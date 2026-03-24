package dev.tailwindutility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit tests for {@link TailwindUtility}, verifying that each constant maps to
 * the correct Tailwind CSS utility class string.
 */
class TailwindUtilityTest {

    // -----------------------------------------------------------------------
    // AlignContent
    // -----------------------------------------------------------------------

    @Test
    void alignContent_constants_mapToCorrectClasses() {
        assertEquals("content-around", TailwindUtility.AlignContent.AROUND);
        assertEquals("content-baseline", TailwindUtility.AlignContent.BASELINE);
        assertEquals("content-between", TailwindUtility.AlignContent.BETWEEN);
        assertEquals("content-center", TailwindUtility.AlignContent.CENTER);
        assertEquals("content-end", TailwindUtility.AlignContent.END);
        assertEquals("content-evenly", TailwindUtility.AlignContent.EVENLY);
        assertEquals("content-normal", TailwindUtility.AlignContent.NORMAL);
        assertEquals("content-start", TailwindUtility.AlignContent.START);
        assertEquals("content-stretch", TailwindUtility.AlignContent.STRETCH);
    }

    // -----------------------------------------------------------------------
    // AlignItems
    // -----------------------------------------------------------------------

    @Test
    void alignItems_constants_mapToCorrectClasses() {
        assertEquals("items-baseline", TailwindUtility.AlignItems.BASELINE);
        assertEquals("items-center", TailwindUtility.AlignItems.CENTER);
        assertEquals("items-end", TailwindUtility.AlignItems.END);
        assertEquals("items-start", TailwindUtility.AlignItems.START);
        assertEquals("items-stretch", TailwindUtility.AlignItems.STRETCH);
    }

    // -----------------------------------------------------------------------
    // AlignSelf
    // -----------------------------------------------------------------------

    @Test
    void alignSelf_constants_mapToCorrectClasses() {
        assertEquals("self-auto", TailwindUtility.AlignSelf.AUTO);
        assertEquals("self-baseline", TailwindUtility.AlignSelf.BASELINE);
        assertEquals("self-center", TailwindUtility.AlignSelf.CENTER);
        assertEquals("self-end", TailwindUtility.AlignSelf.END);
        assertEquals("self-start", TailwindUtility.AlignSelf.START);
        assertEquals("self-stretch", TailwindUtility.AlignSelf.STRETCH);
    }

    // -----------------------------------------------------------------------
    // AspectRatio
    // -----------------------------------------------------------------------

    @Test
    void aspectRatio_constants_mapToCorrectClasses() {
        assertEquals("aspect-auto", TailwindUtility.AspectRatio.AUTO);
        assertEquals("aspect-square", TailwindUtility.AspectRatio.SQUARE);
        assertEquals("aspect-video", TailwindUtility.AspectRatio.VIDEO);
    }

    // -----------------------------------------------------------------------
    // Background
    // -----------------------------------------------------------------------

    @Test
    void background_base_constants_mapToCorrectClasses() {
        assertEquals("bg-black", TailwindUtility.Background.BLACK);
        assertEquals("bg-white", TailwindUtility.Background.WHITE);
        assertEquals("bg-transparent", TailwindUtility.Background.TRANSPARENT);
        assertEquals("bg-current", TailwindUtility.Background.CURRENT);
        assertEquals("bg-inherit", TailwindUtility.Background.INHERIT);
    }

    @Test
    void background_colorVariants_mapToCorrectClasses() {
        assertEquals("bg-slate-50", TailwindUtility.Background.Slate._50);
        assertEquals("bg-slate-500", TailwindUtility.Background.Slate._500);
        assertEquals("bg-slate-950", TailwindUtility.Background.Slate._950);
        assertEquals("bg-red-500", TailwindUtility.Background.Red._500);
        assertEquals("bg-blue-700", TailwindUtility.Background.Blue._700);
        assertEquals("bg-green-300", TailwindUtility.Background.Green._300);
    }

    // -----------------------------------------------------------------------
    // Border
    // -----------------------------------------------------------------------

