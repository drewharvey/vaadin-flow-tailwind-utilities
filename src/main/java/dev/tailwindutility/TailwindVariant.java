package dev.tailwindutility;

/**
 * Provides type-safe factory methods for composing Tailwind CSS variant-prefixed
 * class strings.
 *
 * <p>Tailwind's variant system lets you conditionally apply any utility class by
 * prepending a prefix such as {@code hover:}, {@code md:}, or {@code dark:}.
 * Because the resulting class name is assembled from a prefix <em>and</em> a base
 * utility, a finite set of static constants cannot represent this space — it
 * multiplies the entire utility surface by the number of variants.
 *
 * <p>This class bridges that gap: every method accepts a base class string (which
 * can come from a {@link TailwindUtility} constant or be a raw string) and returns
 * the correctly prefixed variant.
 *
 * <h2>Usage example</h2>
 * <pre>{@code
 * // Instead of: component.addClassName("hover:bg-blue-700");
 * component.addClassName(TailwindVariant.hover(TailwindUtility.Background.Blue._700));
 *
 * // Responsive
 * component.addClassName(TailwindVariant.md(TailwindUtility.Display.FLEX));
 *
 * // Dark mode
 * component.addClassName(TailwindVariant.dark(TailwindUtility.Background.Gray._900));
 *
 * // Chaining variants (e.g. dark + hover)
 * component.addClassName(TailwindVariant.dark(TailwindVariant.hover(TailwindUtility.Background.Blue._700)));
 * }</pre>
 */
public final class TailwindVariant {

    private TailwindVariant() {
    }

    // -----------------------------------------------------------------------
    // Internal helper
    // -----------------------------------------------------------------------

    private static String prefix(String variant, String cls) {
        if (cls == null || cls.isEmpty()) {
            throw new IllegalArgumentException("cls must not be null or empty");
        }
        return variant + ":" + cls;
    }

    // -----------------------------------------------------------------------
    // Responsive breakpoints
    // -----------------------------------------------------------------------

    /**
     * Applies the {@code sm:} responsive prefix (≥640 px).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "sm:flex"}
     */
    public static String sm(String cls) {
        return prefix("sm", cls);
    }

    /**
     * Applies the {@code md:} responsive prefix (≥768 px).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "md:hidden"}
     */
    public static String md(String cls) {
        return prefix("md", cls);
    }

    /**
     * Applies the {@code lg:} responsive prefix (≥1024 px).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "lg:grid"}
     */
    public static String lg(String cls) {
        return prefix("lg", cls);
    }

    /**
     * Applies the {@code xl:} responsive prefix (≥1280 px).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "xl:w-1/2"}
     */
    public static String xl(String cls) {
        return prefix("xl", cls);
    }

    /**
     * Applies the {@code 2xl:} responsive prefix (≥1536 px).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "2xl:container"}
     */
    public static String xxl(String cls) {
        return prefix("2xl", cls);
    }

    // -----------------------------------------------------------------------
    // Interactive state variants
    // -----------------------------------------------------------------------

    /**
     * Applies the {@code hover:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "hover:bg-blue-700"}
     */
    public static String hover(String cls) {
        return prefix("hover", cls);
    }

    /**
     * Applies the {@code focus:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "focus:ring-2"}
     */
    public static String focus(String cls) {
        return prefix("focus", cls);
    }

    /**
     * Applies the {@code focus-visible:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "focus-visible:outline"}
     */
    public static String focusVisible(String cls) {
        return prefix("focus-visible", cls);
    }

    /**
     * Applies the {@code focus-within:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "focus-within:ring-1"}
     */
    public static String focusWithin(String cls) {
        return prefix("focus-within", cls);
    }

    /**
     * Applies the {@code active:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "active:scale-95"}
     */
    public static String active(String cls) {
        return prefix("active", cls);
    }

    /**
     * Applies the {@code visited:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "visited:text-purple-600"}
     */
    public static String visited(String cls) {
        return prefix("visited", cls);
    }

