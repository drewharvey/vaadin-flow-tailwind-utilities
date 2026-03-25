package dev.tailwindutility;

/**
 * Contains constants for all standard Tailwind CSS utility classes, structured
 * similarly to Vaadin's {@code LumoUtility} class.
 *
 * <p>
 * Instead of using magic strings like:
 * <pre>
 *     span.addClassNames("text-xl", "font-bold");
 * </pre>
 *
 * you can use the typed constants provided here:
 * <pre>
 *     span.addClassNames(TailwindUtility.FontSize.XLARGE, TailwindUtility.FontWeight.BOLD);
 * </pre>
 *
 * <p>
 * Adding this library as a dependency also automatically enables the Vaadin
 * Tailwind CSS feature flag ({@code tailwindCss}) via the bundled
 * {@code vaadin-featureflags.properties} resource.
 */
public final class TailwindUtility {

    private TailwindUtility() {
    }

    // -----------------------------------------------------------------------
    // AlignContent
    // -----------------------------------------------------------------------

    /**
     * Classes for distributing space around and between items along a
     * flexbox's cross axis or a grid's block axis.
     */
    public static final class AlignContent {

        public static final String AROUND = "content-around";
        public static final String BASELINE = "content-baseline";
        public static final String BETWEEN = "content-between";
        public static final String CENTER = "content-center";
        public static final String END = "content-end";
        public static final String EVENLY = "content-evenly";
        public static final String NORMAL = "content-normal";
        public static final String START = "content-start";
        public static final String STRETCH = "content-stretch";

        private AlignContent() {
        }
    }

    // -----------------------------------------------------------------------
    // AlignItems
    // -----------------------------------------------------------------------

    /**
     * Classes for aligning items along a flexbox's cross axis or a grid's
     * block axis.
     */
    public static final class AlignItems {

        public static final String BASELINE = "items-baseline";
        public static final String CENTER = "items-center";
        public static final String END = "items-end";
        public static final String START = "items-start";
        public static final String STRETCH = "items-stretch";

        private AlignItems() {
        }
    }

    // -----------------------------------------------------------------------
    // AlignSelf
    // -----------------------------------------------------------------------

    /**
     * Classes for overriding individual items' align-items value in flexbox
     * and grid layouts.
     */
    public static final class AlignSelf {

        public static final String AUTO = "self-auto";
        public static final String BASELINE = "self-baseline";
        public static final String CENTER = "self-center";
        public static final String END = "self-end";
        public static final String START = "self-start";
        public static final String STRETCH = "self-stretch";

        private AlignSelf() {
        }
    }

    // -----------------------------------------------------------------------
    // Accessibility
    // -----------------------------------------------------------------------

    /**
     * Classes for hiding content from or exposing it to screen readers.
     */
    public static final class Accessibility {

        /** Hides content visually while keeping it accessible to screen readers. */
        public static final String SCREEN_READER_ONLY = "sr-only";
        /** Undoes {@link #SCREEN_READER_ONLY} to make the element visible to all users. */
        public static final String NOT_SCREEN_READER_ONLY = "not-sr-only";

        private Accessibility() {
        }
    }

    // -----------------------------------------------------------------------
    // Animation
    // -----------------------------------------------------------------------

    /**
     * Classes for animating elements with CSS animations.
     */
    public static final class Animation {

        public static final String NONE = "animate-none";
        public static final String SPIN = "animate-spin";
        public static final String PING = "animate-ping";
        public static final String PULSE = "animate-pulse";
        public static final String BOUNCE = "animate-bounce";

        private Animation() {
        }
    }

    // -----------------------------------------------------------------------
    // Appearance
    // -----------------------------------------------------------------------

    /**
     * Classes for suppressing the native form-element styling.
     */
    public static final class Appearance {

        public static final String NONE = "appearance-none";
        public static final String AUTO = "appearance-auto";

        private Appearance() {
        }
    }

    // -----------------------------------------------------------------------
    // AspectRatio    // -----------------------------------------------------------------------
    // AspectRatio
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the aspect ratio of an element.
     */
    public static final class AspectRatio {

        public static final String AUTO = "aspect-auto";
        public static final String SQUARE = "aspect-square";
        public static final String VIDEO = "aspect-video";

        private AspectRatio() {
        }
    }

    // -----------------------------------------------------------------------
    // Background
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the background color of an element.
     *
     * <p>
     * Color variants follow the Tailwind CSS palette. Each named color class
     * (e.g. {@link Background.Slate}, {@link Background.Blue}) exposes shades
     * {@code _50} through {@code _950}.
     */
    public static final class Background {

        public static final String BLACK = "bg-black";
        public static final String WHITE = "bg-white";
        public static final String TRANSPARENT = "bg-transparent";
        public static final String CURRENT = "bg-current";
        public static final String INHERIT = "bg-inherit";

        private Background() {
        }

        public static final class Slate {
            public static final String _50 = "bg-slate-50";
            public static final String _100 = "bg-slate-100";
            public static final String _200 = "bg-slate-200";
            public static final String _300 = "bg-slate-300";
            public static final String _400 = "bg-slate-400";
            public static final String _500 = "bg-slate-500";
            public static final String _600 = "bg-slate-600";
            public static final String _700 = "bg-slate-700";
            public static final String _800 = "bg-slate-800";
            public static final String _900 = "bg-slate-900";
            public static final String _950 = "bg-slate-950";

            private Slate() {
            }
        }

        public static final class Gray {
            public static final String _50 = "bg-gray-50";
            public static final String _100 = "bg-gray-100";
            public static final String _200 = "bg-gray-200";
            public static final String _300 = "bg-gray-300";
            public static final String _400 = "bg-gray-400";
            public static final String _500 = "bg-gray-500";
            public static final String _600 = "bg-gray-600";
            public static final String _700 = "bg-gray-700";
            public static final String _800 = "bg-gray-800";
            public static final String _900 = "bg-gray-900";
            public static final String _950 = "bg-gray-950";

            private Gray() {
            }
        }

        public static final class Zinc {
            public static final String _50 = "bg-zinc-50";
            public static final String _100 = "bg-zinc-100";
            public static final String _200 = "bg-zinc-200";
            public static final String _300 = "bg-zinc-300";
            public static final String _400 = "bg-zinc-400";
            public static final String _500 = "bg-zinc-500";
            public static final String _600 = "bg-zinc-600";
            public static final String _700 = "bg-zinc-700";
            public static final String _800 = "bg-zinc-800";
            public static final String _900 = "bg-zinc-900";
            public static final String _950 = "bg-zinc-950";

            private Zinc() {
            }
        }

        public static final class Neutral {
            public static final String _50 = "bg-neutral-50";
            public static final String _100 = "bg-neutral-100";
            public static final String _200 = "bg-neutral-200";
            public static final String _300 = "bg-neutral-300";
            public static final String _400 = "bg-neutral-400";
            public static final String _500 = "bg-neutral-500";
            public static final String _600 = "bg-neutral-600";
            public static final String _700 = "bg-neutral-700";
            public static final String _800 = "bg-neutral-800";
            public static final String _900 = "bg-neutral-900";
            public static final String _950 = "bg-neutral-950";

            private Neutral() {
            }
        }

        public static final class Stone {
            public static final String _50 = "bg-stone-50";
            public static final String _100 = "bg-stone-100";
            public static final String _200 = "bg-stone-200";
            public static final String _300 = "bg-stone-300";
            public static final String _400 = "bg-stone-400";
            public static final String _500 = "bg-stone-500";
            public static final String _600 = "bg-stone-600";
            public static final String _700 = "bg-stone-700";
            public static final String _800 = "bg-stone-800";
            public static final String _900 = "bg-stone-900";
            public static final String _950 = "bg-stone-950";

            private Stone() {
            }
        }

        public static final class Red {
            public static final String _50 = "bg-red-50";
            public static final String _100 = "bg-red-100";
            public static final String _200 = "bg-red-200";
            public static final String _300 = "bg-red-300";
            public static final String _400 = "bg-red-400";
            public static final String _500 = "bg-red-500";
            public static final String _600 = "bg-red-600";
            public static final String _700 = "bg-red-700";
            public static final String _800 = "bg-red-800";
            public static final String _900 = "bg-red-900";
            public static final String _950 = "bg-red-950";

            private Red() {
            }
        }

        public static final class Orange {
            public static final String _50 = "bg-orange-50";
            public static final String _100 = "bg-orange-100";
            public static final String _200 = "bg-orange-200";
            public static final String _300 = "bg-orange-300";
            public static final String _400 = "bg-orange-400";
            public static final String _500 = "bg-orange-500";
            public static final String _600 = "bg-orange-600";
            public static final String _700 = "bg-orange-700";
            public static final String _800 = "bg-orange-800";
            public static final String _900 = "bg-orange-900";
            public static final String _950 = "bg-orange-950";

            private Orange() {
            }
        }

        public static final class Amber {
            public static final String _50 = "bg-amber-50";
            public static final String _100 = "bg-amber-100";
            public static final String _200 = "bg-amber-200";
            public static final String _300 = "bg-amber-300";
            public static final String _400 = "bg-amber-400";
            public static final String _500 = "bg-amber-500";
            public static final String _600 = "bg-amber-600";
            public static final String _700 = "bg-amber-700";
            public static final String _800 = "bg-amber-800";
            public static final String _900 = "bg-amber-900";
            public static final String _950 = "bg-amber-950";

            private Amber() {
            }
        }

        public static final class Yellow {
            public static final String _50 = "bg-yellow-50";
            public static final String _100 = "bg-yellow-100";
            public static final String _200 = "bg-yellow-200";
            public static final String _300 = "bg-yellow-300";
            public static final String _400 = "bg-yellow-400";
            public static final String _500 = "bg-yellow-500";
            public static final String _600 = "bg-yellow-600";
            public static final String _700 = "bg-yellow-700";
            public static final String _800 = "bg-yellow-800";
            public static final String _900 = "bg-yellow-900";
            public static final String _950 = "bg-yellow-950";

            private Yellow() {
            }
        }

        public static final class Lime {
            public static final String _50 = "bg-lime-50";
            public static final String _100 = "bg-lime-100";
            public static final String _200 = "bg-lime-200";
            public static final String _300 = "bg-lime-300";
            public static final String _400 = "bg-lime-400";
            public static final String _500 = "bg-lime-500";
            public static final String _600 = "bg-lime-600";
            public static final String _700 = "bg-lime-700";
            public static final String _800 = "bg-lime-800";
            public static final String _900 = "bg-lime-900";
            public static final String _950 = "bg-lime-950";

            private Lime() {
            }
        }

        public static final class Green {
            public static final String _50 = "bg-green-50";
            public static final String _100 = "bg-green-100";
            public static final String _200 = "bg-green-200";
            public static final String _300 = "bg-green-300";
            public static final String _400 = "bg-green-400";
            public static final String _500 = "bg-green-500";
            public static final String _600 = "bg-green-600";
            public static final String _700 = "bg-green-700";
            public static final String _800 = "bg-green-800";
            public static final String _900 = "bg-green-900";
            public static final String _950 = "bg-green-950";

            private Green() {
            }
        }

        public static final class Emerald {
            public static final String _50 = "bg-emerald-50";
            public static final String _100 = "bg-emerald-100";
            public static final String _200 = "bg-emerald-200";
            public static final String _300 = "bg-emerald-300";
            public static final String _400 = "bg-emerald-400";
            public static final String _500 = "bg-emerald-500";
            public static final String _600 = "bg-emerald-600";
            public static final String _700 = "bg-emerald-700";
            public static final String _800 = "bg-emerald-800";
            public static final String _900 = "bg-emerald-900";
            public static final String _950 = "bg-emerald-950";

            private Emerald() {
            }
        }

        public static final class Teal {
            public static final String _50 = "bg-teal-50";
            public static final String _100 = "bg-teal-100";
            public static final String _200 = "bg-teal-200";
            public static final String _300 = "bg-teal-300";
            public static final String _400 = "bg-teal-400";
            public static final String _500 = "bg-teal-500";
            public static final String _600 = "bg-teal-600";
            public static final String _700 = "bg-teal-700";
            public static final String _800 = "bg-teal-800";
            public static final String _900 = "bg-teal-900";
            public static final String _950 = "bg-teal-950";

            private Teal() {
            }
        }

        public static final class Cyan {
            public static final String _50 = "bg-cyan-50";
            public static final String _100 = "bg-cyan-100";
            public static final String _200 = "bg-cyan-200";
            public static final String _300 = "bg-cyan-300";
            public static final String _400 = "bg-cyan-400";
            public static final String _500 = "bg-cyan-500";
            public static final String _600 = "bg-cyan-600";
            public static final String _700 = "bg-cyan-700";
            public static final String _800 = "bg-cyan-800";
            public static final String _900 = "bg-cyan-900";
            public static final String _950 = "bg-cyan-950";

            private Cyan() {
            }
        }

        public static final class Sky {
            public static final String _50 = "bg-sky-50";
            public static final String _100 = "bg-sky-100";
            public static final String _200 = "bg-sky-200";
            public static final String _300 = "bg-sky-300";
            public static final String _400 = "bg-sky-400";
            public static final String _500 = "bg-sky-500";
            public static final String _600 = "bg-sky-600";
            public static final String _700 = "bg-sky-700";
            public static final String _800 = "bg-sky-800";
            public static final String _900 = "bg-sky-900";
            public static final String _950 = "bg-sky-950";

            private Sky() {
            }
        }

        public static final class Blue {
            public static final String _50 = "bg-blue-50";
            public static final String _100 = "bg-blue-100";
            public static final String _200 = "bg-blue-200";
            public static final String _300 = "bg-blue-300";
            public static final String _400 = "bg-blue-400";
            public static final String _500 = "bg-blue-500";
            public static final String _600 = "bg-blue-600";
            public static final String _700 = "bg-blue-700";
            public static final String _800 = "bg-blue-800";
            public static final String _900 = "bg-blue-900";
            public static final String _950 = "bg-blue-950";

            private Blue() {
            }
        }

        public static final class Indigo {
            public static final String _50 = "bg-indigo-50";
            public static final String _100 = "bg-indigo-100";
            public static final String _200 = "bg-indigo-200";
            public static final String _300 = "bg-indigo-300";
            public static final String _400 = "bg-indigo-400";
            public static final String _500 = "bg-indigo-500";
            public static final String _600 = "bg-indigo-600";
            public static final String _700 = "bg-indigo-700";
            public static final String _800 = "bg-indigo-800";
            public static final String _900 = "bg-indigo-900";
            public static final String _950 = "bg-indigo-950";