    @Test
    void border_constants_mapToCorrectClasses() {
        assertEquals("border-0", TailwindUtility.Border.NONE);
        assertEquals("border", TailwindUtility.Border.DEFAULT);
        assertEquals("border-2", TailwindUtility.Border.XSMALL);
        assertEquals("border-4", TailwindUtility.Border.SMALL);
        assertEquals("border-8", TailwindUtility.Border.MEDIUM);
    }

    // -----------------------------------------------------------------------
    // BorderColor
    // -----------------------------------------------------------------------

    @Test
    void borderColor_base_constants_mapToCorrectClasses() {
        assertEquals("border-black", TailwindUtility.BorderColor.BLACK);
        assertEquals("border-white", TailwindUtility.BorderColor.WHITE);
        assertEquals("border-transparent", TailwindUtility.BorderColor.TRANSPARENT);
    }

    @Test
    void borderColor_colorVariants_mapToCorrectClasses() {
        assertEquals("border-blue-500", TailwindUtility.BorderColor.Blue._500);
        assertEquals("border-red-300", TailwindUtility.BorderColor.Red._300);
        assertEquals("border-gray-200", TailwindUtility.BorderColor.Gray._200);
    }

    // -----------------------------------------------------------------------
    // BorderRadius
    // -----------------------------------------------------------------------

    @Test
    void borderRadius_constants_mapToCorrectClasses() {
        assertEquals("rounded-none", TailwindUtility.BorderRadius.NONE);
        assertEquals("rounded-sm", TailwindUtility.BorderRadius.SMALL);
        assertEquals("rounded", TailwindUtility.BorderRadius.MEDIUM);
        assertEquals("rounded-md", TailwindUtility.BorderRadius.LARGE);
        assertEquals("rounded-lg", TailwindUtility.BorderRadius.XLARGE);
        assertEquals("rounded-xl", TailwindUtility.BorderRadius.XXLARGE);
        assertEquals("rounded-2xl", TailwindUtility.BorderRadius.XXXLARGE);
        assertEquals("rounded-3xl", TailwindUtility.BorderRadius.XXXXLARGE);
        assertEquals("rounded-full", TailwindUtility.BorderRadius.FULL);
    }

    // -----------------------------------------------------------------------
    // BoxShadow
    // -----------------------------------------------------------------------

    @Test
    void boxShadow_constants_mapToCorrectClasses() {
        assertEquals("shadow-none", TailwindUtility.BoxShadow.NONE);
        assertEquals("shadow-sm", TailwindUtility.BoxShadow.XSMALL);
        assertEquals("shadow", TailwindUtility.BoxShadow.SMALL);
        assertEquals("shadow-md", TailwindUtility.BoxShadow.MEDIUM);
        assertEquals("shadow-lg", TailwindUtility.BoxShadow.LARGE);
        assertEquals("shadow-xl", TailwindUtility.BoxShadow.XLARGE);
        assertEquals("shadow-2xl", TailwindUtility.BoxShadow.XXLARGE);
        assertEquals("shadow-inner", TailwindUtility.BoxShadow.INNER);
    }

    // -----------------------------------------------------------------------
    // BoxSizing
    // -----------------------------------------------------------------------

    @Test
    void boxSizing_constants_mapToCorrectClasses() {
        assertEquals("box-border", TailwindUtility.BoxSizing.BORDER);
        assertEquals("box-content", TailwindUtility.BoxSizing.CONTENT);
    }

    // -----------------------------------------------------------------------
    // Display
    // -----------------------------------------------------------------------

    @Test
    void display_constants_mapToCorrectClasses() {
        assertEquals("block", TailwindUtility.Display.BLOCK);
        assertEquals("contents", TailwindUtility.Display.CONTENTS);
        assertEquals("flex", TailwindUtility.Display.FLEX);
        assertEquals("flow-root", TailwindUtility.Display.FLOW_ROOT);
        assertEquals("grid", TailwindUtility.Display.GRID);
        assertEquals("hidden", TailwindUtility.Display.HIDDEN);
        assertEquals("inline", TailwindUtility.Display.INLINE);
        assertEquals("inline-block", TailwindUtility.Display.INLINE_BLOCK);
        assertEquals("inline-flex", TailwindUtility.Display.INLINE_FLEX);
        assertEquals("inline-grid", TailwindUtility.Display.INLINE_GRID);
        assertEquals("list-item", TailwindUtility.Display.LIST_ITEM);
        assertEquals("table", TailwindUtility.Display.TABLE);
    }

