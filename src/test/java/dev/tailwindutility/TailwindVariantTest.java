package dev.tailwindutility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit tests for {@link TailwindVariant}, verifying that each factory method
 * produces the correctly prefixed Tailwind CSS class string.
 */
class TailwindVariantTest {

    // -----------------------------------------------------------------------
    // Responsive breakpoints
    // -----------------------------------------------------------------------

    @Test
    void sm_prefixesClass() {
        assertEquals("sm:flex", TailwindVariant.sm(TailwindUtility.Display.FLEX));
        assertEquals("sm:hidden", TailwindVariant.sm("hidden"));
    }

    @Test
    void md_prefixesClass() {
        assertEquals("md:flex", TailwindVariant.md(TailwindUtility.Display.FLEX));
        assertEquals("md:hidden", TailwindVariant.md(TailwindUtility.Display.HIDDEN));
    }

    @Test
    void lg_prefixesClass() {
        assertEquals("lg:grid", TailwindVariant.lg(TailwindUtility.Display.GRID));
    }

    @Test
    void xl_prefixesClass() {
        assertEquals("xl:block", TailwindVariant.xl(TailwindUtility.Display.BLOCK));
    }

    @Test
    void xxl_prefixesClass() {
        assertEquals("2xl:container", TailwindVariant.xxl("container"));
    }

    // -----------------------------------------------------------------------
    // Interactive state variants
    // -----------------------------------------------------------------------

    @Test
    void hover_prefixesClass() {
        assertEquals("hover:bg-blue-700", TailwindVariant.hover(TailwindUtility.Background.Blue._700));
        assertEquals("hover:opacity-75", TailwindVariant.hover("opacity-75"));
    }

    @Test
    void focus_prefixesClass() {
        assertEquals("focus:ring-2", TailwindVariant.focus("ring-2"));
    }

    @Test
    void focusVisible_prefixesClass() {
        assertEquals("focus-visible:outline", TailwindVariant.focusVisible("outline"));
    }

    @Test
    void focusWithin_prefixesClass() {
        assertEquals("focus-within:ring-1", TailwindVariant.focusWithin("ring-1"));
    }

    @Test
    void active_prefixesClass() {
        assertEquals("active:scale-95", TailwindVariant.active("scale-95"));
    }

    @Test
    void visited_prefixesClass() {
        assertEquals("visited:text-purple-600", TailwindVariant.visited("text-purple-600"));
    }

    @Test
    void target_prefixesClass() {
        assertEquals("target:ring-2", TailwindVariant.target("ring-2"));
    }

    @Test
    void open_prefixesClass() {
        assertEquals("open:bg-blue-50", TailwindVariant.open("bg-blue-50"));
    }

    // -----------------------------------------------------------------------
    // Form-state variants
    // -----------------------------------------------------------------------

    @Test
    void checked_prefixesClass() {
        assertEquals("checked:bg-blue-500", TailwindVariant.checked(TailwindUtility.Background.Blue._500));
    }

    @Test
    void indeterminate_prefixesClass() {
        assertEquals("indeterminate:opacity-50", TailwindVariant.indeterminate("opacity-50"));
    }

    @Test
    void defaultState_prefixesClass() {
        assertEquals("default:opacity-100", TailwindVariant.defaultState("opacity-100"));
    }

    @Test
    void required_prefixesClass() {
        assertEquals("required:border-red-500", TailwindVariant.required("border-red-500"));
    }

    @Test
    void optional_prefixesClass() {
        assertEquals("optional:border-gray-300", TailwindVariant.optional("border-gray-300"));
    }

    @Test
    void valid_prefixesClass() {
        assertEquals("valid:border-green-500", TailwindVariant.valid("border-green-500"));
    }

    @Test
    void invalid_prefixesClass() {
        assertEquals("invalid:border-red-500", TailwindVariant.invalid("border-red-500"));
    }

    @Test
    void inRange_prefixesClass() {
        assertEquals("in-range:border-green-400", TailwindVariant.inRange("border-green-400"));
    }

    @Test
    void outOfRange_prefixesClass() {
        assertEquals("out-of-range:border-red-400", TailwindVariant.outOfRange("border-red-400"));
    }

    @Test
    void placeholderShown_prefixesClass() {
        assertEquals("placeholder-shown:text-gray-400", TailwindVariant.placeholderShown("text-gray-400"));
    }

    @Test
    void autofill_prefixesClass() {
        assertEquals("autofill:bg-yellow-50", TailwindVariant.autofill("bg-yellow-50"));
    }

    @Test
    void readOnly_prefixesClass() {
        assertEquals("read-only:opacity-75", TailwindVariant.readOnly("opacity-75"));
    }

    @Test
    void disabled_prefixesClass() {
        assertEquals("disabled:opacity-50", TailwindVariant.disabled(TailwindUtility.Opacity._50));
    }