            private Indigo() {
            }
        }

        public static final class Violet {
            public static final String _50 = "bg-violet-50";
            public static final String _100 = "bg-violet-100";
            public static final String _200 = "bg-violet-200";
            public static final String _300 = "bg-violet-300";
            public static final String _400 = "bg-violet-400";
            public static final String _500 = "bg-violet-500";
            public static final String _600 = "bg-violet-600";
            public static final String _700 = "bg-violet-700";
            public static final String _800 = "bg-violet-800";
            public static final String _900 = "bg-violet-900";
            public static final String _950 = "bg-violet-950";

            private Violet() {
            }
        }

        public static final class Purple {
            public static final String _50 = "bg-purple-50";
            public static final String _100 = "bg-purple-100";
            public static final String _200 = "bg-purple-200";
            public static final String _300 = "bg-purple-300";
            public static final String _400 = "bg-purple-400";
            public static final String _500 = "bg-purple-500";
            public static final String _600 = "bg-purple-600";
            public static final String _700 = "bg-purple-700";
            public static final String _800 = "bg-purple-800";
            public static final String _900 = "bg-purple-900";
            public static final String _950 = "bg-purple-950";

            private Purple() {
            }
        }

        public static final class Fuchsia {
            public static final String _50 = "bg-fuchsia-50";
            public static final String _100 = "bg-fuchsia-100";
            public static final String _200 = "bg-fuchsia-200";
            public static final String _300 = "bg-fuchsia-300";
            public static final String _400 = "bg-fuchsia-400";
            public static final String _500 = "bg-fuchsia-500";
            public static final String _600 = "bg-fuchsia-600";
            public static final String _700 = "bg-fuchsia-700";
            public static final String _800 = "bg-fuchsia-800";
            public static final String _900 = "bg-fuchsia-900";
            public static final String _950 = "bg-fuchsia-950";

            private Fuchsia() {
            }
        }

        public static final class Pink {
            public static final String _50 = "bg-pink-50";
            public static final String _100 = "bg-pink-100";
            public static final String _200 = "bg-pink-200";
            public static final String _300 = "bg-pink-300";
            public static final String _400 = "bg-pink-400";
            public static final String _500 = "bg-pink-500";
            public static final String _600 = "bg-pink-600";
            public static final String _700 = "bg-pink-700";
            public static final String _800 = "bg-pink-800";
            public static final String _900 = "bg-pink-900";
            public static final String _950 = "bg-pink-950";

            private Pink() {
            }
        }

        public static final class Rose {
            public static final String _50 = "bg-rose-50";
            public static final String _100 = "bg-rose-100";
            public static final String _200 = "bg-rose-200";
            public static final String _300 = "bg-rose-300";
            public static final String _400 = "bg-rose-400";
            public static final String _500 = "bg-rose-500";
            public static final String _600 = "bg-rose-600";
            public static final String _700 = "bg-rose-700";
            public static final String _800 = "bg-rose-800";
            public static final String _900 = "bg-rose-900";
            public static final String _950 = "bg-rose-950";

            private Rose() {
            }
        }
    }

    // -----------------------------------------------------------------------
    // BackdropFilter
    // -----------------------------------------------------------------------

    /**
     * Classes for applying backdrop-filter effects to an element.
     */
    public static final class BackdropFilter {

        public static final String NONE = "backdrop-blur-none";
        public static final String BLUR_SMALL = "backdrop-blur-sm";
        public static final String BLUR = "backdrop-blur";
        public static final String BLUR_MEDIUM = "backdrop-blur-md";
        public static final String BLUR_LARGE = "backdrop-blur-lg";
        public static final String BLUR_XLARGE = "backdrop-blur-xl";
        public static final String BLUR_XXLARGE = "backdrop-blur-2xl";
        public static final String BLUR_XXXLARGE = "backdrop-blur-3xl";

        private BackdropFilter() {
        }
    }

    // -----------------------------------------------------------------------
    // BackgroundAttachment
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how a background image behaves when scrolling.
     */
    public static final class BackgroundAttachment {

        public static final String FIXED = "bg-fixed";
        public static final String LOCAL = "bg-local";
        public static final String SCROLL = "bg-scroll";

        private BackgroundAttachment() {
        }
    }

    // -----------------------------------------------------------------------
    // BackgroundBlendMode
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how an element's background blends with its
     * background color.
     */
    public static final class BackgroundBlendMode {

        public static final String NORMAL = "bg-blend-normal";
        public static final String MULTIPLY = "bg-blend-multiply";
        public static final String SCREEN = "bg-blend-screen";
        public static final String OVERLAY = "bg-blend-overlay";
        public static final String DARKEN = "bg-blend-darken";
        public static final String LIGHTEN = "bg-blend-lighten";
        public static final String COLOR_DODGE = "bg-blend-color-dodge";
        public static final String COLOR_BURN = "bg-blend-color-burn";
        public static final String HARD_LIGHT = "bg-blend-hard-light";
        public static final String SOFT_LIGHT = "bg-blend-soft-light";
        public static final String DIFFERENCE = "bg-blend-difference";
        public static final String EXCLUSION = "bg-blend-exclusion";
        public static final String HUE = "bg-blend-hue";
        public static final String SATURATION = "bg-blend-saturation";
        public static final String COLOR = "bg-blend-color";
        public static final String LUMINOSITY = "bg-blend-luminosity";

        private BackgroundBlendMode() {
        }
    }

    // -----------------------------------------------------------------------
    // BackgroundClip
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the bounding box of an element's background.
     */
    public static final class BackgroundClip {

        public static final String BORDER = "bg-clip-border";
        public static final String PADDING = "bg-clip-padding";
        public static final String CONTENT = "bg-clip-content";
        public static final String TEXT = "bg-clip-text";

        private BackgroundClip() {
        }
    }

    // -----------------------------------------------------------------------
    // BackgroundImage
    // -----------------------------------------------------------------------

    /**
     * Classes for setting a background gradient direction.
     *
     * <p>
     * Use gradient color stop classes ({@code from-*}, {@code via-*},
     * {@code to-*}) with the same Tailwind color palette naming to set colors.
     * For example: {@code from-blue-500}, {@code to-purple-600}.
     */
    public static final class BackgroundImage {

        public static final String NONE = "bg-none";
        public static final String GRADIENT_TO_TOP = "bg-gradient-to-t";
        public static final String GRADIENT_TO_TOP_RIGHT = "bg-gradient-to-tr";
        public static final String GRADIENT_TO_RIGHT = "bg-gradient-to-r";
        public static final String GRADIENT_TO_BOTTOM_RIGHT = "bg-gradient-to-br";
        public static final String GRADIENT_TO_BOTTOM = "bg-gradient-to-b";
        public static final String GRADIENT_TO_BOTTOM_LEFT = "bg-gradient-to-bl";
        public static final String GRADIENT_TO_LEFT = "bg-gradient-to-l";
        public static final String GRADIENT_TO_TOP_LEFT = "bg-gradient-to-tl";

        private BackgroundImage() {
        }
    }

    // -----------------------------------------------------------------------
    // BackgroundOrigin
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how an element's background is positioned
     * relative to its borders, padding, or content.
     */
    public static final class BackgroundOrigin {

        public static final String BORDER = "bg-origin-border";
        public static final String PADDING = "bg-origin-padding";
        public static final String CONTENT = "bg-origin-content";

        private BackgroundOrigin() {
        }
    }

    // -----------------------------------------------------------------------
    // BackgroundPosition
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the position of an element's background image.
     */
    public static final class BackgroundPosition {

        public static final String BOTTOM = "bg-bottom";
        public static final String CENTER = "bg-center";
        public static final String LEFT = "bg-left";
        public static final String LEFT_BOTTOM = "bg-left-bottom";
        public static final String LEFT_TOP = "bg-left-top";
        public static final String RIGHT = "bg-right";
        public static final String RIGHT_BOTTOM = "bg-right-bottom";
        public static final String RIGHT_TOP = "bg-right-top";
        public static final String TOP = "bg-top";

        private BackgroundPosition() {
        }
    }

    // -----------------------------------------------------------------------
    // BackgroundRepeat
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the repetition of an element's background image.
     */
    public static final class BackgroundRepeat {

        public static final String REPEAT = "bg-repeat";
        public static final String NO_REPEAT = "bg-no-repeat";
        public static final String REPEAT_X = "bg-repeat-x";
        public static final String REPEAT_Y = "bg-repeat-y";
        public static final String REPEAT_ROUND = "bg-repeat-round";
        public static final String REPEAT_SPACE = "bg-repeat-space";

        private BackgroundRepeat() {
        }
    }

    // -----------------------------------------------------------------------
    // BackgroundSize
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the background size of an element's background
     * image.
     */
    public static final class BackgroundSize {

        public static final String AUTO = "bg-auto";
        public static final String COVER = "bg-cover";
        public static final String CONTAIN = "bg-contain";

        private BackgroundSize() {
        }
    }

    // -----------------------------------------------------------------------
    // Border    // -----------------------------------------------------------------------
    // Border
    // -----------------------------------------------------------------------

    /**
     * Classes for adding or removing borders from an element.
     */
    public static final class Border {

        /** Removes all borders. */
        public static final String NONE = "border-0";
        /** Adds a 1 px border on all sides (Tailwind default). */
        public static final String DEFAULT = "border";
        public static final String XSMALL = "border-2";
        public static final String SMALL = "border-4";
        public static final String MEDIUM = "border-8";

        private Border() {
        }
    }

    // -----------------------------------------------------------------------
    // BorderColor
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the border color of an element.
     *
     * <p>
     * Color variants follow the Tailwind CSS palette.
     */
    public static final class BorderColor {

        public static final String BLACK = "border-black";
        public static final String WHITE = "border-white";
        public static final String TRANSPARENT = "border-transparent";
        public static final String CURRENT = "border-current";
        public static final String INHERIT = "border-inherit";

        private BorderColor() {
        }

        public static final class Slate {
            public static final String _50 = "border-slate-50";
            public static final String _100 = "border-slate-100";
            public static final String _200 = "border-slate-200";
            public static final String _300 = "border-slate-300";
            public static final String _400 = "border-slate-400";
            public static final String _500 = "border-slate-500";
            public static final String _600 = "border-slate-600";
            public static final String _700 = "border-slate-700";
            public static final String _800 = "border-slate-800";
            public static final String _900 = "border-slate-900";
            public static final String _950 = "border-slate-950";

            private Slate() {
            }
        }

        public static final class Gray {
            public static final String _50 = "border-gray-50";
            public static final String _100 = "border-gray-100";
            public static final String _200 = "border-gray-200";
            public static final String _300 = "border-gray-300";
            public static final String _400 = "border-gray-400";
            public static final String _500 = "border-gray-500";
            public static final String _600 = "border-gray-600";
            public static final String _700 = "border-gray-700";
            public static final String _800 = "border-gray-800";
            public static final String _900 = "border-gray-900";
            public static final String _950 = "border-gray-950";

            private Gray() {
            }
        }

        public static final class Red {
            public static final String _50 = "border-red-50";
            public static final String _100 = "border-red-100";
            public static final String _200 = "border-red-200";
            public static final String _300 = "border-red-300";
            public static final String _400 = "border-red-400";
            public static final String _500 = "border-red-500";
            public static final String _600 = "border-red-600";
            public static final String _700 = "border-red-700";
            public static final String _800 = "border-red-800";
            public static final String _900 = "border-red-900";
            public static final String _950 = "border-red-950";

            private Red() {
            }
        }

        public static final class Orange {
            public static final String _50 = "border-orange-50";
            public static final String _100 = "border-orange-100";
            public static final String _200 = "border-orange-200";
            public static final String _300 = "border-orange-300";
            public static final String _400 = "border-orange-400";
            public static final String _500 = "border-orange-500";
            public static final String _600 = "border-orange-600";
            public static final String _700 = "border-orange-700";
            public static final String _800 = "border-orange-800";
            public static final String _900 = "border-orange-900";
            public static final String _950 = "border-orange-950";

            private Orange() {
            }
        }

        public static final class Blue {
            public static final String _50 = "border-blue-50";
            public static final String _100 = "border-blue-100";
            public static final String _200 = "border-blue-200";
            public static final String _300 = "border-blue-300";
            public static final String _400 = "border-blue-400";
            public static final String _500 = "border-blue-500";
            public static final String _600 = "border-blue-600";
            public static final String _700 = "border-blue-700";
            public static final String _800 = "border-blue-800";
            public static final String _900 = "border-blue-900";
            public static final String _950 = "border-blue-950";

            private Blue() {
            }
        }

        public static final class Green {
            public static final String _50 = "border-green-50";
            public static final String _100 = "border-green-100";
            public static final String _200 = "border-green-200";
            public static final String _300 = "border-green-300";
            public static final String _400 = "border-green-400";
            public static final String _500 = "border-green-500";
            public static final String _600 = "border-green-600";
            public static final String _700 = "border-green-700";
            public static final String _800 = "border-green-800";
            public static final String _900 = "border-green-900";
            public static final String _950 = "border-green-950";

            private Green() {
            }
        }

        public static final class Yellow {
            public static final String _50 = "border-yellow-50";
            public static final String _100 = "border-yellow-100";
            public static final String _200 = "border-yellow-200";
            public static final String _300 = "border-yellow-300";
            public static final String _400 = "border-yellow-400";
            public static final String _500 = "border-yellow-500";
            public static final String _600 = "border-yellow-600";
            public static final String _700 = "border-yellow-700";
            public static final String _800 = "border-yellow-800";
            public static final String _900 = "border-yellow-900";
            public static final String _950 = "border-yellow-950";

            private Yellow() {
            }
        }

        public static final class Purple {
            public static final String _50 = "border-purple-50";
            public static final String _100 = "border-purple-100";
            public static final String _200 = "border-purple-200";
            public static final String _300 = "border-purple-300";
            public static final String _400 = "border-purple-400";
            public static final String _500 = "border-purple-500";
            public static final String _600 = "border-purple-600";
            public static final String _700 = "border-purple-700";
            public static final String _800 = "border-purple-800";
            public static final String _900 = "border-purple-900";
            public static final String _950 = "border-purple-950";

            private Purple() {
            }
        }

        public static final class Pink {
            public static final String _50 = "border-pink-50";
            public static final String _100 = "border-pink-100";
            public static final String _200 = "border-pink-200";
            public static final String _300 = "border-pink-300";
            public static final String _400 = "border-pink-400";
            public static final String _500 = "border-pink-500";
            public static final String _600 = "border-pink-600";
            public static final String _700 = "border-pink-700";
            public static final String _800 = "border-pink-800";
            public static final String _900 = "border-pink-900";
            public static final String _950 = "border-pink-950";

