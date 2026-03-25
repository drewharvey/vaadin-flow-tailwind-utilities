# Tailwind CSS Classes and Type-Safe Strategies

This document catalogues Tailwind CSS v3 utility classes that **could not
originally be expressed as static `String` constants** in `TailwindUtility`,
explains which of those gaps have since been addressed, and describes how to
work with the categories that still require runtime construction.

---

## What Has Been Added

The following categories, which previously required raw string literals, are
now covered by static constants or helper utilities in this library.

### Static constants now available in `TailwindUtility`

| Class / sub-class | Tailwind prefix | Notes |
|---|---|---|
| `GradientColorStops.From` | `from-*` | Full 22-color palette + black/white/transparent |
| `GradientColorStops.Via` | `via-*` | Full 22-color palette + black/white/transparent |
| `GradientColorStops.To` | `to-*` | Full 22-color palette + black/white/transparent |
| `OutlineColor` | `outline-*` | Full 22-color palette |
| `RingColor` | `ring-*` | Full 22-color palette |
| `RingOffsetColor` | `ring-offset-*` | Full 22-color palette |
| `ShadowColor` | `shadow-*` | Full 22-color palette (tints existing shadows) |
| `TextDecorationColor` | `decoration-*` | Full 22-color palette |
| `FillColor` | `fill-*` | Full 22-color palette (SVG) |
| `StrokeColor` | `stroke-*` | Full 22-color palette (SVG) |
| `StrokeWidth` | `stroke-{0,1,2}` | Three discrete SVG stroke widths |
| `Divide` | `divide-solid/dashed/…` | Style constants |
| `Divide.X` / `Divide.Y` | `divide-x-*` / `divide-y-*` | Width constants + reverse |
| `Divide.Color` | `divide-*` | Core color palette |
| `SpaceBetween.X` / `SpaceBetween.Y` | `space-x-*` / `space-y-*` | Spacing-scale constants + reverse |
| `Direction` | `ltr` / `rtl` | Marks reading direction on container elements |
| `Content` | `content-none` | The only static content value |

### Variant-prefix composition via `TailwindVariant`

The new `TailwindVariant` class provides a type-safe factory method for every
Tailwind variant prefix.  Instead of writing a magic string, pass a base class
string (typically a `TailwindUtility` constant) to the appropriate method and
receive the correctly prefixed class:

```java
// Responsive
component.addClassName(TailwindVariant.md(TailwindUtility.Display.FLEX));
// => "md:flex"

// Hover state
component.addClassName(TailwindVariant.hover(TailwindUtility.Background.Blue._700));
// => "hover:bg-blue-700"

// Dark mode
component.addClassName(TailwindVariant.dark(TailwindUtility.Background.Gray._900));
// => "dark:bg-gray-900"

// Disabled state
component.addClassName(TailwindVariant.disabled(TailwindUtility.Opacity._50));
// => "disabled:opacity-50"

// ARIA variant
component.addClassName(TailwindVariant.ariaChecked(TailwindUtility.Background.Blue._500));
// => "aria-checked:bg-blue-500"

// Group interaction (hover on parent → style child)
div.addClassName("group");
span.addClassName(TailwindVariant.group("hover", TailwindUtility.TextColor.Blue._500));
// => "group-hover:text-blue-500"

// Peer interaction (sibling state → style element)
input.addClassName("peer");
label.addClassName(TailwindVariant.peer("focus", TailwindUtility.TextColor.Blue._600));
// => "peer-focus:text-blue-600"

// Chaining variants (dark + hover)
component.addClassName(
    TailwindVariant.dark(TailwindVariant.hover(TailwindUtility.Background.Blue._700)));
// => "dark:hover:bg-blue-700"
```

**Supported variant methods in `TailwindVariant`:**