    @Test
    void enabled_prefixesClass() {
        assertEquals("enabled:cursor-pointer", TailwindVariant.enabled("cursor-pointer"));
    }

    // -----------------------------------------------------------------------
    // Positional / structural variants
    // -----------------------------------------------------------------------

    @Test
    void first_prefixesClass() {
        assertEquals("first:mt-0", TailwindVariant.first("mt-0"));
    }

    @Test
    void last_prefixesClass() {
        assertEquals("last:mb-0", TailwindVariant.last("mb-0"));
    }

    @Test
    void only_prefixesClass() {
        assertEquals("only:p-4", TailwindVariant.only("p-4"));
    }

    @Test
    void odd_prefixesClass() {
        assertEquals("odd:bg-gray-100", TailwindVariant.odd("bg-gray-100"));
    }

    @Test
    void even_prefixesClass() {
        assertEquals("even:bg-white", TailwindVariant.even(TailwindUtility.Background.WHITE));
    }

    @Test
    void firstOfType_prefixesClass() {
        assertEquals("first-of-type:mt-0", TailwindVariant.firstOfType("mt-0"));
    }

    @Test
    void lastOfType_prefixesClass() {
        assertEquals("last-of-type:mb-0", TailwindVariant.lastOfType("mb-0"));
    }

    @Test
    void onlyOfType_prefixesClass() {
        assertEquals("only-of-type:p-2", TailwindVariant.onlyOfType("p-2"));
    }

    @Test
    void empty_prefixesClass() {
        assertEquals("empty:hidden", TailwindVariant.empty(TailwindUtility.Display.HIDDEN));
    }

    // -----------------------------------------------------------------------
    // Pseudo-element variants
    // -----------------------------------------------------------------------

    @Test
    void before_prefixesClass() {
        assertEquals("before:block", TailwindVariant.before(TailwindUtility.Display.BLOCK));
    }

    @Test
    void after_prefixesClass() {
        assertEquals("after:block", TailwindVariant.after(TailwindUtility.Display.BLOCK));
    }

    @Test
    void placeholder_prefixesClass() {
        assertEquals("placeholder:text-gray-400", TailwindVariant.placeholder("text-gray-400"));
    }

    @Test
    void file_prefixesClass() {
        assertEquals("file:cursor-pointer", TailwindVariant.file("cursor-pointer"));
    }

    @Test
    void marker_prefixesClass() {
        assertEquals("marker:text-blue-500", TailwindVariant.marker("text-blue-500"));
    }

    @Test
    void selection_prefixesClass() {
        assertEquals("selection:bg-blue-200", TailwindVariant.selection("bg-blue-200"));
    }

    @Test
    void firstLetter_prefixesClass() {
        assertEquals("first-letter:text-4xl", TailwindVariant.firstLetter("text-4xl"));
    }

    @Test
    void firstLine_prefixesClass() {
        assertEquals("first-line:font-bold", TailwindVariant.firstLine(TailwindUtility.FontWeight.BOLD));
    }

    @Test
    void backdrop_prefixesClass() {
        assertEquals("backdrop:bg-black/50", TailwindVariant.backdrop("bg-black/50"));
    }

    // -----------------------------------------------------------------------
    // Media / feature-query variants
    // -----------------------------------------------------------------------

    @Test
    void dark_prefixesClass() {
        assertEquals("dark:bg-gray-900", TailwindVariant.dark(TailwindUtility.Background.Gray._900));
    }

    @Test
    void print_prefixesClass() {
        assertEquals("print:hidden", TailwindVariant.print(TailwindUtility.Display.HIDDEN));
    }

    @Test
    void portrait_prefixesClass() {
        assertEquals("portrait:flex-col", TailwindVariant.portrait(TailwindUtility.FlexDirection.COLUMN));
    }

    @Test
    void landscape_prefixesClass() {
        assertEquals("landscape:flex-row", TailwindVariant.landscape(TailwindUtility.FlexDirection.ROW));
    }

    @Test
    void motionSafe_prefixesClass() {
        assertEquals("motion-safe:animate-spin", TailwindVariant.motionSafe("animate-spin"));
    }

    @Test
    void motionReduce_prefixesClass() {
        assertEquals("motion-reduce:animate-none", TailwindVariant.motionReduce("animate-none"));
    }

    @Test
    void contrastMore_prefixesClass() {
        assertEquals("contrast-more:border-2", TailwindVariant.contrastMore("border-2"));
    }

    @Test
    void contrastLess_prefixesClass() {
        assertEquals("contrast-less:border-0", TailwindVariant.contrastLess("border-0"));
    }

    @Test
    void forcedColors_prefixesClass() {
        assertEquals("forced-colors:hidden", TailwindVariant.forcedColors(TailwindUtility.Display.HIDDEN));
    }