    // -----------------------------------------------------------------------
    // FlexDirection
    // -----------------------------------------------------------------------

    @Test
    void flexDirection_constants_mapToCorrectClasses() {
        assertEquals("flex-col", TailwindUtility.FlexDirection.COLUMN);
        assertEquals("flex-col-reverse", TailwindUtility.FlexDirection.COLUMN_REVERSE);
        assertEquals("flex-row", TailwindUtility.FlexDirection.ROW);
        assertEquals("flex-row-reverse", TailwindUtility.FlexDirection.ROW_REVERSE);
    }

    // -----------------------------------------------------------------------
    // FlexGrow / FlexShrink
    // -----------------------------------------------------------------------

    @Test
    void flexGrow_constants_mapToCorrectClasses() {
        assertEquals("grow", TailwindUtility.FlexGrow.GROW);
        assertEquals("grow-0", TailwindUtility.FlexGrow.NONE);
    }

    @Test
    void flexShrink_constants_mapToCorrectClasses() {
        assertEquals("shrink", TailwindUtility.FlexShrink.SHRINK);
        assertEquals("shrink-0", TailwindUtility.FlexShrink.NONE);
    }

    // -----------------------------------------------------------------------
    // FlexWrap
    // -----------------------------------------------------------------------

    @Test
    void flexWrap_constants_mapToCorrectClasses() {
        assertEquals("flex-nowrap", TailwindUtility.FlexWrap.NOWRAP);
        assertEquals("flex-wrap", TailwindUtility.FlexWrap.WRAP);
        assertEquals("flex-wrap-reverse", TailwindUtility.FlexWrap.WRAP_REVERSE);
    }

    // -----------------------------------------------------------------------
    // FontSize
    // -----------------------------------------------------------------------

    @Test
    void fontSize_constants_mapToCorrectClasses() {
        assertEquals("text-xs", TailwindUtility.FontSize.XSMALL);
        assertEquals("text-sm", TailwindUtility.FontSize.SMALL);
        assertEquals("text-base", TailwindUtility.FontSize.MEDIUM);
        assertEquals("text-lg", TailwindUtility.FontSize.LARGE);
        assertEquals("text-xl", TailwindUtility.FontSize.XLARGE);
        assertEquals("text-2xl", TailwindUtility.FontSize.XXLARGE);
        assertEquals("text-3xl", TailwindUtility.FontSize.XXXLARGE);
        assertEquals("text-4xl", TailwindUtility.FontSize.XXXXLARGE);
        assertEquals("text-5xl", TailwindUtility.FontSize.XXXXXLARGE);
        assertEquals("text-6xl", TailwindUtility.FontSize.XXXXXXLARGE);
        assertEquals("text-7xl", TailwindUtility.FontSize.XXXXXXXLARGE);
        assertEquals("text-8xl", TailwindUtility.FontSize.XXXXXXXXLARGE);
        assertEquals("text-9xl", TailwindUtility.FontSize.XXXXXXXXXLARGE);
    }

    // -----------------------------------------------------------------------
    // FontStyle
    // -----------------------------------------------------------------------

    @Test
    void fontStyle_constants_mapToCorrectClasses() {
        assertEquals("italic", TailwindUtility.FontStyle.ITALIC);
        assertEquals("not-italic", TailwindUtility.FontStyle.NORMAL);
    }

    // -----------------------------------------------------------------------
    // FontWeight
    // -----------------------------------------------------------------------

    @Test
    void fontWeight_constants_mapToCorrectClasses() {
        assertEquals("font-thin", TailwindUtility.FontWeight.THIN);
        assertEquals("font-extralight", TailwindUtility.FontWeight.EXTRALIGHT);
        assertEquals("font-light", TailwindUtility.FontWeight.LIGHT);
        assertEquals("font-normal", TailwindUtility.FontWeight.NORMAL);
        assertEquals("font-medium", TailwindUtility.FontWeight.MEDIUM);
        assertEquals("font-semibold", TailwindUtility.FontWeight.SEMIBOLD);
        assertEquals("font-bold", TailwindUtility.FontWeight.BOLD);
        assertEquals("font-extrabold", TailwindUtility.FontWeight.EXTRABOLD);
        assertEquals("font-black", TailwindUtility.FontWeight.BLACK);
    }