            private Pink() {
            }
        }
    }

    // -----------------------------------------------------------------------
    // BorderRadius
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the border radius of an element.
     */
    public static final class BorderRadius {

        public static final String NONE = "rounded-none";
        public static final String SMALL = "rounded-sm";
        public static final String MEDIUM = "rounded";
        public static final String LARGE = "rounded-md";
        public static final String XLARGE = "rounded-lg";
        public static final String XXLARGE = "rounded-xl";
        public static final String XXXLARGE = "rounded-2xl";
        public static final String XXXXLARGE = "rounded-3xl";
        public static final String FULL = "rounded-full";

        private BorderRadius() {
        }
    }

    // -----------------------------------------------------------------------
    // BorderCollapse
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling whether table borders should collapse or be
     * separated.
     */
    public static final class BorderCollapse {

        public static final String COLLAPSE = "border-collapse";
        public static final String SEPARATE = "border-separate";

        private BorderCollapse() {
        }
    }

    // -----------------------------------------------------------------------
    // BorderStyle
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the style of an element's borders.
     */
    public static final class BorderStyle {

        public static final String SOLID = "border-solid";
        public static final String DASHED = "border-dashed";
        public static final String DOTTED = "border-dotted";
        public static final String DOUBLE = "border-double";
        public static final String HIDDEN = "border-hidden";
        public static final String NONE = "border-none";

        private BorderStyle() {
        }
    }

    // -----------------------------------------------------------------------
    // BoxDecorationBreak
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how element fragments render across multiple
     * lines, columns, or pages.
     */
    public static final class BoxDecorationBreak {

        public static final String CLONE = "box-decoration-clone";
        public static final String SLICE = "box-decoration-slice";

        private BoxDecorationBreak() {
        }
    }

    // -----------------------------------------------------------------------
    // BoxShadow    // -----------------------------------------------------------------------
    // BoxShadow
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the box shadow of an element.
     */
    public static final class BoxShadow {

        public static final String NONE = "shadow-none";
        public static final String XSMALL = "shadow-sm";
        public static final String SMALL = "shadow";
        public static final String MEDIUM = "shadow-md";
        public static final String LARGE = "shadow-lg";
        public static final String XLARGE = "shadow-xl";
        public static final String XXLARGE = "shadow-2xl";
        public static final String INNER = "shadow-inner";

        private BoxShadow() {
        }
    }

    // -----------------------------------------------------------------------
    // BoxSizing
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how the browser calculates an element's
     * total size.
     */
    public static final class BoxSizing {

        public static final String BORDER = "box-border";
        public static final String CONTENT = "box-content";

        private BoxSizing() {
        }
    }

    // -----------------------------------------------------------------------
    // BreakAfter
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how a column or page break should behave
     * after an element.
     */
    public static final class BreakAfter {

        public static final String AUTO = "break-after-auto";
        public static final String AVOID = "break-after-avoid";
        public static final String ALL = "break-after-all";
        public static final String AVOID_PAGE = "break-after-avoid-page";
        public static final String PAGE = "break-after-page";
        public static final String LEFT = "break-after-left";
        public static final String RIGHT = "break-after-right";
        public static final String COLUMN = "break-after-column";

        private BreakAfter() {
        }
    }

    // -----------------------------------------------------------------------
    // BreakBefore
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how a column or page break should behave
     * before an element.
     */
    public static final class BreakBefore {

        public static final String AUTO = "break-before-auto";
        public static final String AVOID = "break-before-avoid";
        public static final String ALL = "break-before-all";
        public static final String AVOID_PAGE = "break-before-avoid-page";
        public static final String PAGE = "break-before-page";
        public static final String LEFT = "break-before-left";
        public static final String RIGHT = "break-before-right";
        public static final String COLUMN = "break-before-column";

        private BreakBefore() {
        }
    }

    // -----------------------------------------------------------------------
    // BreakInside
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how a column or page break should behave
     * inside an element.
     */
    public static final class BreakInside {

        public static final String AUTO = "break-inside-auto";
        public static final String AVOID = "break-inside-avoid";
        public static final String AVOID_PAGE = "break-inside-avoid-page";
        public static final String AVOID_COLUMN = "break-inside-avoid-column";

        private BreakInside() {
        }
    }

    // -----------------------------------------------------------------------
    // CaptionSide
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the alignment of a caption element inside a
     * table.
     */
    public static final class CaptionSide {

        public static final String TOP = "caption-top";
        public static final String BOTTOM = "caption-bottom";

        private CaptionSide() {
        }
    }

    // -----------------------------------------------------------------------
    // Clear
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the wrapping of content around an element.
     */
    public static final class Clear {

        public static final String LEFT = "clear-left";
        public static final String RIGHT = "clear-right";
        public static final String BOTH = "clear-both";
        public static final String NONE = "clear-none";
        public static final String START = "clear-start";
        public static final String END = "clear-end";

        private Clear() {
        }
    }

    // -----------------------------------------------------------------------
    // Columns
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the number of columns within an element.
     */
    public static final class Columns {

        public static final String AUTO = "columns-auto";
        public static final String _1 = "columns-1";
        public static final String _2 = "columns-2";
        public static final String _3 = "columns-3";
        public static final String _4 = "columns-4";
        public static final String _5 = "columns-5";
        public static final String _6 = "columns-6";
        public static final String _7 = "columns-7";
        public static final String _8 = "columns-8";
        public static final String _9 = "columns-9";
        public static final String _10 = "columns-10";
        public static final String _11 = "columns-11";
        public static final String _12 = "columns-12";
        public static final String XSMALL_3 = "columns-3xs";
        public static final String XSMALL_2 = "columns-2xs";
        public static final String XSMALL = "columns-xs";
        public static final String SMALL = "columns-sm";
        public static final String MEDIUM = "columns-md";
        public static final String LARGE = "columns-lg";
        public static final String XLARGE = "columns-xl";
        public static final String XXLARGE = "columns-2xl";
        public static final String XXXLARGE = "columns-3xl";
        public static final String XXXXLARGE = "columns-4xl";
        public static final String XXXXXLARGE = "columns-5xl";
        public static final String XXXXXXLARGE = "columns-6xl";
        public static final String XXXXXXXLARGE = "columns-7xl";

        private Columns() {
        }
    }

    // -----------------------------------------------------------------------
    // Cursor
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the cursor style when hovering over an element.
     */
    public static final class Cursor {

        public static final String AUTO = "cursor-auto";
        public static final String DEFAULT = "cursor-default";
        public static final String POINTER = "cursor-pointer";
        public static final String WAIT = "cursor-wait";
        public static final String TEXT = "cursor-text";
        public static final String MOVE = "cursor-move";
        public static final String HELP = "cursor-help";
        public static final String NOT_ALLOWED = "cursor-not-allowed";
        public static final String NONE = "cursor-none";
        public static final String CONTEXT_MENU = "cursor-context-menu";
        public static final String PROGRESS = "cursor-progress";
        public static final String CELL = "cursor-cell";
        public static final String CROSSHAIR = "cursor-crosshair";
        public static final String VERTICAL_TEXT = "cursor-vertical-text";
        public static final String ALIAS = "cursor-alias";
        public static final String COPY = "cursor-copy";
        public static final String NO_DROP = "cursor-no-drop";
        public static final String GRAB = "cursor-grab";
        public static final String GRABBING = "cursor-grabbing";
        public static final String ALL_SCROLL = "cursor-all-scroll";
        public static final String COL_RESIZE = "cursor-col-resize";
        public static final String ROW_RESIZE = "cursor-row-resize";
        public static final String N_RESIZE = "cursor-n-resize";
        public static final String E_RESIZE = "cursor-e-resize";
        public static final String S_RESIZE = "cursor-s-resize";
        public static final String W_RESIZE = "cursor-w-resize";
        public static final String NE_RESIZE = "cursor-ne-resize";
        public static final String NW_RESIZE = "cursor-nw-resize";
        public static final String SE_RESIZE = "cursor-se-resize";
        public static final String SW_RESIZE = "cursor-sw-resize";
        public static final String EW_RESIZE = "cursor-ew-resize";
        public static final String NS_RESIZE = "cursor-ns-resize";
        public static final String NESW_RESIZE = "cursor-nesw-resize";
        public static final String NWSE_RESIZE = "cursor-nwse-resize";
        public static final String ZOOM_IN = "cursor-zoom-in";
        public static final String ZOOM_OUT = "cursor-zoom-out";

        private Cursor() {
        }
    }

    // -----------------------------------------------------------------------
    // Display    // -----------------------------------------------------------------------
    // Display
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the display type of an element.
     */
    public static final class Display {

        public static final String BLOCK = "block";
        public static final String CONTENTS = "contents";
        public static final String FLEX = "flex";
        public static final String FLOW_ROOT = "flow-root";
        public static final String GRID = "grid";
        public static final String HIDDEN = "hidden";
        public static final String INLINE = "inline";
        public static final String INLINE_BLOCK = "inline-block";
        public static final String INLINE_FLEX = "inline-flex";
        public static final String INLINE_GRID = "inline-grid";
        public static final String LIST_ITEM = "list-item";
        public static final String TABLE = "table";

        private Display() {
        }
    }

    // -----------------------------------------------------------------------
    // FlexDirection
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the direction of flex items.
     */
    public static final class FlexDirection {

        public static final String COLUMN = "flex-col";
        public static final String COLUMN_REVERSE = "flex-col-reverse";
        public static final String ROW = "flex-row";
        public static final String ROW_REVERSE = "flex-row-reverse";

        private FlexDirection() {
        }
    }

    // -----------------------------------------------------------------------
    // FlexGrow
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how flex items grow.
     */
    public static final class FlexGrow {

        public static final String GROW = "grow";
        public static final String NONE = "grow-0";

        private FlexGrow() {
        }
    }

    // -----------------------------------------------------------------------
    // FlexShrink
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how flex items shrink.
     */
    public static final class FlexShrink {

        public static final String SHRINK = "shrink";
        public static final String NONE = "shrink-0";

        private FlexShrink() {
        }
    }

    // -----------------------------------------------------------------------
    // FlexWrap
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how flex items wrap.
     */
    public static final class FlexWrap {

        public static final String NOWRAP = "flex-nowrap";
        public static final String WRAP = "flex-wrap";
        public static final String WRAP_REVERSE = "flex-wrap-reverse";

        private FlexWrap() {
        }
    }

    // -----------------------------------------------------------------------
    // Filter
    // -----------------------------------------------------------------------

    /**
     * Classes for applying CSS filter effects to an element.
     */
    public static final class Filter {

        private Filter() {
        }

        /** Blur filter classes ({@code blur-*}). */
        public static final class Blur {
            public static final String NONE = "blur-none";
            public static final String SMALL = "blur-sm";
            public static final String DEFAULT = "blur";
            public static final String MEDIUM = "blur-md";
            public static final String LARGE = "blur-lg";
            public static final String XLARGE = "blur-xl";
            public static final String XXLARGE = "blur-2xl";
            public static final String XXXLARGE = "blur-3xl";

            private Blur() {
            }
        }

        /** Brightness filter classes ({@code brightness-*}). */
        public static final class Brightness {
            public static final String _0 = "brightness-0";
            public static final String _50 = "brightness-50";
            public static final String _75 = "brightness-75";
            public static final String _90 = "brightness-90";
            public static final String _95 = "brightness-95";
            public static final String _100 = "brightness-100";
            public static final String _105 = "brightness-105";
            public static final String _110 = "brightness-110";
            public static final String _125 = "brightness-125";
            public static final String _150 = "brightness-150";
            public static final String _200 = "brightness-200";

            private Brightness() {
            }
        }

        /** Contrast filter classes ({@code contrast-*}). */
        public static final class Contrast {
            public static final String _0 = "contrast-0";
            public static final String _50 = "contrast-50";
            public static final String _75 = "contrast-75";
            public static final String _100 = "contrast-100";
            public static final String _125 = "contrast-125";
            public static final String _150 = "contrast-150";
            public static final String _200 = "contrast-200";

            private Contrast() {
            }
        }

        /** Grayscale filter classes ({@code grayscale-*}). */
        public static final class Grayscale {
            public static final String NONE = "grayscale-0";
            public static final String FULL = "grayscale";

            private Grayscale() {
            }
        }

        /** Hue-rotate filter classes ({@code hue-rotate-*}). */
        public static final class HueRotate {
            public static final String _0 = "hue-rotate-0";
            public static final String _15 = "hue-rotate-15";
            public static final String _30 = "hue-rotate-30";
            public static final String _60 = "hue-rotate-60";
            public static final String _90 = "hue-rotate-90";
            public static final String _180 = "hue-rotate-180";

            private HueRotate() {
            }
        }

        /** Invert filter classes ({@code invert-*}). */
        public static final class Invert {
            public static final String NONE = "invert-0";
            public static final String FULL = "invert";

            private Invert() {
            }
        }

        /** Saturate filter classes ({@code saturate-*}). */
        public static final class Saturate {
            public static final String _0 = "saturate-0";
            public static final String _50 = "saturate-50";
            public static final String _100 = "saturate-100";
            public static final String _150 = "saturate-150";
            public static final String _200 = "saturate-200";

            private Saturate() {
            }
        }

        /** Sepia filter classes ({@code sepia-*}). */
        public static final class Sepia {
            public static final String NONE = "sepia-0";
            public static final String FULL = "sepia";

            private Sepia() {
            }
        }
    }

    // -----------------------------------------------------------------------
    // Flex
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how flex items both grow and shrink
     * ({@code flex} shorthand).
     */
    public static final class Flex {

        public static final String _1 = "flex-1";
        public static final String AUTO = "flex-auto";
        public static final String INITIAL = "flex-initial";
        public static final String NONE = "flex-none";

        private Flex() {
        }
    }

    // -----------------------------------------------------------------------
    // FlexBasis
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the initial size of flex items ({@code basis-*}).
     */
    public static final class FlexBasis {

        public static final String AUTO = "basis-auto";
        public static final String FULL = "basis-full";
        public static final String NONE = "basis-0";
        public static final String XSMALL = "basis-1";
        public static final String SMALL = "basis-2";
        public static final String MEDIUM = "basis-4";
        public static final String LARGE = "basis-6";
        public static final String XLARGE = "basis-8";
        public static final String XXLARGE = "basis-12";
        public static final String XXXLARGE = "basis-16";
        public static final String XXXXLARGE = "basis-24";
        public static final String XXXXXLARGE = "basis-32";
        public static final String HALF = "basis-1/2";
        public static final String ONE_THIRD = "basis-1/3";
        public static final String TWO_THIRDS = "basis-2/3";
        public static final String ONE_QUARTER = "basis-1/4";
        public static final String THREE_QUARTERS = "basis-3/4";