| Category | Methods |
|---|---|
| Responsive | `sm`, `md`, `lg`, `xl`, `xxl` |
| Interactive state | `hover`, `focus`, `focusVisible`, `focusWithin`, `active`, `visited`, `target`, `open` |
| Form state | `checked`, `indeterminate`, `defaultState`, `required`, `optional`, `valid`, `invalid`, `inRange`, `outOfRange`, `placeholderShown`, `autofill`, `readOnly`, `disabled`, `enabled` |
| Positional / structural | `first`, `last`, `only`, `odd`, `even`, `firstOfType`, `lastOfType`, `onlyOfType`, `empty` |
| Pseudo-element | `before`, `after`, `placeholder`, `file`, `marker`, `selection`, `firstLetter`, `firstLine`, `backdrop` |
| Media / feature query | `dark`, `print`, `portrait`, `landscape`, `motionSafe`, `motionReduce`, `contrastMore`, `contrastLess`, `forcedColors` |
| Direction | `ltr`, `rtl` |
| Group / Peer | `group(state, cls)`, `peer(state, cls)` |
| ARIA (named) | `ariaChecked`, `ariaDisabled`, `ariaExpanded`, `ariaHidden`, `ariaPressed`, `ariaReadonly`, `ariaRequired`, `ariaSelected` |
| ARIA (arbitrary) | `aria(attribute, cls)` |

---

## What Still Cannot Be Pre-Enumerated

The challenge shared by every remaining category below is the same: the class
name is assembled at **runtime** from a value that is either user-defined,
continuous, or contextual, making a finite compile-time list impossible.

---

### A — Arbitrary-Value Utilities (Bracket Syntax)

Tailwind allows *any* CSS value to be passed directly inside square brackets.

```html
<!-- arbitrary length -->
<div class="w-[327px] h-[calc(100vh-4rem)]">

<!-- arbitrary color -->
<div class="bg-[#1a2b3c] text-[rgb(11,22,33)]">

<!-- arbitrary property via CSS variable -->
<div class="translate-x-[var(--sidebar-width)]">

<!-- arbitrary grid template -->
<div class="grid-cols-[1fr_2fr_1fr]">

<!-- arbitrary content string -->
<div class="before:content-['Hello_World']">
```

**Affected prefixes** — virtually every utility accepts bracket values:

| Prefix | Example |
|---|---|
| `w-[…]` / `h-[…]` / `size-[…]` | `w-[327px]` |
| `m-[…]` / `p-[…]` and directional variants | `mt-[3.5rem]` |
| `text-[…]` | `text-[0.9375rem]` |
| `bg-[…]` | `bg-[url('/hero.jpg')]` |
| `border-[…]` | `border-[3px]` |
| `rounded-[…]` | `rounded-[0.375rem]` |
| `opacity-[…]` | `opacity-[0.33]` |
| `z-[…]` | `z-[100]` |
| `translate-[…]` | `translate-x-[var(--offset)]` |
| `rotate-[…]` | `rotate-[17deg]` |
| `skew-[…]` | `skew-x-[8deg]` |
| `scale-[…]` | `scale-[1.15]` |
| `grid-cols-[…]` / `grid-rows-[…]` | `grid-cols-[repeat(3,minmax(0,1fr))]` |
| `inset-[…]` / `top-[…]` etc. | `top-[env(safe-area-inset-top)]` |
| `tracking-[…]` | `tracking-[0.2em]` |
| `leading-[…]` | `leading-[1.8]` |
| `indent-[…]` | `indent-[3ch]` |
| `underline-offset-[…]` | `underline-offset-[3px]` |
| `outline-offset-[…]` | `outline-offset-[5px]` |
| `blur-[…]` | `blur-[4px]` |
| `brightness-[…]` | `brightness-[1.3]` |
| `contrast-[…]` | `contrast-[0.8]` |
| `hue-rotate-[…]` | `hue-rotate-[45deg]` |
| `saturate-[…]` | `saturate-[1.75]` |
| `delay-[…]` / `duration-[…]` | `duration-[350ms]` |
| `ease-[…]` | `ease-[cubic-bezier(0.4,0,0.2,1)]` |
| `aspect-[…]` | `aspect-[4/3]` |
| `columns-[…]` | `columns-[14rem]` |
| `basis-[…]` | `basis-[17.5%]` |
| `line-clamp-[…]` | `line-clamp-[7]` |
| `fill-[…]` / `stroke-[…]` | `fill-[#aabbcc]` |
| `shadow-[…]` | `shadow-[0_4px_6px_rgba(0,0,0,0.3)]` |
| `ring-[…]` | `ring-[3px]` |
| `max-w-[…]` / `min-w-[…]` | `max-w-[65ch]` |
| `max-h-[…]` / `min-h-[…]` | `min-h-[theme(spacing.32)]` |
| `object-[…]` | `object-[center_top_1rem]` |
| `origin-[…]` | `origin-[33%_75%]` |
| `cursor-[…]` | `cursor-[url(cursor.png),_auto]` |
| `scroll-m-[…]` / `scroll-p-[…]` | `scroll-mt-[72px]` |
| `content-[…]` | `content-['★']` |
| `placeholder-[…]` | `placeholder-[color:#aaa]` |