    // -----------------------------------------------------------------------
    // Gap
    // -----------------------------------------------------------------------

    @Test
    void gap_constants_mapToCorrectClasses() {
        assertEquals("gap-0", TailwindUtility.Gap.NONE);
        assertEquals("gap-1", TailwindUtility.Gap.XSMALL);
        assertEquals("gap-2", TailwindUtility.Gap.SMALL);
        assertEquals("gap-4", TailwindUtility.Gap.MEDIUM);
        assertEquals("gap-6", TailwindUtility.Gap.LARGE);
        assertEquals("gap-8", TailwindUtility.Gap.XLARGE);
        assertEquals("gap-12", TailwindUtility.Gap.XXLARGE);
        assertEquals("gap-16", TailwindUtility.Gap.XXXLARGE);
    }

    @Test
    void gap_columnAndRow_mapToCorrectClasses() {
        assertEquals("gap-x-0", TailwindUtility.Gap.Column.NONE);
        assertEquals("gap-x-4", TailwindUtility.Gap.Column.MEDIUM);
        assertEquals("gap-y-0", TailwindUtility.Gap.Row.NONE);
        assertEquals("gap-y-4", TailwindUtility.Gap.Row.MEDIUM);
    }

    // -----------------------------------------------------------------------
    // Height
    // -----------------------------------------------------------------------

    @Test
    void height_constants_mapToCorrectClasses() {
        assertEquals("h-auto", TailwindUtility.Height.AUTO);
        assertEquals("h-full", TailwindUtility.Height.FULL);
        assertEquals("h-screen", TailwindUtility.Height.SCREEN);
        assertEquals("h-svh", TailwindUtility.Height.SVH);
        assertEquals("h-min", TailwindUtility.Height.MIN);
        assertEquals("h-max", TailwindUtility.Height.MAX);
        assertEquals("h-fit", TailwindUtility.Height.FIT);
        assertEquals("h-0", TailwindUtility.Height.NONE);
        assertEquals("h-4", TailwindUtility.Height.MEDIUM);
    }

    // -----------------------------------------------------------------------
    // JustifyContent
    // -----------------------------------------------------------------------

    @Test
    void justifyContent_constants_mapToCorrectClasses() {
        assertEquals("justify-around", TailwindUtility.JustifyContent.AROUND);
        assertEquals("justify-between", TailwindUtility.JustifyContent.BETWEEN);
        assertEquals("justify-center", TailwindUtility.JustifyContent.CENTER);
        assertEquals("justify-end", TailwindUtility.JustifyContent.END);
        assertEquals("justify-evenly", TailwindUtility.JustifyContent.EVENLY);
        assertEquals("justify-normal", TailwindUtility.JustifyContent.NORMAL);
        assertEquals("justify-start", TailwindUtility.JustifyContent.START);
        assertEquals("justify-stretch", TailwindUtility.JustifyContent.STRETCH);
    }

    // -----------------------------------------------------------------------
    // LineHeight
    // -----------------------------------------------------------------------

    @Test
    void lineHeight_constants_mapToCorrectClasses() {
        assertEquals("leading-none", TailwindUtility.LineHeight.NONE);
        assertEquals("leading-tight", TailwindUtility.LineHeight.TIGHT);
        assertEquals("leading-snug", TailwindUtility.LineHeight.SNUG);
        assertEquals("leading-normal", TailwindUtility.LineHeight.NORMAL);
        assertEquals("leading-relaxed", TailwindUtility.LineHeight.RELAXED);
        assertEquals("leading-loose", TailwindUtility.LineHeight.LOOSE);
    }

    // -----------------------------------------------------------------------
    // Margin
    // -----------------------------------------------------------------------

