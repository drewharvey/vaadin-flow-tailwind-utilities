# vaadin-flow-tailwind-utilities

Type-safe Tailwind CSS utility class constants for Vaadin Flow — the equivalent of
[`LumoUtility`](https://vaadin.com/api/platform/com/vaadin/flow/theme/lumo/LumoUtility.html)
but for [Tailwind CSS](https://tailwindcss.com/).

## Motivation

The Vaadin Flow Tailwind integration lets you add Tailwind classes to components, but
requires you to write magic strings:

```java
var name = new Span("My Name");
name.addClassNames("text-xl", "font-bold"); // magic strings, no IDE support
```

This library provides typed constants for every standard Tailwind class, giving you
IDE auto-complete, compile-time safety, and an experience identical to `LumoUtility`:

```java
var name = new Span("My Name");
name.addClassNames(TailwindUtility.FontSize.XLARGE, TailwindUtility.FontWeight.BOLD);
```

## Features

* **Complete Tailwind coverage** — constants for all standard Tailwind v4 utility
  classes: spacing, layout, typography, colors, flexbox, grid, and more.
* **Full Tailwind color palette** — all 22 color families × 11 shades are available
  as nested classes inside `TextColor`, `Background`, and `BorderColor`.
* **Auto-enables the Vaadin Tailwind feature flag** — simply adding this library as a
  Maven dependency enables `com.vaadin.experimental.tailwindCss=true` on the
  classpath, so you don't have to edit `vaadin-featureflags.properties` yourself.

## Requirements

* Java 21+
* Vaadin 25+

## Installation

Add the dependency to your project's `pom.xml`:

```xml
<dependency>
    <groupId>io.github.drewharvey</groupId>
    <artifactId>vaadin-flow-tailwind-utilities</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

> **Note:** If your project already has a `src/main/resources/vaadin-featureflags.properties`
> file, add the following line to it manually so the library's bundled properties file
> is not shadowed:
> ```properties
> com.vaadin.experimental.tailwindCss=true
> ```

## Usage

Import `TailwindUtility` and reference the nested constant classes:

```java
import io.github.drewharvey.tailwindutilities.TailwindUtility;

// Typography
var title = new H1("Hello");
title.addClassNames(
    TailwindUtility.FontSize.XXXLARGE,
    TailwindUtility.FontWeight.BOLD,
    TailwindUtility.TextColor.Slate._900
);

// Layout
var card = new Div();
card.addClassNames(
    TailwindUtility.Display.FLEX,
    TailwindUtility.FlexDirection.COLUMN,
    TailwindUtility.Gap.MEDIUM,
    TailwindUtility.Padding.LARGE,
    TailwindUtility.BorderRadius.XLARGE,
    TailwindUtility.BoxShadow.MEDIUM,
    TailwindUtility.Background.White  // bg-white
);

// Responsive alignment
var row = new Div();
row.addClassNames(
    TailwindUtility.Display.FLEX,
    TailwindUtility.AlignItems.CENTER,
    TailwindUtility.JustifyContent.BETWEEN
);
```

## Available Utility Classes

| Class | Tailwind utilities covered |
|---|---|
| `AlignContent` | `content-*` |
| `AlignItems` | `items-*` |
| `AlignSelf` | `self-*` |
| `AspectRatio` | `aspect-*` |
| `Background` | `bg-*` (includes full color palette) |
| `Border` | `border-{width}` |
| `BorderColor` | `border-{color}-{shade}` |
| `BorderRadius` | `rounded-*` |
| `BoxShadow` | `shadow-*` |
| `BoxSizing` | `box-*` |
| `Display` | `block`, `flex`, `grid`, `hidden`, etc. |
| `FlexDirection` | `flex-row`, `flex-col`, etc. |
| `FlexGrow` | `grow`, `grow-0` |
| `FlexShrink` | `shrink`, `shrink-0` |
| `FlexWrap` | `flex-wrap`, `flex-nowrap`, etc. |
| `FontSize` | `text-xs` … `text-9xl` |
| `FontStyle` | `italic`, `not-italic` |
| `FontWeight` | `font-thin` … `font-black` |
| `Gap` | `gap-*`, `gap-x-*`, `gap-y-*` |
| `Height` | `h-*` |
| `JustifyContent` | `justify-*` |
| `LineHeight` | `leading-*` |
| `Margin` | `m-*`, `mx-*`, `my-*`, `mt-*`, `mr-*`, `mb-*`, `ml-*` |
| `MaxHeight` | `max-h-*` |
| `MaxWidth` | `max-w-*` |
| `MinHeight` | `min-h-*` |
| `MinWidth` | `min-w-*` |
| `Overflow` | `overflow-*`, `overflow-x-*`, `overflow-y-*` |
| `Padding` | `p-*`, `px-*`, `py-*`, `pt-*`, `pr-*`, `pb-*`, `pl-*` |
| `Position` | `absolute`, `fixed`, `relative`, `static`, `sticky` |
| `TextAlignment` | `text-left`, `text-center`, etc. |
| `TextColor` | `text-{color}-{shade}` (includes full color palette) |
| `TextOverflow` | `truncate`, `text-ellipsis`, `text-clip` |
| `TextTransform` | `uppercase`, `lowercase`, `capitalize`, `normal-case` |
| `Whitespace` | `whitespace-*` |
| `Width` | `w-*` |
| `ZIndex` | `z-*` |

## Building

```bash
mvn clean install
```

## License

Apache License 2.0