        private FlexBasis() {
        }
    }

    // -----------------------------------------------------------------------
    // Float
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the wrapping of content around an element.
     */
    public static final class Float {

        public static final String LEFT = "float-left";
        public static final String RIGHT = "float-right";
        public static final String NONE = "float-none";
        public static final String START = "float-start";
        public static final String END = "float-end";

        private Float() {
        }
    }

    // -----------------------------------------------------------------------
    // FontFamily
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the font family of an element.
     */
    public static final class FontFamily {

        public static final String SANS = "font-sans";
        public static final String SERIF = "font-serif";
        public static final String MONO = "font-mono";

        private FontFamily() {
        }
    }

    // -----------------------------------------------------------------------
    // FontSmoothing
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the font-smoothing of an element.
     */
    public static final class FontSmoothing {

        public static final String ANTIALIASED = "antialiased";
        public static final String SUBPIXEL_ANTIALIASED = "subpixel-antialiased";

        private FontSmoothing() {
        }
    }

    // -----------------------------------------------------------------------
    // FontVariantNumeric
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the variant of numbers in an element.
     */
    public static final class FontVariantNumeric {

        public static final String NORMAL = "normal-nums";
        public static final String ORDINAL = "ordinal";
        public static final String SLASHED_ZERO = "slashed-zero";
        public static final String LINING_NUMS = "lining-nums";
        public static final String OLDSTYLE_NUMS = "oldstyle-nums";
        public static final String PROPORTIONAL_NUMS = "proportional-nums";
        public static final String TABULAR_NUMS = "tabular-nums";
        public static final String DIAGONAL_FRACTIONS = "diagonal-fractions";
        public static final String STACKED_FRACTIONS = "stacked-fractions";

        private FontVariantNumeric() {
        }
    }

    // -----------------------------------------------------------------------
    // FontSize    // -----------------------------------------------------------------------
    // FontSize
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the font size of an element.
     *
     * <p>
     * Corresponds to Tailwind's {@code text-{size}} utilities.
     */
    public static final class FontSize {

        public static final String XSMALL = "text-xs";
        public static final String SMALL = "text-sm";
        public static final String MEDIUM = "text-base";
        public static final String LARGE = "text-lg";
        public static final String XLARGE = "text-xl";
        public static final String XXLARGE = "text-2xl";
        public static final String XXXLARGE = "text-3xl";
        public static final String XXXXLARGE = "text-4xl";
        public static final String XXXXXLARGE = "text-5xl";
        public static final String XXXXXXLARGE = "text-6xl";
        public static final String XXXXXXXLARGE = "text-7xl";
        public static final String XXXXXXXXLARGE = "text-8xl";
        public static final String XXXXXXXXXLARGE = "text-9xl";

        private FontSize() {
        }
    }

    // -----------------------------------------------------------------------
    // FontStyle
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the font style of an element.
     */
    public static final class FontStyle {

        public static final String ITALIC = "italic";
        public static final String NORMAL = "not-italic";

        private FontStyle() {
        }
    }

    // -----------------------------------------------------------------------
    // FontWeight
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the font weight of an element.
     */
    public static final class FontWeight {

        public static final String THIN = "font-thin";
        public static final String EXTRALIGHT = "font-extralight";
        public static final String LIGHT = "font-light";
        public static final String NORMAL = "font-normal";
        public static final String MEDIUM = "font-medium";
        public static final String SEMIBOLD = "font-semibold";
        public static final String BOLD = "font-bold";
        public static final String EXTRABOLD = "font-extrabold";
        public static final String BLACK = "font-black";

        private FontWeight() {
        }
    }

    // -----------------------------------------------------------------------
    // Gap
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the gutters between grid and flexbox items.
     *
     * <p>
     * Values use the Tailwind default spacing scale where 1 unit = 0.25 rem.
     */
    public static final class Gap {

        public static final String NONE = "gap-0";
        public static final String XSMALL = "gap-1";
        public static final String SMALL = "gap-2";
        public static final String MEDIUM = "gap-4";
        public static final String LARGE = "gap-6";
        public static final String XLARGE = "gap-8";
        public static final String XXLARGE = "gap-12";
        public static final String XXXLARGE = "gap-16";

        private Gap() {
        }

        /** Classes for controlling column gaps only. */
        public static final class Column {

            public static final String NONE = "gap-x-0";
            public static final String XSMALL = "gap-x-1";
            public static final String SMALL = "gap-x-2";
            public static final String MEDIUM = "gap-x-4";
            public static final String LARGE = "gap-x-6";
            public static final String XLARGE = "gap-x-8";
            public static final String XXLARGE = "gap-x-12";
            public static final String XXXLARGE = "gap-x-16";

            private Column() {
            }
        }

        /** Classes for controlling row gaps only. */
        public static final class Row {

            public static final String NONE = "gap-y-0";
            public static final String XSMALL = "gap-y-1";
            public static final String SMALL = "gap-y-2";
            public static final String MEDIUM = "gap-y-4";
            public static final String LARGE = "gap-y-6";
            public static final String XLARGE = "gap-y-8";
            public static final String XXLARGE = "gap-y-12";
            public static final String XXXLARGE = "gap-y-16";

            private Row() {
            }
        }
    }

    // -----------------------------------------------------------------------
    // Grid
    // -----------------------------------------------------------------------

    /**
     * Classes for specifying columns, rows, and flow in a grid layout.
     */
    public static final class Grid {

        private Grid() {
        }

        /** Grid template column classes ({@code grid-cols-*}). */
        public static final class TemplateColumns {
            public static final String NONE = "grid-cols-none";
            public static final String SUBGRID = "grid-cols-subgrid";
            public static final String _1 = "grid-cols-1";
            public static final String _2 = "grid-cols-2";
            public static final String _3 = "grid-cols-3";
            public static final String _4 = "grid-cols-4";
            public static final String _5 = "grid-cols-5";
            public static final String _6 = "grid-cols-6";
            public static final String _7 = "grid-cols-7";
            public static final String _8 = "grid-cols-8";
            public static final String _9 = "grid-cols-9";
            public static final String _10 = "grid-cols-10";
            public static final String _11 = "grid-cols-11";
            public static final String _12 = "grid-cols-12";

            private TemplateColumns() {
            }
        }

        /** Grid template row classes ({@code grid-rows-*}). */
        public static final class TemplateRows {
            public static final String NONE = "grid-rows-none";
            public static final String SUBGRID = "grid-rows-subgrid";
            public static final String _1 = "grid-rows-1";
            public static final String _2 = "grid-rows-2";
            public static final String _3 = "grid-rows-3";
            public static final String _4 = "grid-rows-4";
            public static final String _5 = "grid-rows-5";
            public static final String _6 = "grid-rows-6";

            private TemplateRows() {
            }
        }

        /** Grid auto-flow classes ({@code grid-flow-*}). */
        public static final class AutoFlow {
            public static final String ROW = "grid-flow-row";
            public static final String COLUMN = "grid-flow-col";
            public static final String DENSE = "grid-flow-dense";
            public static final String ROW_DENSE = "grid-flow-row-dense";
            public static final String COLUMN_DENSE = "grid-flow-col-dense";

            private AutoFlow() {
            }
        }

        /** Grid auto-columns classes ({@code auto-cols-*}). */
        public static final class AutoColumns {
            public static final String AUTO = "auto-cols-auto";
            public static final String MIN = "auto-cols-min";
            public static final String MAX = "auto-cols-max";
            public static final String FR = "auto-cols-fr";

            private AutoColumns() {
            }
        }

        /** Grid auto-rows classes ({@code auto-rows-*}). */
        public static final class AutoRows {
            public static final String AUTO = "auto-rows-auto";
            public static final String MIN = "auto-rows-min";
            public static final String MAX = "auto-rows-max";
            public static final String FR = "auto-rows-fr";

            private AutoRows() {
            }
        }
    }

    // -----------------------------------------------------------------------
    // GridColumn
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how elements are sized and placed across
     * grid columns ({@code col-*}).
     */
    public static final class GridColumn {

        public static final String AUTO = "col-auto";
        public static final String SPAN_FULL = "col-span-full";
        public static final String SPAN_1 = "col-span-1";
        public static final String SPAN_2 = "col-span-2";
        public static final String SPAN_3 = "col-span-3";
        public static final String SPAN_4 = "col-span-4";
        public static final String SPAN_5 = "col-span-5";
        public static final String SPAN_6 = "col-span-6";
        public static final String SPAN_7 = "col-span-7";
        public static final String SPAN_8 = "col-span-8";
        public static final String SPAN_9 = "col-span-9";
        public static final String SPAN_10 = "col-span-10";
        public static final String SPAN_11 = "col-span-11";
        public static final String SPAN_12 = "col-span-12";
        public static final String START_AUTO = "col-start-auto";
        public static final String START_1 = "col-start-1";
        public static final String START_2 = "col-start-2";
        public static final String START_3 = "col-start-3";
        public static final String START_4 = "col-start-4";
        public static final String START_5 = "col-start-5";
        public static final String START_6 = "col-start-6";
        public static final String START_7 = "col-start-7";
        public static final String START_8 = "col-start-8";
        public static final String START_9 = "col-start-9";
        public static final String START_10 = "col-start-10";
        public static final String START_11 = "col-start-11";
        public static final String START_12 = "col-start-12";
        public static final String START_13 = "col-start-13";
        public static final String END_AUTO = "col-end-auto";
        public static final String END_1 = "col-end-1";
        public static final String END_2 = "col-end-2";
        public static final String END_3 = "col-end-3";
        public static final String END_4 = "col-end-4";
        public static final String END_5 = "col-end-5";
        public static final String END_6 = "col-end-6";
        public static final String END_7 = "col-end-7";
        public static final String END_8 = "col-end-8";
        public static final String END_9 = "col-end-9";
        public static final String END_10 = "col-end-10";
        public static final String END_11 = "col-end-11";
        public static final String END_12 = "col-end-12";
        public static final String END_13 = "col-end-13";

        private GridColumn() {
        }
    }

    // -----------------------------------------------------------------------
    // GridRow
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how elements are sized and placed across
     * grid rows ({@code row-*}).
     */
    public static final class GridRow {

        public static final String AUTO = "row-auto";
        public static final String SPAN_FULL = "row-span-full";
        public static final String SPAN_1 = "row-span-1";
        public static final String SPAN_2 = "row-span-2";
        public static final String SPAN_3 = "row-span-3";
        public static final String SPAN_4 = "row-span-4";
        public static final String SPAN_5 = "row-span-5";
        public static final String SPAN_6 = "row-span-6";
        public static final String START_AUTO = "row-start-auto";
        public static final String START_1 = "row-start-1";
        public static final String START_2 = "row-start-2";
        public static final String START_3 = "row-start-3";
        public static final String START_4 = "row-start-4";
        public static final String START_5 = "row-start-5";
        public static final String START_6 = "row-start-6";
        public static final String START_7 = "row-start-7";
        public static final String END_AUTO = "row-end-auto";
        public static final String END_1 = "row-end-1";
        public static final String END_2 = "row-end-2";
        public static final String END_3 = "row-end-3";
        public static final String END_4 = "row-end-4";
        public static final String END_5 = "row-end-5";
        public static final String END_6 = "row-end-6";
        public static final String END_7 = "row-end-7";

        private GridRow() {
        }
    }

    // -----------------------------------------------------------------------
    // Height    // -----------------------------------------------------------------------
    // Height
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the height of an element.
     */
    public static final class Height {

        public static final String AUTO = "h-auto";
        public static final String FULL = "h-full";
        public static final String SCREEN = "h-screen";
        public static final String SVH = "h-svh";
        public static final String MIN = "h-min";
        public static final String MAX = "h-max";
        public static final String FIT = "h-fit";
        public static final String NONE = "h-0";
        public static final String XSMALL = "h-1";
        public static final String SMALL = "h-2";
        public static final String MEDIUM = "h-4";
        public static final String LARGE = "h-6";
        public static final String XLARGE = "h-8";
        public static final String XXLARGE = "h-12";
        public static final String XXXLARGE = "h-16";
        public static final String XXXXLARGE = "h-24";
        public static final String XXXXXLARGE = "h-32";

        private Height() {
        }
    }

    // -----------------------------------------------------------------------
    // Hyphens
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how words should be hyphenated.
     */
    public static final class Hyphens {

        public static final String NONE = "hyphens-none";
        public static final String MANUAL = "hyphens-manual";
        public static final String AUTO = "hyphens-auto";

        private Hyphens() {
        }
    }

    // -----------------------------------------------------------------------
    // Inset
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the placement of positioned elements
     * ({@code top-*}, {@code right-*}, {@code bottom-*}, {@code left-*},
     * {@code inset-*}).
     */
    public static final class Inset {

        public static final String AUTO = "inset-auto";
        public static final String FULL = "inset-full";
        public static final String HALF = "inset-1/2";
        public static final String NONE = "inset-0";
        public static final String XSMALL = "inset-1";
        public static final String SMALL = "inset-2";
        public static final String MEDIUM = "inset-4";
        public static final String LARGE = "inset-6";
        public static final String XLARGE = "inset-8";
        public static final String XXLARGE = "inset-12";
        public static final String XXXLARGE = "inset-16";

        private Inset() {
        }

        /** Horizontal (left + right) inset classes ({@code inset-x-*}). */
        public static final class X {
            public static final String AUTO = "inset-x-auto";
            public static final String FULL = "inset-x-full";
            public static final String HALF = "inset-x-1/2";
            public static final String NONE = "inset-x-0";
            public static final String XSMALL = "inset-x-1";
            public static final String SMALL = "inset-x-2";
            public static final String MEDIUM = "inset-x-4";
            public static final String LARGE = "inset-x-6";
            public static final String XLARGE = "inset-x-8";
            public static final String XXLARGE = "inset-x-12";
            public static final String XXXLARGE = "inset-x-16";

            private X() {
            }
        }

