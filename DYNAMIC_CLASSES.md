# Tailwind CSS Classes That Cannot Be Represented as Static Constants

This document catalogues all Tailwind CSS v3 utility classes—and class-construction
mechanisms—that **cannot be pre-enumerated as static `String` constants** in
`TailwindUtility`. Understanding these limits is important for library consumers who
need to fall back to raw string literals.

The challenge shared by every category below is the same: the class name is assembled at
**runtime** from a value that is either user-defined, continuous, or contextual, making a
finite compile-time list impossible.

---

## 1. Arbitrary-Value Utilities (Bracket Syntax)

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

## 2. Full Tailwind Default Spacing Scale (Partial Coverage Only)

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

## 3. Negative Value Variants

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

## 4. Color Opacity Modifier (Slash Syntax)

Tailwind v3 introduced the `/opacity` modifier that appends an opacity
percentage to any color class.  The resulting class name is a **combination**
of a color token and a numeric opacity and cannot be pre-enumerated:

```html
<div class="bg-blue-500/50 text-red-300/75 border-green-400/25">
```

Pattern: `{color-class}/{opacity}` where opacity is 0–100 (or an arbitrary
value: `bg-blue-500/[0.33]`).

---

## 5. Responsive Breakpoint Prefixes

Breakpoint variants prefix any utility with a screen size token.  Because
they combine with the full utility space, they multiply the class count
to a number far beyond what static constants can cover.

**Built-in breakpoints:** `sm:`, `md:`, `lg:`, `xl:`, `2xl:`

**Arbitrary breakpoints:** `min-[640px]:`, `max-[768px]:`

**Example:**
```html
<div class="w-full md:w-1/2 lg:w-1/3">
```

---

## 6. State / Pseudo-Class Variant Prefixes

These prefixes apply a conditional modifier to any base utility.
Combined with the full utility surface, they produce an open-ended set
of class names.

### Positional
`first:`, `last:`, `only:`, `odd:`, `even:`,
`first-of-type:`, `last-of-type:`, `only-of-type:`

### Form state
`default:`, `checked:`, `indeterminate:`, `placeholder-shown:`,
`autofill:`, `optional:`, `required:`, `valid:`, `invalid:`,
`in-range:`, `out-of-range:`, `read-only:`

### Interactive state
`hover:`, `focus:`, `focus-within:`, `focus-visible:`,
`active:`, `visited:`, `target:`, `open:`,
`enabled:`, `disabled:`

### Misc
`empty:`

**Example:**
```html
<button class="bg-blue-500 hover:bg-blue-700 focus:ring-2 disabled:opacity-50">
```

---

## 7. Pseudo-Element Variant Prefixes

`before:`, `after:`, `placeholder:`, `file:`,
`marker:`, `selection:`, `first-letter:`, `first-line:`, `backdrop:`

**Example:**
```html
<p class="first-letter:text-4xl before:content-['»']">
```

---

## 8. Media / Feature Query Variants

| Variant | Condition |
|---|---|
| `dark:` | `prefers-color-scheme: dark` |
| `portrait:` | `orientation: portrait` |
| `landscape:` | `orientation: landscape` |
| `motion-safe:` | `prefers-reduced-motion: no-preference` |
| `motion-reduce:` | `prefers-reduced-motion: reduce` |
| `contrast-more:` | `prefers-contrast: more` |
| `contrast-less:` | `prefers-contrast: less` |
| `forced-colors:` | `forced-colors: active` |
| `print:` | `@media print` |

---

## 9. Direction Variants

`ltr:`, `rtl:`

---

## 10. Group / Peer Interaction Variants

These allow styling an element based on the state of a parent (`group`)
or sibling (`peer`) element. The variant name includes the state of the
other element, so the combinatorial space is unbounded.

```html
<div class="group">
  <span class="group-hover:text-blue-500">…</span>
</div>
```

**Pattern:** `group-{state}:`, `peer-{state}:`  
**Named groups/peers:** `group/{name}-{state}:`, `peer/{name}-{state}:`

---

## 11. ARIA Variants

```html
<button class="aria-checked:bg-blue-500" aria-checked="true">
```

**Built-in:** `aria-checked:`, `aria-disabled:`, `aria-expanded:`,
`aria-hidden:`, `aria-pressed:`, `aria-readonly:`, `aria-required:`,
`aria-selected:`

**Arbitrary:** `aria-[sort=ascending]:`, `aria-[labelledby=a11y-title]:`

---

## 12. Data Attribute Variants

```html
<div data-size="large" class="data-[size=large]:p-8">
```

**Pattern:** `data-[key=value]:`, `data-[key]:`

---

## 13. `supports-` Variants

```html
<div class="supports-[display:grid]:grid">
```

**Pattern:** `supports-[{css-declaration}]:`

---

## 14. `:has()` Variants

```html
<div class="has-[:checked]:bg-blue-50">
```

**Pattern:** `has-[{selector}]:`, `group-has-[{selector}]:`, `peer-has-[{selector}]:`

---

## 15. `not-` Variants

```html
<div class="not-[:checked]:opacity-50">
```

