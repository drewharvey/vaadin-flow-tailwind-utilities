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
    // Accessibility
    // -----------------------------------------------------------------------

    @Test
    void accessibility_constants_mapToCorrectClasses() {
        assertEquals("sr-only", TailwindUtility.Accessibility.SCREEN_READER_ONLY);
        assertEquals("not-sr-only", TailwindUtility.Accessibility.NOT_SCREEN_READER_ONLY);
    }

    // -----------------------------------------------------------------------
    // Animation
    // -----------------------------------------------------------------------

    @Test
    void animation_constants_mapToCorrectClasses() {
        assertEquals("animate-none", TailwindUtility.Animation.NONE);
        assertEquals("animate-spin", TailwindUtility.Animation.SPIN);
        assertEquals("animate-ping", TailwindUtility.Animation.PING);
        assertEquals("animate-pulse", TailwindUtility.Animation.PULSE);
        assertEquals("animate-bounce", TailwindUtility.Animation.BOUNCE);
    }

    // -----------------------------------------------------------------------
    // Appearance
    // -----------------------------------------------------------------------

    @Test
    void appearance_constants_mapToCorrectClasses() {
        assertEquals("appearance-none", TailwindUtility.Appearance.NONE);
        assertEquals("appearance-auto", TailwindUtility.Appearance.AUTO);
    }

    // -----------------------------------------------------------------------
    // BackdropFilter
    // -----------------------------------------------------------------------

    @Test
    void backdropFilter_constants_mapToCorrectClasses() {
        assertEquals("backdrop-blur-none", TailwindUtility.BackdropFilter.NONE);
        assertEquals("backdrop-blur-sm", TailwindUtility.BackdropFilter.BLUR_SMALL);
        assertEquals("backdrop-blur", TailwindUtility.BackdropFilter.BLUR);
        assertEquals("backdrop-blur-3xl", TailwindUtility.BackdropFilter.BLUR_XXXLARGE);
    }

    // -----------------------------------------------------------------------
    // BackgroundAttachment / Clip / Image / Origin / Position / Repeat / Size
    // -----------------------------------------------------------------------

    @Test
    void backgroundAttachment_constants_mapToCorrectClasses() {
        assertEquals("bg-fixed", TailwindUtility.BackgroundAttachment.FIXED);
        assertEquals("bg-local", TailwindUtility.BackgroundAttachment.LOCAL);
        assertEquals("bg-scroll", TailwindUtility.BackgroundAttachment.SCROLL);
    }

    @Test
    void backgroundBlendMode_constants_mapToCorrectClasses() {
        assertEquals("bg-blend-normal", TailwindUtility.BackgroundBlendMode.NORMAL);
        assertEquals("bg-blend-multiply", TailwindUtility.BackgroundBlendMode.MULTIPLY);
        assertEquals("bg-blend-luminosity", TailwindUtility.BackgroundBlendMode.LUMINOSITY);
    }

    @Test
    void backgroundClip_constants_mapToCorrectClasses() {
        assertEquals("bg-clip-border", TailwindUtility.BackgroundClip.BORDER);
        assertEquals("bg-clip-padding", TailwindUtility.BackgroundClip.PADDING);
        assertEquals("bg-clip-content", TailwindUtility.BackgroundClip.CONTENT);
        assertEquals("bg-clip-text", TailwindUtility.BackgroundClip.TEXT);
    }

    @Test
    void backgroundImage_constants_mapToCorrectClasses() {
        assertEquals("bg-none", TailwindUtility.BackgroundImage.NONE);
        assertEquals("bg-gradient-to-t", TailwindUtility.BackgroundImage.GRADIENT_TO_TOP);
        assertEquals("bg-gradient-to-r", TailwindUtility.BackgroundImage.GRADIENT_TO_RIGHT);
        assertEquals("bg-gradient-to-b", TailwindUtility.BackgroundImage.GRADIENT_TO_BOTTOM);
        assertEquals("bg-gradient-to-tl", TailwindUtility.BackgroundImage.GRADIENT_TO_TOP_LEFT);
    }

    @Test
    void backgroundOrigin_constants_mapToCorrectClasses() {
        assertEquals("bg-origin-border", TailwindUtility.BackgroundOrigin.BORDER);
        assertEquals("bg-origin-padding", TailwindUtility.BackgroundOrigin.PADDING);
        assertEquals("bg-origin-content", TailwindUtility.BackgroundOrigin.CONTENT);
    }

    @Test
    void backgroundPosition_constants_mapToCorrectClasses() {
        assertEquals("bg-bottom", TailwindUtility.BackgroundPosition.BOTTOM);
        assertEquals("bg-center", TailwindUtility.BackgroundPosition.CENTER);
        assertEquals("bg-left", TailwindUtility.BackgroundPosition.LEFT);
        assertEquals("bg-right-top", TailwindUtility.BackgroundPosition.RIGHT_TOP);
        assertEquals("bg-top", TailwindUtility.BackgroundPosition.TOP);
    }

    @Test
    void backgroundRepeat_constants_mapToCorrectClasses() {
        assertEquals("bg-repeat", TailwindUtility.BackgroundRepeat.REPEAT);
        assertEquals("bg-no-repeat", TailwindUtility.BackgroundRepeat.NO_REPEAT);
        assertEquals("bg-repeat-x", TailwindUtility.BackgroundRepeat.REPEAT_X);
        assertEquals("bg-repeat-y", TailwindUtility.BackgroundRepeat.REPEAT_Y);
        assertEquals("bg-repeat-round", TailwindUtility.BackgroundRepeat.REPEAT_ROUND);
        assertEquals("bg-repeat-space", TailwindUtility.BackgroundRepeat.REPEAT_SPACE);
    }

    @Test
    void backgroundSize_constants_mapToCorrectClasses() {
        assertEquals("bg-auto", TailwindUtility.BackgroundSize.AUTO);
        assertEquals("bg-cover", TailwindUtility.BackgroundSize.COVER);
        assertEquals("bg-contain", TailwindUtility.BackgroundSize.CONTAIN);
    }

    // -----------------------------------------------------------------------
    // BorderCollapse / BorderStyle / BoxDecorationBreak
    // -----------------------------------------------------------------------

    @Test
    void borderCollapse_constants_mapToCorrectClasses() {
        assertEquals("border-collapse", TailwindUtility.BorderCollapse.COLLAPSE);
        assertEquals("border-separate", TailwindUtility.BorderCollapse.SEPARATE);
    }

    @Test
    void borderStyle_constants_mapToCorrectClasses() {
        assertEquals("border-solid", TailwindUtility.BorderStyle.SOLID);
        assertEquals("border-dashed", TailwindUtility.BorderStyle.DASHED);
        assertEquals("border-dotted", TailwindUtility.BorderStyle.DOTTED);
        assertEquals("border-double", TailwindUtility.BorderStyle.DOUBLE);
        assertEquals("border-hidden", TailwindUtility.BorderStyle.HIDDEN);
        assertEquals("border-none", TailwindUtility.BorderStyle.NONE);
    }

    @Test
    void boxDecorationBreak_constants_mapToCorrectClasses() {
        assertEquals("box-decoration-clone", TailwindUtility.BoxDecorationBreak.CLONE);
        assertEquals("box-decoration-slice", TailwindUtility.BoxDecorationBreak.SLICE);
    }

    // -----------------------------------------------------------------------
    // Break* / CaptionSide / Clear / Columns / Cursor
    // -----------------------------------------------------------------------

    @Test
    void breakAfter_constants_mapToCorrectClasses() {
        assertEquals("break-after-auto", TailwindUtility.BreakAfter.AUTO);
        assertEquals("break-after-avoid", TailwindUtility.BreakAfter.AVOID);
        assertEquals("break-after-column", TailwindUtility.BreakAfter.COLUMN);
        assertEquals("break-after-page", TailwindUtility.BreakAfter.PAGE);
    }

    @Test
    void breakBefore_constants_mapToCorrectClasses() {
        assertEquals("break-before-auto", TailwindUtility.BreakBefore.AUTO);
        assertEquals("break-before-avoid", TailwindUtility.BreakBefore.AVOID);
        assertEquals("break-before-left", TailwindUtility.BreakBefore.LEFT);
    }

    @Test
    void breakInside_constants_mapToCorrectClasses() {
        assertEquals("break-inside-auto", TailwindUtility.BreakInside.AUTO);
        assertEquals("break-inside-avoid", TailwindUtility.BreakInside.AVOID);
        assertEquals("break-inside-avoid-column", TailwindUtility.BreakInside.AVOID_COLUMN);
    }

    @Test
    void captionSide_constants_mapToCorrectClasses() {
        assertEquals("caption-top", TailwindUtility.CaptionSide.TOP);
        assertEquals("caption-bottom", TailwindUtility.CaptionSide.BOTTOM);
    }

    @Test
    void clear_constants_mapToCorrectClasses() {
        assertEquals("clear-left", TailwindUtility.Clear.LEFT);
        assertEquals("clear-right", TailwindUtility.Clear.RIGHT);
        assertEquals("clear-both", TailwindUtility.Clear.BOTH);
        assertEquals("clear-none", TailwindUtility.Clear.NONE);
        assertEquals("clear-start", TailwindUtility.Clear.START);
        assertEquals("clear-end", TailwindUtility.Clear.END);
    }

    @Test
    void columns_constants_mapToCorrectClasses() {
        assertEquals("columns-auto", TailwindUtility.Columns.AUTO);
        assertEquals("columns-1", TailwindUtility.Columns._1);
        assertEquals("columns-12", TailwindUtility.Columns._12);
        assertEquals("columns-sm", TailwindUtility.Columns.SMALL);
        assertEquals("columns-2xl", TailwindUtility.Columns.XXLARGE);
    }

    @Test
    void cursor_constants_mapToCorrectClasses() {
        assertEquals("cursor-pointer", TailwindUtility.Cursor.POINTER);
        assertEquals("cursor-not-allowed", TailwindUtility.Cursor.NOT_ALLOWED);
        assertEquals("cursor-grab", TailwindUtility.Cursor.GRAB);
        assertEquals("cursor-zoom-in", TailwindUtility.Cursor.ZOOM_IN);
        assertEquals("cursor-default", TailwindUtility.Cursor.DEFAULT);
    }

    // -----------------------------------------------------------------------
    // Filter
    // -----------------------------------------------------------------------

    @Test
    void filter_blur_constants_mapToCorrectClasses() {
        assertEquals("blur-none", TailwindUtility.Filter.Blur.NONE);
        assertEquals("blur-sm", TailwindUtility.Filter.Blur.SMALL);
        assertEquals("blur", TailwindUtility.Filter.Blur.DEFAULT);
        assertEquals("blur-3xl", TailwindUtility.Filter.Blur.XXXLARGE);
    }

    @Test
    void filter_brightness_constants_mapToCorrectClasses() {
        assertEquals("brightness-0", TailwindUtility.Filter.Brightness._0);
        assertEquals("brightness-100", TailwindUtility.Filter.Brightness._100);
        assertEquals("brightness-150", TailwindUtility.Filter.Brightness._150);
    }

    @Test
    void filter_contrast_constants_mapToCorrectClasses() {
        assertEquals("contrast-0", TailwindUtility.Filter.Contrast._0);
        assertEquals("contrast-100", TailwindUtility.Filter.Contrast._100);
        assertEquals("contrast-200", TailwindUtility.Filter.Contrast._200);
    }

    @Test
    void filter_grayscale_invert_sepia_constants_mapToCorrectClasses() {
        assertEquals("grayscale-0", TailwindUtility.Filter.Grayscale.NONE);
        assertEquals("grayscale", TailwindUtility.Filter.Grayscale.FULL);
        assertEquals("invert-0", TailwindUtility.Filter.Invert.NONE);
        assertEquals("invert", TailwindUtility.Filter.Invert.FULL);
        assertEquals("sepia-0", TailwindUtility.Filter.Sepia.NONE);
        assertEquals("sepia", TailwindUtility.Filter.Sepia.FULL);
    }

    @Test
    void filter_hueRotate_saturate_constants_mapToCorrectClasses() {
        assertEquals("hue-rotate-0", TailwindUtility.Filter.HueRotate._0);
        assertEquals("hue-rotate-90", TailwindUtility.Filter.HueRotate._90);
        assertEquals("saturate-0", TailwindUtility.Filter.Saturate._0);
        assertEquals("saturate-200", TailwindUtility.Filter.Saturate._200);
    }

    // -----------------------------------------------------------------------
    // Flex / FlexBasis / Float / FontFamily / FontSmoothing / FontVariantNumeric
    // -----------------------------------------------------------------------

    @Test
    void flex_shorthand_constants_mapToCorrectClasses() {
        assertEquals("flex-1", TailwindUtility.Flex._1);
        assertEquals("flex-auto", TailwindUtility.Flex.AUTO);
        assertEquals("flex-initial", TailwindUtility.Flex.INITIAL);
        assertEquals("flex-none", TailwindUtility.Flex.NONE);
    }

    @Test
    void flexBasis_constants_mapToCorrectClasses() {
        assertEquals("basis-auto", TailwindUtility.FlexBasis.AUTO);
        assertEquals("basis-full", TailwindUtility.FlexBasis.FULL);
        assertEquals("basis-0", TailwindUtility.FlexBasis.NONE);
        assertEquals("basis-4", TailwindUtility.FlexBasis.MEDIUM);
        assertEquals("basis-1/2", TailwindUtility.FlexBasis.HALF);
        assertEquals("basis-1/3", TailwindUtility.FlexBasis.ONE_THIRD);
    }

    @Test
    void float_constants_mapToCorrectClasses() {
        assertEquals("float-left", TailwindUtility.Float.LEFT);
        assertEquals("float-right", TailwindUtility.Float.RIGHT);
        assertEquals("float-none", TailwindUtility.Float.NONE);
        assertEquals("float-start", TailwindUtility.Float.START);
        assertEquals("float-end", TailwindUtility.Float.END);
    }

    @Test
    void fontFamily_constants_mapToCorrectClasses() {
        assertEquals("font-sans", TailwindUtility.FontFamily.SANS);
        assertEquals("font-serif", TailwindUtility.FontFamily.SERIF);
        assertEquals("font-mono", TailwindUtility.FontFamily.MONO);
    }

    @Test
    void fontSmoothing_constants_mapToCorrectClasses() {
        assertEquals("antialiased", TailwindUtility.FontSmoothing.ANTIALIASED);
        assertEquals("subpixel-antialiased", TailwindUtility.FontSmoothing.SUBPIXEL_ANTIALIASED);
    }

    @Test
    void fontVariantNumeric_constants_mapToCorrectClasses() {
        assertEquals("normal-nums", TailwindUtility.FontVariantNumeric.NORMAL);
        assertEquals("ordinal", TailwindUtility.FontVariantNumeric.ORDINAL);
        assertEquals("tabular-nums", TailwindUtility.FontVariantNumeric.TABULAR_NUMS);
        assertEquals("diagonal-fractions", TailwindUtility.FontVariantNumeric.DIAGONAL_FRACTIONS);
    }

    // -----------------------------------------------------------------------
    // Grid / GridColumn / GridRow
    // -----------------------------------------------------------------------

    @Test
    void grid_templateColumns_mapToCorrectClasses() {
        assertEquals("grid-cols-none", TailwindUtility.Grid.TemplateColumns.NONE);
        assertEquals("grid-cols-1", TailwindUtility.Grid.TemplateColumns._1);
        assertEquals("grid-cols-12", TailwindUtility.Grid.TemplateColumns._12);
        assertEquals("grid-cols-subgrid", TailwindUtility.Grid.TemplateColumns.SUBGRID);
    }

    @Test
    void grid_templateRows_mapToCorrectClasses() {
        assertEquals("grid-rows-none", TailwindUtility.Grid.TemplateRows.NONE);
        assertEquals("grid-rows-1", TailwindUtility.Grid.TemplateRows._1);
        assertEquals("grid-rows-6", TailwindUtility.Grid.TemplateRows._6);
    }

    @Test
    void grid_autoFlow_mapToCorrectClasses() {
        assertEquals("grid-flow-row", TailwindUtility.Grid.AutoFlow.ROW);
        assertEquals("grid-flow-col", TailwindUtility.Grid.AutoFlow.COLUMN);
        assertEquals("grid-flow-dense", TailwindUtility.Grid.AutoFlow.DENSE);
        assertEquals("grid-flow-col-dense", TailwindUtility.Grid.AutoFlow.COLUMN_DENSE);
    }

    @Test
    void grid_autoColumnsAndRows_mapToCorrectClasses() {
        assertEquals("auto-cols-auto", TailwindUtility.Grid.AutoColumns.AUTO);
        assertEquals("auto-cols-fr", TailwindUtility.Grid.AutoColumns.FR);
        assertEquals("auto-rows-auto", TailwindUtility.Grid.AutoRows.AUTO);
        assertEquals("auto-rows-fr", TailwindUtility.Grid.AutoRows.FR);
    }

    @Test
    void gridColumn_constants_mapToCorrectClasses() {
        assertEquals("col-auto", TailwindUtility.GridColumn.AUTO);
        assertEquals("col-span-full", TailwindUtility.GridColumn.SPAN_FULL);
        assertEquals("col-span-6", TailwindUtility.GridColumn.SPAN_6);
        assertEquals("col-start-1", TailwindUtility.GridColumn.START_1);
        assertEquals("col-start-13", TailwindUtility.GridColumn.START_13);
        assertEquals("col-end-7", TailwindUtility.GridColumn.END_7);
        assertEquals("col-end-auto", TailwindUtility.GridColumn.END_AUTO);
    }

    @Test
    void gridRow_constants_mapToCorrectClasses() {
        assertEquals("row-auto", TailwindUtility.GridRow.AUTO);
        assertEquals("row-span-full", TailwindUtility.GridRow.SPAN_FULL);
        assertEquals("row-span-3", TailwindUtility.GridRow.SPAN_3);
        assertEquals("row-start-1", TailwindUtility.GridRow.START_1);
        assertEquals("row-end-7", TailwindUtility.GridRow.END_7);
        assertEquals("row-end-auto", TailwindUtility.GridRow.END_AUTO);
    }

    // -----------------------------------------------------------------------
    // Hyphens / Inset / Isolation
    // -----------------------------------------------------------------------

    @Test
    void hyphens_constants_mapToCorrectClasses() {
        assertEquals("hyphens-none", TailwindUtility.Hyphens.NONE);
        assertEquals("hyphens-manual", TailwindUtility.Hyphens.MANUAL);
        assertEquals("hyphens-auto", TailwindUtility.Hyphens.AUTO);
    }

    @Test
    void inset_base_constants_mapToCorrectClasses() {
        assertEquals("inset-auto", TailwindUtility.Inset.AUTO);
        assertEquals("inset-full", TailwindUtility.Inset.FULL);
        assertEquals("inset-1/2", TailwindUtility.Inset.HALF);
        assertEquals("inset-0", TailwindUtility.Inset.NONE);
        assertEquals("inset-4", TailwindUtility.Inset.MEDIUM);
    }

    @Test
    void inset_directional_constants_mapToCorrectClasses() {
        assertEquals("inset-x-4", TailwindUtility.Inset.X.MEDIUM);
        assertEquals("inset-y-4", TailwindUtility.Inset.Y.MEDIUM);
        assertEquals("top-0", TailwindUtility.Inset.Top.NONE);
        assertEquals("top-4", TailwindUtility.Inset.Top.MEDIUM);
        assertEquals("right-full", TailwindUtility.Inset.Right.FULL);
        assertEquals("bottom-1/2", TailwindUtility.Inset.Bottom.HALF);
        assertEquals("left-auto", TailwindUtility.Inset.Left.AUTO);
    }

    @Test
    void isolation_constants_mapToCorrectClasses() {
        assertEquals("isolate", TailwindUtility.Isolation.ISOLATE);
        assertEquals("isolation-auto", TailwindUtility.Isolation.AUTO);
    }

    // -----------------------------------------------------------------------
    // JustifyItems / JustifySelf
    // -----------------------------------------------------------------------

    @Test
    void justifyItems_constants_mapToCorrectClasses() {
        assertEquals("justify-items-start", TailwindUtility.JustifyItems.START);
        assertEquals("justify-items-end", TailwindUtility.JustifyItems.END);
        assertEquals("justify-items-center", TailwindUtility.JustifyItems.CENTER);
        assertEquals("justify-items-stretch", TailwindUtility.JustifyItems.STRETCH);
    }

    @Test
    void justifySelf_constants_mapToCorrectClasses() {
        assertEquals("justify-self-auto", TailwindUtility.JustifySelf.AUTO);
        assertEquals("justify-self-start", TailwindUtility.JustifySelf.START);
        assertEquals("justify-self-center", TailwindUtility.JustifySelf.CENTER);
        assertEquals("justify-self-stretch", TailwindUtility.JustifySelf.STRETCH);
    }

    // -----------------------------------------------------------------------
    // LetterSpacing / LineClamp / ListStylePosition / ListStyleType
    // -----------------------------------------------------------------------

    @Test
    void letterSpacing_constants_mapToCorrectClasses() {
        assertEquals("tracking-tighter", TailwindUtility.LetterSpacing.TIGHTER);
        assertEquals("tracking-tight", TailwindUtility.LetterSpacing.TIGHT);
        assertEquals("tracking-normal", TailwindUtility.LetterSpacing.NORMAL);
        assertEquals("tracking-wide", TailwindUtility.LetterSpacing.WIDE);
        assertEquals("tracking-wider", TailwindUtility.LetterSpacing.WIDER);
        assertEquals("tracking-widest", TailwindUtility.LetterSpacing.WIDEST);
    }

    @Test
    void lineClamp_constants_mapToCorrectClasses() {
        assertEquals("line-clamp-none", TailwindUtility.LineClamp.NONE);
        assertEquals("line-clamp-1", TailwindUtility.LineClamp._1);
        assertEquals("line-clamp-6", TailwindUtility.LineClamp._6);
    }

    @Test
    void listStylePosition_constants_mapToCorrectClasses() {
        assertEquals("list-inside", TailwindUtility.ListStylePosition.INSIDE);
        assertEquals("list-outside", TailwindUtility.ListStylePosition.OUTSIDE);
    }

    @Test
    void listStyleType_constants_mapToCorrectClasses() {
        assertEquals("list-none", TailwindUtility.ListStyleType.NONE);
        assertEquals("list-disc", TailwindUtility.ListStyleType.DISC);
        assertEquals("list-decimal", TailwindUtility.ListStyleType.DECIMAL);
    }

    // -----------------------------------------------------------------------
    // MixBlendMode / ObjectFit / ObjectPosition / Opacity / Order
    // -----------------------------------------------------------------------

    @Test
    void mixBlendMode_constants_mapToCorrectClasses() {
        assertEquals("mix-blend-normal", TailwindUtility.MixBlendMode.NORMAL);
        assertEquals("mix-blend-multiply", TailwindUtility.MixBlendMode.MULTIPLY);
        assertEquals("mix-blend-plus-lighter", TailwindUtility.MixBlendMode.PLUS_LIGHTER);
    }

    @Test
    void objectFit_constants_mapToCorrectClasses() {
        assertEquals("object-contain", TailwindUtility.ObjectFit.CONTAIN);
        assertEquals("object-cover", TailwindUtility.ObjectFit.COVER);
        assertEquals("object-fill", TailwindUtility.ObjectFit.FILL);
        assertEquals("object-none", TailwindUtility.ObjectFit.NONE);
        assertEquals("object-scale-down", TailwindUtility.ObjectFit.SCALE_DOWN);
    }

    @Test
    void objectPosition_constants_mapToCorrectClasses() {
        assertEquals("object-center", TailwindUtility.ObjectPosition.CENTER);
        assertEquals("object-top", TailwindUtility.ObjectPosition.TOP);
        assertEquals("object-right-bottom", TailwindUtility.ObjectPosition.RIGHT_BOTTOM);
    }

    @Test
    void opacity_constants_mapToCorrectClasses() {
        assertEquals("opacity-0", TailwindUtility.Opacity._0);
        assertEquals("opacity-50", TailwindUtility.Opacity._50);
        assertEquals("opacity-75", TailwindUtility.Opacity._75);
        assertEquals("opacity-100", TailwindUtility.Opacity._100);
    }

    @Test
    void order_constants_mapToCorrectClasses() {
        assertEquals("order-first", TailwindUtility.Order.FIRST);
        assertEquals("order-last", TailwindUtility.Order.LAST);
        assertEquals("order-none", TailwindUtility.Order.NONE);
        assertEquals("order-1", TailwindUtility.Order._1);
        assertEquals("order-12", TailwindUtility.Order._12);
    }

    // -----------------------------------------------------------------------
    // Outline / OutlineOffset / OutlineWidth / Overscroll
    // -----------------------------------------------------------------------

    @Test
    void outline_constants_mapToCorrectClasses() {
        assertEquals("outline-none", TailwindUtility.Outline.NONE);
        assertEquals("outline", TailwindUtility.Outline.DEFAULT);
        assertEquals("outline-dashed", TailwindUtility.Outline.DASHED);
        assertEquals("outline-dotted", TailwindUtility.Outline.DOTTED);
        assertEquals("outline-double", TailwindUtility.Outline.DOUBLE);
    }

    @Test
    void outlineOffset_constants_mapToCorrectClasses() {
        assertEquals("outline-offset-0", TailwindUtility.OutlineOffset._0);
        assertEquals("outline-offset-2", TailwindUtility.OutlineOffset._2);
        assertEquals("outline-offset-8", TailwindUtility.OutlineOffset._8);
    }

    @Test
    void outlineWidth_constants_mapToCorrectClasses() {
        assertEquals("outline-0", TailwindUtility.OutlineWidth._0);
        assertEquals("outline-2", TailwindUtility.OutlineWidth._2);
        assertEquals("outline-8", TailwindUtility.OutlineWidth._8);
    }

    @Test
    void overscroll_constants_mapToCorrectClasses() {
        assertEquals("overscroll-auto", TailwindUtility.Overscroll.AUTO);
        assertEquals("overscroll-contain", TailwindUtility.Overscroll.CONTAIN);
        assertEquals("overscroll-none", TailwindUtility.Overscroll.NONE);
        assertEquals("overscroll-x-auto", TailwindUtility.Overscroll.X.AUTO);
        assertEquals("overscroll-y-none", TailwindUtility.Overscroll.Y.NONE);
    }

    // -----------------------------------------------------------------------
    // PlaceContent / PlaceItems / PlaceSelf / PointerEvents
    // -----------------------------------------------------------------------

    @Test
    void placeContent_constants_mapToCorrectClasses() {
        assertEquals("place-content-center", TailwindUtility.PlaceContent.CENTER);
        assertEquals("place-content-between", TailwindUtility.PlaceContent.BETWEEN);
        assertEquals("place-content-stretch", TailwindUtility.PlaceContent.STRETCH);
    }

    @Test
    void placeItems_constants_mapToCorrectClasses() {
        assertEquals("place-items-start", TailwindUtility.PlaceItems.START);
        assertEquals("place-items-center", TailwindUtility.PlaceItems.CENTER);
        assertEquals("place-items-stretch", TailwindUtility.PlaceItems.STRETCH);
    }

    @Test
    void placeSelf_constants_mapToCorrectClasses() {
        assertEquals("place-self-auto", TailwindUtility.PlaceSelf.AUTO);
        assertEquals("place-self-center", TailwindUtility.PlaceSelf.CENTER);
        assertEquals("place-self-stretch", TailwindUtility.PlaceSelf.STRETCH);
    }

    @Test
    void pointerEvents_constants_mapToCorrectClasses() {
        assertEquals("pointer-events-none", TailwindUtility.PointerEvents.NONE);
        assertEquals("pointer-events-auto", TailwindUtility.PointerEvents.AUTO);
    }

    // -----------------------------------------------------------------------
    // Resize / Ring / Rotate / Scale
    // -----------------------------------------------------------------------

    @Test
    void resize_constants_mapToCorrectClasses() {
        assertEquals("resize-none", TailwindUtility.Resize.NONE);
        assertEquals("resize-y", TailwindUtility.Resize.Y);
        assertEquals("resize-x", TailwindUtility.Resize.X);
        assertEquals("resize", TailwindUtility.Resize.BOTH);
    }

    @Test
    void ring_constants_mapToCorrectClasses() {
        assertEquals("ring-0", TailwindUtility.Ring.NONE);
        assertEquals("ring-1", TailwindUtility.Ring.XSMALL);
        assertEquals("ring-2", TailwindUtility.Ring.SMALL);
        assertEquals("ring", TailwindUtility.Ring.DEFAULT);
        assertEquals("ring-inset", TailwindUtility.Ring.INSET);
    }

    @Test
    void rotate_constants_mapToCorrectClasses() {
        assertEquals("rotate-0", TailwindUtility.Rotate._0);
        assertEquals("rotate-45", TailwindUtility.Rotate._45);
        assertEquals("rotate-90", TailwindUtility.Rotate._90);
        assertEquals("rotate-180", TailwindUtility.Rotate._180);
    }

    @Test
    void scale_constants_mapToCorrectClasses() {
        assertEquals("scale-0", TailwindUtility.Scale._0);
        assertEquals("scale-75", TailwindUtility.Scale._75);
        assertEquals("scale-100", TailwindUtility.Scale._100);
        assertEquals("scale-150", TailwindUtility.Scale._150);
        assertEquals("scale-x-50", TailwindUtility.Scale.X._50);
        assertEquals("scale-y-90", TailwindUtility.Scale.Y._90);
    }

    // -----------------------------------------------------------------------
    // ScrollBehavior / ScrollSnapAlign / ScrollSnapStop / ScrollSnapType
    // -----------------------------------------------------------------------

    @Test
    void scrollBehavior_constants_mapToCorrectClasses() {
        assertEquals("scroll-auto", TailwindUtility.ScrollBehavior.AUTO);
        assertEquals("scroll-smooth", TailwindUtility.ScrollBehavior.SMOOTH);
    }

    @Test
    void scrollSnapAlign_constants_mapToCorrectClasses() {
        assertEquals("snap-start", TailwindUtility.ScrollSnapAlign.START);
        assertEquals("snap-end", TailwindUtility.ScrollSnapAlign.END);
        assertEquals("snap-center", TailwindUtility.ScrollSnapAlign.CENTER);
        assertEquals("snap-align-none", TailwindUtility.ScrollSnapAlign.NONE);
    }

    @Test
    void scrollSnapStop_constants_mapToCorrectClasses() {
        assertEquals("snap-normal", TailwindUtility.ScrollSnapStop.NORMAL);
        assertEquals("snap-always", TailwindUtility.ScrollSnapStop.ALWAYS);
    }

    @Test
    void scrollSnapType_constants_mapToCorrectClasses() {
        assertEquals("snap-none", TailwindUtility.ScrollSnapType.NONE);
        assertEquals("snap-x", TailwindUtility.ScrollSnapType.X);
        assertEquals("snap-y", TailwindUtility.ScrollSnapType.Y);
        assertEquals("snap-both", TailwindUtility.ScrollSnapType.BOTH);
        assertEquals("snap-mandatory", TailwindUtility.ScrollSnapType.MANDATORY);
        assertEquals("snap-proximity", TailwindUtility.ScrollSnapType.PROXIMITY);
    }

    // -----------------------------------------------------------------------
    // Size / Skew / TableLayout
    // -----------------------------------------------------------------------

    @Test
    void size_constants_mapToCorrectClasses() {
        assertEquals("size-auto", TailwindUtility.Size.AUTO);
        assertEquals("size-full", TailwindUtility.Size.FULL);
        assertEquals("size-fit", TailwindUtility.Size.FIT);
        assertEquals("size-0", TailwindUtility.Size.NONE);
        assertEquals("size-4", TailwindUtility.Size.MEDIUM);
    }

    @Test
    void skew_constants_mapToCorrectClasses() {
        assertEquals("skew-x-0", TailwindUtility.Skew.X._0);
        assertEquals("skew-x-6", TailwindUtility.Skew.X._6);
        assertEquals("skew-y-0", TailwindUtility.Skew.Y._0);
        assertEquals("skew-y-12", TailwindUtility.Skew.Y._12);
    }

    @Test
    void tableLayout_constants_mapToCorrectClasses() {
        assertEquals("table-auto", TailwindUtility.TableLayout.AUTO);
        assertEquals("table-fixed", TailwindUtility.TableLayout.FIXED);
    }

    // -----------------------------------------------------------------------
    // TextDecoration* / TextIndent / TextUnderlineOffset / TextWrap
    // -----------------------------------------------------------------------

    @Test
    void textDecoration_constants_mapToCorrectClasses() {
        assertEquals("underline", TailwindUtility.TextDecoration.UNDERLINE);
        assertEquals("overline", TailwindUtility.TextDecoration.OVERLINE);
        assertEquals("line-through", TailwindUtility.TextDecoration.LINE_THROUGH);
        assertEquals("no-underline", TailwindUtility.TextDecoration.NONE);
    }

    @Test
    void textDecorationStyle_constants_mapToCorrectClasses() {
        assertEquals("decoration-solid", TailwindUtility.TextDecorationStyle.SOLID);
        assertEquals("decoration-double", TailwindUtility.TextDecorationStyle.DOUBLE);
        assertEquals("decoration-wavy", TailwindUtility.TextDecorationStyle.WAVY);
    }

    @Test
    void textDecorationThickness_constants_mapToCorrectClasses() {
        assertEquals("decoration-auto", TailwindUtility.TextDecorationThickness.AUTO);
        assertEquals("decoration-from-font", TailwindUtility.TextDecorationThickness.FROM_FONT);
        assertEquals("decoration-0", TailwindUtility.TextDecorationThickness._0);
        assertEquals("decoration-4", TailwindUtility.TextDecorationThickness._4);
    }

    @Test
    void textIndent_constants_mapToCorrectClasses() {
        assertEquals("indent-0", TailwindUtility.TextIndent.NONE);
        assertEquals("indent-4", TailwindUtility.TextIndent.MEDIUM);
        assertEquals("indent-32", TailwindUtility.TextIndent.XXXXXLARGE);
    }

    @Test
    void textUnderlineOffset_constants_mapToCorrectClasses() {
        assertEquals("underline-offset-auto", TailwindUtility.TextUnderlineOffset.AUTO);
        assertEquals("underline-offset-0", TailwindUtility.TextUnderlineOffset._0);
        assertEquals("underline-offset-4", TailwindUtility.TextUnderlineOffset._4);
        assertEquals("underline-offset-8", TailwindUtility.TextUnderlineOffset._8);
    }

    @Test
    void textWrap_constants_mapToCorrectClasses() {
        assertEquals("text-wrap", TailwindUtility.TextWrap.WRAP);
        assertEquals("text-nowrap", TailwindUtility.TextWrap.NOWRAP);
        assertEquals("text-balance", TailwindUtility.TextWrap.BALANCE);
        assertEquals("text-pretty", TailwindUtility.TextWrap.PRETTY);
    }

    // -----------------------------------------------------------------------
    // TouchAction / Transform / TransformOrigin / Transition* / Translate
    // -----------------------------------------------------------------------

    @Test
    void touchAction_constants_mapToCorrectClasses() {
        assertEquals("touch-auto", TailwindUtility.TouchAction.AUTO);
        assertEquals("touch-none", TailwindUtility.TouchAction.NONE);
        assertEquals("touch-pan-x", TailwindUtility.TouchAction.PAN_X);
        assertEquals("touch-pinch-zoom", TailwindUtility.TouchAction.PINCH_ZOOM);
        assertEquals("touch-manipulation", TailwindUtility.TouchAction.MANIPULATION);
    }

    @Test
    void transform_constants_mapToCorrectClasses() {
        assertEquals("transform", TailwindUtility.Transform.DEFAULT);
        assertEquals("transform-gpu", TailwindUtility.Transform.GPU);
        assertEquals("transform-none", TailwindUtility.Transform.NONE);
    }

    @Test
    void transformOrigin_constants_mapToCorrectClasses() {
        assertEquals("origin-center", TailwindUtility.TransformOrigin.CENTER);
        assertEquals("origin-top", TailwindUtility.TransformOrigin.TOP);
        assertEquals("origin-top-right", TailwindUtility.TransformOrigin.TOP_RIGHT);
        assertEquals("origin-bottom-left", TailwindUtility.TransformOrigin.BOTTOM_LEFT);
    }

    @Test
    void transition_constants_mapToCorrectClasses() {
        assertEquals("transition-none", TailwindUtility.Transition.NONE);
        assertEquals("transition-all", TailwindUtility.Transition.ALL);
        assertEquals("transition", TailwindUtility.Transition.DEFAULT);
        assertEquals("transition-colors", TailwindUtility.Transition.COLORS);
        assertEquals("transition-transform", TailwindUtility.Transition.TRANSFORM);
    }

    @Test
    void transitionDelay_constants_mapToCorrectClasses() {
        assertEquals("delay-0", TailwindUtility.TransitionDelay._0);
        assertEquals("delay-150", TailwindUtility.TransitionDelay._150);
        assertEquals("delay-1000", TailwindUtility.TransitionDelay._1000);
    }

    @Test
    void transitionDuration_constants_mapToCorrectClasses() {
        assertEquals("duration-0", TailwindUtility.TransitionDuration._0);
        assertEquals("duration-300", TailwindUtility.TransitionDuration._300);
        assertEquals("duration-1000", TailwindUtility.TransitionDuration._1000);
    }

    @Test
    void transitionTimingFunction_constants_mapToCorrectClasses() {
        assertEquals("ease-linear", TailwindUtility.TransitionTimingFunction.LINEAR);
        assertEquals("ease-in", TailwindUtility.TransitionTimingFunction.IN);
        assertEquals("ease-out", TailwindUtility.TransitionTimingFunction.OUT);
        assertEquals("ease-in-out", TailwindUtility.TransitionTimingFunction.IN_OUT);
    }

    @Test
    void translate_constants_mapToCorrectClasses() {
        assertEquals("translate-x-0", TailwindUtility.Translate.X.NONE);
        assertEquals("translate-x-4", TailwindUtility.Translate.X.MEDIUM);
        assertEquals("translate-x-full", TailwindUtility.Translate.X.FULL);
        assertEquals("translate-x-1/2", TailwindUtility.Translate.X.HALF);
        assertEquals("translate-y-0", TailwindUtility.Translate.Y.NONE);
        assertEquals("translate-y-full", TailwindUtility.Translate.Y.FULL);
    }

    // -----------------------------------------------------------------------
    // UserSelect / VerticalAlign / Visibility / WillChange / WordBreak
    // -----------------------------------------------------------------------

    @Test
    void userSelect_constants_mapToCorrectClasses() {
        assertEquals("select-none", TailwindUtility.UserSelect.NONE);
        assertEquals("select-text", TailwindUtility.UserSelect.TEXT);
        assertEquals("select-all", TailwindUtility.UserSelect.ALL);
        assertEquals("select-auto", TailwindUtility.UserSelect.AUTO);
    }

    @Test
    void verticalAlign_constants_mapToCorrectClasses() {
        assertEquals("align-baseline", TailwindUtility.VerticalAlign.BASELINE);
        assertEquals("align-top", TailwindUtility.VerticalAlign.TOP);
        assertEquals("align-middle", TailwindUtility.VerticalAlign.MIDDLE);
        assertEquals("align-bottom", TailwindUtility.VerticalAlign.BOTTOM);
        assertEquals("align-text-top", TailwindUtility.VerticalAlign.TEXT_TOP);
        assertEquals("align-sub", TailwindUtility.VerticalAlign.SUB);
    }

    @Test
    void visibility_constants_mapToCorrectClasses() {
        assertEquals("visible", TailwindUtility.Visibility.VISIBLE);
        assertEquals("invisible", TailwindUtility.Visibility.INVISIBLE);
        assertEquals("collapse", TailwindUtility.Visibility.COLLAPSE);
    }

    @Test
    void willChange_constants_mapToCorrectClasses() {
        assertEquals("will-change-auto", TailwindUtility.WillChange.AUTO);
        assertEquals("will-change-scroll", TailwindUtility.WillChange.SCROLL);
        assertEquals("will-change-contents", TailwindUtility.WillChange.CONTENTS);
        assertEquals("will-change-transform", TailwindUtility.WillChange.TRANSFORM);
    }

    @Test
    void wordBreak_constants_mapToCorrectClasses() {
        assertEquals("break-normal", TailwindUtility.WordBreak.NORMAL);
        assertEquals("break-words", TailwindUtility.WordBreak.WORDS);
        assertEquals("break-all", TailwindUtility.WordBreak.ALL);
        assertEquals("break-keep", TailwindUtility.WordBreak.KEEP);
    }

    // -----------------------------------------------------------------------
    // GradientColorStops
    // -----------------------------------------------------------------------

    @Test
    void gradientColorStops_from_mapToCorrectClasses() {
        assertEquals("from-black", TailwindUtility.GradientColorStops.From.BLACK);
        assertEquals("from-white", TailwindUtility.GradientColorStops.From.WHITE);
        assertEquals("from-transparent", TailwindUtility.GradientColorStops.From.TRANSPARENT);
        assertEquals("from-blue-500", TailwindUtility.GradientColorStops.From.Blue._500);
        assertEquals("from-slate-50", TailwindUtility.GradientColorStops.From.Slate._50);
        assertEquals("from-rose-950", TailwindUtility.GradientColorStops.From.Rose._950);
    }

    @Test
    void gradientColorStops_via_mapToCorrectClasses() {
        assertEquals("via-black", TailwindUtility.GradientColorStops.Via.BLACK);
        assertEquals("via-white", TailwindUtility.GradientColorStops.Via.WHITE);
        assertEquals("via-red-300", TailwindUtility.GradientColorStops.Via.Red._300);
        assertEquals("via-green-700", TailwindUtility.GradientColorStops.Via.Green._700);
    }

    @Test
    void gradientColorStops_to_mapToCorrectClasses() {
        assertEquals("to-black", TailwindUtility.GradientColorStops.To.BLACK);
        assertEquals("to-transparent", TailwindUtility.GradientColorStops.To.TRANSPARENT);
        assertEquals("to-indigo-500", TailwindUtility.GradientColorStops.To.Indigo._500);
        assertEquals("to-pink-100", TailwindUtility.GradientColorStops.To.Pink._100);
    }

    // -----------------------------------------------------------------------
    // OutlineColor
    // -----------------------------------------------------------------------

    @Test
    void outlineColor_constants_mapToCorrectClasses() {
        assertEquals("outline-black", TailwindUtility.OutlineColor.BLACK);
        assertEquals("outline-white", TailwindUtility.OutlineColor.WHITE);
        assertEquals("outline-transparent", TailwindUtility.OutlineColor.TRANSPARENT);
        assertEquals("outline-blue-500", TailwindUtility.OutlineColor.Blue._500);
        assertEquals("outline-red-300", TailwindUtility.OutlineColor.Red._300);
        assertEquals("outline-slate-950", TailwindUtility.OutlineColor.Slate._950);
    }

    // -----------------------------------------------------------------------
    // RingColor
    // -----------------------------------------------------------------------

    @Test
    void ringColor_constants_mapToCorrectClasses() {
        assertEquals("ring-black", TailwindUtility.RingColor.BLACK);
        assertEquals("ring-white", TailwindUtility.RingColor.WHITE);
        assertEquals("ring-blue-500", TailwindUtility.RingColor.Blue._500);
        assertEquals("ring-green-200", TailwindUtility.RingColor.Green._200);
    }

    // -----------------------------------------------------------------------
    // RingOffsetColor
    // -----------------------------------------------------------------------

    @Test
    void ringOffsetColor_constants_mapToCorrectClasses() {
        assertEquals("ring-offset-black", TailwindUtility.RingOffsetColor.BLACK);
        assertEquals("ring-offset-white", TailwindUtility.RingOffsetColor.WHITE);
        assertEquals("ring-offset-blue-500", TailwindUtility.RingOffsetColor.Blue._500);
    }

    // -----------------------------------------------------------------------
    // ShadowColor
    // -----------------------------------------------------------------------

    @Test
    void shadowColor_constants_mapToCorrectClasses() {
        assertEquals("shadow-black", TailwindUtility.ShadowColor.BLACK);
        assertEquals("shadow-white", TailwindUtility.ShadowColor.WHITE);
        assertEquals("shadow-blue-500", TailwindUtility.ShadowColor.Blue._500);
        assertEquals("shadow-slate-300", TailwindUtility.ShadowColor.Slate._300);
    }

    // -----------------------------------------------------------------------
    // TextDecorationColor
    // -----------------------------------------------------------------------

    @Test
    void textDecorationColor_constants_mapToCorrectClasses() {
        assertEquals("decoration-black", TailwindUtility.TextDecorationColor.BLACK);
        assertEquals("decoration-white", TailwindUtility.TextDecorationColor.WHITE);
        assertEquals("decoration-blue-500", TailwindUtility.TextDecorationColor.Blue._500);
        assertEquals("decoration-rose-700", TailwindUtility.TextDecorationColor.Rose._700);
    }

    // -----------------------------------------------------------------------
    // FillColor
    // -----------------------------------------------------------------------

    @Test
    void fillColor_constants_mapToCorrectClasses() {
        assertEquals("fill-black", TailwindUtility.FillColor.BLACK);
        assertEquals("fill-white", TailwindUtility.FillColor.WHITE);
        assertEquals("fill-transparent", TailwindUtility.FillColor.TRANSPARENT);
        assertEquals("fill-blue-500", TailwindUtility.FillColor.Blue._500);
        assertEquals("fill-green-300", TailwindUtility.FillColor.Green._300);
    }

    // -----------------------------------------------------------------------
    // StrokeColor
    // -----------------------------------------------------------------------

    @Test
    void strokeColor_constants_mapToCorrectClasses() {
        assertEquals("stroke-black", TailwindUtility.StrokeColor.BLACK);
        assertEquals("stroke-white", TailwindUtility.StrokeColor.WHITE);
        assertEquals("stroke-blue-500", TailwindUtility.StrokeColor.Blue._500);
    }

    // -----------------------------------------------------------------------
    // StrokeWidth
    // -----------------------------------------------------------------------

    @Test
    void strokeWidth_constants_mapToCorrectClasses() {
        assertEquals("stroke-0", TailwindUtility.StrokeWidth.NONE);
        assertEquals("stroke-1", TailwindUtility.StrokeWidth.SMALL);
        assertEquals("stroke-2", TailwindUtility.StrokeWidth.MEDIUM);
    }

    // -----------------------------------------------------------------------
    // Direction
    // -----------------------------------------------------------------------

    @Test
    void direction_constants_mapToCorrectClasses() {
        assertEquals("ltr", TailwindUtility.Direction.LTR);
        assertEquals("rtl", TailwindUtility.Direction.RTL);
    }

    // -----------------------------------------------------------------------
    // Content
    // -----------------------------------------------------------------------

    @Test
    void content_constants_mapToCorrectClasses() {
        assertEquals("content-none", TailwindUtility.Content.NONE);
    }

    // -----------------------------------------------------------------------
    // Divide
    // -----------------------------------------------------------------------

    @Test
    void divide_style_constants_mapToCorrectClasses() {
        assertEquals("divide-solid", TailwindUtility.Divide.SOLID);
        assertEquals("divide-dashed", TailwindUtility.Divide.DASHED);
        assertEquals("divide-dotted", TailwindUtility.Divide.DOTTED);
        assertEquals("divide-double", TailwindUtility.Divide.DOUBLE);
        assertEquals("divide-none", TailwindUtility.Divide.NONE);
    }

    @Test
    void divide_x_constants_mapToCorrectClasses() {
        assertEquals("divide-x-0", TailwindUtility.Divide.X.NONE);
        assertEquals("divide-x", TailwindUtility.Divide.X.DEFAULT);
        assertEquals("divide-x-2", TailwindUtility.Divide.X.XSMALL);
        assertEquals("divide-x-4", TailwindUtility.Divide.X.SMALL);
        assertEquals("divide-x-8", TailwindUtility.Divide.X.MEDIUM);
        assertEquals("divide-x-reverse", TailwindUtility.Divide.X.REVERSE);
    }

    @Test
    void divide_y_constants_mapToCorrectClasses() {
        assertEquals("divide-y-0", TailwindUtility.Divide.Y.NONE);
        assertEquals("divide-y", TailwindUtility.Divide.Y.DEFAULT);
        assertEquals("divide-y-2", TailwindUtility.Divide.Y.XSMALL);
        assertEquals("divide-y-reverse", TailwindUtility.Divide.Y.REVERSE);
    }

    @Test
    void divide_color_constants_mapToCorrectClasses() {
        assertEquals("divide-black", TailwindUtility.Divide.Color.BLACK);
        assertEquals("divide-white", TailwindUtility.Divide.Color.WHITE);
        assertEquals("divide-blue-500", TailwindUtility.Divide.Color.Blue._500);
        assertEquals("divide-gray-200", TailwindUtility.Divide.Color.Gray._200);
        assertEquals("divide-red-400", TailwindUtility.Divide.Color.Red._400);
    }

    // -----------------------------------------------------------------------
    // SpaceBetween
    // -----------------------------------------------------------------------

    @Test
    void spaceBetween_x_constants_mapToCorrectClasses() {
        assertEquals("space-x-0", TailwindUtility.SpaceBetween.X.NONE);
        assertEquals("space-x-1", TailwindUtility.SpaceBetween.X.XSMALL);
        assertEquals("space-x-2", TailwindUtility.SpaceBetween.X.SMALL);
        assertEquals("space-x-4", TailwindUtility.SpaceBetween.X.MEDIUM);
        assertEquals("space-x-reverse", TailwindUtility.SpaceBetween.X.REVERSE);
    }

    @Test
    void spaceBetween_y_constants_mapToCorrectClasses() {
        assertEquals("space-y-0", TailwindUtility.SpaceBetween.Y.NONE);
        assertEquals("space-y-4", TailwindUtility.SpaceBetween.Y.MEDIUM);
        assertEquals("space-y-reverse", TailwindUtility.SpaceBetween.Y.REVERSE);
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