        /** Vertical (top + bottom) inset classes ({@code inset-y-*}). */
        public static final class Y {
            public static final String AUTO = "inset-y-auto";
            public static final String FULL = "inset-y-full";
            public static final String HALF = "inset-y-1/2";
            public static final String NONE = "inset-y-0";
            public static final String XSMALL = "inset-y-1";
            public static final String SMALL = "inset-y-2";
            public static final String MEDIUM = "inset-y-4";
            public static final String LARGE = "inset-y-6";
            public static final String XLARGE = "inset-y-8";
            public static final String XXLARGE = "inset-y-12";
            public static final String XXXLARGE = "inset-y-16";

            private Y() {
            }
        }

        /** Top inset classes ({@code top-*}). */
        public static final class Top {
            public static final String AUTO = "top-auto";
            public static final String FULL = "top-full";
            public static final String HALF = "top-1/2";
            public static final String NONE = "top-0";
            public static final String XSMALL = "top-1";
            public static final String SMALL = "top-2";
            public static final String MEDIUM = "top-4";
            public static final String LARGE = "top-6";
            public static final String XLARGE = "top-8";
            public static final String XXLARGE = "top-12";
            public static final String XXXLARGE = "top-16";

            private Top() {
            }
        }

        /** Right inset classes ({@code right-*}). */
        public static final class Right {
            public static final String AUTO = "right-auto";
            public static final String FULL = "right-full";
            public static final String HALF = "right-1/2";
            public static final String NONE = "right-0";
            public static final String XSMALL = "right-1";
            public static final String SMALL = "right-2";
            public static final String MEDIUM = "right-4";
            public static final String LARGE = "right-6";
            public static final String XLARGE = "right-8";
            public static final String XXLARGE = "right-12";
            public static final String XXXLARGE = "right-16";

            private Right() {
            }
        }

        /** Bottom inset classes ({@code bottom-*}). */
        public static final class Bottom {
            public static final String AUTO = "bottom-auto";
            public static final String FULL = "bottom-full";
            public static final String HALF = "bottom-1/2";
            public static final String NONE = "bottom-0";
            public static final String XSMALL = "bottom-1";
            public static final String SMALL = "bottom-2";
            public static final String MEDIUM = "bottom-4";
            public static final String LARGE = "bottom-6";
            public static final String XLARGE = "bottom-8";
            public static final String XXLARGE = "bottom-12";
            public static final String XXXLARGE = "bottom-16";

            private Bottom() {
            }
        }

        /** Left inset classes ({@code left-*}). */
        public static final class Left {
            public static final String AUTO = "left-auto";
            public static final String FULL = "left-full";
            public static final String HALF = "left-1/2";
            public static final String NONE = "left-0";
            public static final String XSMALL = "left-1";
            public static final String SMALL = "left-2";
            public static final String MEDIUM = "left-4";
            public static final String LARGE = "left-6";
            public static final String XLARGE = "left-8";
            public static final String XXLARGE = "left-12";
            public static final String XXXLARGE = "left-16";

            private Left() {
            }
        }
    }

    // -----------------------------------------------------------------------
    // Isolation
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling whether an element should explicitly create a
     * new stacking context.
     */
    public static final class Isolation {

        public static final String ISOLATE = "isolate";
        public static final String AUTO = "isolation-auto";

        private Isolation() {
        }
    }

    // -----------------------------------------------------------------------
    // JustifyContent    // -----------------------------------------------------------------------
    // JustifyContent
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how flex and grid items are positioned along
     * a container's main axis.
     */
    public static final class JustifyContent {

        public static final String AROUND = "justify-around";
        public static final String BETWEEN = "justify-between";
        public static final String CENTER = "justify-center";
        public static final String END = "justify-end";
        public static final String EVENLY = "justify-evenly";
        public static final String NORMAL = "justify-normal";
        public static final String START = "justify-start";
        public static final String STRETCH = "justify-stretch";

        private JustifyContent() {
        }
    }

    // -----------------------------------------------------------------------
    // JustifyItems
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how grid items are aligned along their
     * inline axis.
     */
    public static final class JustifyItems {

        public static final String START = "justify-items-start";
        public static final String END = "justify-items-end";
        public static final String CENTER = "justify-items-center";
        public static final String STRETCH = "justify-items-stretch";

        private JustifyItems() {
        }
    }

    // -----------------------------------------------------------------------
    // JustifySelf
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how an individual grid item is aligned along
     * its inline axis.
     */
    public static final class JustifySelf {

        public static final String AUTO = "justify-self-auto";
        public static final String START = "justify-self-start";
        public static final String END = "justify-self-end";
        public static final String CENTER = "justify-self-center";
        public static final String STRETCH = "justify-self-stretch";

        private JustifySelf() {
        }
    }

    // -----------------------------------------------------------------------
    // LineHeight    // -----------------------------------------------------------------------
    // LineHeight
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the leading (line height) of an element.
     */
    public static final class LineHeight {

        public static final String NONE = "leading-none";
        public static final String TIGHT = "leading-tight";
        public static final String SNUG = "leading-snug";
        public static final String NORMAL = "leading-normal";
        public static final String RELAXED = "leading-relaxed";
        public static final String LOOSE = "leading-loose";

        private LineHeight() {
        }
    }

    // -----------------------------------------------------------------------
    // LetterSpacing
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the tracking (letter spacing) of an element.
     */
    public static final class LetterSpacing {

        public static final String TIGHTER = "tracking-tighter";
        public static final String TIGHT = "tracking-tight";
        public static final String NORMAL = "tracking-normal";
        public static final String WIDE = "tracking-wide";
        public static final String WIDER = "tracking-wider";
        public static final String WIDEST = "tracking-widest";

        private LetterSpacing() {
        }
    }

    // -----------------------------------------------------------------------
    // LineClamp
    // -----------------------------------------------------------------------

    /**
     * Classes for clamping text to a fixed number of lines.
     */
    public static final class LineClamp {

        public static final String NONE = "line-clamp-none";
        public static final String _1 = "line-clamp-1";
        public static final String _2 = "line-clamp-2";
        public static final String _3 = "line-clamp-3";
        public static final String _4 = "line-clamp-4";
        public static final String _5 = "line-clamp-5";
        public static final String _6 = "line-clamp-6";

        private LineClamp() {
        }
    }

    // -----------------------------------------------------------------------
    // ListStylePosition
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the position of bullets/numbers in a list.
     */
    public static final class ListStylePosition {

        public static final String INSIDE = "list-inside";
        public static final String OUTSIDE = "list-outside";

        private ListStylePosition() {
        }
    }

    // -----------------------------------------------------------------------
    // ListStyleType
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the marker style of a list.
     */
    public static final class ListStyleType {

        public static final String NONE = "list-none";
        public static final String DISC = "list-disc";
        public static final String DECIMAL = "list-decimal";

        private ListStyleType() {
        }
    }

    // -----------------------------------------------------------------------
    // Margin    // -----------------------------------------------------------------------
    // Margin
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the margin of an element.
     *
     * <p>
     * Values use the Tailwind default spacing scale where 1 unit = 0.25 rem.
     * Use the {@link Horizontal}, {@link Vertical}, {@link Top}, {@link Right},
     * {@link Bottom}, and {@link Left} inner classes for directional variants.
     */
    public static final class Margin {

        public static final String AUTO = "m-auto";
        public static final String NONE = "m-0";
        public static final String XSMALL = "m-1";
        public static final String SMALL = "m-2";
        public static final String MEDIUM = "m-4";
        public static final String LARGE = "m-6";
        public static final String XLARGE = "m-8";
        public static final String XXLARGE = "m-12";
        public static final String XXXLARGE = "m-16";

        private Margin() {
        }

        /** Horizontal (left + right) margin classes. */
        public static final class Horizontal {

            public static final String AUTO = "mx-auto";
            public static final String NONE = "mx-0";
            public static final String XSMALL = "mx-1";
            public static final String SMALL = "mx-2";
            public static final String MEDIUM = "mx-4";
            public static final String LARGE = "mx-6";
            public static final String XLARGE = "mx-8";
            public static final String XXLARGE = "mx-12";
            public static final String XXXLARGE = "mx-16";

            private Horizontal() {
            }
        }

        /** Vertical (top + bottom) margin classes. */
        public static final class Vertical {

            public static final String AUTO = "my-auto";
            public static final String NONE = "my-0";
            public static final String XSMALL = "my-1";
            public static final String SMALL = "my-2";
            public static final String MEDIUM = "my-4";
            public static final String LARGE = "my-6";
            public static final String XLARGE = "my-8";
            public static final String XXLARGE = "my-12";
            public static final String XXXLARGE = "my-16";

            private Vertical() {
            }
        }

        /** Top margin classes. */
        public static final class Top {

            public static final String AUTO = "mt-auto";
            public static final String NONE = "mt-0";
            public static final String XSMALL = "mt-1";
            public static final String SMALL = "mt-2";
            public static final String MEDIUM = "mt-4";
            public static final String LARGE = "mt-6";
            public static final String XLARGE = "mt-8";
            public static final String XXLARGE = "mt-12";
            public static final String XXXLARGE = "mt-16";

            private Top() {
            }
        }

        /** Right margin classes. */
        public static final class Right {

            public static final String AUTO = "mr-auto";
            public static final String NONE = "mr-0";
            public static final String XSMALL = "mr-1";
            public static final String SMALL = "mr-2";
            public static final String MEDIUM = "mr-4";
            public static final String LARGE = "mr-6";
            public static final String XLARGE = "mr-8";
            public static final String XXLARGE = "mr-12";
            public static final String XXXLARGE = "mr-16";

            private Right() {
            }
        }

        /** Bottom margin classes. */
        public static final class Bottom {

            public static final String AUTO = "mb-auto";
            public static final String NONE = "mb-0";
            public static final String XSMALL = "mb-1";
            public static final String SMALL = "mb-2";
            public static final String MEDIUM = "mb-4";
            public static final String LARGE = "mb-6";
            public static final String XLARGE = "mb-8";
            public static final String XXLARGE = "mb-12";
            public static final String XXXLARGE = "mb-16";

            private Bottom() {
            }
        }

        /** Left margin classes. */
        public static final class Left {

            public static final String AUTO = "ml-auto";
            public static final String NONE = "ml-0";
            public static final String XSMALL = "ml-1";
            public static final String SMALL = "ml-2";
            public static final String MEDIUM = "ml-4";
            public static final String LARGE = "ml-6";
            public static final String XLARGE = "ml-8";
            public static final String XXLARGE = "ml-12";
            public static final String XXXLARGE = "ml-16";

            private Left() {
            }
        }
    }

    // -----------------------------------------------------------------------
    // MaxHeight
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the maximum height of an element.
     */
    public static final class MaxHeight {

        public static final String NONE = "max-h-none";
        public static final String FULL = "max-h-full";
        public static final String SCREEN = "max-h-screen";
        public static final String MIN = "max-h-min";
        public static final String MAX = "max-h-max";
        public static final String FIT = "max-h-fit";
        public static final String XSMALL = "max-h-1";
        public static final String SMALL = "max-h-2";
        public static final String MEDIUM = "max-h-4";
        public static final String LARGE = "max-h-6";
        public static final String XLARGE = "max-h-8";
        public static final String XXLARGE = "max-h-12";
        public static final String XXXLARGE = "max-h-16";

        private MaxHeight() {
        }
    }

    // -----------------------------------------------------------------------
    // MaxWidth
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the maximum width of an element.
     */
    public static final class MaxWidth {

        public static final String NONE = "max-w-none";
        public static final String FULL = "max-w-full";
        public static final String MIN = "max-w-min";
        public static final String MAX = "max-w-max";
        public static final String FIT = "max-w-fit";
        public static final String PROSE = "max-w-prose";
        public static final String XSMALL = "max-w-xs";
        public static final String SMALL = "max-w-sm";
        public static final String MEDIUM = "max-w-md";
        public static final String LARGE = "max-w-lg";
        public static final String XLARGE = "max-w-xl";
        public static final String XXLARGE = "max-w-2xl";
        public static final String XXXLARGE = "max-w-3xl";
        public static final String XXXXLARGE = "max-w-4xl";
        public static final String XXXXXLARGE = "max-w-5xl";
        public static final String XXXXXXLARGE = "max-w-6xl";
        public static final String XXXXXXXLARGE = "max-w-7xl";

        private MaxWidth() {
        }
    }

    // -----------------------------------------------------------------------
    // MinHeight
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the minimum height of an element.
     */
    public static final class MinHeight {

        public static final String NONE = "min-h-0";
        public static final String FULL = "min-h-full";
        public static final String SCREEN = "min-h-screen";
        public static final String MIN = "min-h-min";
        public static final String MAX = "min-h-max";
        public static final String FIT = "min-h-fit";

        private MinHeight() {
        }
    }

    // -----------------------------------------------------------------------
    // MinWidth
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the minimum width of an element.
     */
    public static final class MinWidth {

        public static final String NONE = "min-w-0";
        public static final String FULL = "min-w-full";
        public static final String MIN = "min-w-min";
        public static final String MAX = "min-w-max";
        public static final String FIT = "min-w-fit";

        private MinWidth() {
        }
    }

    // -----------------------------------------------------------------------
    // MixBlendMode
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how an element should blend with the background.
     */
    public static final class MixBlendMode {

        public static final String NORMAL = "mix-blend-normal";
        public static final String MULTIPLY = "mix-blend-multiply";
        public static final String SCREEN = "mix-blend-screen";
        public static final String OVERLAY = "mix-blend-overlay";
        public static final String DARKEN = "mix-blend-darken";
        public static final String LIGHTEN = "mix-blend-lighten";
        public static final String COLOR_DODGE = "mix-blend-color-dodge";
        public static final String COLOR_BURN = "mix-blend-color-burn";
        public static final String HARD_LIGHT = "mix-blend-hard-light";
        public static final String SOFT_LIGHT = "mix-blend-soft-light";
        public static final String DIFFERENCE = "mix-blend-difference";
        public static final String EXCLUSION = "mix-blend-exclusion";
        public static final String HUE = "mix-blend-hue";
        public static final String SATURATION = "mix-blend-saturation";
        public static final String COLOR = "mix-blend-color";
        public static final String LUMINOSITY = "mix-blend-luminosity";
        public static final String PLUS_LIGHTER = "mix-blend-plus-lighter";

        private MixBlendMode() {
        }
    }

    // -----------------------------------------------------------------------
    // ObjectFit
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how a replaced element's content should be
     * resized.
     */
    public static final class ObjectFit {

        public static final String CONTAIN = "object-contain";
        public static final String COVER = "object-cover";
        public static final String FILL = "object-fill";
        public static final String NONE = "object-none";
        public static final String SCALE_DOWN = "object-scale-down";

        private ObjectFit() {
        }
    }