    // -----------------------------------------------------------------------
    // Direction variants
    // -----------------------------------------------------------------------

    @Test
    void ltr_prefixesClass() {
        assertEquals("ltr:ml-4", TailwindVariant.ltr("ml-4"));
    }

    @Test
    void rtl_prefixesClass() {
        assertEquals("rtl:mr-4", TailwindVariant.rtl("mr-4"));
    }

    // -----------------------------------------------------------------------
    // Group / Peer variants
    // -----------------------------------------------------------------------

    @Test
    void group_prefixesClassWithState() {
        assertEquals("group-hover:text-blue-500",
                TailwindVariant.group("hover", TailwindUtility.TextColor.Blue._500));
        assertEquals("group-focus:ring-2", TailwindVariant.group("focus", "ring-2"));
        assertEquals("group-open:rotate-180", TailwindVariant.group("open", "rotate-180"));
    }

    @Test
    void peer_prefixesClassWithState() {
        assertEquals("peer-focus:text-blue-600",
                TailwindVariant.peer("focus", TailwindUtility.TextColor.Blue._600));
        assertEquals("peer-checked:bg-blue-500",
                TailwindVariant.peer("checked", TailwindUtility.Background.Blue._500));
    }

    // -----------------------------------------------------------------------
    // ARIA variants
    // -----------------------------------------------------------------------

    @Test
    void ariaChecked_prefixesClass() {
        assertEquals("aria-checked:bg-blue-500",
                TailwindVariant.ariaChecked(TailwindUtility.Background.Blue._500));
    }

    @Test
    void ariaDisabled_prefixesClass() {
        assertEquals("aria-disabled:opacity-50", TailwindVariant.ariaDisabled("opacity-50"));
    }

    @Test
    void ariaExpanded_prefixesClass() {
        assertEquals("aria-expanded:rotate-180", TailwindVariant.ariaExpanded("rotate-180"));
    }

    @Test
    void ariaHidden_prefixesClass() {
        assertEquals("aria-hidden:hidden", TailwindVariant.ariaHidden(TailwindUtility.Display.HIDDEN));
    }

    @Test
    void ariaPressed_prefixesClass() {
        assertEquals("aria-pressed:font-bold",
                TailwindVariant.ariaPressed(TailwindUtility.FontWeight.BOLD));
    }

    @Test
    void ariaReadonly_prefixesClass() {
        assertEquals("aria-readonly:opacity-75", TailwindVariant.ariaReadonly("opacity-75"));
    }

    @Test
    void ariaRequired_prefixesClass() {
        assertEquals("aria-required:border-red-500", TailwindVariant.ariaRequired("border-red-500"));
    }

    @Test
    void ariaSelected_prefixesClass() {
        assertEquals("aria-selected:font-bold",
                TailwindVariant.ariaSelected(TailwindUtility.FontWeight.BOLD));
    }

    @Test
    void aria_arbitrary_prefixesClass() {
        assertEquals("aria-[sort=ascending]:font-bold",
                TailwindVariant.aria("sort=ascending", TailwindUtility.FontWeight.BOLD));
        assertEquals("aria-[labelledby=title]:text-sm",
                TailwindVariant.aria("labelledby=title", "text-sm"));
    }

    // -----------------------------------------------------------------------
    // Chaining variants
    // -----------------------------------------------------------------------

    @Test
    void chained_darkAndHover_producesCorrectClass() {
        // dark:hover:bg-blue-700
        assertEquals("dark:hover:bg-blue-700",
                TailwindVariant.dark(TailwindVariant.hover(TailwindUtility.Background.Blue._700)));
    }

    @Test
    void chained_mdAndHover_producesCorrectClass() {
        assertEquals("md:hover:text-blue-500",
                TailwindVariant.md(TailwindVariant.hover(TailwindUtility.TextColor.Blue._500)));
    }

    // -----------------------------------------------------------------------
    // Input validation
    // -----------------------------------------------------------------------

    @Test
    void nullClass_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> TailwindVariant.hover(null));
        assertThrows(IllegalArgumentException.class, () -> TailwindVariant.md(""));
    }

    @Test
    void group_nullState_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> TailwindVariant.group(null, "flex"));
        assertThrows(IllegalArgumentException.class, () -> TailwindVariant.group("", "flex"));
    }

    @Test
    void peer_nullState_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> TailwindVariant.peer(null, "flex"));
        assertThrows(IllegalArgumentException.class, () -> TailwindVariant.peer("", "flex"));
    }

    @Test
    void aria_nullAttribute_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> TailwindVariant.aria(null, "flex"));
        assertThrows(IllegalArgumentException.class, () -> TailwindVariant.aria("", "flex"));
    }
}