    /**
     * Applies the {@code target:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "target:ring-2"}
     */
    public static String target(String cls) {
        return prefix("target", cls);
    }

    /**
     * Applies the {@code open:} variant (for {@code <details>} / {@code <dialog>}).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "open:bg-blue-50"}
     */
    public static String open(String cls) {
        return prefix("open", cls);
    }

    // -----------------------------------------------------------------------
    // Form-state variants
    // -----------------------------------------------------------------------

    /**
     * Applies the {@code checked:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "checked:bg-blue-500"}
     */
    public static String checked(String cls) {
        return prefix("checked", cls);
    }

    /**
     * Applies the {@code indeterminate:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String indeterminate(String cls) {
        return prefix("indeterminate", cls);
    }

    /**
     * Applies the {@code default:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String defaultState(String cls) {
        return prefix("default", cls);
    }

    /**
     * Applies the {@code required:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "required:border-red-500"}
     */
    public static String required(String cls) {
        return prefix("required", cls);
    }

    /**
     * Applies the {@code optional:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String optional(String cls) {
        return prefix("optional", cls);
    }

    /**
     * Applies the {@code valid:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "valid:border-green-500"}
     */
    public static String valid(String cls) {
        return prefix("valid", cls);
    }

    /**
     * Applies the {@code invalid:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "invalid:border-red-500"}
     */
    public static String invalid(String cls) {
        return prefix("invalid", cls);
    }

    /**
     * Applies the {@code in-range:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String inRange(String cls) {
        return prefix("in-range", cls);
    }

    /**
     * Applies the {@code out-of-range:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String outOfRange(String cls) {
        return prefix("out-of-range", cls);
    }

    /**
     * Applies the {@code placeholder-shown:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String placeholderShown(String cls) {
        return prefix("placeholder-shown", cls);
    }

    /**
     * Applies the {@code autofill:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String autofill(String cls) {
        return prefix("autofill", cls);
    }

    /**
     * Applies the {@code read-only:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "read-only:opacity-75"}
     */
    public static String readOnly(String cls) {
        return prefix("read-only", cls);
    }

    /**
     * Applies the {@code disabled:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "disabled:opacity-50"}
     */
    public static String disabled(String cls) {
        return prefix("disabled", cls);
    }

    /**
     * Applies the {@code enabled:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String enabled(String cls) {
        return prefix("enabled", cls);
    }

    // -----------------------------------------------------------------------
    // Positional / structural variants
    // -----------------------------------------------------------------------

    /**
     * Applies the {@code first:} variant (first child).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "first:mt-0"}
     */
    public static String first(String cls) {
        return prefix("first", cls);
    }

    /**
     * Applies the {@code last:} variant (last child).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "last:mb-0"}
     */
    public static String last(String cls) {
        return prefix("last", cls);
    }

    /**
     * Applies the {@code only:} variant (only child).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String only(String cls) {
        return prefix("only", cls);
    }

    /**
     * Applies the {@code odd:} variant (odd-numbered children).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "odd:bg-gray-100"}
     */
    public static String odd(String cls) {
        return prefix("odd", cls);
    }

    /**
     * Applies the {@code even:} variant (even-numbered children).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "even:bg-white"}
     */
    public static String even(String cls) {
        return prefix("even", cls);
    }

    /**
     * Applies the {@code first-of-type:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String firstOfType(String cls) {
        return prefix("first-of-type", cls);
    }

    /**
     * Applies the {@code last-of-type:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String lastOfType(String cls) {
        return prefix("last-of-type", cls);
    }

    /**
     * Applies the {@code only-of-type:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String onlyOfType(String cls) {
        return prefix("only-of-type", cls);
    }

    /**
     * Applies the {@code empty:} variant (elements with no children).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String empty(String cls) {
        return prefix("empty", cls);
    }

    // -----------------------------------------------------------------------
    // Pseudo-element variants
    // -----------------------------------------------------------------------

    /**
     * Applies the {@code before:} pseudo-element variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "before:content-['']"}
     */
    public static String before(String cls) {
        return prefix("before", cls);
    }