    // -----------------------------------------------------------------------
    // ObjectPosition
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how a replaced element's content should be
     * positioned within its container.
     */
    public static final class ObjectPosition {

        public static final String BOTTOM = "object-bottom";
        public static final String CENTER = "object-center";
        public static final String LEFT = "object-left";
        public static final String LEFT_BOTTOM = "object-left-bottom";
        public static final String LEFT_TOP = "object-left-top";
        public static final String RIGHT = "object-right";
        public static final String RIGHT_BOTTOM = "object-right-bottom";
        public static final String RIGHT_TOP = "object-right-top";
        public static final String TOP = "object-top";

        private ObjectPosition() {
        }
    }

    // -----------------------------------------------------------------------
    // Opacity
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the opacity of an element.
     */
    public static final class Opacity {

        public static final String _0 = "opacity-0";
        public static final String _5 = "opacity-5";
        public static final String _10 = "opacity-10";
        public static final String _20 = "opacity-20";
        public static final String _25 = "opacity-25";
        public static final String _30 = "opacity-30";
        public static final String _40 = "opacity-40";
        public static final String _50 = "opacity-50";
        public static final String _60 = "opacity-60";
        public static final String _70 = "opacity-70";
        public static final String _75 = "opacity-75";
        public static final String _80 = "opacity-80";
        public static final String _90 = "opacity-90";
        public static final String _95 = "opacity-95";
        public static final String _100 = "opacity-100";

        private Opacity() {
        }
    }

    // -----------------------------------------------------------------------
    // Order
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the order of flex and grid items.
     */
    public static final class Order {

        public static final String FIRST = "order-first";
        public static final String LAST = "order-last";
        public static final String NONE = "order-none";
        public static final String _1 = "order-1";
        public static final String _2 = "order-2";
        public static final String _3 = "order-3";
        public static final String _4 = "order-4";
        public static final String _5 = "order-5";
        public static final String _6 = "order-6";
        public static final String _7 = "order-7";
        public static final String _8 = "order-8";
        public static final String _9 = "order-9";
        public static final String _10 = "order-10";
        public static final String _11 = "order-11";
        public static final String _12 = "order-12";

        private Order() {
        }
    }

    // -----------------------------------------------------------------------
    // Outline
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the outline of an element.
     */
    public static final class Outline {

        public static final String NONE = "outline-none";
        public static final String DEFAULT = "outline";
        public static final String DASHED = "outline-dashed";
        public static final String DOTTED = "outline-dotted";
        public static final String DOUBLE = "outline-double";

        private Outline() {
        }
    }

    // -----------------------------------------------------------------------
    // OutlineOffset
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the offset of an element's outline.
     */
    public static final class OutlineOffset {

        public static final String _0 = "outline-offset-0";
        public static final String _1 = "outline-offset-1";
        public static final String _2 = "outline-offset-2";
        public static final String _4 = "outline-offset-4";
        public static final String _8 = "outline-offset-8";

        private OutlineOffset() {
        }
    }

    // -----------------------------------------------------------------------
    // OutlineWidth
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the width of an element's outline.
     */
    public static final class OutlineWidth {

        public static final String _0 = "outline-0";
        public static final String _1 = "outline-1";
        public static final String _2 = "outline-2";
        public static final String _4 = "outline-4";
        public static final String _8 = "outline-8";

        private OutlineWidth() {
        }
    }

    // -----------------------------------------------------------------------
    // Overscroll
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how the browser behaves when reaching the
     * boundary of a scrolling area.
     */
    public static final class Overscroll {

        public static final String AUTO = "overscroll-auto";
        public static final String CONTAIN = "overscroll-contain";
        public static final String NONE = "overscroll-none";

        private Overscroll() {
        }

        /** Horizontal overscroll classes ({@code overscroll-x-*}). */
        public static final class X {
            public static final String AUTO = "overscroll-x-auto";
            public static final String CONTAIN = "overscroll-x-contain";
            public static final String NONE = "overscroll-x-none";

            private X() {
            }
        }

        /** Vertical overscroll classes ({@code overscroll-y-*}). */
        public static final class Y {
            public static final String AUTO = "overscroll-y-auto";
            public static final String CONTAIN = "overscroll-y-contain";
            public static final String NONE = "overscroll-y-none";

            private Y() {
            }
        }
    }

    // -----------------------------------------------------------------------
    // Overflow    // -----------------------------------------------------------------------
    // Overflow
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how an element handles content that is too
     * large for the container.
     */
    public static final class Overflow {

        public static final String AUTO = "overflow-auto";
        public static final String HIDDEN = "overflow-hidden";
        public static final String CLIP = "overflow-clip";
        public static final String VISIBLE = "overflow-visible";
        public static final String SCROLL = "overflow-scroll";

        private Overflow() {
        }

        /** Horizontal overflow classes. */
        public static final class X {

            public static final String AUTO = "overflow-x-auto";
            public static final String HIDDEN = "overflow-x-hidden";
            public static final String CLIP = "overflow-x-clip";
            public static final String VISIBLE = "overflow-x-visible";
            public static final String SCROLL = "overflow-x-scroll";

            private X() {
            }
        }

        /** Vertical overflow classes. */
        public static final class Y {

            public static final String AUTO = "overflow-y-auto";
            public static final String HIDDEN = "overflow-y-hidden";
            public static final String CLIP = "overflow-y-clip";
            public static final String VISIBLE = "overflow-y-visible";
            public static final String SCROLL = "overflow-y-scroll";

            private Y() {
            }
        }
    }

    // -----------------------------------------------------------------------
    // Padding
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the padding of an element.
     *
     * <p>
     * Values use the Tailwind default spacing scale where 1 unit = 0.25 rem.
     * Use the {@link Horizontal}, {@link Vertical}, {@link Top}, {@link Right},
     * {@link Bottom}, and {@link Left} inner classes for directional variants.
     */
    public static final class Padding {

        public static final String NONE = "p-0";
        public static final String XSMALL = "p-1";
        public static final String SMALL = "p-2";
        public static final String MEDIUM = "p-4";
        public static final String LARGE = "p-6";
        public static final String XLARGE = "p-8";
        public static final String XXLARGE = "p-12";
        public static final String XXXLARGE = "p-16";

        private Padding() {
        }

        /** Horizontal (left + right) padding classes. */
        public static final class Horizontal {

            public static final String NONE = "px-0";
            public static final String XSMALL = "px-1";
            public static final String SMALL = "px-2";
            public static final String MEDIUM = "px-4";
            public static final String LARGE = "px-6";
            public static final String XLARGE = "px-8";
            public static final String XXLARGE = "px-12";
            public static final String XXXLARGE = "px-16";

            private Horizontal() {
            }
        }

        /** Vertical (top + bottom) padding classes. */
        public static final class Vertical {

            public static final String NONE = "py-0";
            public static final String XSMALL = "py-1";
            public static final String SMALL = "py-2";
            public static final String MEDIUM = "py-4";
            public static final String LARGE = "py-6";
            public static final String XLARGE = "py-8";
            public static final String XXLARGE = "py-12";
            public static final String XXXLARGE = "py-16";

            private Vertical() {
            }
        }

        /** Top padding classes. */
        public static final class Top {

            public static final String NONE = "pt-0";
            public static final String XSMALL = "pt-1";
            public static final String SMALL = "pt-2";
            public static final String MEDIUM = "pt-4";
            public static final String LARGE = "pt-6";
            public static final String XLARGE = "pt-8";
            public static final String XXLARGE = "pt-12";
            public static final String XXXLARGE = "pt-16";

            private Top() {
            }
        }

        /** Right padding classes. */
        public static final class Right {

            public static final String NONE = "pr-0";
            public static final String XSMALL = "pr-1";
            public static final String SMALL = "pr-2";
            public static final String MEDIUM = "pr-4";
            public static final String LARGE = "pr-6";
            public static final String XLARGE = "pr-8";
            public static final String XXLARGE = "pr-12";
            public static final String XXXLARGE = "pr-16";

            private Right() {
            }
        }

        /** Bottom padding classes. */
        public static final class Bottom {

            public static final String NONE = "pb-0";
            public static final String XSMALL = "pb-1";
            public static final String SMALL = "pb-2";
            public static final String MEDIUM = "pb-4";
            public static final String LARGE = "pb-6";
            public static final String XLARGE = "pb-8";
            public static final String XXLARGE = "pb-12";
            public static final String XXXLARGE = "pb-16";

            private Bottom() {
            }
        }

        /** Left padding classes. */
        public static final class Left {

            public static final String NONE = "pl-0";
            public static final String XSMALL = "pl-1";
            public static final String SMALL = "pl-2";
            public static final String MEDIUM = "pl-4";
            public static final String LARGE = "pl-6";
            public static final String XLARGE = "pl-8";
            public static final String XXLARGE = "pl-12";
            public static final String XXXLARGE = "pl-16";

            private Left() {
            }
        }
    }

    // -----------------------------------------------------------------------
    // PlaceContent
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how content is justified and aligned
     * simultaneously in grid layouts.
     */
    public static final class PlaceContent {

        public static final String CENTER = "place-content-center";
        public static final String START = "place-content-start";
        public static final String END = "place-content-end";
        public static final String BETWEEN = "place-content-between";
        public static final String AROUND = "place-content-around";
        public static final String EVENLY = "place-content-evenly";
        public static final String BASELINE = "place-content-baseline";
        public static final String STRETCH = "place-content-stretch";

        private PlaceContent() {
        }
    }

    // -----------------------------------------------------------------------
    // PlaceItems
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how items are justified and aligned
     * simultaneously in grid layouts.
     */
    public static final class PlaceItems {

        public static final String START = "place-items-start";
        public static final String END = "place-items-end";
        public static final String CENTER = "place-items-center";
        public static final String BASELINE = "place-items-baseline";
        public static final String STRETCH = "place-items-stretch";

        private PlaceItems() {
        }
    }

    // -----------------------------------------------------------------------
    // PlaceSelf
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how an individual item is justified and aligned
     * simultaneously in a grid layout.
     */
    public static final class PlaceSelf {

        public static final String AUTO = "place-self-auto";
        public static final String START = "place-self-start";
        public static final String END = "place-self-end";
        public static final String CENTER = "place-self-center";
        public static final String STRETCH = "place-self-stretch";

        private PlaceSelf() {
        }
    }

    // -----------------------------------------------------------------------
    // PointerEvents
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling whether an element responds to pointer events.
     */
    public static final class PointerEvents {

        public static final String NONE = "pointer-events-none";
        public static final String AUTO = "pointer-events-auto";

        private PointerEvents() {
        }
    }

    // -----------------------------------------------------------------------
    // Position    // -----------------------------------------------------------------------
    // Position
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how an element is positioned in the document.
     */
    public static final class Position {

        public static final String ABSOLUTE = "absolute";
        public static final String FIXED = "fixed";
        public static final String RELATIVE = "relative";
        public static final String STATIC = "static";
        public static final String STICKY = "sticky";

        private Position() {
        }
    }

    // -----------------------------------------------------------------------
    // Resize
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how an element can be resized.
     */
    public static final class Resize {

        public static final String NONE = "resize-none";
        public static final String Y = "resize-y";
        public static final String X = "resize-x";
        public static final String BOTH = "resize";

        private Resize() {
        }
    }

    // -----------------------------------------------------------------------
    // Ring
    // -----------------------------------------------------------------------

    /**
     * Classes for creating outline rings using box shadows ({@code ring-*}).
     */
    public static final class Ring {

        public static final String NONE = "ring-0";
        public static final String XSMALL = "ring-1";
        public static final String SMALL = "ring-2";
        public static final String DEFAULT = "ring";
        public static final String MEDIUM = "ring-4";
        public static final String LARGE = "ring-8";
        public static final String INSET = "ring-inset";

        private Ring() {
        }
    }

    // -----------------------------------------------------------------------
    // Rotate
    // -----------------------------------------------------------------------

    /**
     * Classes for rotating elements with CSS transforms ({@code rotate-*}).
     */
    public static final class Rotate {

        public static final String _0 = "rotate-0";
        public static final String _1 = "rotate-1";
        public static final String _2 = "rotate-2";
        public static final String _3 = "rotate-3";
        public static final String _6 = "rotate-6";
        public static final String _12 = "rotate-12";
        public static final String _45 = "rotate-45";
        public static final String _90 = "rotate-90";
        public static final String _180 = "rotate-180";

        private Rotate() {
        }
    }

    // -----------------------------------------------------------------------
    // Scale
    // -----------------------------------------------------------------------

    /**
     * Classes for scaling elements with CSS transforms ({@code scale-*}).
     */
    public static final class Scale {

        public static final String _0 = "scale-0";
        public static final String _50 = "scale-50";
        public static final String _75 = "scale-75";
        public static final String _90 = "scale-90";
        public static final String _95 = "scale-95";
        public static final String _100 = "scale-100";
        public static final String _105 = "scale-105";
        public static final String _110 = "scale-110";
        public static final String _125 = "scale-125";
        public static final String _150 = "scale-150";

        private Scale() {
        }

        /** Horizontal-axis scale classes ({@code scale-x-*}). */
        public static final class X {
            public static final String _0 = "scale-x-0";
            public static final String _50 = "scale-x-50";
            public static final String _75 = "scale-x-75";
            public static final String _90 = "scale-x-90";
            public static final String _95 = "scale-x-95";
            public static final String _100 = "scale-x-100";
            public static final String _105 = "scale-x-105";
            public static final String _110 = "scale-x-110";
            public static final String _125 = "scale-x-125";
            public static final String _150 = "scale-x-150";

            private X() {
            }
        }

        /** Vertical-axis scale classes ({@code scale-y-*}). */
        public static final class Y {
            public static final String _0 = "scale-y-0";
            public static final String _50 = "scale-y-50";
            public static final String _75 = "scale-y-75";
            public static final String _90 = "scale-y-90";
            public static final String _95 = "scale-y-95";
            public static final String _100 = "scale-y-100";
            public static final String _105 = "scale-y-105";
            public static final String _110 = "scale-y-110";
            public static final String _125 = "scale-y-125";
            public static final String _150 = "scale-y-150";

            private Y() {
            }
        }
    }

    // -----------------------------------------------------------------------
    // ScrollBehavior
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the scroll behavior of an element.
     */
    public static final class ScrollBehavior {

        public static final String AUTO = "scroll-auto";
        public static final String SMOOTH = "scroll-smooth";

        private ScrollBehavior() {
        }
    }

    // -----------------------------------------------------------------------
    // ScrollSnapAlign
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the scroll snap alignment of an element.
     */
    public static final class ScrollSnapAlign {