---

### B — Full Tailwind Default Spacing Scale (Partial Coverage Only)

`TailwindUtility` covers a curated subset of spacing values
(e.g. `m-1`, `m-2`, `m-4`, `m-6`, `m-8`, `m-12`, `m-16`).
The complete **default spacing scale** contains many more steps:

```
0, 0.5, 1, 1.5, 2, 2.5, 3, 3.5, 4, 5, 6, 7, 8, 9, 10, 11, 12,
14, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52, 56, 60, 64, 72, 80, 96
```

All spacing-based utilities share this scale, so every "gap" in the
sequence below cannot be expressed as a constant:

`m-*`, `p-*`, `w-*`, `h-*`, `gap-*`, `space-*`, `translate-*`,
`inset-*` / `top-*` / `right-*` / `bottom-*` / `left-*`, `scroll-m-*`,
`scroll-p-*`, `basis-*`, `size-*`, `indent-*`, `tracking-*`, `leading-*`,
`rounded-*`, `border-*` (width), `outline-*` (width/offset), `ring-*`
(width/offset), `shadow-*`

Similarly, **fractional width/height** utilities extend to many denominators
that are not pre-enumerated:

```
1/2, 1/3, 2/3, 1/4, 2/4, 3/4, 1/5, 2/5, 3/5, 4/5,
1/6, 2/6, 3/6, 4/6, 5/6, 1/12, 2/12, … 11/12
```

---

### C — Negative Value Variants

Tailwind generates negative counterparts (prefixed with `-`) for many
spacing-scale utilities.  None of these can be expressed as non-negative
constants:

| Utility | Example classes |
|---|---|
| Margin | `-m-4`, `-mx-2`, `-mt-8` |
| Inset / positional | `-inset-2`, `-top-4`, `-left-1` |
| Translate | `-translate-x-2`, `-translate-y-full` |
| Rotate | `-rotate-6`, `-rotate-45` |
| Skew | `-skew-x-3`, `-skew-y-6` |
| Letter spacing | `-tracking-tight` (theme-defined) |
| Scroll margin | `-scroll-mt-4` |
| Text indent | `-indent-4` |
| Order | `-order-1` |
| Z-index | `-z-10` |

---

### D — Color Opacity Modifier (Slash Syntax)

Tailwind v3 introduced the `/opacity` modifier that appends an opacity
percentage to any color class.  The resulting class name is a **combination**
of a color token and a numeric opacity and cannot be pre-enumerated:

```html
<div class="bg-blue-500/50 text-red-300/75 border-green-400/25">
```

Pattern: `{color-class}/{opacity}` where opacity is 0–100 (or an arbitrary
value: `bg-blue-500/[0.33]`).

---

### E — Responsive Breakpoint Prefixes (arbitrary breakpoints only)

Named breakpoints (`sm:`, `md:`, `lg:`, `xl:`, `2xl:`) are fully covered by
`TailwindVariant`.  Arbitrary breakpoints still require raw strings:

```java
// arbitrary min/max breakpoints — raw string only
component.addClassName("min-[640px]:flex");
component.addClassName("max-[768px]:hidden");
```

---

### F — Named Group / Peer Variants

`TailwindVariant.group(state, cls)` and `TailwindVariant.peer(state, cls)` cover
the common case.  Named group/peer modifiers (e.g. `group/sidebar-hover:`) still
require raw strings:

```java
// named group — raw string only
component.addClassName("group/sidebar");
component.addClassName("group-hover/sidebar:opacity-100");
```

---

### G — `data-[…]:` Attribute Variants

```html
<div data-size="large" class="data-[size=large]:p-8">
```

Pattern: `data-[key=value]:`, `data-[key]:`

---

### H — `supports-[…]:` Variants

```html
<div class="supports-[display:grid]:grid">
```

Pattern: `supports-[{css-declaration}]:`

---

### I — `:has()`, `not-[…]:` Variants

```html
<div class="has-[:checked]:bg-blue-50">
<div class="not-[:checked]:opacity-50">
```

Pattern: `has-[{selector}]:`, `group-has-[{selector}]:`, `peer-has-[{selector}]:`,
`not-[{selector}]:`

---

### J — Scroll Margin / Scroll Padding