**Pattern:** `not-[{selector}]:`

---

## 16. Gradient Color Stops

`from-{color}`, `via-{color}`, `to-{color}` plus positional variants
`from-{percent}`, `via-{percent}`, `to-{percent}` and arbitrary values
`from-[#1a2b3c]`, `via-[rgba(0,0,0,0.5)]`.

The **color** portion reuses the same 22 × 11 palette already in
`TextColor`, `Background`, and `BorderColor`.  Adding three mirror-image
color tables (~726 strings) would add no new information; the only
difference is the prefix.

---

## 17. Divide Utilities

`divide-x-{n}`, `divide-y-{n}`, `divide-{color}`, `divide-opacity-{n}`,
`divide-solid`, `divide-dashed`, `divide-dotted`, `divide-double`,
`divide-none`, `divide-x-reverse`, `divide-y-reverse`

These use the CSS selector `& > :not([hidden]) ~ :not([hidden])` and apply
styles between sibling elements, not to the element itself.  The color and
width values are the same scales already enumerated elsewhere.

---

## 18. Space Between Utilities

`space-x-{n}`, `space-y-{n}`, `space-x-reverse`, `space-y-reverse`

Like Divide, these target child elements via a sibling CSS selector rather
than the element itself.  Using `Gap` with a flex or grid container is the
preferred modern alternative.

---

## 19. Fill / Stroke / StrokeWidth

`fill-{color}`, `stroke-{color}`, `stroke-0`, `stroke-1`, `stroke-2`

SVG-specific utilities.  The color palette reuses the same 22 × 11 palette.
These are rarely needed in Vaadin server-side component development.

---

## 20. Placeholder Color / Caret Color / Accent Color

`placeholder-{color}`, `caret-{color}`, `accent-{color}`,
`placeholder-opacity-{n}`

`PlaceholderColor` is deprecated in Tailwind v3+ (use `::placeholder` pseudo-element
with `before:` instead).  `CaretColor` and `AccentColor` are highly specific
form-element styling utilities with limited use in typical Vaadin UIs.

---

## 21. Box Shadow Color

`shadow-{color}` — applies a tinted color to an existing box shadow
(`--tw-shadow-color`).  The color palette is the same 22 × 11 grid.

---

## 22. Outline Color / Ring Color / Ring Offset Color

`outline-{color}`, `ring-{color}`, `ring-offset-{color}`

Color classes using the same 22 × 11 palette.  Not enumerated to avoid
duplicating the palette for every decoration type.

---

## 23. Scroll Margin / Scroll Padding

`scroll-m-*`, `scroll-mx-*`, `scroll-my-*`, `scroll-mt-*`, …
`scroll-p-*`, `scroll-px-*`, `scroll-py-*`, `scroll-pt-*`, …

These follow the identical spacing scale as `Margin` and `Padding`.
A class like `scroll-mt-4` can be constructed by prepending `scroll-`
to the value returned by `Margin.Top.MEDIUM` (`mt-4` → `scroll-mt-4`).

---

## 24. Border Spacing

`border-spacing-{n}`, `border-spacing-x-{n}`, `border-spacing-y-{n}`

Follows the spacing scale.  Used with `border-separate` tables.

---

## 25. Text Decoration Color

`decoration-{color}` — sets the `text-decoration-color` using the full
22 × 11 color palette.  Thickness and style *are* enumerated in
`TextDecorationThickness` and `TextDecorationStyle`.

---

## 26. Content Utilities

`content-none` is a static value available in CSS; arbitrary string content
requires bracket syntax:

```html
<span class="before:content-['Chapter_1:']">
```

**Pattern:** `content-['{string}']`, `content-none`

---

## 27. Deprecated Opacity Utilities

`bg-opacity-{n}`, `border-opacity-{n}`, `text-opacity-{n}`,
`placeholder-opacity-{n}`, `divide-opacity-{n}`, `ring-opacity-{n}`

Replaced in Tailwind v3+ by the `/opacity` modifier (section 4 above).
Retained in the framework for backwards compatibility but not recommended
for new code.

---

## Guidance for Library Consumers

When you need a class from one of the categories above, use a string literal:

```java
// arbitrary value
component.addClassName("w-[327px]");
component.addClassName("bg-[#1a2b3c]");

// negative margin
component.addClassName("-mt-4");

// color opacity modifier
component.addClassName("bg-blue-500/50");

// responsive prefix
component.addClassName("md:hidden");

// hover state
component.addClassName("hover:bg-blue-700");

// full spacing scale value not in TailwindUtility
component.addClassName("m-14");   // 14 is in the scale but not a named constant
component.addClassName("p-3.5");  // fractional steps need a raw string
```

For classes using Tailwind's standard color palette with a different prefix
(gradient stops, divide color, shadow color, etc.), derive the color token
from the existing palette constants:

```java
// "from-slate-500" — use the same token name as TextColor.Slate._500
String fromSlate500 = "from-" + TailwindUtility.TextColor.Slate._500
        .replaceFirst("^text-", "");   // "from-slate-500"
```