        public static final String START = "snap-start";
        public static final String END = "snap-end";
        public static final String CENTER = "snap-center";
        public static final String NONE = "snap-align-none";

        private ScrollSnapAlign() {
        }
    }

    // -----------------------------------------------------------------------
    // ScrollSnapStop
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling whether you can skip past possible snap
     * positions.
     */
    public static final class ScrollSnapStop {

        public static final String NORMAL = "snap-normal";
        public static final String ALWAYS = "snap-always";

        private ScrollSnapStop() {
        }
    }

    // -----------------------------------------------------------------------
    // ScrollSnapType
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how strictly snap points are enforced in a
     * scroll container.
     */
    public static final class ScrollSnapType {

        public static final String NONE = "snap-none";
        public static final String X = "snap-x";
        public static final String Y = "snap-y";
        public static final String BOTH = "snap-both";
        public static final String MANDATORY = "snap-mandatory";
        public static final String PROXIMITY = "snap-proximity";

        private ScrollSnapType() {
        }
    }

    // -----------------------------------------------------------------------
    // Size
    // -----------------------------------------------------------------------

    /**
     * Classes for setting both the width and height of an element
     * simultaneously ({@code size-*}).
     */
    public static final class Size {

        public static final String AUTO = "size-auto";
        public static final String FULL = "size-full";
        public static final String MIN = "size-min";
        public static final String MAX = "size-max";
        public static final String FIT = "size-fit";
        public static final String NONE = "size-0";
        public static final String XSMALL = "size-1";
        public static final String SMALL = "size-2";
        public static final String MEDIUM = "size-4";
        public static final String LARGE = "size-6";
        public static final String XLARGE = "size-8";
        public static final String XXLARGE = "size-12";
        public static final String XXXLARGE = "size-16";
        public static final String XXXXLARGE = "size-24";
        public static final String XXXXXLARGE = "size-32";

        private Size() {
        }
    }

    // -----------------------------------------------------------------------
    // Skew
    // -----------------------------------------------------------------------

    /**
     * Classes for skewing elements with CSS transforms ({@code skew-*}).
     */
    public static final class Skew {

        private Skew() {
        }

        /** Horizontal-axis skew classes ({@code skew-x-*}). */
        public static final class X {
            public static final String _0 = "skew-x-0";
            public static final String _1 = "skew-x-1";
            public static final String _2 = "skew-x-2";
            public static final String _3 = "skew-x-3";
            public static final String _6 = "skew-x-6";
            public static final String _12 = "skew-x-12";

            private X() {
            }
        }

        /** Vertical-axis skew classes ({@code skew-y-*}). */
        public static final class Y {
            public static final String _0 = "skew-y-0";
            public static final String _1 = "skew-y-1";
            public static final String _2 = "skew-y-2";
            public static final String _3 = "skew-y-3";
            public static final String _6 = "skew-y-6";
            public static final String _12 = "skew-y-12";

            private Y() {
            }
        }
    }

    // -----------------------------------------------------------------------
    // TableLayout
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the table layout algorithm.
     */
    public static final class TableLayout {

        public static final String AUTO = "table-auto";
        public static final String FIXED = "table-fixed";

        private TableLayout() {
        }
    }

    // -----------------------------------------------------------------------
    // TextAlignment    // -----------------------------------------------------------------------
    // TextAlignment
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the alignment of text.
     */
    public static final class TextAlignment {

        public static final String CENTER = "text-center";
        public static final String END = "text-end";
        public static final String JUSTIFY = "text-justify";
        public static final String LEFT = "text-left";
        public static final String RIGHT = "text-right";
        public static final String START = "text-start";

        private TextAlignment() {
        }
    }

    // -----------------------------------------------------------------------
    // TextColor
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the text color of an element.
     *
     * <p>
     * Color variants follow the Tailwind CSS palette. Each named color class
     * (e.g. {@link TextColor.Slate}, {@link TextColor.Blue}) exposes shades
     * {@code _50} through {@code _950}.
     */
    public static final class TextColor {

        public static final String BLACK = "text-black";
        public static final String WHITE = "text-white";
        public static final String TRANSPARENT = "text-transparent";
        public static final String CURRENT = "text-current";
        public static final String INHERIT = "text-inherit";

        private TextColor() {
        }

        public static final class Slate {
            public static final String _50 = "text-slate-50";
            public static final String _100 = "text-slate-100";
            public static final String _200 = "text-slate-200";
            public static final String _300 = "text-slate-300";
            public static final String _400 = "text-slate-400";
            public static final String _500 = "text-slate-500";
            public static final String _600 = "text-slate-600";
            public static final String _700 = "text-slate-700";
            public static final String _800 = "text-slate-800";
            public static final String _900 = "text-slate-900";
            public static final String _950 = "text-slate-950";

            private Slate() {
            }
        }

        public static final class Gray {
            public static final String _50 = "text-gray-50";
            public static final String _100 = "text-gray-100";
            public static final String _200 = "text-gray-200";
            public static final String _300 = "text-gray-300";
            public static final String _400 = "text-gray-400";
            public static final String _500 = "text-gray-500";
            public static final String _600 = "text-gray-600";
            public static final String _700 = "text-gray-700";
            public static final String _800 = "text-gray-800";
            public static final String _900 = "text-gray-900";
            public static final String _950 = "text-gray-950";

            private Gray() {
            }
        }

        public static final class Zinc {
            public static final String _50 = "text-zinc-50";
            public static final String _100 = "text-zinc-100";
            public static final String _200 = "text-zinc-200";
            public static final String _300 = "text-zinc-300";
            public static final String _400 = "text-zinc-400";
            public static final String _500 = "text-zinc-500";
            public static final String _600 = "text-zinc-600";
            public static final String _700 = "text-zinc-700";
            public static final String _800 = "text-zinc-800";
            public static final String _900 = "text-zinc-900";
            public static final String _950 = "text-zinc-950";

            private Zinc() {
            }
        }

        public static final class Neutral {
            public static final String _50 = "text-neutral-50";
            public static final String _100 = "text-neutral-100";
            public static final String _200 = "text-neutral-200";
            public static final String _300 = "text-neutral-300";
            public static final String _400 = "text-neutral-400";
            public static final String _500 = "text-neutral-500";
            public static final String _600 = "text-neutral-600";
            public static final String _700 = "text-neutral-700";
            public static final String _800 = "text-neutral-800";
            public static final String _900 = "text-neutral-900";
            public static final String _950 = "text-neutral-950";

            private Neutral() {
            }
        }

        public static final class Stone {
            public static final String _50 = "text-stone-50";
            public static final String _100 = "text-stone-100";
            public static final String _200 = "text-stone-200";
            public static final String _300 = "text-stone-300";
            public static final String _400 = "text-stone-400";
            public static final String _500 = "text-stone-500";
            public static final String _600 = "text-stone-600";
            public static final String _700 = "text-stone-700";
            public static final String _800 = "text-stone-800";
            public static final String _900 = "text-stone-900";
            public static final String _950 = "text-stone-950";

            private Stone() {
            }
        }

        public static final class Red {
            public static final String _50 = "text-red-50";
            public static final String _100 = "text-red-100";
            public static final String _200 = "text-red-200";
            public static final String _300 = "text-red-300";
            public static final String _400 = "text-red-400";
            public static final String _500 = "text-red-500";
            public static final String _600 = "text-red-600";
            public static final String _700 = "text-red-700";
            public static final String _800 = "text-red-800";
            public static final String _900 = "text-red-900";
            public static final String _950 = "text-red-950";

            private Red() {
            }
        }

        public static final class Orange {
            public static final String _50 = "text-orange-50";
            public static final String _100 = "text-orange-100";
            public static final String _200 = "text-orange-200";
            public static final String _300 = "text-orange-300";
            public static final String _400 = "text-orange-400";
            public static final String _500 = "text-orange-500";
            public static final String _600 = "text-orange-600";
            public static final String _700 = "text-orange-700";
            public static final String _800 = "text-orange-800";
            public static final String _900 = "text-orange-900";
            public static final String _950 = "text-orange-950";

            private Orange() {
            }
        }

        public static final class Amber {
            public static final String _50 = "text-amber-50";
            public static final String _100 = "text-amber-100";
            public static final String _200 = "text-amber-200";
            public static final String _300 = "text-amber-300";
            public static final String _400 = "text-amber-400";
            public static final String _500 = "text-amber-500";
            public static final String _600 = "text-amber-600";
            public static final String _700 = "text-amber-700";
            public static final String _800 = "text-amber-800";
            public static final String _900 = "text-amber-900";
            public static final String _950 = "text-amber-950";

            private Amber() {
            }
        }

        public static final class Yellow {
            public static final String _50 = "text-yellow-50";
            public static final String _100 = "text-yellow-100";
            public static final String _200 = "text-yellow-200";
            public static final String _300 = "text-yellow-300";
            public static final String _400 = "text-yellow-400";
            public static final String _500 = "text-yellow-500";
            public static final String _600 = "text-yellow-600";
            public static final String _700 = "text-yellow-700";
            public static final String _800 = "text-yellow-800";
            public static final String _900 = "text-yellow-900";
            public static final String _950 = "text-yellow-950";

            private Yellow() {
            }
        }

        public static final class Lime {
            public static final String _50 = "text-lime-50";
            public static final String _100 = "text-lime-100";
            public static final String _200 = "text-lime-200";
            public static final String _300 = "text-lime-300";
            public static final String _400 = "text-lime-400";
            public static final String _500 = "text-lime-500";
            public static final String _600 = "text-lime-600";
            public static final String _700 = "text-lime-700";
            public static final String _800 = "text-lime-800";
            public static final String _900 = "text-lime-900";
            public static final String _950 = "text-lime-950";

            private Lime() {
            }
        }

        public static final class Green {
            public static final String _50 = "text-green-50";
            public static final String _100 = "text-green-100";
            public static final String _200 = "text-green-200";
            public static final String _300 = "text-green-300";
            public static final String _400 = "text-green-400";
            public static final String _500 = "text-green-500";
            public static final String _600 = "text-green-600";
            public static final String _700 = "text-green-700";
            public static final String _800 = "text-green-800";
            public static final String _900 = "text-green-900";
            public static final String _950 = "text-green-950";

            private Green() {
            }
        }

        public static final class Emerald {
            public static final String _50 = "text-emerald-50";
            public static final String _100 = "text-emerald-100";
            public static final String _200 = "text-emerald-200";
            public static final String _300 = "text-emerald-300";
            public static final String _400 = "text-emerald-400";
            public static final String _500 = "text-emerald-500";
            public static final String _600 = "text-emerald-600";
            public static final String _700 = "text-emerald-700";
            public static final String _800 = "text-emerald-800";
            public static final String _900 = "text-emerald-900";
            public static final String _950 = "text-emerald-950";

            private Emerald() {
            }
        }

        public static final class Teal {
            public static final String _50 = "text-teal-50";
            public static final String _100 = "text-teal-100";
            public static final String _200 = "text-teal-200";
            public static final String _300 = "text-teal-300";
            public static final String _400 = "text-teal-400";
            public static final String _500 = "text-teal-500";
            public static final String _600 = "text-teal-600";
            public static final String _700 = "text-teal-700";
            public static final String _800 = "text-teal-800";
            public static final String _900 = "text-teal-900";
            public static final String _950 = "text-teal-950";

            private Teal() {
            }
        }

        public static final class Cyan {
            public static final String _50 = "text-cyan-50";
            public static final String _100 = "text-cyan-100";
            public static final String _200 = "text-cyan-200";
            public static final String _300 = "text-cyan-300";
            public static final String _400 = "text-cyan-400";
            public static final String _500 = "text-cyan-500";
            public static final String _600 = "text-cyan-600";
            public static final String _700 = "text-cyan-700";
            public static final String _800 = "text-cyan-800";
            public static final String _900 = "text-cyan-900";
            public static final String _950 = "text-cyan-950";

            private Cyan() {
            }
        }

        public static final class Sky {
            public static final String _50 = "text-sky-50";
            public static final String _100 = "text-sky-100";
            public static final String _200 = "text-sky-200";
            public static final String _300 = "text-sky-300";
            public static final String _400 = "text-sky-400";
            public static final String _500 = "text-sky-500";
            public static final String _600 = "text-sky-600";
            public static final String _700 = "text-sky-700";
            public static final String _800 = "text-sky-800";
            public static final String _900 = "text-sky-900";
            public static final String _950 = "text-sky-950";

            private Sky() {
            }
        }

        public static final class Blue {
            public static final String _50 = "text-blue-50";
            public static final String _100 = "text-blue-100";
            public static final String _200 = "text-blue-200";
            public static final String _300 = "text-blue-300";
            public static final String _400 = "text-blue-400";
            public static final String _500 = "text-blue-500";
            public static final String _600 = "text-blue-600";
            public static final String _700 = "text-blue-700";
            public static final String _800 = "text-blue-800";
            public static final String _900 = "text-blue-900";
            public static final String _950 = "text-blue-950";

            private Blue() {
            }
        }

        public static final class Indigo {
            public static final String _50 = "text-indigo-50";
            public static final String _100 = "text-indigo-100";
            public static final String _200 = "text-indigo-200";
            public static final String _300 = "text-indigo-300";
            public static final String _400 = "text-indigo-400";
            public static final String _500 = "text-indigo-500";
            public static final String _600 = "text-indigo-600";
            public static final String _700 = "text-indigo-700";
            public static final String _800 = "text-indigo-800";
            public static final String _900 = "text-indigo-900";
            public static final String _950 = "text-indigo-950";

            private Indigo() {
            }
        }

        public static final class Violet {
            public static final String _50 = "text-violet-50";
            public static final String _100 = "text-violet-100";
            public static final String _200 = "text-violet-200";
            public static final String _300 = "text-violet-300";
            public static final String _400 = "text-violet-400";
            public static final String _500 = "text-violet-500";
            public static final String _600 = "text-violet-600";
            public static final String _700 = "text-violet-700";
            public static final String _800 = "text-violet-800";
            public static final String _900 = "text-violet-900";
            public static final String _950 = "text-violet-950";

            private Violet() {
            }
        }

        public static final class Purple {
            public static final String _50 = "text-purple-50";
            public static final String _100 = "text-purple-100";
            public static final String _200 = "text-purple-200";
            public static final String _300 = "text-purple-300";
            public static final String _400 = "text-purple-400";
            public static final String _500 = "text-purple-500";
            public static final String _600 = "text-purple-600";
            public static final String _700 = "text-purple-700";
            public static final String _800 = "text-purple-800";
            public static final String _900 = "text-purple-900";
            public static final String _950 = "text-purple-950";