`scroll-m-*`, `scroll-mx-*`, `scroll-my-*`, `scroll-mt-*`, …
`scroll-p-*`, `scroll-px-*`, `scroll-py-*`, `scroll-pt-*`, …

These follow the identical spacing scale as `Margin` and `Padding`.
A class like `scroll-mt-4` can be constructed by prepending `scroll-`
to the value returned by `Margin.Top.MEDIUM` (`mt-4` → `scroll-mt-4`).

---

### K — Border Spacing

`border-spacing-{n}`, `border-spacing-x-{n}`, `border-spacing-y-{n}`

Follows the spacing scale.  Used with `border-separate` tables.

---

### L — Deprecated Opacity Utilities

`bg-opacity-{n}`, `border-opacity-{n}`, `text-opacity-{n}`,
`placeholder-opacity-{n}`, `divide-opacity-{n}`, `ring-opacity-{n}`

Replaced in Tailwind v3+ by the `/opacity` modifier (section D above).
Retained in the framework for backwards compatibility but not recommended
for new code.

---

## Guidance for Library Consumers

### Using static constants for gradient, ring, shadow, and decoration colors

```java
// gradient stop
component.addClassName(TailwindUtility.GradientColorStops.From.Blue._500); // "from-blue-500"
component.addClassName(TailwindUtility.GradientColorStops.Via.Purple._400); // "via-purple-400"
component.addClassName(TailwindUtility.GradientColorStops.To.Pink._300);   // "to-pink-300"

// outline, ring, and shadow colors
component.addClassName(TailwindUtility.OutlineColor.Blue._500);  // "outline-blue-500"
component.addClassName(TailwindUtility.RingColor.Blue._500);     // "ring-blue-500"
component.addClassName(TailwindUtility.ShadowColor.Slate._300);  // "shadow-slate-300"

// text decoration color
component.addClassName(TailwindUtility.TextDecorationColor.Red._500); // "decoration-red-500"

// SVG fill and stroke
component.addClassName(TailwindUtility.FillColor.Blue._500);   // "fill-blue-500"
component.addClassName(TailwindUtility.StrokeColor.Red._500);  // "stroke-red-500"
component.addClassName(TailwindUtility.StrokeWidth.MEDIUM);    // "stroke-2"
```

### Using `TailwindVariant` for variant prefixes

```java
// Instead of magic strings like "hover:bg-blue-700":
component.addClassName(TailwindVariant.hover(TailwindUtility.Background.Blue._700));

// Responsive layouts
component.addClassName(TailwindVariant.md(TailwindUtility.Display.FLEX));
component.addClassName(TailwindVariant.lg(TailwindUtility.Width.FULL));

// Dark mode
component.addClassName(TailwindVariant.dark(TailwindUtility.Background.Gray._900));
component.addClassName(TailwindVariant.dark(TailwindVariant.hover(TailwindUtility.Background.Blue._700)));

// Form state
component.addClassName(TailwindVariant.disabled(TailwindUtility.Opacity._50));
component.addClassName(TailwindVariant.invalid(TailwindUtility.BorderColor.Red._500));

// Accessibility / ARIA
component.addClassName(TailwindVariant.ariaChecked(TailwindUtility.Background.Blue._500));
component.addClassName(TailwindVariant.ariaExpanded("rotate-180"));

// Group hover (parent → child styling)
div.addClassName("group");
span.addClassName(TailwindVariant.group("hover", TailwindUtility.TextColor.Blue._500));
```

### Falling back to raw strings

For anything not yet covered by the library, use a raw string literal:

```java
// arbitrary value
component.addClassName("w-[327px]");
component.addClassName("bg-[#1a2b3c]");

// negative margin
component.addClassName("-mt-4");

// color opacity modifier
component.addClassName("bg-blue-500/50");

// arbitrary breakpoint
component.addClassName("min-[640px]:flex");

// data attribute variant
component.addClassName("data-[size=large]:p-8");

// full spacing scale value not in TailwindUtility
component.addClassName("m-14");   // 14 is in the scale but not a named constant
component.addClassName("p-3.5");  // fractional steps need a raw string
```

For color-prefixed classes not enumerated for a specific prefix, you can
derive the color token from an existing palette constant:

```java
// "from-slate-500" — strip the existing prefix, add the gradient prefix
String fromSlate500 = "from-" + TailwindUtility.TextColor.Slate._500
        .replaceFirst("^text-", "");   // "from-slate-500"
```