    @Test
    void margin_base_constants_mapToCorrectClasses() {
        assertEquals("m-auto", TailwindUtility.Margin.AUTO);
        assertEquals("m-0", TailwindUtility.Margin.NONE);
        assertEquals("m-1", TailwindUtility.Margin.XSMALL);
        assertEquals("m-2", TailwindUtility.Margin.SMALL);
        assertEquals("m-4", TailwindUtility.Margin.MEDIUM);
        assertEquals("m-6", TailwindUtility.Margin.LARGE);
        assertEquals("m-8", TailwindUtility.Margin.XLARGE);
        assertEquals("m-12", TailwindUtility.Margin.XXLARGE);
        assertEquals("m-16", TailwindUtility.Margin.XXXLARGE);
    }

    @Test
    void margin_directional_constants_mapToCorrectClasses() {
        assertEquals("mx-auto", TailwindUtility.Margin.Horizontal.AUTO);
        assertEquals("mx-4", TailwindUtility.Margin.Horizontal.MEDIUM);
        assertEquals("my-auto", TailwindUtility.Margin.Vertical.AUTO);
        assertEquals("my-4", TailwindUtility.Margin.Vertical.MEDIUM);
        assertEquals("mt-4", TailwindUtility.Margin.Top.MEDIUM);
        assertEquals("mr-4", TailwindUtility.Margin.Right.MEDIUM);
        assertEquals("mb-4", TailwindUtility.Margin.Bottom.MEDIUM);
        assertEquals("ml-4", TailwindUtility.Margin.Left.MEDIUM);
    }

    // -----------------------------------------------------------------------
    // MaxHeight / MaxWidth
    // -----------------------------------------------------------------------

    @Test
    void maxHeight_constants_mapToCorrectClasses() {
        assertEquals("max-h-none", TailwindUtility.MaxHeight.NONE);
        assertEquals("max-h-full", TailwindUtility.MaxHeight.FULL);
        assertEquals("max-h-screen", TailwindUtility.MaxHeight.SCREEN);
        assertEquals("max-h-fit", TailwindUtility.MaxHeight.FIT);
    }

    @Test
    void maxWidth_constants_mapToCorrectClasses() {
        assertEquals("max-w-none", TailwindUtility.MaxWidth.NONE);
        assertEquals("max-w-full", TailwindUtility.MaxWidth.FULL);
        assertEquals("max-w-xs", TailwindUtility.MaxWidth.XSMALL);
        assertEquals("max-w-sm", TailwindUtility.MaxWidth.SMALL);
        assertEquals("max-w-md", TailwindUtility.MaxWidth.MEDIUM);
        assertEquals("max-w-lg", TailwindUtility.MaxWidth.LARGE);
        assertEquals("max-w-xl", TailwindUtility.MaxWidth.XLARGE);
        assertEquals("max-w-2xl", TailwindUtility.MaxWidth.XXLARGE);
        assertEquals("max-w-7xl", TailwindUtility.MaxWidth.XXXXXXXLARGE);
        assertEquals("max-w-prose", TailwindUtility.MaxWidth.PROSE);
    }

    // -----------------------------------------------------------------------
    // MinHeight / MinWidth
    // -----------------------------------------------------------------------

    @Test
    void minHeight_constants_mapToCorrectClasses() {
        assertEquals("min-h-0", TailwindUtility.MinHeight.NONE);
        assertEquals("min-h-full", TailwindUtility.MinHeight.FULL);
        assertEquals("min-h-screen", TailwindUtility.MinHeight.SCREEN);
        assertEquals("min-h-fit", TailwindUtility.MinHeight.FIT);
    }

    @Test
    void minWidth_constants_mapToCorrectClasses() {
        assertEquals("min-w-0", TailwindUtility.MinWidth.NONE);
        assertEquals("min-w-full", TailwindUtility.MinWidth.FULL);
        assertEquals("min-w-fit", TailwindUtility.MinWidth.FIT);
    }

    // -----------------------------------------------------------------------
    // Overflow
    // -----------------------------------------------------------------------

    @Test
    void overflow_constants_mapToCorrectClasses() {
        assertEquals("overflow-auto", TailwindUtility.Overflow.AUTO);
        assertEquals("overflow-hidden", TailwindUtility.Overflow.HIDDEN);
        assertEquals("overflow-clip", TailwindUtility.Overflow.CLIP);
        assertEquals("overflow-visible", TailwindUtility.Overflow.VISIBLE);
        assertEquals("overflow-scroll", TailwindUtility.Overflow.SCROLL);
    }