            private Purple() {
            }
        }

        public static final class Fuchsia {
            public static final String _50 = "text-fuchsia-50";
            public static final String _100 = "text-fuchsia-100";
            public static final String _200 = "text-fuchsia-200";
            public static final String _300 = "text-fuchsia-300";
            public static final String _400 = "text-fuchsia-400";
            public static final String _500 = "text-fuchsia-500";
            public static final String _600 = "text-fuchsia-600";
            public static final String _700 = "text-fuchsia-700";
            public static final String _800 = "text-fuchsia-800";
            public static final String _900 = "text-fuchsia-900";
            public static final String _950 = "text-fuchsia-950";

            private Fuchsia() {
            }
        }

        public static final class Pink {
            public static final String _50 = "text-pink-50";
            public static final String _100 = "text-pink-100";
            public static final String _200 = "text-pink-200";
            public static final String _300 = "text-pink-300";
            public static final String _400 = "text-pink-400";
            public static final String _500 = "text-pink-500";
            public static final String _600 = "text-pink-600";
            public static final String _700 = "text-pink-700";
            public static final String _800 = "text-pink-800";
            public static final String _900 = "text-pink-900";
            public static final String _950 = "text-pink-950";

            private Pink() {
            }
        }

        public static final class Rose {
            public static final String _50 = "text-rose-50";
            public static final String _100 = "text-rose-100";
            public static final String _200 = "text-rose-200";
            public static final String _300 = "text-rose-300";
            public static final String _400 = "text-rose-400";
            public static final String _500 = "text-rose-500";
            public static final String _600 = "text-rose-600";
            public static final String _700 = "text-rose-700";
            public static final String _800 = "text-rose-800";
            public static final String _900 = "text-rose-900";
            public static final String _950 = "text-rose-950";

            private Rose() {
            }
        }
    }

    // -----------------------------------------------------------------------
    // TextDecoration
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the decoration of text.
     */
    public static final class TextDecoration {

        public static final String UNDERLINE = "underline";
        public static final String OVERLINE = "overline";
        public static final String LINE_THROUGH = "line-through";
        public static final String NONE = "no-underline";

        private TextDecoration() {
        }
    }

    // -----------------------------------------------------------------------
    // TextDecorationStyle
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the style of text decorations.
     */
    public static final class TextDecorationStyle {

        public static final String SOLID = "decoration-solid";
        public static final String DOUBLE = "decoration-double";
        public static final String DOTTED = "decoration-dotted";
        public static final String DASHED = "decoration-dashed";
        public static final String WAVY = "decoration-wavy";

        private TextDecorationStyle() {
        }
    }

    // -----------------------------------------------------------------------
    // TextDecorationThickness
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the thickness of text decorations.
     */
    public static final class TextDecorationThickness {

        public static final String AUTO = "decoration-auto";
        public static final String FROM_FONT = "decoration-from-font";
        public static final String _0 = "decoration-0";
        public static final String _1 = "decoration-1";
        public static final String _2 = "decoration-2";
        public static final String _4 = "decoration-4";
        public static final String _8 = "decoration-8";

        private TextDecorationThickness() {
        }
    }

    // -----------------------------------------------------------------------
    // TextIndent
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the amount of empty space shown before text
     * in a block ({@code indent-*}).
     */
    public static final class TextIndent {

        public static final String NONE = "indent-0";
        public static final String XSMALL = "indent-1";
        public static final String SMALL = "indent-2";
        public static final String MEDIUM = "indent-4";
        public static final String LARGE = "indent-6";
        public static final String XLARGE = "indent-8";
        public static final String XXLARGE = "indent-12";
        public static final String XXXLARGE = "indent-16";
        public static final String XXXXLARGE = "indent-24";
        public static final String XXXXXLARGE = "indent-32";

        private TextIndent() {
        }
    }

    // -----------------------------------------------------------------------
    // TextUnderlineOffset
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the offset of a text underline.
     */
    public static final class TextUnderlineOffset {

        public static final String AUTO = "underline-offset-auto";
        public static final String _0 = "underline-offset-0";
        public static final String _1 = "underline-offset-1";
        public static final String _2 = "underline-offset-2";
        public static final String _4 = "underline-offset-4";
        public static final String _8 = "underline-offset-8";

        private TextUnderlineOffset() {
        }
    }

    // -----------------------------------------------------------------------
    // TextWrap
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how text wraps within an element.
     */
    public static final class TextWrap {

        public static final String WRAP = "text-wrap";
        public static final String NOWRAP = "text-nowrap";
        public static final String BALANCE = "text-balance";
        public static final String PRETTY = "text-pretty";

        private TextWrap() {
        }
    }

    // -----------------------------------------------------------------------
    // TextOverflow    // -----------------------------------------------------------------------
    // TextOverflow
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how text overflows its container.
     */
    public static final class TextOverflow {

        public static final String CLIP = "text-clip";
        public static final String ELLIPSIS = "text-ellipsis";
        public static final String TRUNCATE = "truncate";

        private TextOverflow() {
        }
    }

    // -----------------------------------------------------------------------
    // TextTransform
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the capitalization of text.
     */
    public static final class TextTransform {

        public static final String CAPITALIZE = "capitalize";
        public static final String LOWERCASE = "lowercase";
        public static final String NORMAL = "normal-case";
        public static final String UPPERCASE = "uppercase";

        private TextTransform() {
        }
    }

    // -----------------------------------------------------------------------
    // TouchAction
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how an element can be scrolled and zoomed on
     * touchscreens.
     */
    public static final class TouchAction {

        public static final String AUTO = "touch-auto";
        public static final String NONE = "touch-none";
        public static final String PAN_X = "touch-pan-x";
        public static final String PAN_LEFT = "touch-pan-left";
        public static final String PAN_RIGHT = "touch-pan-right";
        public static final String PAN_Y = "touch-pan-y";
        public static final String PAN_UP = "touch-pan-up";
        public static final String PAN_DOWN = "touch-pan-down";
        public static final String PINCH_ZOOM = "touch-pinch-zoom";
        public static final String MANIPULATION = "touch-manipulation";

        private TouchAction() {
        }
    }

    // -----------------------------------------------------------------------
    // Transform
    // -----------------------------------------------------------------------

    /**
     * Classes for enabling CSS transform utilities on an element.
     */
    public static final class Transform {

        public static final String DEFAULT = "transform";
        public static final String GPU = "transform-gpu";
        public static final String NONE = "transform-none";

        private Transform() {
        }
    }

    // -----------------------------------------------------------------------
    // TransformOrigin
    // -----------------------------------------------------------------------

    /**
     * Classes for specifying the origin for an element's transformations.
     */
    public static final class TransformOrigin {

        public static final String CENTER = "origin-center";
        public static final String TOP = "origin-top";
        public static final String TOP_RIGHT = "origin-top-right";
        public static final String RIGHT = "origin-right";
        public static final String BOTTOM_RIGHT = "origin-bottom-right";
        public static final String BOTTOM = "origin-bottom";
        public static final String BOTTOM_LEFT = "origin-bottom-left";
        public static final String LEFT = "origin-left";
        public static final String TOP_LEFT = "origin-top-left";

        private TransformOrigin() {
        }
    }

    // -----------------------------------------------------------------------
    // Transition
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling which CSS properties transition.
     */
    public static final class Transition {

        public static final String NONE = "transition-none";
        public static final String ALL = "transition-all";
        public static final String DEFAULT = "transition";
        public static final String COLORS = "transition-colors";
        public static final String OPACITY = "transition-opacity";
        public static final String SHADOW = "transition-shadow";
        public static final String TRANSFORM = "transition-transform";

        private Transition() {
        }
    }

    // -----------------------------------------------------------------------
    // TransitionDelay
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the delay of CSS transitions ({@code delay-*}).
     */
    public static final class TransitionDelay {

        public static final String _0 = "delay-0";
        public static final String _75 = "delay-75";
        public static final String _100 = "delay-100";
        public static final String _150 = "delay-150";
        public static final String _200 = "delay-200";
        public static final String _300 = "delay-300";
        public static final String _500 = "delay-500";
        public static final String _700 = "delay-700";
        public static final String _1000 = "delay-1000";

        private TransitionDelay() {
        }
    }

    // -----------------------------------------------------------------------
    // TransitionDuration
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the duration of CSS transitions
     * ({@code duration-*}).
     */
    public static final class TransitionDuration {

        public static final String _0 = "duration-0";
        public static final String _75 = "duration-75";
        public static final String _100 = "duration-100";
        public static final String _150 = "duration-150";
        public static final String _200 = "duration-200";
        public static final String _300 = "duration-300";
        public static final String _500 = "duration-500";
        public static final String _700 = "duration-700";
        public static final String _1000 = "duration-1000";

        private TransitionDuration() {
        }
    }

    // -----------------------------------------------------------------------
    // TransitionTimingFunction
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the easing of CSS transitions ({@code ease-*}).
     */
    public static final class TransitionTimingFunction {

        public static final String LINEAR = "ease-linear";
        public static final String IN = "ease-in";
        public static final String OUT = "ease-out";
        public static final String IN_OUT = "ease-in-out";

        private TransitionTimingFunction() {
        }
    }

    // -----------------------------------------------------------------------
    // Translate
    // -----------------------------------------------------------------------

    /**
     * Classes for translating elements with CSS transforms
     * ({@code translate-x-*}, {@code translate-y-*}).
     */
    public static final class Translate {

        private Translate() {
        }

        /** Horizontal translation classes ({@code translate-x-*}). */
        public static final class X {
            public static final String NONE = "translate-x-0";
            public static final String XSMALL = "translate-x-1";
            public static final String SMALL = "translate-x-2";
            public static final String MEDIUM = "translate-x-4";
            public static final String LARGE = "translate-x-6";
            public static final String XLARGE = "translate-x-8";
            public static final String XXLARGE = "translate-x-12";
            public static final String XXXLARGE = "translate-x-16";
            public static final String FULL = "translate-x-full";
            public static final String HALF = "translate-x-1/2";

            private X() {
            }
        }

        /** Vertical translation classes ({@code translate-y-*}). */
        public static final class Y {
            public static final String NONE = "translate-y-0";
            public static final String XSMALL = "translate-y-1";
            public static final String SMALL = "translate-y-2";
            public static final String MEDIUM = "translate-y-4";
            public static final String LARGE = "translate-y-6";
            public static final String XLARGE = "translate-y-8";
            public static final String XXLARGE = "translate-y-12";
            public static final String XXXLARGE = "translate-y-16";
            public static final String FULL = "translate-y-full";
            public static final String HALF = "translate-y-1/2";

            private Y() {
            }
        }
    }

    // -----------------------------------------------------------------------
    // Whitespace    // -----------------------------------------------------------------------
    // Whitespace
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling how white space inside an element is handled.
     */
    public static final class Whitespace {

        public static final String BREAK_SPACES = "whitespace-break-spaces";
        public static final String NORMAL = "whitespace-normal";
        public static final String NOWRAP = "whitespace-nowrap";
        public static final String PRE = "whitespace-pre";
        public static final String PRE_LINE = "whitespace-pre-line";
        public static final String PRE_WRAP = "whitespace-pre-wrap";

        private Whitespace() {
        }
    }

    // -----------------------------------------------------------------------
    // Width
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the width of an element.
     */
    public static final class Width {

        public static final String AUTO = "w-auto";
        public static final String FULL = "w-full";
        public static final String SCREEN = "w-screen";
        public static final String MIN = "w-min";
        public static final String MAX = "w-max";
        public static final String FIT = "w-fit";
        public static final String NONE = "w-0";
        public static final String XSMALL = "w-1";
        public static final String SMALL = "w-2";
        public static final String MEDIUM = "w-4";
        public static final String LARGE = "w-6";
        public static final String XLARGE = "w-8";
        public static final String XXLARGE = "w-12";
        public static final String XXXLARGE = "w-16";
        public static final String XXXXLARGE = "w-24";
        public static final String XXXXXLARGE = "w-32";

        private Width() {
        }
    }

    // -----------------------------------------------------------------------
    // UserSelect
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling whether the user can select text in an element.
     */
    public static final class UserSelect {

        public static final String NONE = "select-none";
        public static final String TEXT = "select-text";
        public static final String ALL = "select-all";
        public static final String AUTO = "select-auto";

        private UserSelect() {
        }
    }

    // -----------------------------------------------------------------------
    // VerticalAlign
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the vertical alignment of an inline or
     * table-cell element.
     */
    public static final class VerticalAlign {

        public static final String BASELINE = "align-baseline";
        public static final String TOP = "align-top";
        public static final String MIDDLE = "align-middle";
        public static final String BOTTOM = "align-bottom";
        public static final String TEXT_TOP = "align-text-top";
        public static final String TEXT_BOTTOM = "align-text-bottom";
        public static final String SUB = "align-sub";
        public static final String SUPER = "align-super";

        private VerticalAlign() {
        }
    }

    // -----------------------------------------------------------------------
    // Visibility
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the visibility of an element.
     */
    public static final class Visibility {

        public static final String VISIBLE = "visible";
        public static final String INVISIBLE = "invisible";
        public static final String COLLAPSE = "collapse";

        private Visibility() {
        }
    }

    // -----------------------------------------------------------------------
    // WillChange
    // -----------------------------------------------------------------------

    /**
     * Classes for optimising upcoming animations of elements that are expected
     * to change.
     */
    public static final class WillChange {

        public static final String AUTO = "will-change-auto";
        public static final String SCROLL = "will-change-scroll";
        public static final String CONTENTS = "will-change-contents";
        public static final String TRANSFORM = "will-change-transform";

        private WillChange() {
        }
    }

    // -----------------------------------------------------------------------
    // WordBreak
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling word breaks in an element.
     */
    public static final class WordBreak {

        public static final String NORMAL = "break-normal";
        public static final String WORDS = "break-words";
        public static final String ALL = "break-all";
        public static final String KEEP = "break-keep";

        private WordBreak() {
        }
    }

    // -----------------------------------------------------------------------
    // ZIndex    // -----------------------------------------------------------------------
    // ZIndex
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the stack order of an element.
     */
    public static final class ZIndex {

        public static final String AUTO = "z-auto";
        public static final String NONE = "z-0";
        public static final String XSMALL = "z-10";
        public static final String SMALL = "z-20";
        public static final String MEDIUM = "z-30";
        public static final String LARGE = "z-40";
        public static final String XLARGE = "z-50";

        private ZIndex() {
        }
    }
}