    /**
     * Applies the {@code after:} pseudo-element variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "after:block"}
     */
    public static String after(String cls) {
        return prefix("after", cls);
    }

    /**
     * Applies the {@code placeholder:} pseudo-element variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "placeholder:text-gray-400"}
     */
    public static String placeholder(String cls) {
        return prefix("placeholder", cls);
    }

    /**
     * Applies the {@code file:} pseudo-element variant (file input button).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "file:cursor-pointer"}
     */
    public static String file(String cls) {
        return prefix("file", cls);
    }

    /**
     * Applies the {@code marker:} pseudo-element variant (list item marker).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "marker:text-blue-500"}
     */
    public static String marker(String cls) {
        return prefix("marker", cls);
    }

    /**
     * Applies the {@code selection:} pseudo-element variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "selection:bg-blue-200"}
     */
    public static String selection(String cls) {
        return prefix("selection", cls);
    }

    /**
     * Applies the {@code first-letter:} pseudo-element variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "first-letter:text-4xl"}
     */
    public static String firstLetter(String cls) {
        return prefix("first-letter", cls);
    }

    /**
     * Applies the {@code first-line:} pseudo-element variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "first-line:font-bold"}
     */
    public static String firstLine(String cls) {
        return prefix("first-line", cls);
    }

    /**
     * Applies the {@code backdrop:} pseudo-element variant ({@code ::backdrop}).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "backdrop:bg-black/50"}
     */
    public static String backdrop(String cls) {
        return prefix("backdrop", cls);
    }

    // -----------------------------------------------------------------------
    // Media / feature-query variants
    // -----------------------------------------------------------------------

    /**
     * Applies the {@code dark:} variant ({@code prefers-color-scheme: dark}).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "dark:bg-gray-900"}
     */
    public static String dark(String cls) {
        return prefix("dark", cls);
    }

    /**
     * Applies the {@code print:} variant ({@code @media print}).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "print:hidden"}
     */
    public static String print(String cls) {
        return prefix("print", cls);
    }

    /**
     * Applies the {@code portrait:} variant ({@code orientation: portrait}).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String portrait(String cls) {
        return prefix("portrait", cls);
    }

    /**
     * Applies the {@code landscape:} variant ({@code orientation: landscape}).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String landscape(String cls) {
        return prefix("landscape", cls);
    }

    /**
     * Applies the {@code motion-safe:} variant
     * ({@code prefers-reduced-motion: no-preference}).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "motion-safe:animate-spin"}
     */
    public static String motionSafe(String cls) {
        return prefix("motion-safe", cls);
    }

    /**
     * Applies the {@code motion-reduce:} variant
     * ({@code prefers-reduced-motion: reduce}).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "motion-reduce:animate-none"}
     */
    public static String motionReduce(String cls) {
        return prefix("motion-reduce", cls);
    }

    /**
     * Applies the {@code contrast-more:} variant ({@code prefers-contrast: more}).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String contrastMore(String cls) {
        return prefix("contrast-more", cls);
    }

    /**
     * Applies the {@code contrast-less:} variant ({@code prefers-contrast: less}).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String contrastLess(String cls) {
        return prefix("contrast-less", cls);
    }

    /**
     * Applies the {@code forced-colors:} variant ({@code forced-colors: active}).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String forcedColors(String cls) {
        return prefix("forced-colors", cls);
    }

    // -----------------------------------------------------------------------
    // Direction variants
    // -----------------------------------------------------------------------

    /**
     * Applies the {@code ltr:} variant (left-to-right direction).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "ltr:ml-4"}
     */
    public static String ltr(String cls) {
        return prefix("ltr", cls);
    }

    /**
     * Applies the {@code rtl:} variant (right-to-left direction).
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "rtl:mr-4"}
     */
    public static String rtl(String cls) {
        return prefix("rtl", cls);
    }

    // -----------------------------------------------------------------------
    // Group / Peer variants
    // -----------------------------------------------------------------------