    @Test
    void overflow_directional_constants_mapToCorrectClasses() {
        assertEquals("overflow-x-auto", TailwindUtility.Overflow.X.AUTO);
        assertEquals("overflow-x-hidden", TailwindUtility.Overflow.X.HIDDEN);
        assertEquals("overflow-y-auto", TailwindUtility.Overflow.Y.AUTO);
        assertEquals("overflow-y-scroll", TailwindUtility.Overflow.Y.SCROLL);
    }

    // -----------------------------------------------------------------------
    // Padding
    // -----------------------------------------------------------------------

    @Test
    void padding_base_constants_mapToCorrectClasses() {
        assertEquals("p-0", TailwindUtility.Padding.NONE);
        assertEquals("p-1", TailwindUtility.Padding.XSMALL);
        assertEquals("p-2", TailwindUtility.Padding.SMALL);
        assertEquals("p-4", TailwindUtility.Padding.MEDIUM);
        assertEquals("p-6", TailwindUtility.Padding.LARGE);
        assertEquals("p-8", TailwindUtility.Padding.XLARGE);
        assertEquals("p-12", TailwindUtility.Padding.XXLARGE);
        assertEquals("p-16", TailwindUtility.Padding.XXXLARGE);
    }

    @Test
    void padding_directional_constants_mapToCorrectClasses() {
        assertEquals("px-4", TailwindUtility.Padding.Horizontal.MEDIUM);
        assertEquals("py-4", TailwindUtility.Padding.Vertical.MEDIUM);
        assertEquals("pt-4", TailwindUtility.Padding.Top.MEDIUM);
        assertEquals("pr-4", TailwindUtility.Padding.Right.MEDIUM);
        assertEquals("pb-4", TailwindUtility.Padding.Bottom.MEDIUM);
        assertEquals("pl-4", TailwindUtility.Padding.Left.MEDIUM);
    }

    // -----------------------------------------------------------------------
    // Position
    // -----------------------------------------------------------------------

    @Test
    void position_constants_mapToCorrectClasses() {
        assertEquals("absolute", TailwindUtility.Position.ABSOLUTE);
        assertEquals("fixed", TailwindUtility.Position.FIXED);
        assertEquals("relative", TailwindUtility.Position.RELATIVE);
        assertEquals("static", TailwindUtility.Position.STATIC);
        assertEquals("sticky", TailwindUtility.Position.STICKY);
    }

    // -----------------------------------------------------------------------
    // TextAlignment
    // -----------------------------------------------------------------------

    @Test
    void textAlignment_constants_mapToCorrectClasses() {
        assertEquals("text-center", TailwindUtility.TextAlignment.CENTER);
        assertEquals("text-end", TailwindUtility.TextAlignment.END);
        assertEquals("text-justify", TailwindUtility.TextAlignment.JUSTIFY);
        assertEquals("text-left", TailwindUtility.TextAlignment.LEFT);
        assertEquals("text-right", TailwindUtility.TextAlignment.RIGHT);
        assertEquals("text-start", TailwindUtility.TextAlignment.START);
    }

    // -----------------------------------------------------------------------
    // TextColor
    // -----------------------------------------------------------------------

    @Test
    void textColor_base_constants_mapToCorrectClasses() {
        assertEquals("text-black", TailwindUtility.TextColor.BLACK);
        assertEquals("text-white", TailwindUtility.TextColor.WHITE);
        assertEquals("text-transparent", TailwindUtility.TextColor.TRANSPARENT);
        assertEquals("text-current", TailwindUtility.TextColor.CURRENT);
        assertEquals("text-inherit", TailwindUtility.TextColor.INHERIT);
    }

    @Test
    void textColor_colorVariants_mapToCorrectClasses() {
        assertEquals("text-slate-50", TailwindUtility.TextColor.Slate._50);
        assertEquals("text-slate-950", TailwindUtility.TextColor.Slate._950);
        assertEquals("text-blue-500", TailwindUtility.TextColor.Blue._500);
        assertEquals("text-red-700", TailwindUtility.TextColor.Red._700);
        assertEquals("text-green-400", TailwindUtility.TextColor.Green._400);
        assertEquals("text-rose-100", TailwindUtility.TextColor.Rose._100);
    }