    /**
     * Applies a {@code group-{state}:} variant, allowing you to style an element
     * based on the state of a parent marked with the {@code group} class.
     *
     * <p>Example:
     * <pre>{@code
     * // Marks the parent
     * div.addClassName("group");
     * // Styles the child based on parent hover
     * span.addClassName(TailwindVariant.group("hover", TailwindUtility.TextColor.Blue._500));
     * // => "group-hover:text-blue-500"
     * }</pre>
     *
     * @param state the group state (e.g. {@code "hover"}, {@code "focus"}, {@code "open"})
     * @param cls   the base Tailwind class
     * @return the prefixed class string
     */
    public static String group(String state, String cls) {
        if (state == null || state.isEmpty()) {
            throw new IllegalArgumentException("state must not be null or empty");
        }
        return prefix("group-" + state, cls);
    }

    /**
     * Applies a {@code peer-{state}:} variant, allowing you to style an element
     * based on the state of a sibling marked with the {@code peer} class.
     *
     * <p>Example:
     * <pre>{@code
     * // Marks the sibling input
     * input.addClassName("peer");
     * // Styles the label based on sibling focus
     * label.addClassName(TailwindVariant.peer("focus", TailwindUtility.TextColor.Blue._600));
     * // => "peer-focus:text-blue-600"
     * }</pre>
     *
     * @param state the peer state (e.g. {@code "hover"}, {@code "focus"}, {@code "checked"})
     * @param cls   the base Tailwind class
     * @return the prefixed class string
     */
    public static String peer(String state, String cls) {
        if (state == null || state.isEmpty()) {
            throw new IllegalArgumentException("state must not be null or empty");
        }
        return prefix("peer-" + state, cls);
    }

    // -----------------------------------------------------------------------
    // ARIA variants
    // -----------------------------------------------------------------------

    /**
     * Applies the {@code aria-checked:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "aria-checked:bg-blue-500"}
     */
    public static String ariaChecked(String cls) {
        return prefix("aria-checked", cls);
    }

    /**
     * Applies the {@code aria-disabled:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String ariaDisabled(String cls) {
        return prefix("aria-disabled", cls);
    }

    /**
     * Applies the {@code aria-expanded:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "aria-expanded:rotate-180"}
     */
    public static String ariaExpanded(String cls) {
        return prefix("aria-expanded", cls);
    }

    /**
     * Applies the {@code aria-hidden:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String ariaHidden(String cls) {
        return prefix("aria-hidden", cls);
    }

    /**
     * Applies the {@code aria-pressed:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String ariaPressed(String cls) {
        return prefix("aria-pressed", cls);
    }

    /**
     * Applies the {@code aria-readonly:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String ariaReadonly(String cls) {
        return prefix("aria-readonly", cls);
    }

    /**
     * Applies the {@code aria-required:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string
     */
    public static String ariaRequired(String cls) {
        return prefix("aria-required", cls);
    }

    /**
     * Applies the {@code aria-selected:} variant.
     *
     * @param cls the base Tailwind class
     * @return the prefixed class string, e.g. {@code "aria-selected:font-bold"}
     */
    public static String ariaSelected(String cls) {
        return prefix("aria-selected", cls);
    }

    /**
     * Applies an arbitrary {@code aria-[{attribute}]:} variant.
     *
     * <p>Use this when none of the named ARIA helpers cover your attribute:
     * <pre>{@code
     * component.addClassName(TailwindVariant.aria("sort=ascending", TailwindUtility.FontWeight.BOLD));
     * // => "aria-[sort=ascending]:font-bold"
     * }</pre>
     *
     * @param attribute the ARIA attribute expression (e.g. {@code "sort=ascending"})
     * @param cls       the base Tailwind class
     * @return the prefixed class string
     */
    public static String aria(String attribute, String cls) {
        if (attribute == null || attribute.isEmpty()) {
            throw new IllegalArgumentException("attribute must not be null or empty");
        }
        return prefix("aria-[" + attribute + "]", cls);
    }
}