    // -----------------------------------------------------------------------
    // TextOverflow
    // -----------------------------------------------------------------------

    @Test
    void textOverflow_constants_mapToCorrectClasses() {
        assertEquals("text-clip", TailwindUtility.TextOverflow.CLIP);
        assertEquals("text-ellipsis", TailwindUtility.TextOverflow.ELLIPSIS);
        assertEquals("truncate", TailwindUtility.TextOverflow.TRUNCATE);
    }

    // -----------------------------------------------------------------------
    // TextTransform
    // -----------------------------------------------------------------------

    @Test
    void textTransform_constants_mapToCorrectClasses() {
        assertEquals("capitalize", TailwindUtility.TextTransform.CAPITALIZE);
        assertEquals("lowercase", TailwindUtility.TextTransform.LOWERCASE);
        assertEquals("normal-case", TailwindUtility.TextTransform.NORMAL);
        assertEquals("uppercase", TailwindUtility.TextTransform.UPPERCASE);
    }

    // -----------------------------------------------------------------------
    // Whitespace
    // -----------------------------------------------------------------------

    @Test
    void whitespace_constants_mapToCorrectClasses() {
        assertEquals("whitespace-break-spaces", TailwindUtility.Whitespace.BREAK_SPACES);
        assertEquals("whitespace-normal", TailwindUtility.Whitespace.NORMAL);
        assertEquals("whitespace-nowrap", TailwindUtility.Whitespace.NOWRAP);
        assertEquals("whitespace-pre", TailwindUtility.Whitespace.PRE);
        assertEquals("whitespace-pre-line", TailwindUtility.Whitespace.PRE_LINE);
        assertEquals("whitespace-pre-wrap", TailwindUtility.Whitespace.PRE_WRAP);
    }

    // -----------------------------------------------------------------------
    // Width
    // -----------------------------------------------------------------------

    @Test
    void width_constants_mapToCorrectClasses() {
        assertEquals("w-auto", TailwindUtility.Width.AUTO);
        assertEquals("w-full", TailwindUtility.Width.FULL);
        assertEquals("w-screen", TailwindUtility.Width.SCREEN);
        assertEquals("w-min", TailwindUtility.Width.MIN);
        assertEquals("w-max", TailwindUtility.Width.MAX);
        assertEquals("w-fit", TailwindUtility.Width.FIT);
        assertEquals("w-0", TailwindUtility.Width.NONE);
        assertEquals("w-4", TailwindUtility.Width.MEDIUM);
    }

    // -----------------------------------------------------------------------
    // ZIndex
    // -----------------------------------------------------------------------

    @Test
    void zIndex_constants_mapToCorrectClasses() {
        assertEquals("z-auto", TailwindUtility.ZIndex.AUTO);
        assertEquals("z-0", TailwindUtility.ZIndex.NONE);
        assertEquals("z-10", TailwindUtility.ZIndex.XSMALL);
        assertEquals("z-20", TailwindUtility.ZIndex.SMALL);
        assertEquals("z-30", TailwindUtility.ZIndex.MEDIUM);
        assertEquals("z-40", TailwindUtility.ZIndex.LARGE);
        assertEquals("z-50", TailwindUtility.ZIndex.XLARGE);
    }

    // -----------------------------------------------------------------------
    // Feature flags resource
    // -----------------------------------------------------------------------

    @Test
    void featureFlagsProperties_isPresent_onClasspath() {
        assertNotNull(
                getClass().getClassLoader().getResource("vaadin-featureflags.properties"),
                "vaadin-featureflags.properties should be present on the classpath"
        );
    }

    @Test
    void featureFlagsProperties_enablesTailwindCss() throws Exception {
        var url = getClass().getClassLoader().getResource("vaadin-featureflags.properties");
        assertNotNull(url);
        var props = new java.util.Properties();
        try (var stream = url.openStream()) {
            props.load(stream);
        }
        assertEquals("true", props.getProperty("com.vaadin.experimental.tailwindCss"),
                "vaadin-featureflags.properties must set com.vaadin.experimental.tailwindCss=true");
    }
}
