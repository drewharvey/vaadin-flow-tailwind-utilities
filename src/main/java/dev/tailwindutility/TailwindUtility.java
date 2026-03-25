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
    // -----------------------------------------------------------------------
    // GradientColorStops
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the color stops of gradient backgrounds.
     * Contains {@link From}, {@link Via}, and {@link To} sub-classes, each
     * offering the full Tailwind color palette.
     */
    public static final class GradientColorStops {

        private GradientColorStops() {
        }

        /** Gradient from color stops. */
        public static final class From {

            public static final String BLACK = "from-black";
            public static final String WHITE = "from-white";
            public static final String TRANSPARENT = "from-transparent";
            public static final String CURRENT = "from-current";
            public static final String INHERIT = "from-inherit";

            private From() {
            }

            public static final class Slate {
                public static final String _50 = "from-slate-50";
                public static final String _100 = "from-slate-100";
                public static final String _200 = "from-slate-200";
                public static final String _300 = "from-slate-300";
                public static final String _400 = "from-slate-400";
                public static final String _500 = "from-slate-500";
                public static final String _600 = "from-slate-600";
                public static final String _700 = "from-slate-700";
                public static final String _800 = "from-slate-800";
                public static final String _900 = "from-slate-900";
                public static final String _950 = "from-slate-950";

                private Slate() {
                }
            }

            public static final class Gray {
                public static final String _50 = "from-gray-50";
                public static final String _100 = "from-gray-100";
                public static final String _200 = "from-gray-200";
                public static final String _300 = "from-gray-300";
                public static final String _400 = "from-gray-400";
                public static final String _500 = "from-gray-500";
                public static final String _600 = "from-gray-600";
                public static final String _700 = "from-gray-700";
                public static final String _800 = "from-gray-800";
                public static final String _900 = "from-gray-900";
                public static final String _950 = "from-gray-950";

                private Gray() {
                }
            }

            public static final class Zinc {
                public static final String _50 = "from-zinc-50";
                public static final String _100 = "from-zinc-100";
                public static final String _200 = "from-zinc-200";
                public static final String _300 = "from-zinc-300";
                public static final String _400 = "from-zinc-400";
                public static final String _500 = "from-zinc-500";
                public static final String _600 = "from-zinc-600";
                public static final String _700 = "from-zinc-700";
                public static final String _800 = "from-zinc-800";
                public static final String _900 = "from-zinc-900";
                public static final String _950 = "from-zinc-950";

                private Zinc() {
                }
            }

            public static final class Neutral {
                public static final String _50 = "from-neutral-50";
                public static final String _100 = "from-neutral-100";
                public static final String _200 = "from-neutral-200";
                public static final String _300 = "from-neutral-300";
                public static final String _400 = "from-neutral-400";
                public static final String _500 = "from-neutral-500";
                public static final String _600 = "from-neutral-600";
                public static final String _700 = "from-neutral-700";
                public static final String _800 = "from-neutral-800";
                public static final String _900 = "from-neutral-900";
                public static final String _950 = "from-neutral-950";

                private Neutral() {
                }
            }

            public static final class Stone {
                public static final String _50 = "from-stone-50";
                public static final String _100 = "from-stone-100";
                public static final String _200 = "from-stone-200";
                public static final String _300 = "from-stone-300";
                public static final String _400 = "from-stone-400";
                public static final String _500 = "from-stone-500";
                public static final String _600 = "from-stone-600";
                public static final String _700 = "from-stone-700";
                public static final String _800 = "from-stone-800";
                public static final String _900 = "from-stone-900";
                public static final String _950 = "from-stone-950";

                private Stone() {
                }
            }

            public static final class Red {
                public static final String _50 = "from-red-50";
                public static final String _100 = "from-red-100";
                public static final String _200 = "from-red-200";
                public static final String _300 = "from-red-300";
                public static final String _400 = "from-red-400";
                public static final String _500 = "from-red-500";
                public static final String _600 = "from-red-600";
                public static final String _700 = "from-red-700";
                public static final String _800 = "from-red-800";
                public static final String _900 = "from-red-900";
                public static final String _950 = "from-red-950";

                private Red() {
                }
            }

            public static final class Orange {
                public static final String _50 = "from-orange-50";
                public static final String _100 = "from-orange-100";
                public static final String _200 = "from-orange-200";
                public static final String _300 = "from-orange-300";
                public static final String _400 = "from-orange-400";
                public static final String _500 = "from-orange-500";
                public static final String _600 = "from-orange-600";
                public static final String _700 = "from-orange-700";
                public static final String _800 = "from-orange-800";
                public static final String _900 = "from-orange-900";
                public static final String _950 = "from-orange-950";

                private Orange() {
                }
            }

            public static final class Amber {
                public static final String _50 = "from-amber-50";
                public static final String _100 = "from-amber-100";
                public static final String _200 = "from-amber-200";
                public static final String _300 = "from-amber-300";
                public static final String _400 = "from-amber-400";
                public static final String _500 = "from-amber-500";
                public static final String _600 = "from-amber-600";
                public static final String _700 = "from-amber-700";
                public static final String _800 = "from-amber-800";
                public static final String _900 = "from-amber-900";
                public static final String _950 = "from-amber-950";

                private Amber() {
                }
            }

            public static final class Yellow {
                public static final String _50 = "from-yellow-50";
                public static final String _100 = "from-yellow-100";
                public static final String _200 = "from-yellow-200";
                public static final String _300 = "from-yellow-300";
                public static final String _400 = "from-yellow-400";
                public static final String _500 = "from-yellow-500";
                public static final String _600 = "from-yellow-600";
                public static final String _700 = "from-yellow-700";
                public static final String _800 = "from-yellow-800";
                public static final String _900 = "from-yellow-900";
                public static final String _950 = "from-yellow-950";

                private Yellow() {
                }
            }

            public static final class Lime {
                public static final String _50 = "from-lime-50";
                public static final String _100 = "from-lime-100";
                public static final String _200 = "from-lime-200";
                public static final String _300 = "from-lime-300";
                public static final String _400 = "from-lime-400";
                public static final String _500 = "from-lime-500";
                public static final String _600 = "from-lime-600";
                public static final String _700 = "from-lime-700";
                public static final String _800 = "from-lime-800";
                public static final String _900 = "from-lime-900";
                public static final String _950 = "from-lime-950";

                private Lime() {
                }
            }

            public static final class Green {
                public static final String _50 = "from-green-50";
                public static final String _100 = "from-green-100";
                public static final String _200 = "from-green-200";
                public static final String _300 = "from-green-300";
                public static final String _400 = "from-green-400";
                public static final String _500 = "from-green-500";
                public static final String _600 = "from-green-600";
                public static final String _700 = "from-green-700";
                public static final String _800 = "from-green-800";
                public static final String _900 = "from-green-900";
                public static final String _950 = "from-green-950";

                private Green() {
                }
            }

            public static final class Emerald {
                public static final String _50 = "from-emerald-50";
                public static final String _100 = "from-emerald-100";
                public static final String _200 = "from-emerald-200";
                public static final String _300 = "from-emerald-300";
                public static final String _400 = "from-emerald-400";
                public static final String _500 = "from-emerald-500";
                public static final String _600 = "from-emerald-600";
                public static final String _700 = "from-emerald-700";
                public static final String _800 = "from-emerald-800";
                public static final String _900 = "from-emerald-900";
                public static final String _950 = "from-emerald-950";

                private Emerald() {
                }
            }

            public static final class Teal {
                public static final String _50 = "from-teal-50";
                public static final String _100 = "from-teal-100";
                public static final String _200 = "from-teal-200";
                public static final String _300 = "from-teal-300";
                public static final String _400 = "from-teal-400";
                public static final String _500 = "from-teal-500";
                public static final String _600 = "from-teal-600";
                public static final String _700 = "from-teal-700";
                public static final String _800 = "from-teal-800";
                public static final String _900 = "from-teal-900";
                public static final String _950 = "from-teal-950";

                private Teal() {
                }
            }

            public static final class Cyan {
                public static final String _50 = "from-cyan-50";
                public static final String _100 = "from-cyan-100";
                public static final String _200 = "from-cyan-200";
                public static final String _300 = "from-cyan-300";
                public static final String _400 = "from-cyan-400";
                public static final String _500 = "from-cyan-500";
                public static final String _600 = "from-cyan-600";
                public static final String _700 = "from-cyan-700";
                public static final String _800 = "from-cyan-800";
                public static final String _900 = "from-cyan-900";
                public static final String _950 = "from-cyan-950";

                private Cyan() {
                }
            }

            public static final class Sky {
                public static final String _50 = "from-sky-50";
                public static final String _100 = "from-sky-100";
                public static final String _200 = "from-sky-200";
                public static final String _300 = "from-sky-300";
                public static final String _400 = "from-sky-400";
                public static final String _500 = "from-sky-500";
                public static final String _600 = "from-sky-600";
                public static final String _700 = "from-sky-700";
                public static final String _800 = "from-sky-800";
                public static final String _900 = "from-sky-900";
                public static final String _950 = "from-sky-950";

                private Sky() {
                }
            }

            public static final class Blue {
                public static final String _50 = "from-blue-50";
                public static final String _100 = "from-blue-100";
                public static final String _200 = "from-blue-200";
                public static final String _300 = "from-blue-300";
                public static final String _400 = "from-blue-400";
                public static final String _500 = "from-blue-500";
                public static final String _600 = "from-blue-600";
                public static final String _700 = "from-blue-700";
                public static final String _800 = "from-blue-800";
                public static final String _900 = "from-blue-900";
                public static final String _950 = "from-blue-950";

                private Blue() {
                }
            }

            public static final class Indigo {
                public static final String _50 = "from-indigo-50";
                public static final String _100 = "from-indigo-100";
                public static final String _200 = "from-indigo-200";
                public static final String _300 = "from-indigo-300";
                public static final String _400 = "from-indigo-400";
                public static final String _500 = "from-indigo-500";
                public static final String _600 = "from-indigo-600";
                public static final String _700 = "from-indigo-700";
                public static final String _800 = "from-indigo-800";
                public static final String _900 = "from-indigo-900";
                public static final String _950 = "from-indigo-950";

                private Indigo() {
                }
            }

            public static final class Violet {
                public static final String _50 = "from-violet-50";
                public static final String _100 = "from-violet-100";
                public static final String _200 = "from-violet-200";
                public static final String _300 = "from-violet-300";
                public static final String _400 = "from-violet-400";
                public static final String _500 = "from-violet-500";
                public static final String _600 = "from-violet-600";
                public static final String _700 = "from-violet-700";
                public static final String _800 = "from-violet-800";
                public static final String _900 = "from-violet-900";
                public static final String _950 = "from-violet-950";

                private Violet() {
                }
            }

            public static final class Purple {
                public static final String _50 = "from-purple-50";
                public static final String _100 = "from-purple-100";
                public static final String _200 = "from-purple-200";
                public static final String _300 = "from-purple-300";
                public static final String _400 = "from-purple-400";
                public static final String _500 = "from-purple-500";
                public static final String _600 = "from-purple-600";
                public static final String _700 = "from-purple-700";
                public static final String _800 = "from-purple-800";
                public static final String _900 = "from-purple-900";
                public static final String _950 = "from-purple-950";

                private Purple() {
                }
            }

            public static final class Fuchsia {
                public static final String _50 = "from-fuchsia-50";
                public static final String _100 = "from-fuchsia-100";
                public static final String _200 = "from-fuchsia-200";
                public static final String _300 = "from-fuchsia-300";
                public static final String _400 = "from-fuchsia-400";
                public static final String _500 = "from-fuchsia-500";
                public static final String _600 = "from-fuchsia-600";
                public static final String _700 = "from-fuchsia-700";
                public static final String _800 = "from-fuchsia-800";
                public static final String _900 = "from-fuchsia-900";
                public static final String _950 = "from-fuchsia-950";

                private Fuchsia() {
                }
            }

            public static final class Pink {
                public static final String _50 = "from-pink-50";
                public static final String _100 = "from-pink-100";
                public static final String _200 = "from-pink-200";
                public static final String _300 = "from-pink-300";
                public static final String _400 = "from-pink-400";
                public static final String _500 = "from-pink-500";
                public static final String _600 = "from-pink-600";
                public static final String _700 = "from-pink-700";
                public static final String _800 = "from-pink-800";
                public static final String _900 = "from-pink-900";
                public static final String _950 = "from-pink-950";

                private Pink() {
                }
            }

            public static final class Rose {
                public static final String _50 = "from-rose-50";
                public static final String _100 = "from-rose-100";
                public static final String _200 = "from-rose-200";
                public static final String _300 = "from-rose-300";
                public static final String _400 = "from-rose-400";
                public static final String _500 = "from-rose-500";
                public static final String _600 = "from-rose-600";
                public static final String _700 = "from-rose-700";
                public static final String _800 = "from-rose-800";
                public static final String _900 = "from-rose-900";
                public static final String _950 = "from-rose-950";

                private Rose() {
                }
            }

        }

        /** Gradient via color stops. */
        public static final class Via {

            public static final String BLACK = "via-black";
            public static final String WHITE = "via-white";
            public static final String TRANSPARENT = "via-transparent";
            public static final String CURRENT = "via-current";
            public static final String INHERIT = "via-inherit";

            private Via() {
            }

            public static final class Slate {
                public static final String _50 = "via-slate-50";
                public static final String _100 = "via-slate-100";
                public static final String _200 = "via-slate-200";
                public static final String _300 = "via-slate-300";
                public static final String _400 = "via-slate-400";
                public static final String _500 = "via-slate-500";
                public static final String _600 = "via-slate-600";
                public static final String _700 = "via-slate-700";
                public static final String _800 = "via-slate-800";
                public static final String _900 = "via-slate-900";
                public static final String _950 = "via-slate-950";

                private Slate() {
                }
            }

            public static final class Gray {
                public static final String _50 = "via-gray-50";
                public static final String _100 = "via-gray-100";
                public static final String _200 = "via-gray-200";
                public static final String _300 = "via-gray-300";
                public static final String _400 = "via-gray-400";
                public static final String _500 = "via-gray-500";
                public static final String _600 = "via-gray-600";
                public static final String _700 = "via-gray-700";
                public static final String _800 = "via-gray-800";
                public static final String _900 = "via-gray-900";
                public static final String _950 = "via-gray-950";

                private Gray() {
                }
            }

            public static final class Zinc {
                public static final String _50 = "via-zinc-50";
                public static final String _100 = "via-zinc-100";
                public static final String _200 = "via-zinc-200";
                public static final String _300 = "via-zinc-300";
                public static final String _400 = "via-zinc-400";
                public static final String _500 = "via-zinc-500";
                public static final String _600 = "via-zinc-600";
                public static final String _700 = "via-zinc-700";
                public static final String _800 = "via-zinc-800";
                public static final String _900 = "via-zinc-900";
                public static final String _950 = "via-zinc-950";

                private Zinc() {
                }
            }

            public static final class Neutral {
                public static final String _50 = "via-neutral-50";
                public static final String _100 = "via-neutral-100";
                public static final String _200 = "via-neutral-200";
                public static final String _300 = "via-neutral-300";
                public static final String _400 = "via-neutral-400";
                public static final String _500 = "via-neutral-500";
                public static final String _600 = "via-neutral-600";
                public static final String _700 = "via-neutral-700";
                public static final String _800 = "via-neutral-800";
                public static final String _900 = "via-neutral-900";
                public static final String _950 = "via-neutral-950";

                private Neutral() {
                }
            }

            public static final class Stone {
                public static final String _50 = "via-stone-50";
                public static final String _100 = "via-stone-100";
                public static final String _200 = "via-stone-200";
                public static final String _300 = "via-stone-300";
                public static final String _400 = "via-stone-400";
                public static final String _500 = "via-stone-500";
                public static final String _600 = "via-stone-600";
                public static final String _700 = "via-stone-700";
                public static final String _800 = "via-stone-800";
                public static final String _900 = "via-stone-900";
                public static final String _950 = "via-stone-950";

                private Stone() {
                }
            }

            public static final class Red {
                public static final String _50 = "via-red-50";
                public static final String _100 = "via-red-100";
                public static final String _200 = "via-red-200";
                public static final String _300 = "via-red-300";
                public static final String _400 = "via-red-400";
                public static final String _500 = "via-red-500";
                public static final String _600 = "via-red-600";
                public static final String _700 = "via-red-700";
                public static final String _800 = "via-red-800";
                public static final String _900 = "via-red-900";
                public static final String _950 = "via-red-950";

                private Red() {
                }
            }

            public static final class Orange {
                public static final String _50 = "via-orange-50";
                public static final String _100 = "via-orange-100";
                public static final String _200 = "via-orange-200";
                public static final String _300 = "via-orange-300";
                public static final String _400 = "via-orange-400";
                public static final String _500 = "via-orange-500";
                public static final String _600 = "via-orange-600";
                public static final String _700 = "via-orange-700";
                public static final String _800 = "via-orange-800";
                public static final String _900 = "via-orange-900";
                public static final String _950 = "via-orange-950";

                private Orange() {
                }
            }

            public static final class Amber {
                public static final String _50 = "via-amber-50";
                public static final String _100 = "via-amber-100";
                public static final String _200 = "via-amber-200";
                public static final String _300 = "via-amber-300";
                public static final String _400 = "via-amber-400";
                public static final String _500 = "via-amber-500";
                public static final String _600 = "via-amber-600";
                public static final String _700 = "via-amber-700";
                public static final String _800 = "via-amber-800";
                public static final String _900 = "via-amber-900";
                public static final String _950 = "via-amber-950";

                private Amber() {
                }
            }

            public static final class Yellow {
                public static final String _50 = "via-yellow-50";
                public static final String _100 = "via-yellow-100";
                public static final String _200 = "via-yellow-200";
                public static final String _300 = "via-yellow-300";
                public static final String _400 = "via-yellow-400";
                public static final String _500 = "via-yellow-500";
                public static final String _600 = "via-yellow-600";
                public static final String _700 = "via-yellow-700";
                public static final String _800 = "via-yellow-800";
                public static final String _900 = "via-yellow-900";
                public static final String _950 = "via-yellow-950";

                private Yellow() {
                }
            }

            public static final class Lime {
                public static final String _50 = "via-lime-50";
                public static final String _100 = "via-lime-100";
                public static final String _200 = "via-lime-200";
                public static final String _300 = "via-lime-300";
                public static final String _400 = "via-lime-400";
                public static final String _500 = "via-lime-500";
                public static final String _600 = "via-lime-600";
                public static final String _700 = "via-lime-700";
                public static final String _800 = "via-lime-800";
                public static final String _900 = "via-lime-900";
                public static final String _950 = "via-lime-950";

                private Lime() {
                }
            }

            public static final class Green {
                public static final String _50 = "via-green-50";
                public static final String _100 = "via-green-100";
                public static final String _200 = "via-green-200";
                public static final String _300 = "via-green-300";
                public static final String _400 = "via-green-400";
                public static final String _500 = "via-green-500";
                public static final String _600 = "via-green-600";
                public static final String _700 = "via-green-700";
                public static final String _800 = "via-green-800";
                public static final String _900 = "via-green-900";
                public static final String _950 = "via-green-950";

                private Green() {
                }
            }

            public static final class Emerald {
                public static final String _50 = "via-emerald-50";
                public static final String _100 = "via-emerald-100";
                public static final String _200 = "via-emerald-200";
                public static final String _300 = "via-emerald-300";
                public static final String _400 = "via-emerald-400";
                public static final String _500 = "via-emerald-500";
                public static final String _600 = "via-emerald-600";
                public static final String _700 = "via-emerald-700";
                public static final String _800 = "via-emerald-800";
                public static final String _900 = "via-emerald-900";
                public static final String _950 = "via-emerald-950";

                private Emerald() {
                }
            }

            public static final class Teal {
                public static final String _50 = "via-teal-50";
                public static final String _100 = "via-teal-100";
                public static final String _200 = "via-teal-200";
                public static final String _300 = "via-teal-300";
                public static final String _400 = "via-teal-400";
                public static final String _500 = "via-teal-500";
                public static final String _600 = "via-teal-600";
                public static final String _700 = "via-teal-700";
                public static final String _800 = "via-teal-800";
                public static final String _900 = "via-teal-900";
                public static final String _950 = "via-teal-950";

                private Teal() {
                }
            }

            public static final class Cyan {
                public static final String _50 = "via-cyan-50";
                public static final String _100 = "via-cyan-100";
                public static final String _200 = "via-cyan-200";
                public static final String _300 = "via-cyan-300";
                public static final String _400 = "via-cyan-400";
                public static final String _500 = "via-cyan-500";
                public static final String _600 = "via-cyan-600";
                public static final String _700 = "via-cyan-700";
                public static final String _800 = "via-cyan-800";
                public static final String _900 = "via-cyan-900";
                public static final String _950 = "via-cyan-950";

                private Cyan() {
                }
            }

            public static final class Sky {
                public static final String _50 = "via-sky-50";
                public static final String _100 = "via-sky-100";
                public static final String _200 = "via-sky-200";
                public static final String _300 = "via-sky-300";
                public static final String _400 = "via-sky-400";
                public static final String _500 = "via-sky-500";
                public static final String _600 = "via-sky-600";
                public static final String _700 = "via-sky-700";
                public static final String _800 = "via-sky-800";
                public static final String _900 = "via-sky-900";
                public static final String _950 = "via-sky-950";

                private Sky() {
                }
            }

            public static final class Blue {
                public static final String _50 = "via-blue-50";
                public static final String _100 = "via-blue-100";
                public static final String _200 = "via-blue-200";
                public static final String _300 = "via-blue-300";
                public static final String _400 = "via-blue-400";
                public static final String _500 = "via-blue-500";
                public static final String _600 = "via-blue-600";
                public static final String _700 = "via-blue-700";
                public static final String _800 = "via-blue-800";
                public static final String _900 = "via-blue-900";
                public static final String _950 = "via-blue-950";

                private Blue() {
                }
            }

            public static final class Indigo {
                public static final String _50 = "via-indigo-50";
                public static final String _100 = "via-indigo-100";
                public static final String _200 = "via-indigo-200";
                public static final String _300 = "via-indigo-300";
                public static final String _400 = "via-indigo-400";
                public static final String _500 = "via-indigo-500";
                public static final String _600 = "via-indigo-600";
                public static final String _700 = "via-indigo-700";
                public static final String _800 = "via-indigo-800";
                public static final String _900 = "via-indigo-900";
                public static final String _950 = "via-indigo-950";

                private Indigo() {
                }
            }

            public static final class Violet {
                public static final String _50 = "via-violet-50";
                public static final String _100 = "via-violet-100";
                public static final String _200 = "via-violet-200";
                public static final String _300 = "via-violet-300";
                public static final String _400 = "via-violet-400";
                public static final String _500 = "via-violet-500";
                public static final String _600 = "via-violet-600";
                public static final String _700 = "via-violet-700";
                public static final String _800 = "via-violet-800";
                public static final String _900 = "via-violet-900";
                public static final String _950 = "via-violet-950";

                private Violet() {
                }
            }

            public static final class Purple {
                public static final String _50 = "via-purple-50";
                public static final String _100 = "via-purple-100";
                public static final String _200 = "via-purple-200";
                public static final String _300 = "via-purple-300";
                public static final String _400 = "via-purple-400";
                public static final String _500 = "via-purple-500";
                public static final String _600 = "via-purple-600";
                public static final String _700 = "via-purple-700";
                public static final String _800 = "via-purple-800";
                public static final String _900 = "via-purple-900";
                public static final String _950 = "via-purple-950";

                private Purple() {
                }
            }

            public static final class Fuchsia {
                public static final String _50 = "via-fuchsia-50";
                public static final String _100 = "via-fuchsia-100";
                public static final String _200 = "via-fuchsia-200";
                public static final String _300 = "via-fuchsia-300";
                public static final String _400 = "via-fuchsia-400";
                public static final String _500 = "via-fuchsia-500";
                public static final String _600 = "via-fuchsia-600";
                public static final String _700 = "via-fuchsia-700";
                public static final String _800 = "via-fuchsia-800";
                public static final String _900 = "via-fuchsia-900";
                public static final String _950 = "via-fuchsia-950";

                private Fuchsia() {
                }
            }

            public static final class Pink {
                public static final String _50 = "via-pink-50";
                public static final String _100 = "via-pink-100";
                public static final String _200 = "via-pink-200";
                public static final String _300 = "via-pink-300";
                public static final String _400 = "via-pink-400";
                public static final String _500 = "via-pink-500";
                public static final String _600 = "via-pink-600";
                public static final String _700 = "via-pink-700";
                public static final String _800 = "via-pink-800";
                public static final String _900 = "via-pink-900";
                public static final String _950 = "via-pink-950";

                private Pink() {
                }
            }

            public static final class Rose {
                public static final String _50 = "via-rose-50";
                public static final String _100 = "via-rose-100";
                public static final String _200 = "via-rose-200";
                public static final String _300 = "via-rose-300";
                public static final String _400 = "via-rose-400";
                public static final String _500 = "via-rose-500";
                public static final String _600 = "via-rose-600";
                public static final String _700 = "via-rose-700";
                public static final String _800 = "via-rose-800";
                public static final String _900 = "via-rose-900";
                public static final String _950 = "via-rose-950";

                private Rose() {
                }
            }

        }

        /** Gradient to color stops. */
        public static final class To {

            public static final String BLACK = "to-black";
            public static final String WHITE = "to-white";
            public static final String TRANSPARENT = "to-transparent";
            public static final String CURRENT = "to-current";
            public static final String INHERIT = "to-inherit";

            private To() {
            }

            public static final class Slate {
                public static final String _50 = "to-slate-50";
                public static final String _100 = "to-slate-100";
                public static final String _200 = "to-slate-200";
                public static final String _300 = "to-slate-300";
                public static final String _400 = "to-slate-400";
                public static final String _500 = "to-slate-500";
                public static final String _600 = "to-slate-600";
                public static final String _700 = "to-slate-700";
                public static final String _800 = "to-slate-800";
                public static final String _900 = "to-slate-900";
                public static final String _950 = "to-slate-950";

                private Slate() {
                }
            }

            public static final class Gray {
                public static final String _50 = "to-gray-50";
                public static final String _100 = "to-gray-100";
                public static final String _200 = "to-gray-200";
                public static final String _300 = "to-gray-300";
                public static final String _400 = "to-gray-400";
                public static final String _500 = "to-gray-500";
                public static final String _600 = "to-gray-600";
                public static final String _700 = "to-gray-700";
                public static final String _800 = "to-gray-800";
                public static final String _900 = "to-gray-900";
                public static final String _950 = "to-gray-950";

                private Gray() {
                }
            }

            public static final class Zinc {
                public static final String _50 = "to-zinc-50";
                public static final String _100 = "to-zinc-100";
                public static final String _200 = "to-zinc-200";
                public static final String _300 = "to-zinc-300";
                public static final String _400 = "to-zinc-400";
                public static final String _500 = "to-zinc-500";
                public static final String _600 = "to-zinc-600";
                public static final String _700 = "to-zinc-700";
                public static final String _800 = "to-zinc-800";
                public static final String _900 = "to-zinc-900";
                public static final String _950 = "to-zinc-950";

                private Zinc() {
                }
            }

            public static final class Neutral {
                public static final String _50 = "to-neutral-50";
                public static final String _100 = "to-neutral-100";
                public static final String _200 = "to-neutral-200";
                public static final String _300 = "to-neutral-300";
                public static final String _400 = "to-neutral-400";
                public static final String _500 = "to-neutral-500";
                public static final String _600 = "to-neutral-600";
                public static final String _700 = "to-neutral-700";
                public static final String _800 = "to-neutral-800";
                public static final String _900 = "to-neutral-900";
                public static final String _950 = "to-neutral-950";

                private Neutral() {
                }
            }

            public static final class Stone {
                public static final String _50 = "to-stone-50";
                public static final String _100 = "to-stone-100";
                public static final String _200 = "to-stone-200";
                public static final String _300 = "to-stone-300";
                public static final String _400 = "to-stone-400";
                public static final String _500 = "to-stone-500";
                public static final String _600 = "to-stone-600";
                public static final String _700 = "to-stone-700";
                public static final String _800 = "to-stone-800";
                public static final String _900 = "to-stone-900";
                public static final String _950 = "to-stone-950";

                private Stone() {
                }
            }

            public static final class Red {
                public static final String _50 = "to-red-50";
                public static final String _100 = "to-red-100";
                public static final String _200 = "to-red-200";
                public static final String _300 = "to-red-300";
                public static final String _400 = "to-red-400";
                public static final String _500 = "to-red-500";
                public static final String _600 = "to-red-600";
                public static final String _700 = "to-red-700";
                public static final String _800 = "to-red-800";
                public static final String _900 = "to-red-900";
                public static final String _950 = "to-red-950";

                private Red() {
                }
            }

            public static final class Orange {
                public static final String _50 = "to-orange-50";
                public static final String _100 = "to-orange-100";
                public static final String _200 = "to-orange-200";
                public static final String _300 = "to-orange-300";
                public static final String _400 = "to-orange-400";
                public static final String _500 = "to-orange-500";
                public static final String _600 = "to-orange-600";
                public static final String _700 = "to-orange-700";
                public static final String _800 = "to-orange-800";
                public static final String _900 = "to-orange-900";
                public static final String _950 = "to-orange-950";

                private Orange() {
                }
            }

            public static final class Amber {
                public static final String _50 = "to-amber-50";
                public static final String _100 = "to-amber-100";
                public static final String _200 = "to-amber-200";
                public static final String _300 = "to-amber-300";
                public static final String _400 = "to-amber-400";
                public static final String _500 = "to-amber-500";
                public static final String _600 = "to-amber-600";
                public static final String _700 = "to-amber-700";
                public static final String _800 = "to-amber-800";
                public static final String _900 = "to-amber-900";
                public static final String _950 = "to-amber-950";

                private Amber() {
                }
            }

            public static final class Yellow {
                public static final String _50 = "to-yellow-50";
                public static final String _100 = "to-yellow-100";
                public static final String _200 = "to-yellow-200";
                public static final String _300 = "to-yellow-300";
                public static final String _400 = "to-yellow-400";
                public static final String _500 = "to-yellow-500";
                public static final String _600 = "to-yellow-600";
                public static final String _700 = "to-yellow-700";
                public static final String _800 = "to-yellow-800";
                public static final String _900 = "to-yellow-900";
                public static final String _950 = "to-yellow-950";

                private Yellow() {
                }
            }

            public static final class Lime {
                public static final String _50 = "to-lime-50";
                public static final String _100 = "to-lime-100";
                public static final String _200 = "to-lime-200";
                public static final String _300 = "to-lime-300";
                public static final String _400 = "to-lime-400";
                public static final String _500 = "to-lime-500";
                public static final String _600 = "to-lime-600";
                public static final String _700 = "to-lime-700";
                public static final String _800 = "to-lime-800";
                public static final String _900 = "to-lime-900";
                public static final String _950 = "to-lime-950";

                private Lime() {
                }
            }

            public static final class Green {
                public static final String _50 = "to-green-50";
                public static final String _100 = "to-green-100";
                public static final String _200 = "to-green-200";
                public static final String _300 = "to-green-300";
                public static final String _400 = "to-green-400";
                public static final String _500 = "to-green-500";
                public static final String _600 = "to-green-600";
                public static final String _700 = "to-green-700";
                public static final String _800 = "to-green-800";
                public static final String _900 = "to-green-900";
                public static final String _950 = "to-green-950";

                private Green() {
                }
            }

            public static final class Emerald {
                public static final String _50 = "to-emerald-50";
                public static final String _100 = "to-emerald-100";
                public static final String _200 = "to-emerald-200";
                public static final String _300 = "to-emerald-300";
                public static final String _400 = "to-emerald-400";
                public static final String _500 = "to-emerald-500";
                public static final String _600 = "to-emerald-600";
                public static final String _700 = "to-emerald-700";
                public static final String _800 = "to-emerald-800";
                public static final String _900 = "to-emerald-900";
                public static final String _950 = "to-emerald-950";

                private Emerald() {
                }
            }

            public static final class Teal {
                public static final String _50 = "to-teal-50";
                public static final String _100 = "to-teal-100";
                public static final String _200 = "to-teal-200";
                public static final String _300 = "to-teal-300";
                public static final String _400 = "to-teal-400";
                public static final String _500 = "to-teal-500";
                public static final String _600 = "to-teal-600";
                public static final String _700 = "to-teal-700";
                public static final String _800 = "to-teal-800";
                public static final String _900 = "to-teal-900";
                public static final String _950 = "to-teal-950";

                private Teal() {
                }
            }

            public static final class Cyan {
                public static final String _50 = "to-cyan-50";
                public static final String _100 = "to-cyan-100";
                public static final String _200 = "to-cyan-200";
                public static final String _300 = "to-cyan-300";
                public static final String _400 = "to-cyan-400";
                public static final String _500 = "to-cyan-500";
                public static final String _600 = "to-cyan-600";
                public static final String _700 = "to-cyan-700";
                public static final String _800 = "to-cyan-800";
                public static final String _900 = "to-cyan-900";
                public static final String _950 = "to-cyan-950";

                private Cyan() {
                }
            }

            public static final class Sky {
                public static final String _50 = "to-sky-50";
                public static final String _100 = "to-sky-100";
                public static final String _200 = "to-sky-200";
                public static final String _300 = "to-sky-300";
                public static final String _400 = "to-sky-400";
                public static final String _500 = "to-sky-500";
                public static final String _600 = "to-sky-600";
                public static final String _700 = "to-sky-700";
                public static final String _800 = "to-sky-800";
                public static final String _900 = "to-sky-900";
                public static final String _950 = "to-sky-950";

                private Sky() {
                }
            }

            public static final class Blue {
                public static final String _50 = "to-blue-50";
                public static final String _100 = "to-blue-100";
                public static final String _200 = "to-blue-200";
                public static final String _300 = "to-blue-300";
                public static final String _400 = "to-blue-400";
                public static final String _500 = "to-blue-500";
                public static final String _600 = "to-blue-600";
                public static final String _700 = "to-blue-700";
                public static final String _800 = "to-blue-800";
                public static final String _900 = "to-blue-900";
                public static final String _950 = "to-blue-950";

                private Blue() {
                }
            }

            public static final class Indigo {
                public static final String _50 = "to-indigo-50";
                public static final String _100 = "to-indigo-100";
                public static final String _200 = "to-indigo-200";
                public static final String _300 = "to-indigo-300";
                public static final String _400 = "to-indigo-400";
                public static final String _500 = "to-indigo-500";
                public static final String _600 = "to-indigo-600";
                public static final String _700 = "to-indigo-700";
                public static final String _800 = "to-indigo-800";
                public static final String _900 = "to-indigo-900";
                public static final String _950 = "to-indigo-950";

                private Indigo() {
                }
            }

            public static final class Violet {
                public static final String _50 = "to-violet-50";
                public static final String _100 = "to-violet-100";
                public static final String _200 = "to-violet-200";
                public static final String _300 = "to-violet-300";
                public static final String _400 = "to-violet-400";
                public static final String _500 = "to-violet-500";
                public static final String _600 = "to-violet-600";
                public static final String _700 = "to-violet-700";
                public static final String _800 = "to-violet-800";
                public static final String _900 = "to-violet-900";
                public static final String _950 = "to-violet-950";

                private Violet() {
                }
            }

            public static final class Purple {
                public static final String _50 = "to-purple-50";
                public static final String _100 = "to-purple-100";
                public static final String _200 = "to-purple-200";
                public static final String _300 = "to-purple-300";
                public static final String _400 = "to-purple-400";
                public static final String _500 = "to-purple-500";
                public static final String _600 = "to-purple-600";
                public static final String _700 = "to-purple-700";
                public static final String _800 = "to-purple-800";
                public static final String _900 = "to-purple-900";
                public static final String _950 = "to-purple-950";

                private Purple() {
                }
            }

            public static final class Fuchsia {
                public static final String _50 = "to-fuchsia-50";
                public static final String _100 = "to-fuchsia-100";
                public static final String _200 = "to-fuchsia-200";
                public static final String _300 = "to-fuchsia-300";
                public static final String _400 = "to-fuchsia-400";
                public static final String _500 = "to-fuchsia-500";
                public static final String _600 = "to-fuchsia-600";
                public static final String _700 = "to-fuchsia-700";
                public static final String _800 = "to-fuchsia-800";
                public static final String _900 = "to-fuchsia-900";
                public static final String _950 = "to-fuchsia-950";

                private Fuchsia() {
                }
            }

            public static final class Pink {
                public static final String _50 = "to-pink-50";
                public static final String _100 = "to-pink-100";
                public static final String _200 = "to-pink-200";
                public static final String _300 = "to-pink-300";
                public static final String _400 = "to-pink-400";
                public static final String _500 = "to-pink-500";
                public static final String _600 = "to-pink-600";
                public static final String _700 = "to-pink-700";
                public static final String _800 = "to-pink-800";
                public static final String _900 = "to-pink-900";
                public static final String _950 = "to-pink-950";

                private Pink() {
                }
            }

            public static final class Rose {
                public static final String _50 = "to-rose-50";
                public static final String _100 = "to-rose-100";
                public static final String _200 = "to-rose-200";
                public static final String _300 = "to-rose-300";
                public static final String _400 = "to-rose-400";
                public static final String _500 = "to-rose-500";
                public static final String _600 = "to-rose-600";
                public static final String _700 = "to-rose-700";
                public static final String _800 = "to-rose-800";
                public static final String _900 = "to-rose-900";
                public static final String _950 = "to-rose-950";

                private Rose() {
                }
            }

        }

    }

    // -----------------------------------------------------------------------
    // OutlineColor
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the outline color of an element.
     */
    public static final class OutlineColor {

        public static final String BLACK = "outline-black";
        public static final String WHITE = "outline-white";
        public static final String TRANSPARENT = "outline-transparent";
        public static final String CURRENT = "outline-current";
        public static final String INHERIT = "outline-inherit";

        private OutlineColor() {
        }

        public static final class Slate {
            public static final String _50 = "outline-slate-50";
            public static final String _100 = "outline-slate-100";
            public static final String _200 = "outline-slate-200";
            public static final String _300 = "outline-slate-300";
            public static final String _400 = "outline-slate-400";
            public static final String _500 = "outline-slate-500";
            public static final String _600 = "outline-slate-600";
            public static final String _700 = "outline-slate-700";
            public static final String _800 = "outline-slate-800";
            public static final String _900 = "outline-slate-900";
            public static final String _950 = "outline-slate-950";

            private Slate() {
            }
        }

        public static final class Gray {
            public static final String _50 = "outline-gray-50";
            public static final String _100 = "outline-gray-100";
            public static final String _200 = "outline-gray-200";
            public static final String _300 = "outline-gray-300";
            public static final String _400 = "outline-gray-400";
            public static final String _500 = "outline-gray-500";
            public static final String _600 = "outline-gray-600";
            public static final String _700 = "outline-gray-700";
            public static final String _800 = "outline-gray-800";
            public static final String _900 = "outline-gray-900";
            public static final String _950 = "outline-gray-950";

            private Gray() {
            }
        }

        public static final class Zinc {
            public static final String _50 = "outline-zinc-50";
            public static final String _100 = "outline-zinc-100";
            public static final String _200 = "outline-zinc-200";
            public static final String _300 = "outline-zinc-300";
            public static final String _400 = "outline-zinc-400";
            public static final String _500 = "outline-zinc-500";
            public static final String _600 = "outline-zinc-600";
            public static final String _700 = "outline-zinc-700";
            public static final String _800 = "outline-zinc-800";
            public static final String _900 = "outline-zinc-900";
            public static final String _950 = "outline-zinc-950";

            private Zinc() {
            }
        }

        public static final class Neutral {
            public static final String _50 = "outline-neutral-50";
            public static final String _100 = "outline-neutral-100";
            public static final String _200 = "outline-neutral-200";
            public static final String _300 = "outline-neutral-300";
            public static final String _400 = "outline-neutral-400";
            public static final String _500 = "outline-neutral-500";
            public static final String _600 = "outline-neutral-600";
            public static final String _700 = "outline-neutral-700";
            public static final String _800 = "outline-neutral-800";
            public static final String _900 = "outline-neutral-900";
            public static final String _950 = "outline-neutral-950";

            private Neutral() {
            }
        }

        public static final class Stone {
            public static final String _50 = "outline-stone-50";
            public static final String _100 = "outline-stone-100";
            public static final String _200 = "outline-stone-200";
            public static final String _300 = "outline-stone-300";
            public static final String _400 = "outline-stone-400";
            public static final String _500 = "outline-stone-500";
            public static final String _600 = "outline-stone-600";
            public static final String _700 = "outline-stone-700";
            public static final String _800 = "outline-stone-800";
            public static final String _900 = "outline-stone-900";
            public static final String _950 = "outline-stone-950";

            private Stone() {
            }
        }

        public static final class Red {
            public static final String _50 = "outline-red-50";
            public static final String _100 = "outline-red-100";
            public static final String _200 = "outline-red-200";
            public static final String _300 = "outline-red-300";
            public static final String _400 = "outline-red-400";
            public static final String _500 = "outline-red-500";
            public static final String _600 = "outline-red-600";
            public static final String _700 = "outline-red-700";
            public static final String _800 = "outline-red-800";
            public static final String _900 = "outline-red-900";
            public static final String _950 = "outline-red-950";

            private Red() {
            }
        }

        public static final class Orange {
            public static final String _50 = "outline-orange-50";
            public static final String _100 = "outline-orange-100";
            public static final String _200 = "outline-orange-200";
            public static final String _300 = "outline-orange-300";
            public static final String _400 = "outline-orange-400";
            public static final String _500 = "outline-orange-500";
            public static final String _600 = "outline-orange-600";
            public static final String _700 = "outline-orange-700";
            public static final String _800 = "outline-orange-800";
            public static final String _900 = "outline-orange-900";
            public static final String _950 = "outline-orange-950";

            private Orange() {
            }
        }

        public static final class Amber {
            public static final String _50 = "outline-amber-50";
            public static final String _100 = "outline-amber-100";
            public static final String _200 = "outline-amber-200";
            public static final String _300 = "outline-amber-300";
            public static final String _400 = "outline-amber-400";
            public static final String _500 = "outline-amber-500";
            public static final String _600 = "outline-amber-600";
            public static final String _700 = "outline-amber-700";
            public static final String _800 = "outline-amber-800";
            public static final String _900 = "outline-amber-900";
            public static final String _950 = "outline-amber-950";

            private Amber() {
            }
        }

        public static final class Yellow {
            public static final String _50 = "outline-yellow-50";
            public static final String _100 = "outline-yellow-100";
            public static final String _200 = "outline-yellow-200";
            public static final String _300 = "outline-yellow-300";
            public static final String _400 = "outline-yellow-400";
            public static final String _500 = "outline-yellow-500";
            public static final String _600 = "outline-yellow-600";
            public static final String _700 = "outline-yellow-700";
            public static final String _800 = "outline-yellow-800";
            public static final String _900 = "outline-yellow-900";
            public static final String _950 = "outline-yellow-950";

            private Yellow() {
            }
        }

        public static final class Lime {
            public static final String _50 = "outline-lime-50";
            public static final String _100 = "outline-lime-100";
            public static final String _200 = "outline-lime-200";
            public static final String _300 = "outline-lime-300";
            public static final String _400 = "outline-lime-400";
            public static final String _500 = "outline-lime-500";
            public static final String _600 = "outline-lime-600";
            public static final String _700 = "outline-lime-700";
            public static final String _800 = "outline-lime-800";
            public static final String _900 = "outline-lime-900";
            public static final String _950 = "outline-lime-950";

            private Lime() {
            }
        }

        public static final class Green {
            public static final String _50 = "outline-green-50";
            public static final String _100 = "outline-green-100";
            public static final String _200 = "outline-green-200";
            public static final String _300 = "outline-green-300";
            public static final String _400 = "outline-green-400";
            public static final String _500 = "outline-green-500";
            public static final String _600 = "outline-green-600";
            public static final String _700 = "outline-green-700";
            public static final String _800 = "outline-green-800";
            public static final String _900 = "outline-green-900";
            public static final String _950 = "outline-green-950";

            private Green() {
            }
        }

        public static final class Emerald {
            public static final String _50 = "outline-emerald-50";
            public static final String _100 = "outline-emerald-100";
            public static final String _200 = "outline-emerald-200";
            public static final String _300 = "outline-emerald-300";
            public static final String _400 = "outline-emerald-400";
            public static final String _500 = "outline-emerald-500";
            public static final String _600 = "outline-emerald-600";
            public static final String _700 = "outline-emerald-700";
            public static final String _800 = "outline-emerald-800";
            public static final String _900 = "outline-emerald-900";
            public static final String _950 = "outline-emerald-950";

            private Emerald() {
            }
        }

        public static final class Teal {
            public static final String _50 = "outline-teal-50";
            public static final String _100 = "outline-teal-100";
            public static final String _200 = "outline-teal-200";
            public static final String _300 = "outline-teal-300";
            public static final String _400 = "outline-teal-400";
            public static final String _500 = "outline-teal-500";
            public static final String _600 = "outline-teal-600";
            public static final String _700 = "outline-teal-700";
            public static final String _800 = "outline-teal-800";
            public static final String _900 = "outline-teal-900";
            public static final String _950 = "outline-teal-950";

            private Teal() {
            }
        }

        public static final class Cyan {
            public static final String _50 = "outline-cyan-50";
            public static final String _100 = "outline-cyan-100";
            public static final String _200 = "outline-cyan-200";
            public static final String _300 = "outline-cyan-300";
            public static final String _400 = "outline-cyan-400";
            public static final String _500 = "outline-cyan-500";
            public static final String _600 = "outline-cyan-600";
            public static final String _700 = "outline-cyan-700";
            public static final String _800 = "outline-cyan-800";
            public static final String _900 = "outline-cyan-900";
            public static final String _950 = "outline-cyan-950";

            private Cyan() {
            }
        }

        public static final class Sky {
            public static final String _50 = "outline-sky-50";
            public static final String _100 = "outline-sky-100";
            public static final String _200 = "outline-sky-200";
            public static final String _300 = "outline-sky-300";
            public static final String _400 = "outline-sky-400";
            public static final String _500 = "outline-sky-500";
            public static final String _600 = "outline-sky-600";
            public static final String _700 = "outline-sky-700";
            public static final String _800 = "outline-sky-800";
            public static final String _900 = "outline-sky-900";
            public static final String _950 = "outline-sky-950";

            private Sky() {
            }
        }

        public static final class Blue {
            public static final String _50 = "outline-blue-50";
            public static final String _100 = "outline-blue-100";
            public static final String _200 = "outline-blue-200";
            public static final String _300 = "outline-blue-300";
            public static final String _400 = "outline-blue-400";
            public static final String _500 = "outline-blue-500";
            public static final String _600 = "outline-blue-600";
            public static final String _700 = "outline-blue-700";
            public static final String _800 = "outline-blue-800";
            public static final String _900 = "outline-blue-900";
            public static final String _950 = "outline-blue-950";

            private Blue() {
            }
        }

        public static final class Indigo {
            public static final String _50 = "outline-indigo-50";
            public static final String _100 = "outline-indigo-100";
            public static final String _200 = "outline-indigo-200";
            public static final String _300 = "outline-indigo-300";
            public static final String _400 = "outline-indigo-400";
            public static final String _500 = "outline-indigo-500";
            public static final String _600 = "outline-indigo-600";
            public static final String _700 = "outline-indigo-700";
            public static final String _800 = "outline-indigo-800";
            public static final String _900 = "outline-indigo-900";
            public static final String _950 = "outline-indigo-950";

            private Indigo() {
            }
        }

        public static final class Violet {
            public static final String _50 = "outline-violet-50";
            public static final String _100 = "outline-violet-100";
            public static final String _200 = "outline-violet-200";
            public static final String _300 = "outline-violet-300";
            public static final String _400 = "outline-violet-400";
            public static final String _500 = "outline-violet-500";
            public static final String _600 = "outline-violet-600";
            public static final String _700 = "outline-violet-700";
            public static final String _800 = "outline-violet-800";
            public static final String _900 = "outline-violet-900";
            public static final String _950 = "outline-violet-950";

            private Violet() {
            }
        }

        public static final class Purple {
            public static final String _50 = "outline-purple-50";
            public static final String _100 = "outline-purple-100";
            public static final String _200 = "outline-purple-200";
            public static final String _300 = "outline-purple-300";
            public static final String _400 = "outline-purple-400";
            public static final String _500 = "outline-purple-500";
            public static final String _600 = "outline-purple-600";
            public static final String _700 = "outline-purple-700";
            public static final String _800 = "outline-purple-800";
            public static final String _900 = "outline-purple-900";
            public static final String _950 = "outline-purple-950";

            private Purple() {
            }
        }

        public static final class Fuchsia {
            public static final String _50 = "outline-fuchsia-50";
            public static final String _100 = "outline-fuchsia-100";
            public static final String _200 = "outline-fuchsia-200";
            public static final String _300 = "outline-fuchsia-300";
            public static final String _400 = "outline-fuchsia-400";
            public static final String _500 = "outline-fuchsia-500";
            public static final String _600 = "outline-fuchsia-600";
            public static final String _700 = "outline-fuchsia-700";
            public static final String _800 = "outline-fuchsia-800";
            public static final String _900 = "outline-fuchsia-900";
            public static final String _950 = "outline-fuchsia-950";

            private Fuchsia() {
            }
        }

        public static final class Pink {
            public static final String _50 = "outline-pink-50";
            public static final String _100 = "outline-pink-100";
            public static final String _200 = "outline-pink-200";
            public static final String _300 = "outline-pink-300";
            public static final String _400 = "outline-pink-400";
            public static final String _500 = "outline-pink-500";
            public static final String _600 = "outline-pink-600";
            public static final String _700 = "outline-pink-700";
            public static final String _800 = "outline-pink-800";
            public static final String _900 = "outline-pink-900";
            public static final String _950 = "outline-pink-950";

            private Pink() {
            }
        }

        public static final class Rose {
            public static final String _50 = "outline-rose-50";
            public static final String _100 = "outline-rose-100";
            public static final String _200 = "outline-rose-200";
            public static final String _300 = "outline-rose-300";
            public static final String _400 = "outline-rose-400";
            public static final String _500 = "outline-rose-500";
            public static final String _600 = "outline-rose-600";
            public static final String _700 = "outline-rose-700";
            public static final String _800 = "outline-rose-800";
            public static final String _900 = "outline-rose-900";
            public static final String _950 = "outline-rose-950";

            private Rose() {
            }
        }

    }

    // -----------------------------------------------------------------------
    // RingColor
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the color of focus ring utilities.
     */
    public static final class RingColor {

        public static final String BLACK = "ring-black";
        public static final String WHITE = "ring-white";
        public static final String TRANSPARENT = "ring-transparent";
        public static final String CURRENT = "ring-current";
        public static final String INHERIT = "ring-inherit";

        private RingColor() {
        }

        public static final class Slate {
            public static final String _50 = "ring-slate-50";
            public static final String _100 = "ring-slate-100";
            public static final String _200 = "ring-slate-200";
            public static final String _300 = "ring-slate-300";
            public static final String _400 = "ring-slate-400";
            public static final String _500 = "ring-slate-500";
            public static final String _600 = "ring-slate-600";
            public static final String _700 = "ring-slate-700";
            public static final String _800 = "ring-slate-800";
            public static final String _900 = "ring-slate-900";
            public static final String _950 = "ring-slate-950";

            private Slate() {
            }
        }

        public static final class Gray {
            public static final String _50 = "ring-gray-50";
            public static final String _100 = "ring-gray-100";
            public static final String _200 = "ring-gray-200";
            public static final String _300 = "ring-gray-300";
            public static final String _400 = "ring-gray-400";
            public static final String _500 = "ring-gray-500";
            public static final String _600 = "ring-gray-600";
            public static final String _700 = "ring-gray-700";
            public static final String _800 = "ring-gray-800";
            public static final String _900 = "ring-gray-900";
            public static final String _950 = "ring-gray-950";

            private Gray() {
            }
        }

        public static final class Zinc {
            public static final String _50 = "ring-zinc-50";
            public static final String _100 = "ring-zinc-100";
            public static final String _200 = "ring-zinc-200";
            public static final String _300 = "ring-zinc-300";
            public static final String _400 = "ring-zinc-400";
            public static final String _500 = "ring-zinc-500";
            public static final String _600 = "ring-zinc-600";
            public static final String _700 = "ring-zinc-700";
            public static final String _800 = "ring-zinc-800";
            public static final String _900 = "ring-zinc-900";
            public static final String _950 = "ring-zinc-950";

            private Zinc() {
            }
        }

        public static final class Neutral {
            public static final String _50 = "ring-neutral-50";
            public static final String _100 = "ring-neutral-100";
            public static final String _200 = "ring-neutral-200";
            public static final String _300 = "ring-neutral-300";
            public static final String _400 = "ring-neutral-400";
            public static final String _500 = "ring-neutral-500";
            public static final String _600 = "ring-neutral-600";
            public static final String _700 = "ring-neutral-700";
            public static final String _800 = "ring-neutral-800";
            public static final String _900 = "ring-neutral-900";
            public static final String _950 = "ring-neutral-950";

            private Neutral() {
            }
        }

        public static final class Stone {
            public static final String _50 = "ring-stone-50";
            public static final String _100 = "ring-stone-100";
            public static final String _200 = "ring-stone-200";
            public static final String _300 = "ring-stone-300";
            public static final String _400 = "ring-stone-400";
            public static final String _500 = "ring-stone-500";
            public static final String _600 = "ring-stone-600";
            public static final String _700 = "ring-stone-700";
            public static final String _800 = "ring-stone-800";
            public static final String _900 = "ring-stone-900";
            public static final String _950 = "ring-stone-950";

            private Stone() {
            }
        }

        public static final class Red {
            public static final String _50 = "ring-red-50";
            public static final String _100 = "ring-red-100";
            public static final String _200 = "ring-red-200";
            public static final String _300 = "ring-red-300";
            public static final String _400 = "ring-red-400";
            public static final String _500 = "ring-red-500";
            public static final String _600 = "ring-red-600";
            public static final String _700 = "ring-red-700";
            public static final String _800 = "ring-red-800";
            public static final String _900 = "ring-red-900";
            public static final String _950 = "ring-red-950";

            private Red() {
            }
        }

        public static final class Orange {
            public static final String _50 = "ring-orange-50";
            public static final String _100 = "ring-orange-100";
            public static final String _200 = "ring-orange-200";
            public static final String _300 = "ring-orange-300";
            public static final String _400 = "ring-orange-400";
            public static final String _500 = "ring-orange-500";
            public static final String _600 = "ring-orange-600";
            public static final String _700 = "ring-orange-700";
            public static final String _800 = "ring-orange-800";
            public static final String _900 = "ring-orange-900";
            public static final String _950 = "ring-orange-950";

            private Orange() {
            }
        }

        public static final class Amber {
            public static final String _50 = "ring-amber-50";
            public static final String _100 = "ring-amber-100";
            public static final String _200 = "ring-amber-200";
            public static final String _300 = "ring-amber-300";
            public static final String _400 = "ring-amber-400";
            public static final String _500 = "ring-amber-500";
            public static final String _600 = "ring-amber-600";
            public static final String _700 = "ring-amber-700";
            public static final String _800 = "ring-amber-800";
            public static final String _900 = "ring-amber-900";
            public static final String _950 = "ring-amber-950";

            private Amber() {
            }
        }

        public static final class Yellow {
            public static final String _50 = "ring-yellow-50";
            public static final String _100 = "ring-yellow-100";
            public static final String _200 = "ring-yellow-200";
            public static final String _300 = "ring-yellow-300";
            public static final String _400 = "ring-yellow-400";
            public static final String _500 = "ring-yellow-500";
            public static final String _600 = "ring-yellow-600";
            public static final String _700 = "ring-yellow-700";
            public static final String _800 = "ring-yellow-800";
            public static final String _900 = "ring-yellow-900";
            public static final String _950 = "ring-yellow-950";

            private Yellow() {
            }
        }

        public static final class Lime {
            public static final String _50 = "ring-lime-50";
            public static final String _100 = "ring-lime-100";
            public static final String _200 = "ring-lime-200";
            public static final String _300 = "ring-lime-300";
            public static final String _400 = "ring-lime-400";
            public static final String _500 = "ring-lime-500";
            public static final String _600 = "ring-lime-600";
            public static final String _700 = "ring-lime-700";
            public static final String _800 = "ring-lime-800";
            public static final String _900 = "ring-lime-900";
            public static final String _950 = "ring-lime-950";

            private Lime() {
            }
        }

        public static final class Green {
            public static final String _50 = "ring-green-50";
            public static final String _100 = "ring-green-100";
            public static final String _200 = "ring-green-200";
            public static final String _300 = "ring-green-300";
            public static final String _400 = "ring-green-400";
            public static final String _500 = "ring-green-500";
            public static final String _600 = "ring-green-600";
            public static final String _700 = "ring-green-700";
            public static final String _800 = "ring-green-800";
            public static final String _900 = "ring-green-900";
            public static final String _950 = "ring-green-950";

            private Green() {
            }
        }

        public static final class Emerald {
            public static final String _50 = "ring-emerald-50";
            public static final String _100 = "ring-emerald-100";
            public static final String _200 = "ring-emerald-200";
            public static final String _300 = "ring-emerald-300";
            public static final String _400 = "ring-emerald-400";
            public static final String _500 = "ring-emerald-500";
            public static final String _600 = "ring-emerald-600";
            public static final String _700 = "ring-emerald-700";
            public static final String _800 = "ring-emerald-800";
            public static final String _900 = "ring-emerald-900";
            public static final String _950 = "ring-emerald-950";

            private Emerald() {
            }
        }

        public static final class Teal {
            public static final String _50 = "ring-teal-50";
            public static final String _100 = "ring-teal-100";
            public static final String _200 = "ring-teal-200";
            public static final String _300 = "ring-teal-300";
            public static final String _400 = "ring-teal-400";
            public static final String _500 = "ring-teal-500";
            public static final String _600 = "ring-teal-600";
            public static final String _700 = "ring-teal-700";
            public static final String _800 = "ring-teal-800";
            public static final String _900 = "ring-teal-900";
            public static final String _950 = "ring-teal-950";

            private Teal() {
            }
        }

        public static final class Cyan {
            public static final String _50 = "ring-cyan-50";
            public static final String _100 = "ring-cyan-100";
            public static final String _200 = "ring-cyan-200";
            public static final String _300 = "ring-cyan-300";
            public static final String _400 = "ring-cyan-400";
            public static final String _500 = "ring-cyan-500";
            public static final String _600 = "ring-cyan-600";
            public static final String _700 = "ring-cyan-700";
            public static final String _800 = "ring-cyan-800";
            public static final String _900 = "ring-cyan-900";
            public static final String _950 = "ring-cyan-950";

            private Cyan() {
            }
        }

        public static final class Sky {
            public static final String _50 = "ring-sky-50";
            public static final String _100 = "ring-sky-100";
            public static final String _200 = "ring-sky-200";
            public static final String _300 = "ring-sky-300";
            public static final String _400 = "ring-sky-400";
            public static final String _500 = "ring-sky-500";
            public static final String _600 = "ring-sky-600";
            public static final String _700 = "ring-sky-700";
            public static final String _800 = "ring-sky-800";
            public static final String _900 = "ring-sky-900";
            public static final String _950 = "ring-sky-950";

            private Sky() {
            }
        }

        public static final class Blue {
            public static final String _50 = "ring-blue-50";
            public static final String _100 = "ring-blue-100";
            public static final String _200 = "ring-blue-200";
            public static final String _300 = "ring-blue-300";
            public static final String _400 = "ring-blue-400";
            public static final String _500 = "ring-blue-500";
            public static final String _600 = "ring-blue-600";
            public static final String _700 = "ring-blue-700";
            public static final String _800 = "ring-blue-800";
            public static final String _900 = "ring-blue-900";
            public static final String _950 = "ring-blue-950";

            private Blue() {
            }
        }

        public static final class Indigo {
            public static final String _50 = "ring-indigo-50";
            public static final String _100 = "ring-indigo-100";
            public static final String _200 = "ring-indigo-200";
            public static final String _300 = "ring-indigo-300";
            public static final String _400 = "ring-indigo-400";
            public static final String _500 = "ring-indigo-500";
            public static final String _600 = "ring-indigo-600";
            public static final String _700 = "ring-indigo-700";
            public static final String _800 = "ring-indigo-800";
            public static final String _900 = "ring-indigo-900";
            public static final String _950 = "ring-indigo-950";

            private Indigo() {
            }
        }

        public static final class Violet {
            public static final String _50 = "ring-violet-50";
            public static final String _100 = "ring-violet-100";
            public static final String _200 = "ring-violet-200";
            public static final String _300 = "ring-violet-300";
            public static final String _400 = "ring-violet-400";
            public static final String _500 = "ring-violet-500";
            public static final String _600 = "ring-violet-600";
            public static final String _700 = "ring-violet-700";
            public static final String _800 = "ring-violet-800";
            public static final String _900 = "ring-violet-900";
            public static final String _950 = "ring-violet-950";

            private Violet() {
            }
        }

        public static final class Purple {
            public static final String _50 = "ring-purple-50";
            public static final String _100 = "ring-purple-100";
            public static final String _200 = "ring-purple-200";
            public static final String _300 = "ring-purple-300";
            public static final String _400 = "ring-purple-400";
            public static final String _500 = "ring-purple-500";
            public static final String _600 = "ring-purple-600";
            public static final String _700 = "ring-purple-700";
            public static final String _800 = "ring-purple-800";
            public static final String _900 = "ring-purple-900";
            public static final String _950 = "ring-purple-950";

            private Purple() {
            }
        }

        public static final class Fuchsia {
            public static final String _50 = "ring-fuchsia-50";
            public static final String _100 = "ring-fuchsia-100";
            public static final String _200 = "ring-fuchsia-200";
            public static final String _300 = "ring-fuchsia-300";
            public static final String _400 = "ring-fuchsia-400";
            public static final String _500 = "ring-fuchsia-500";
            public static final String _600 = "ring-fuchsia-600";
            public static final String _700 = "ring-fuchsia-700";
            public static final String _800 = "ring-fuchsia-800";
            public static final String _900 = "ring-fuchsia-900";
            public static final String _950 = "ring-fuchsia-950";

            private Fuchsia() {
            }
        }

        public static final class Pink {
            public static final String _50 = "ring-pink-50";
            public static final String _100 = "ring-pink-100";
            public static final String _200 = "ring-pink-200";
            public static final String _300 = "ring-pink-300";
            public static final String _400 = "ring-pink-400";
            public static final String _500 = "ring-pink-500";
            public static final String _600 = "ring-pink-600";
            public static final String _700 = "ring-pink-700";
            public static final String _800 = "ring-pink-800";
            public static final String _900 = "ring-pink-900";
            public static final String _950 = "ring-pink-950";

            private Pink() {
            }
        }

        public static final class Rose {
            public static final String _50 = "ring-rose-50";
            public static final String _100 = "ring-rose-100";
            public static final String _200 = "ring-rose-200";
            public static final String _300 = "ring-rose-300";
            public static final String _400 = "ring-rose-400";
            public static final String _500 = "ring-rose-500";
            public static final String _600 = "ring-rose-600";
            public static final String _700 = "ring-rose-700";
            public static final String _800 = "ring-rose-800";
            public static final String _900 = "ring-rose-900";
            public static final String _950 = "ring-rose-950";

            private Rose() {
            }
        }

    }

    // -----------------------------------------------------------------------
    // RingOffsetColor
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the color of ring offset utilities.
     */
    public static final class RingOffsetColor {

        public static final String BLACK = "ring-offset-black";
        public static final String WHITE = "ring-offset-white";
        public static final String TRANSPARENT = "ring-offset-transparent";
        public static final String CURRENT = "ring-offset-current";
        public static final String INHERIT = "ring-offset-inherit";

        private RingOffsetColor() {
        }

        public static final class Slate {
            public static final String _50 = "ring-offset-slate-50";
            public static final String _100 = "ring-offset-slate-100";
            public static final String _200 = "ring-offset-slate-200";
            public static final String _300 = "ring-offset-slate-300";
            public static final String _400 = "ring-offset-slate-400";
            public static final String _500 = "ring-offset-slate-500";
            public static final String _600 = "ring-offset-slate-600";
            public static final String _700 = "ring-offset-slate-700";
            public static final String _800 = "ring-offset-slate-800";
            public static final String _900 = "ring-offset-slate-900";
            public static final String _950 = "ring-offset-slate-950";

            private Slate() {
            }
        }

        public static final class Gray {
            public static final String _50 = "ring-offset-gray-50";
            public static final String _100 = "ring-offset-gray-100";
            public static final String _200 = "ring-offset-gray-200";
            public static final String _300 = "ring-offset-gray-300";
            public static final String _400 = "ring-offset-gray-400";
            public static final String _500 = "ring-offset-gray-500";
            public static final String _600 = "ring-offset-gray-600";
            public static final String _700 = "ring-offset-gray-700";
            public static final String _800 = "ring-offset-gray-800";
            public static final String _900 = "ring-offset-gray-900";
            public static final String _950 = "ring-offset-gray-950";

            private Gray() {
            }
        }

        public static final class Zinc {
            public static final String _50 = "ring-offset-zinc-50";
            public static final String _100 = "ring-offset-zinc-100";
            public static final String _200 = "ring-offset-zinc-200";
            public static final String _300 = "ring-offset-zinc-300";
            public static final String _400 = "ring-offset-zinc-400";
            public static final String _500 = "ring-offset-zinc-500";
            public static final String _600 = "ring-offset-zinc-600";
            public static final String _700 = "ring-offset-zinc-700";
            public static final String _800 = "ring-offset-zinc-800";
            public static final String _900 = "ring-offset-zinc-900";
            public static final String _950 = "ring-offset-zinc-950";

            private Zinc() {
            }
        }

        public static final class Neutral {
            public static final String _50 = "ring-offset-neutral-50";
            public static final String _100 = "ring-offset-neutral-100";
            public static final String _200 = "ring-offset-neutral-200";
            public static final String _300 = "ring-offset-neutral-300";
            public static final String _400 = "ring-offset-neutral-400";
            public static final String _500 = "ring-offset-neutral-500";
            public static final String _600 = "ring-offset-neutral-600";
            public static final String _700 = "ring-offset-neutral-700";
            public static final String _800 = "ring-offset-neutral-800";
            public static final String _900 = "ring-offset-neutral-900";
            public static final String _950 = "ring-offset-neutral-950";

            private Neutral() {
            }
        }

        public static final class Stone {
            public static final String _50 = "ring-offset-stone-50";
            public static final String _100 = "ring-offset-stone-100";
            public static final String _200 = "ring-offset-stone-200";
            public static final String _300 = "ring-offset-stone-300";
            public static final String _400 = "ring-offset-stone-400";
            public static final String _500 = "ring-offset-stone-500";
            public static final String _600 = "ring-offset-stone-600";
            public static final String _700 = "ring-offset-stone-700";
            public static final String _800 = "ring-offset-stone-800";
            public static final String _900 = "ring-offset-stone-900";
            public static final String _950 = "ring-offset-stone-950";

            private Stone() {
            }
        }

        public static final class Red {
            public static final String _50 = "ring-offset-red-50";
            public static final String _100 = "ring-offset-red-100";
            public static final String _200 = "ring-offset-red-200";
            public static final String _300 = "ring-offset-red-300";
            public static final String _400 = "ring-offset-red-400";
            public static final String _500 = "ring-offset-red-500";
            public static final String _600 = "ring-offset-red-600";
            public static final String _700 = "ring-offset-red-700";
            public static final String _800 = "ring-offset-red-800";
            public static final String _900 = "ring-offset-red-900";
            public static final String _950 = "ring-offset-red-950";

            private Red() {
            }
        }

        public static final class Orange {
            public static final String _50 = "ring-offset-orange-50";
            public static final String _100 = "ring-offset-orange-100";
            public static final String _200 = "ring-offset-orange-200";
            public static final String _300 = "ring-offset-orange-300";
            public static final String _400 = "ring-offset-orange-400";
            public static final String _500 = "ring-offset-orange-500";
            public static final String _600 = "ring-offset-orange-600";
            public static final String _700 = "ring-offset-orange-700";
            public static final String _800 = "ring-offset-orange-800";
            public static final String _900 = "ring-offset-orange-900";
            public static final String _950 = "ring-offset-orange-950";

            private Orange() {
            }
        }

        public static final class Amber {
            public static final String _50 = "ring-offset-amber-50";
            public static final String _100 = "ring-offset-amber-100";
            public static final String _200 = "ring-offset-amber-200";
            public static final String _300 = "ring-offset-amber-300";
            public static final String _400 = "ring-offset-amber-400";
            public static final String _500 = "ring-offset-amber-500";
            public static final String _600 = "ring-offset-amber-600";
            public static final String _700 = "ring-offset-amber-700";
            public static final String _800 = "ring-offset-amber-800";
            public static final String _900 = "ring-offset-amber-900";
            public static final String _950 = "ring-offset-amber-950";

            private Amber() {
            }
        }

        public static final class Yellow {
            public static final String _50 = "ring-offset-yellow-50";
            public static final String _100 = "ring-offset-yellow-100";
            public static final String _200 = "ring-offset-yellow-200";
            public static final String _300 = "ring-offset-yellow-300";
            public static final String _400 = "ring-offset-yellow-400";
            public static final String _500 = "ring-offset-yellow-500";
            public static final String _600 = "ring-offset-yellow-600";
            public static final String _700 = "ring-offset-yellow-700";
            public static final String _800 = "ring-offset-yellow-800";
            public static final String _900 = "ring-offset-yellow-900";
            public static final String _950 = "ring-offset-yellow-950";

            private Yellow() {
            }
        }

        public static final class Lime {
            public static final String _50 = "ring-offset-lime-50";
            public static final String _100 = "ring-offset-lime-100";
            public static final String _200 = "ring-offset-lime-200";
            public static final String _300 = "ring-offset-lime-300";
            public static final String _400 = "ring-offset-lime-400";
            public static final String _500 = "ring-offset-lime-500";
            public static final String _600 = "ring-offset-lime-600";
            public static final String _700 = "ring-offset-lime-700";
            public static final String _800 = "ring-offset-lime-800";
            public static final String _900 = "ring-offset-lime-900";
            public static final String _950 = "ring-offset-lime-950";

            private Lime() {
            }
        }

        public static final class Green {
            public static final String _50 = "ring-offset-green-50";
            public static final String _100 = "ring-offset-green-100";
            public static final String _200 = "ring-offset-green-200";
            public static final String _300 = "ring-offset-green-300";
            public static final String _400 = "ring-offset-green-400";
            public static final String _500 = "ring-offset-green-500";
            public static final String _600 = "ring-offset-green-600";
            public static final String _700 = "ring-offset-green-700";
            public static final String _800 = "ring-offset-green-800";
            public static final String _900 = "ring-offset-green-900";
            public static final String _950 = "ring-offset-green-950";

            private Green() {
            }
        }

        public static final class Emerald {
            public static final String _50 = "ring-offset-emerald-50";
            public static final String _100 = "ring-offset-emerald-100";
            public static final String _200 = "ring-offset-emerald-200";
            public static final String _300 = "ring-offset-emerald-300";
            public static final String _400 = "ring-offset-emerald-400";
            public static final String _500 = "ring-offset-emerald-500";
            public static final String _600 = "ring-offset-emerald-600";
            public static final String _700 = "ring-offset-emerald-700";
            public static final String _800 = "ring-offset-emerald-800";
            public static final String _900 = "ring-offset-emerald-900";
            public static final String _950 = "ring-offset-emerald-950";

            private Emerald() {
            }
        }

        public static final class Teal {
            public static final String _50 = "ring-offset-teal-50";
            public static final String _100 = "ring-offset-teal-100";
            public static final String _200 = "ring-offset-teal-200";
            public static final String _300 = "ring-offset-teal-300";
            public static final String _400 = "ring-offset-teal-400";
            public static final String _500 = "ring-offset-teal-500";
            public static final String _600 = "ring-offset-teal-600";
            public static final String _700 = "ring-offset-teal-700";
            public static final String _800 = "ring-offset-teal-800";
            public static final String _900 = "ring-offset-teal-900";
            public static final String _950 = "ring-offset-teal-950";

            private Teal() {
            }
        }

        public static final class Cyan {
            public static final String _50 = "ring-offset-cyan-50";
            public static final String _100 = "ring-offset-cyan-100";
            public static final String _200 = "ring-offset-cyan-200";
            public static final String _300 = "ring-offset-cyan-300";
            public static final String _400 = "ring-offset-cyan-400";
            public static final String _500 = "ring-offset-cyan-500";
            public static final String _600 = "ring-offset-cyan-600";
            public static final String _700 = "ring-offset-cyan-700";
            public static final String _800 = "ring-offset-cyan-800";
            public static final String _900 = "ring-offset-cyan-900";
            public static final String _950 = "ring-offset-cyan-950";

            private Cyan() {
            }
        }

        public static final class Sky {
            public static final String _50 = "ring-offset-sky-50";
            public static final String _100 = "ring-offset-sky-100";
            public static final String _200 = "ring-offset-sky-200";
            public static final String _300 = "ring-offset-sky-300";
            public static final String _400 = "ring-offset-sky-400";
            public static final String _500 = "ring-offset-sky-500";
            public static final String _600 = "ring-offset-sky-600";
            public static final String _700 = "ring-offset-sky-700";
            public static final String _800 = "ring-offset-sky-800";
            public static final String _900 = "ring-offset-sky-900";
            public static final String _950 = "ring-offset-sky-950";

            private Sky() {
            }
        }

        public static final class Blue {
            public static final String _50 = "ring-offset-blue-50";
            public static final String _100 = "ring-offset-blue-100";
            public static final String _200 = "ring-offset-blue-200";
            public static final String _300 = "ring-offset-blue-300";
            public static final String _400 = "ring-offset-blue-400";
            public static final String _500 = "ring-offset-blue-500";
            public static final String _600 = "ring-offset-blue-600";
            public static final String _700 = "ring-offset-blue-700";
            public static final String _800 = "ring-offset-blue-800";
            public static final String _900 = "ring-offset-blue-900";
            public static final String _950 = "ring-offset-blue-950";

            private Blue() {
            }
        }

        public static final class Indigo {
            public static final String _50 = "ring-offset-indigo-50";
            public static final String _100 = "ring-offset-indigo-100";
            public static final String _200 = "ring-offset-indigo-200";
            public static final String _300 = "ring-offset-indigo-300";
            public static final String _400 = "ring-offset-indigo-400";
            public static final String _500 = "ring-offset-indigo-500";
            public static final String _600 = "ring-offset-indigo-600";
            public static final String _700 = "ring-offset-indigo-700";
            public static final String _800 = "ring-offset-indigo-800";
            public static final String _900 = "ring-offset-indigo-900";
            public static final String _950 = "ring-offset-indigo-950";

            private Indigo() {
            }
        }

        public static final class Violet {
            public static final String _50 = "ring-offset-violet-50";
            public static final String _100 = "ring-offset-violet-100";
            public static final String _200 = "ring-offset-violet-200";
            public static final String _300 = "ring-offset-violet-300";
            public static final String _400 = "ring-offset-violet-400";
            public static final String _500 = "ring-offset-violet-500";
            public static final String _600 = "ring-offset-violet-600";
            public static final String _700 = "ring-offset-violet-700";
            public static final String _800 = "ring-offset-violet-800";
            public static final String _900 = "ring-offset-violet-900";
            public static final String _950 = "ring-offset-violet-950";

            private Violet() {
            }
        }

        public static final class Purple {
            public static final String _50 = "ring-offset-purple-50";
            public static final String _100 = "ring-offset-purple-100";
            public static final String _200 = "ring-offset-purple-200";
            public static final String _300 = "ring-offset-purple-300";
            public static final String _400 = "ring-offset-purple-400";
            public static final String _500 = "ring-offset-purple-500";
            public static final String _600 = "ring-offset-purple-600";
            public static final String _700 = "ring-offset-purple-700";
            public static final String _800 = "ring-offset-purple-800";
            public static final String _900 = "ring-offset-purple-900";
            public static final String _950 = "ring-offset-purple-950";

            private Purple() {
            }
        }

        public static final class Fuchsia {
            public static final String _50 = "ring-offset-fuchsia-50";
            public static final String _100 = "ring-offset-fuchsia-100";
            public static final String _200 = "ring-offset-fuchsia-200";
            public static final String _300 = "ring-offset-fuchsia-300";
            public static final String _400 = "ring-offset-fuchsia-400";
            public static final String _500 = "ring-offset-fuchsia-500";
            public static final String _600 = "ring-offset-fuchsia-600";
            public static final String _700 = "ring-offset-fuchsia-700";
            public static final String _800 = "ring-offset-fuchsia-800";
            public static final String _900 = "ring-offset-fuchsia-900";
            public static final String _950 = "ring-offset-fuchsia-950";

            private Fuchsia() {
            }
        }

        public static final class Pink {
            public static final String _50 = "ring-offset-pink-50";
            public static final String _100 = "ring-offset-pink-100";
            public static final String _200 = "ring-offset-pink-200";
            public static final String _300 = "ring-offset-pink-300";
            public static final String _400 = "ring-offset-pink-400";
            public static final String _500 = "ring-offset-pink-500";
            public static final String _600 = "ring-offset-pink-600";
            public static final String _700 = "ring-offset-pink-700";
            public static final String _800 = "ring-offset-pink-800";
            public static final String _900 = "ring-offset-pink-900";
            public static final String _950 = "ring-offset-pink-950";

            private Pink() {
            }
        }

        public static final class Rose {
            public static final String _50 = "ring-offset-rose-50";
            public static final String _100 = "ring-offset-rose-100";
            public static final String _200 = "ring-offset-rose-200";
            public static final String _300 = "ring-offset-rose-300";
            public static final String _400 = "ring-offset-rose-400";
            public static final String _500 = "ring-offset-rose-500";
            public static final String _600 = "ring-offset-rose-600";
            public static final String _700 = "ring-offset-rose-700";
            public static final String _800 = "ring-offset-rose-800";
            public static final String _900 = "ring-offset-rose-900";
            public static final String _950 = "ring-offset-rose-950";

            private Rose() {
            }
        }

    }

    // -----------------------------------------------------------------------
    // ShadowColor
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the color tint of box shadow utilities.
     */
    public static final class ShadowColor {

        public static final String BLACK = "shadow-black";
        public static final String WHITE = "shadow-white";
        public static final String TRANSPARENT = "shadow-transparent";
        public static final String CURRENT = "shadow-current";
        public static final String INHERIT = "shadow-inherit";

        private ShadowColor() {
        }

        public static final class Slate {
            public static final String _50 = "shadow-slate-50";
            public static final String _100 = "shadow-slate-100";
            public static final String _200 = "shadow-slate-200";
            public static final String _300 = "shadow-slate-300";
            public static final String _400 = "shadow-slate-400";
            public static final String _500 = "shadow-slate-500";
            public static final String _600 = "shadow-slate-600";
            public static final String _700 = "shadow-slate-700";
            public static final String _800 = "shadow-slate-800";
            public static final String _900 = "shadow-slate-900";
            public static final String _950 = "shadow-slate-950";

            private Slate() {
            }
        }

        public static final class Gray {
            public static final String _50 = "shadow-gray-50";
            public static final String _100 = "shadow-gray-100";
            public static final String _200 = "shadow-gray-200";
            public static final String _300 = "shadow-gray-300";
            public static final String _400 = "shadow-gray-400";
            public static final String _500 = "shadow-gray-500";
            public static final String _600 = "shadow-gray-600";
            public static final String _700 = "shadow-gray-700";
            public static final String _800 = "shadow-gray-800";
            public static final String _900 = "shadow-gray-900";
            public static final String _950 = "shadow-gray-950";

            private Gray() {
            }
        }

        public static final class Zinc {
            public static final String _50 = "shadow-zinc-50";
            public static final String _100 = "shadow-zinc-100";
            public static final String _200 = "shadow-zinc-200";
            public static final String _300 = "shadow-zinc-300";
            public static final String _400 = "shadow-zinc-400";
            public static final String _500 = "shadow-zinc-500";
            public static final String _600 = "shadow-zinc-600";
            public static final String _700 = "shadow-zinc-700";
            public static final String _800 = "shadow-zinc-800";
            public static final String _900 = "shadow-zinc-900";
            public static final String _950 = "shadow-zinc-950";

            private Zinc() {
            }
        }

        public static final class Neutral {
            public static final String _50 = "shadow-neutral-50";
            public static final String _100 = "shadow-neutral-100";
            public static final String _200 = "shadow-neutral-200";
            public static final String _300 = "shadow-neutral-300";
            public static final String _400 = "shadow-neutral-400";
            public static final String _500 = "shadow-neutral-500";
            public static final String _600 = "shadow-neutral-600";
            public static final String _700 = "shadow-neutral-700";
            public static final String _800 = "shadow-neutral-800";
            public static final String _900 = "shadow-neutral-900";
            public static final String _950 = "shadow-neutral-950";

            private Neutral() {
            }
        }

        public static final class Stone {
            public static final String _50 = "shadow-stone-50";
            public static final String _100 = "shadow-stone-100";
            public static final String _200 = "shadow-stone-200";
            public static final String _300 = "shadow-stone-300";
            public static final String _400 = "shadow-stone-400";
            public static final String _500 = "shadow-stone-500";
            public static final String _600 = "shadow-stone-600";
            public static final String _700 = "shadow-stone-700";
            public static final String _800 = "shadow-stone-800";
            public static final String _900 = "shadow-stone-900";
            public static final String _950 = "shadow-stone-950";

            private Stone() {
            }
        }

        public static final class Red {
            public static final String _50 = "shadow-red-50";
            public static final String _100 = "shadow-red-100";
            public static final String _200 = "shadow-red-200";
            public static final String _300 = "shadow-red-300";
            public static final String _400 = "shadow-red-400";
            public static final String _500 = "shadow-red-500";
            public static final String _600 = "shadow-red-600";
            public static final String _700 = "shadow-red-700";
            public static final String _800 = "shadow-red-800";
            public static final String _900 = "shadow-red-900";
            public static final String _950 = "shadow-red-950";

            private Red() {
            }
        }

        public static final class Orange {
            public static final String _50 = "shadow-orange-50";
            public static final String _100 = "shadow-orange-100";
            public static final String _200 = "shadow-orange-200";
            public static final String _300 = "shadow-orange-300";
            public static final String _400 = "shadow-orange-400";
            public static final String _500 = "shadow-orange-500";
            public static final String _600 = "shadow-orange-600";
            public static final String _700 = "shadow-orange-700";
            public static final String _800 = "shadow-orange-800";
            public static final String _900 = "shadow-orange-900";
            public static final String _950 = "shadow-orange-950";

            private Orange() {
            }
        }

        public static final class Amber {
            public static final String _50 = "shadow-amber-50";
            public static final String _100 = "shadow-amber-100";
            public static final String _200 = "shadow-amber-200";
            public static final String _300 = "shadow-amber-300";
            public static final String _400 = "shadow-amber-400";
            public static final String _500 = "shadow-amber-500";
            public static final String _600 = "shadow-amber-600";
            public static final String _700 = "shadow-amber-700";
            public static final String _800 = "shadow-amber-800";
            public static final String _900 = "shadow-amber-900";
            public static final String _950 = "shadow-amber-950";

            private Amber() {
            }
        }

        public static final class Yellow {
            public static final String _50 = "shadow-yellow-50";
            public static final String _100 = "shadow-yellow-100";
            public static final String _200 = "shadow-yellow-200";
            public static final String _300 = "shadow-yellow-300";
            public static final String _400 = "shadow-yellow-400";
            public static final String _500 = "shadow-yellow-500";
            public static final String _600 = "shadow-yellow-600";
            public static final String _700 = "shadow-yellow-700";
            public static final String _800 = "shadow-yellow-800";
            public static final String _900 = "shadow-yellow-900";
            public static final String _950 = "shadow-yellow-950";

            private Yellow() {
            }
        }

        public static final class Lime {
            public static final String _50 = "shadow-lime-50";
            public static final String _100 = "shadow-lime-100";
            public static final String _200 = "shadow-lime-200";
            public static final String _300 = "shadow-lime-300";
            public static final String _400 = "shadow-lime-400";
            public static final String _500 = "shadow-lime-500";
            public static final String _600 = "shadow-lime-600";
            public static final String _700 = "shadow-lime-700";
            public static final String _800 = "shadow-lime-800";
            public static final String _900 = "shadow-lime-900";
            public static final String _950 = "shadow-lime-950";

            private Lime() {
            }
        }

        public static final class Green {
            public static final String _50 = "shadow-green-50";
            public static final String _100 = "shadow-green-100";
            public static final String _200 = "shadow-green-200";
            public static final String _300 = "shadow-green-300";
            public static final String _400 = "shadow-green-400";
            public static final String _500 = "shadow-green-500";
            public static final String _600 = "shadow-green-600";
            public static final String _700 = "shadow-green-700";
            public static final String _800 = "shadow-green-800";
            public static final String _900 = "shadow-green-900";
            public static final String _950 = "shadow-green-950";

            private Green() {
            }
        }

        public static final class Emerald {
            public static final String _50 = "shadow-emerald-50";
            public static final String _100 = "shadow-emerald-100";
            public static final String _200 = "shadow-emerald-200";
            public static final String _300 = "shadow-emerald-300";
            public static final String _400 = "shadow-emerald-400";
            public static final String _500 = "shadow-emerald-500";
            public static final String _600 = "shadow-emerald-600";
            public static final String _700 = "shadow-emerald-700";
            public static final String _800 = "shadow-emerald-800";
            public static final String _900 = "shadow-emerald-900";
            public static final String _950 = "shadow-emerald-950";

            private Emerald() {
            }
        }

        public static final class Teal {
            public static final String _50 = "shadow-teal-50";
            public static final String _100 = "shadow-teal-100";
            public static final String _200 = "shadow-teal-200";
            public static final String _300 = "shadow-teal-300";
            public static final String _400 = "shadow-teal-400";
            public static final String _500 = "shadow-teal-500";
            public static final String _600 = "shadow-teal-600";
            public static final String _700 = "shadow-teal-700";
            public static final String _800 = "shadow-teal-800";
            public static final String _900 = "shadow-teal-900";
            public static final String _950 = "shadow-teal-950";

            private Teal() {
            }
        }

        public static final class Cyan {
            public static final String _50 = "shadow-cyan-50";
            public static final String _100 = "shadow-cyan-100";
            public static final String _200 = "shadow-cyan-200";
            public static final String _300 = "shadow-cyan-300";
            public static final String _400 = "shadow-cyan-400";
            public static final String _500 = "shadow-cyan-500";
            public static final String _600 = "shadow-cyan-600";
            public static final String _700 = "shadow-cyan-700";
            public static final String _800 = "shadow-cyan-800";
            public static final String _900 = "shadow-cyan-900";
            public static final String _950 = "shadow-cyan-950";

            private Cyan() {
            }
        }

        public static final class Sky {
            public static final String _50 = "shadow-sky-50";
            public static final String _100 = "shadow-sky-100";
            public static final String _200 = "shadow-sky-200";
            public static final String _300 = "shadow-sky-300";
            public static final String _400 = "shadow-sky-400";
            public static final String _500 = "shadow-sky-500";
            public static final String _600 = "shadow-sky-600";
            public static final String _700 = "shadow-sky-700";
            public static final String _800 = "shadow-sky-800";
            public static final String _900 = "shadow-sky-900";
            public static final String _950 = "shadow-sky-950";

            private Sky() {
            }
        }

        public static final class Blue {
            public static final String _50 = "shadow-blue-50";
            public static final String _100 = "shadow-blue-100";
            public static final String _200 = "shadow-blue-200";
            public static final String _300 = "shadow-blue-300";
            public static final String _400 = "shadow-blue-400";
            public static final String _500 = "shadow-blue-500";
            public static final String _600 = "shadow-blue-600";
            public static final String _700 = "shadow-blue-700";
            public static final String _800 = "shadow-blue-800";
            public static final String _900 = "shadow-blue-900";
            public static final String _950 = "shadow-blue-950";

            private Blue() {
            }
        }

        public static final class Indigo {
            public static final String _50 = "shadow-indigo-50";
            public static final String _100 = "shadow-indigo-100";
            public static final String _200 = "shadow-indigo-200";
            public static final String _300 = "shadow-indigo-300";
            public static final String _400 = "shadow-indigo-400";
            public static final String _500 = "shadow-indigo-500";
            public static final String _600 = "shadow-indigo-600";
            public static final String _700 = "shadow-indigo-700";
            public static final String _800 = "shadow-indigo-800";
            public static final String _900 = "shadow-indigo-900";
            public static final String _950 = "shadow-indigo-950";

            private Indigo() {
            }
        }

        public static final class Violet {
            public static final String _50 = "shadow-violet-50";
            public static final String _100 = "shadow-violet-100";
            public static final String _200 = "shadow-violet-200";
            public static final String _300 = "shadow-violet-300";
            public static final String _400 = "shadow-violet-400";
            public static final String _500 = "shadow-violet-500";
            public static final String _600 = "shadow-violet-600";
            public static final String _700 = "shadow-violet-700";
            public static final String _800 = "shadow-violet-800";
            public static final String _900 = "shadow-violet-900";
            public static final String _950 = "shadow-violet-950";

            private Violet() {
            }
        }

        public static final class Purple {
            public static final String _50 = "shadow-purple-50";
            public static final String _100 = "shadow-purple-100";
            public static final String _200 = "shadow-purple-200";
            public static final String _300 = "shadow-purple-300";
            public static final String _400 = "shadow-purple-400";
            public static final String _500 = "shadow-purple-500";
            public static final String _600 = "shadow-purple-600";
            public static final String _700 = "shadow-purple-700";
            public static final String _800 = "shadow-purple-800";
            public static final String _900 = "shadow-purple-900";
            public static final String _950 = "shadow-purple-950";

            private Purple() {
            }
        }

        public static final class Fuchsia {
            public static final String _50 = "shadow-fuchsia-50";
            public static final String _100 = "shadow-fuchsia-100";
            public static final String _200 = "shadow-fuchsia-200";
            public static final String _300 = "shadow-fuchsia-300";
            public static final String _400 = "shadow-fuchsia-400";
            public static final String _500 = "shadow-fuchsia-500";
            public static final String _600 = "shadow-fuchsia-600";
            public static final String _700 = "shadow-fuchsia-700";
            public static final String _800 = "shadow-fuchsia-800";
            public static final String _900 = "shadow-fuchsia-900";
            public static final String _950 = "shadow-fuchsia-950";

            private Fuchsia() {
            }
        }

        public static final class Pink {
            public static final String _50 = "shadow-pink-50";
            public static final String _100 = "shadow-pink-100";
            public static final String _200 = "shadow-pink-200";
            public static final String _300 = "shadow-pink-300";
            public static final String _400 = "shadow-pink-400";
            public static final String _500 = "shadow-pink-500";
            public static final String _600 = "shadow-pink-600";
            public static final String _700 = "shadow-pink-700";
            public static final String _800 = "shadow-pink-800";
            public static final String _900 = "shadow-pink-900";
            public static final String _950 = "shadow-pink-950";

            private Pink() {
            }
        }

        public static final class Rose {
            public static final String _50 = "shadow-rose-50";
            public static final String _100 = "shadow-rose-100";
            public static final String _200 = "shadow-rose-200";
            public static final String _300 = "shadow-rose-300";
            public static final String _400 = "shadow-rose-400";
            public static final String _500 = "shadow-rose-500";
            public static final String _600 = "shadow-rose-600";
            public static final String _700 = "shadow-rose-700";
            public static final String _800 = "shadow-rose-800";
            public static final String _900 = "shadow-rose-900";
            public static final String _950 = "shadow-rose-950";

            private Rose() {
            }
        }

    }

    // -----------------------------------------------------------------------
    // TextDecorationColor
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the color of text decoration lines (underline, overline, line-through).
     */
    public static final class TextDecorationColor {

        public static final String BLACK = "decoration-black";
        public static final String WHITE = "decoration-white";
        public static final String TRANSPARENT = "decoration-transparent";
        public static final String CURRENT = "decoration-current";
        public static final String INHERIT = "decoration-inherit";

        private TextDecorationColor() {
        }

        public static final class Slate {
            public static final String _50 = "decoration-slate-50";
            public static final String _100 = "decoration-slate-100";
            public static final String _200 = "decoration-slate-200";
            public static final String _300 = "decoration-slate-300";
            public static final String _400 = "decoration-slate-400";
            public static final String _500 = "decoration-slate-500";
            public static final String _600 = "decoration-slate-600";
            public static final String _700 = "decoration-slate-700";
            public static final String _800 = "decoration-slate-800";
            public static final String _900 = "decoration-slate-900";
            public static final String _950 = "decoration-slate-950";

            private Slate() {
            }
        }

        public static final class Gray {
            public static final String _50 = "decoration-gray-50";
            public static final String _100 = "decoration-gray-100";
            public static final String _200 = "decoration-gray-200";
            public static final String _300 = "decoration-gray-300";
            public static final String _400 = "decoration-gray-400";
            public static final String _500 = "decoration-gray-500";
            public static final String _600 = "decoration-gray-600";
            public static final String _700 = "decoration-gray-700";
            public static final String _800 = "decoration-gray-800";
            public static final String _900 = "decoration-gray-900";
            public static final String _950 = "decoration-gray-950";

            private Gray() {
            }
        }

        public static final class Zinc {
            public static final String _50 = "decoration-zinc-50";
            public static final String _100 = "decoration-zinc-100";
            public static final String _200 = "decoration-zinc-200";
            public static final String _300 = "decoration-zinc-300";
            public static final String _400 = "decoration-zinc-400";
            public static final String _500 = "decoration-zinc-500";
            public static final String _600 = "decoration-zinc-600";
            public static final String _700 = "decoration-zinc-700";
            public static final String _800 = "decoration-zinc-800";
            public static final String _900 = "decoration-zinc-900";
            public static final String _950 = "decoration-zinc-950";

            private Zinc() {
            }
        }

        public static final class Neutral {
            public static final String _50 = "decoration-neutral-50";
            public static final String _100 = "decoration-neutral-100";
            public static final String _200 = "decoration-neutral-200";
            public static final String _300 = "decoration-neutral-300";
            public static final String _400 = "decoration-neutral-400";
            public static final String _500 = "decoration-neutral-500";
            public static final String _600 = "decoration-neutral-600";
            public static final String _700 = "decoration-neutral-700";
            public static final String _800 = "decoration-neutral-800";
            public static final String _900 = "decoration-neutral-900";
            public static final String _950 = "decoration-neutral-950";

            private Neutral() {
            }
        }

        public static final class Stone {
            public static final String _50 = "decoration-stone-50";
            public static final String _100 = "decoration-stone-100";
            public static final String _200 = "decoration-stone-200";
            public static final String _300 = "decoration-stone-300";
            public static final String _400 = "decoration-stone-400";
            public static final String _500 = "decoration-stone-500";
            public static final String _600 = "decoration-stone-600";
            public static final String _700 = "decoration-stone-700";
            public static final String _800 = "decoration-stone-800";
            public static final String _900 = "decoration-stone-900";
            public static final String _950 = "decoration-stone-950";

            private Stone() {
            }
        }

        public static final class Red {
            public static final String _50 = "decoration-red-50";
            public static final String _100 = "decoration-red-100";
            public static final String _200 = "decoration-red-200";
            public static final String _300 = "decoration-red-300";
            public static final String _400 = "decoration-red-400";
            public static final String _500 = "decoration-red-500";
            public static final String _600 = "decoration-red-600";
            public static final String _700 = "decoration-red-700";
            public static final String _800 = "decoration-red-800";
            public static final String _900 = "decoration-red-900";
            public static final String _950 = "decoration-red-950";

            private Red() {
            }
        }

        public static final class Orange {
            public static final String _50 = "decoration-orange-50";
            public static final String _100 = "decoration-orange-100";
            public static final String _200 = "decoration-orange-200";
            public static final String _300 = "decoration-orange-300";
            public static final String _400 = "decoration-orange-400";
            public static final String _500 = "decoration-orange-500";
            public static final String _600 = "decoration-orange-600";
            public static final String _700 = "decoration-orange-700";
            public static final String _800 = "decoration-orange-800";
            public static final String _900 = "decoration-orange-900";
            public static final String _950 = "decoration-orange-950";

            private Orange() {
            }
        }

        public static final class Amber {
            public static final String _50 = "decoration-amber-50";
            public static final String _100 = "decoration-amber-100";
            public static final String _200 = "decoration-amber-200";
            public static final String _300 = "decoration-amber-300";
            public static final String _400 = "decoration-amber-400";
            public static final String _500 = "decoration-amber-500";
            public static final String _600 = "decoration-amber-600";
            public static final String _700 = "decoration-amber-700";
            public static final String _800 = "decoration-amber-800";
            public static final String _900 = "decoration-amber-900";
            public static final String _950 = "decoration-amber-950";

            private Amber() {
            }
        }

        public static final class Yellow {
            public static final String _50 = "decoration-yellow-50";
            public static final String _100 = "decoration-yellow-100";
            public static final String _200 = "decoration-yellow-200";
            public static final String _300 = "decoration-yellow-300";
            public static final String _400 = "decoration-yellow-400";
            public static final String _500 = "decoration-yellow-500";
            public static final String _600 = "decoration-yellow-600";
            public static final String _700 = "decoration-yellow-700";
            public static final String _800 = "decoration-yellow-800";
            public static final String _900 = "decoration-yellow-900";
            public static final String _950 = "decoration-yellow-950";

            private Yellow() {
            }
        }

        public static final class Lime {
            public static final String _50 = "decoration-lime-50";
            public static final String _100 = "decoration-lime-100";
            public static final String _200 = "decoration-lime-200";
            public static final String _300 = "decoration-lime-300";
            public static final String _400 = "decoration-lime-400";
            public static final String _500 = "decoration-lime-500";
            public static final String _600 = "decoration-lime-600";
            public static final String _700 = "decoration-lime-700";
            public static final String _800 = "decoration-lime-800";
            public static final String _900 = "decoration-lime-900";
            public static final String _950 = "decoration-lime-950";

            private Lime() {
            }
        }

        public static final class Green {
            public static final String _50 = "decoration-green-50";
            public static final String _100 = "decoration-green-100";
            public static final String _200 = "decoration-green-200";
            public static final String _300 = "decoration-green-300";
            public static final String _400 = "decoration-green-400";
            public static final String _500 = "decoration-green-500";
            public static final String _600 = "decoration-green-600";
            public static final String _700 = "decoration-green-700";
            public static final String _800 = "decoration-green-800";
            public static final String _900 = "decoration-green-900";
            public static final String _950 = "decoration-green-950";

            private Green() {
            }
        }

        public static final class Emerald {
            public static final String _50 = "decoration-emerald-50";
            public static final String _100 = "decoration-emerald-100";
            public static final String _200 = "decoration-emerald-200";
            public static final String _300 = "decoration-emerald-300";
            public static final String _400 = "decoration-emerald-400";
            public static final String _500 = "decoration-emerald-500";
            public static final String _600 = "decoration-emerald-600";
            public static final String _700 = "decoration-emerald-700";
            public static final String _800 = "decoration-emerald-800";
            public static final String _900 = "decoration-emerald-900";
            public static final String _950 = "decoration-emerald-950";

            private Emerald() {
            }
        }

        public static final class Teal {
            public static final String _50 = "decoration-teal-50";
            public static final String _100 = "decoration-teal-100";
            public static final String _200 = "decoration-teal-200";
            public static final String _300 = "decoration-teal-300";
            public static final String _400 = "decoration-teal-400";
            public static final String _500 = "decoration-teal-500";
            public static final String _600 = "decoration-teal-600";
            public static final String _700 = "decoration-teal-700";
            public static final String _800 = "decoration-teal-800";
            public static final String _900 = "decoration-teal-900";
            public static final String _950 = "decoration-teal-950";

            private Teal() {
            }
        }

        public static final class Cyan {
            public static final String _50 = "decoration-cyan-50";
            public static final String _100 = "decoration-cyan-100";
            public static final String _200 = "decoration-cyan-200";
            public static final String _300 = "decoration-cyan-300";
            public static final String _400 = "decoration-cyan-400";
            public static final String _500 = "decoration-cyan-500";
            public static final String _600 = "decoration-cyan-600";
            public static final String _700 = "decoration-cyan-700";
            public static final String _800 = "decoration-cyan-800";
            public static final String _900 = "decoration-cyan-900";
            public static final String _950 = "decoration-cyan-950";

            private Cyan() {
            }
        }

        public static final class Sky {
            public static final String _50 = "decoration-sky-50";
            public static final String _100 = "decoration-sky-100";
            public static final String _200 = "decoration-sky-200";
            public static final String _300 = "decoration-sky-300";
            public static final String _400 = "decoration-sky-400";
            public static final String _500 = "decoration-sky-500";
            public static final String _600 = "decoration-sky-600";
            public static final String _700 = "decoration-sky-700";
            public static final String _800 = "decoration-sky-800";
            public static final String _900 = "decoration-sky-900";
            public static final String _950 = "decoration-sky-950";

            private Sky() {
            }
        }

        public static final class Blue {
            public static final String _50 = "decoration-blue-50";
            public static final String _100 = "decoration-blue-100";
            public static final String _200 = "decoration-blue-200";
            public static final String _300 = "decoration-blue-300";
            public static final String _400 = "decoration-blue-400";
            public static final String _500 = "decoration-blue-500";
            public static final String _600 = "decoration-blue-600";
            public static final String _700 = "decoration-blue-700";
            public static final String _800 = "decoration-blue-800";
            public static final String _900 = "decoration-blue-900";
            public static final String _950 = "decoration-blue-950";

            private Blue() {
            }
        }

        public static final class Indigo {
            public static final String _50 = "decoration-indigo-50";
            public static final String _100 = "decoration-indigo-100";
            public static final String _200 = "decoration-indigo-200";
            public static final String _300 = "decoration-indigo-300";
            public static final String _400 = "decoration-indigo-400";
            public static final String _500 = "decoration-indigo-500";
            public static final String _600 = "decoration-indigo-600";
            public static final String _700 = "decoration-indigo-700";
            public static final String _800 = "decoration-indigo-800";
            public static final String _900 = "decoration-indigo-900";
            public static final String _950 = "decoration-indigo-950";

            private Indigo() {
            }
        }

        public static final class Violet {
            public static final String _50 = "decoration-violet-50";
            public static final String _100 = "decoration-violet-100";
            public static final String _200 = "decoration-violet-200";
            public static final String _300 = "decoration-violet-300";
            public static final String _400 = "decoration-violet-400";
            public static final String _500 = "decoration-violet-500";
            public static final String _600 = "decoration-violet-600";
            public static final String _700 = "decoration-violet-700";
            public static final String _800 = "decoration-violet-800";
            public static final String _900 = "decoration-violet-900";
            public static final String _950 = "decoration-violet-950";

            private Violet() {
            }
        }

        public static final class Purple {
            public static final String _50 = "decoration-purple-50";
            public static final String _100 = "decoration-purple-100";
            public static final String _200 = "decoration-purple-200";
            public static final String _300 = "decoration-purple-300";
            public static final String _400 = "decoration-purple-400";
            public static final String _500 = "decoration-purple-500";
            public static final String _600 = "decoration-purple-600";
            public static final String _700 = "decoration-purple-700";
            public static final String _800 = "decoration-purple-800";
            public static final String _900 = "decoration-purple-900";
            public static final String _950 = "decoration-purple-950";

            private Purple() {
            }
        }

        public static final class Fuchsia {
            public static final String _50 = "decoration-fuchsia-50";
            public static final String _100 = "decoration-fuchsia-100";
            public static final String _200 = "decoration-fuchsia-200";
            public static final String _300 = "decoration-fuchsia-300";
            public static final String _400 = "decoration-fuchsia-400";
            public static final String _500 = "decoration-fuchsia-500";
            public static final String _600 = "decoration-fuchsia-600";
            public static final String _700 = "decoration-fuchsia-700";
            public static final String _800 = "decoration-fuchsia-800";
            public static final String _900 = "decoration-fuchsia-900";
            public static final String _950 = "decoration-fuchsia-950";

            private Fuchsia() {
            }
        }

        public static final class Pink {
            public static final String _50 = "decoration-pink-50";
            public static final String _100 = "decoration-pink-100";
            public static final String _200 = "decoration-pink-200";
            public static final String _300 = "decoration-pink-300";
            public static final String _400 = "decoration-pink-400";
            public static final String _500 = "decoration-pink-500";
            public static final String _600 = "decoration-pink-600";
            public static final String _700 = "decoration-pink-700";
            public static final String _800 = "decoration-pink-800";
            public static final String _900 = "decoration-pink-900";
            public static final String _950 = "decoration-pink-950";

            private Pink() {
            }
        }

        public static final class Rose {
            public static final String _50 = "decoration-rose-50";
            public static final String _100 = "decoration-rose-100";
            public static final String _200 = "decoration-rose-200";
            public static final String _300 = "decoration-rose-300";
            public static final String _400 = "decoration-rose-400";
            public static final String _500 = "decoration-rose-500";
            public static final String _600 = "decoration-rose-600";
            public static final String _700 = "decoration-rose-700";
            public static final String _800 = "decoration-rose-800";
            public static final String _900 = "decoration-rose-900";
            public static final String _950 = "decoration-rose-950";

            private Rose() {
            }
        }

    }

    // -----------------------------------------------------------------------
    // FillColor
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the fill color of SVG elements.
     */
    public static final class FillColor {

        public static final String BLACK = "fill-black";
        public static final String WHITE = "fill-white";
        public static final String TRANSPARENT = "fill-transparent";
        public static final String CURRENT = "fill-current";
        public static final String INHERIT = "fill-inherit";

        private FillColor() {
        }

        public static final class Slate {
            public static final String _50 = "fill-slate-50";
            public static final String _100 = "fill-slate-100";
            public static final String _200 = "fill-slate-200";
            public static final String _300 = "fill-slate-300";
            public static final String _400 = "fill-slate-400";
            public static final String _500 = "fill-slate-500";
            public static final String _600 = "fill-slate-600";
            public static final String _700 = "fill-slate-700";
            public static final String _800 = "fill-slate-800";
            public static final String _900 = "fill-slate-900";
            public static final String _950 = "fill-slate-950";

            private Slate() {
            }
        }

        public static final class Gray {
            public static final String _50 = "fill-gray-50";
            public static final String _100 = "fill-gray-100";
            public static final String _200 = "fill-gray-200";
            public static final String _300 = "fill-gray-300";
            public static final String _400 = "fill-gray-400";
            public static final String _500 = "fill-gray-500";
            public static final String _600 = "fill-gray-600";
            public static final String _700 = "fill-gray-700";
            public static final String _800 = "fill-gray-800";
            public static final String _900 = "fill-gray-900";
            public static final String _950 = "fill-gray-950";

            private Gray() {
            }
        }

        public static final class Zinc {
            public static final String _50 = "fill-zinc-50";
            public static final String _100 = "fill-zinc-100";
            public static final String _200 = "fill-zinc-200";
            public static final String _300 = "fill-zinc-300";
            public static final String _400 = "fill-zinc-400";
            public static final String _500 = "fill-zinc-500";
            public static final String _600 = "fill-zinc-600";
            public static final String _700 = "fill-zinc-700";
            public static final String _800 = "fill-zinc-800";
            public static final String _900 = "fill-zinc-900";
            public static final String _950 = "fill-zinc-950";

            private Zinc() {
            }
        }

        public static final class Neutral {
            public static final String _50 = "fill-neutral-50";
            public static final String _100 = "fill-neutral-100";
            public static final String _200 = "fill-neutral-200";
            public static final String _300 = "fill-neutral-300";
            public static final String _400 = "fill-neutral-400";
            public static final String _500 = "fill-neutral-500";
            public static final String _600 = "fill-neutral-600";
            public static final String _700 = "fill-neutral-700";
            public static final String _800 = "fill-neutral-800";
            public static final String _900 = "fill-neutral-900";
            public static final String _950 = "fill-neutral-950";

            private Neutral() {
            }
        }

        public static final class Stone {
            public static final String _50 = "fill-stone-50";
            public static final String _100 = "fill-stone-100";
            public static final String _200 = "fill-stone-200";
            public static final String _300 = "fill-stone-300";
            public static final String _400 = "fill-stone-400";
            public static final String _500 = "fill-stone-500";
            public static final String _600 = "fill-stone-600";
            public static final String _700 = "fill-stone-700";
            public static final String _800 = "fill-stone-800";
            public static final String _900 = "fill-stone-900";
            public static final String _950 = "fill-stone-950";

            private Stone() {
            }
        }

        public static final class Red {
            public static final String _50 = "fill-red-50";
            public static final String _100 = "fill-red-100";
            public static final String _200 = "fill-red-200";
            public static final String _300 = "fill-red-300";
            public static final String _400 = "fill-red-400";
            public static final String _500 = "fill-red-500";
            public static final String _600 = "fill-red-600";
            public static final String _700 = "fill-red-700";
            public static final String _800 = "fill-red-800";
            public static final String _900 = "fill-red-900";
            public static final String _950 = "fill-red-950";

            private Red() {
            }
        }

        public static final class Orange {
            public static final String _50 = "fill-orange-50";
            public static final String _100 = "fill-orange-100";
            public static final String _200 = "fill-orange-200";
            public static final String _300 = "fill-orange-300";
            public static final String _400 = "fill-orange-400";
            public static final String _500 = "fill-orange-500";
            public static final String _600 = "fill-orange-600";
            public static final String _700 = "fill-orange-700";
            public static final String _800 = "fill-orange-800";
            public static final String _900 = "fill-orange-900";
            public static final String _950 = "fill-orange-950";

            private Orange() {
            }
        }

        public static final class Amber {
            public static final String _50 = "fill-amber-50";
            public static final String _100 = "fill-amber-100";
            public static final String _200 = "fill-amber-200";
            public static final String _300 = "fill-amber-300";
            public static final String _400 = "fill-amber-400";
            public static final String _500 = "fill-amber-500";
            public static final String _600 = "fill-amber-600";
            public static final String _700 = "fill-amber-700";
            public static final String _800 = "fill-amber-800";
            public static final String _900 = "fill-amber-900";
            public static final String _950 = "fill-amber-950";

            private Amber() {
            }
        }

        public static final class Yellow {
            public static final String _50 = "fill-yellow-50";
            public static final String _100 = "fill-yellow-100";
            public static final String _200 = "fill-yellow-200";
            public static final String _300 = "fill-yellow-300";
            public static final String _400 = "fill-yellow-400";
            public static final String _500 = "fill-yellow-500";
            public static final String _600 = "fill-yellow-600";
            public static final String _700 = "fill-yellow-700";
            public static final String _800 = "fill-yellow-800";
            public static final String _900 = "fill-yellow-900";
            public static final String _950 = "fill-yellow-950";

            private Yellow() {
            }
        }

        public static final class Lime {
            public static final String _50 = "fill-lime-50";
            public static final String _100 = "fill-lime-100";
            public static final String _200 = "fill-lime-200";
            public static final String _300 = "fill-lime-300";
            public static final String _400 = "fill-lime-400";
            public static final String _500 = "fill-lime-500";
            public static final String _600 = "fill-lime-600";
            public static final String _700 = "fill-lime-700";
            public static final String _800 = "fill-lime-800";
            public static final String _900 = "fill-lime-900";
            public static final String _950 = "fill-lime-950";

            private Lime() {
            }
        }

        public static final class Green {
            public static final String _50 = "fill-green-50";
            public static final String _100 = "fill-green-100";
            public static final String _200 = "fill-green-200";
            public static final String _300 = "fill-green-300";
            public static final String _400 = "fill-green-400";
            public static final String _500 = "fill-green-500";
            public static final String _600 = "fill-green-600";
            public static final String _700 = "fill-green-700";
            public static final String _800 = "fill-green-800";
            public static final String _900 = "fill-green-900";
            public static final String _950 = "fill-green-950";

            private Green() {
            }
        }

        public static final class Emerald {
            public static final String _50 = "fill-emerald-50";
            public static final String _100 = "fill-emerald-100";
            public static final String _200 = "fill-emerald-200";
            public static final String _300 = "fill-emerald-300";
            public static final String _400 = "fill-emerald-400";
            public static final String _500 = "fill-emerald-500";
            public static final String _600 = "fill-emerald-600";
            public static final String _700 = "fill-emerald-700";
            public static final String _800 = "fill-emerald-800";
            public static final String _900 = "fill-emerald-900";
            public static final String _950 = "fill-emerald-950";

            private Emerald() {
            }
        }

        public static final class Teal {
            public static final String _50 = "fill-teal-50";
            public static final String _100 = "fill-teal-100";
            public static final String _200 = "fill-teal-200";
            public static final String _300 = "fill-teal-300";
            public static final String _400 = "fill-teal-400";
            public static final String _500 = "fill-teal-500";
            public static final String _600 = "fill-teal-600";
            public static final String _700 = "fill-teal-700";
            public static final String _800 = "fill-teal-800";
            public static final String _900 = "fill-teal-900";
            public static final String _950 = "fill-teal-950";

            private Teal() {
            }
        }

        public static final class Cyan {
            public static final String _50 = "fill-cyan-50";
            public static final String _100 = "fill-cyan-100";
            public static final String _200 = "fill-cyan-200";
            public static final String _300 = "fill-cyan-300";
            public static final String _400 = "fill-cyan-400";
            public static final String _500 = "fill-cyan-500";
            public static final String _600 = "fill-cyan-600";
            public static final String _700 = "fill-cyan-700";
            public static final String _800 = "fill-cyan-800";
            public static final String _900 = "fill-cyan-900";
            public static final String _950 = "fill-cyan-950";

            private Cyan() {
            }
        }

        public static final class Sky {
            public static final String _50 = "fill-sky-50";
            public static final String _100 = "fill-sky-100";
            public static final String _200 = "fill-sky-200";
            public static final String _300 = "fill-sky-300";
            public static final String _400 = "fill-sky-400";
            public static final String _500 = "fill-sky-500";
            public static final String _600 = "fill-sky-600";
            public static final String _700 = "fill-sky-700";
            public static final String _800 = "fill-sky-800";
            public static final String _900 = "fill-sky-900";
            public static final String _950 = "fill-sky-950";

            private Sky() {
            }
        }

        public static final class Blue {
            public static final String _50 = "fill-blue-50";
            public static final String _100 = "fill-blue-100";
            public static final String _200 = "fill-blue-200";
            public static final String _300 = "fill-blue-300";
            public static final String _400 = "fill-blue-400";
            public static final String _500 = "fill-blue-500";
            public static final String _600 = "fill-blue-600";
            public static final String _700 = "fill-blue-700";
            public static final String _800 = "fill-blue-800";
            public static final String _900 = "fill-blue-900";
            public static final String _950 = "fill-blue-950";

            private Blue() {
            }
        }

        public static final class Indigo {
            public static final String _50 = "fill-indigo-50";
            public static final String _100 = "fill-indigo-100";
            public static final String _200 = "fill-indigo-200";
            public static final String _300 = "fill-indigo-300";
            public static final String _400 = "fill-indigo-400";
            public static final String _500 = "fill-indigo-500";
            public static final String _600 = "fill-indigo-600";
            public static final String _700 = "fill-indigo-700";
            public static final String _800 = "fill-indigo-800";
            public static final String _900 = "fill-indigo-900";
            public static final String _950 = "fill-indigo-950";

            private Indigo() {
            }
        }

        public static final class Violet {
            public static final String _50 = "fill-violet-50";
            public static final String _100 = "fill-violet-100";
            public static final String _200 = "fill-violet-200";
            public static final String _300 = "fill-violet-300";
            public static final String _400 = "fill-violet-400";
            public static final String _500 = "fill-violet-500";
            public static final String _600 = "fill-violet-600";
            public static final String _700 = "fill-violet-700";
            public static final String _800 = "fill-violet-800";
            public static final String _900 = "fill-violet-900";
            public static final String _950 = "fill-violet-950";

            private Violet() {
            }
        }

        public static final class Purple {
            public static final String _50 = "fill-purple-50";
            public static final String _100 = "fill-purple-100";
            public static final String _200 = "fill-purple-200";
            public static final String _300 = "fill-purple-300";
            public static final String _400 = "fill-purple-400";
            public static final String _500 = "fill-purple-500";
            public static final String _600 = "fill-purple-600";
            public static final String _700 = "fill-purple-700";
            public static final String _800 = "fill-purple-800";
            public static final String _900 = "fill-purple-900";
            public static final String _950 = "fill-purple-950";

            private Purple() {
            }
        }

        public static final class Fuchsia {
            public static final String _50 = "fill-fuchsia-50";
            public static final String _100 = "fill-fuchsia-100";
            public static final String _200 = "fill-fuchsia-200";
            public static final String _300 = "fill-fuchsia-300";
            public static final String _400 = "fill-fuchsia-400";
            public static final String _500 = "fill-fuchsia-500";
            public static final String _600 = "fill-fuchsia-600";
            public static final String _700 = "fill-fuchsia-700";
            public static final String _800 = "fill-fuchsia-800";
            public static final String _900 = "fill-fuchsia-900";
            public static final String _950 = "fill-fuchsia-950";

            private Fuchsia() {
            }
        }

        public static final class Pink {
            public static final String _50 = "fill-pink-50";
            public static final String _100 = "fill-pink-100";
            public static final String _200 = "fill-pink-200";
            public static final String _300 = "fill-pink-300";
            public static final String _400 = "fill-pink-400";
            public static final String _500 = "fill-pink-500";
            public static final String _600 = "fill-pink-600";
            public static final String _700 = "fill-pink-700";
            public static final String _800 = "fill-pink-800";
            public static final String _900 = "fill-pink-900";
            public static final String _950 = "fill-pink-950";

            private Pink() {
            }
        }

        public static final class Rose {
            public static final String _50 = "fill-rose-50";
            public static final String _100 = "fill-rose-100";
            public static final String _200 = "fill-rose-200";
            public static final String _300 = "fill-rose-300";
            public static final String _400 = "fill-rose-400";
            public static final String _500 = "fill-rose-500";
            public static final String _600 = "fill-rose-600";
            public static final String _700 = "fill-rose-700";
            public static final String _800 = "fill-rose-800";
            public static final String _900 = "fill-rose-900";
            public static final String _950 = "fill-rose-950";

            private Rose() {
            }
        }

    }

    // -----------------------------------------------------------------------
    // StrokeColor
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the stroke color of SVG elements.
     */
    public static final class StrokeColor {

        public static final String BLACK = "stroke-black";
        public static final String WHITE = "stroke-white";
        public static final String TRANSPARENT = "stroke-transparent";
        public static final String CURRENT = "stroke-current";
        public static final String INHERIT = "stroke-inherit";

        private StrokeColor() {
        }

        public static final class Slate {
            public static final String _50 = "stroke-slate-50";
            public static final String _100 = "stroke-slate-100";
            public static final String _200 = "stroke-slate-200";
            public static final String _300 = "stroke-slate-300";
            public static final String _400 = "stroke-slate-400";
            public static final String _500 = "stroke-slate-500";
            public static final String _600 = "stroke-slate-600";
            public static final String _700 = "stroke-slate-700";
            public static final String _800 = "stroke-slate-800";
            public static final String _900 = "stroke-slate-900";
            public static final String _950 = "stroke-slate-950";

            private Slate() {
            }
        }

        public static final class Gray {
            public static final String _50 = "stroke-gray-50";
            public static final String _100 = "stroke-gray-100";
            public static final String _200 = "stroke-gray-200";
            public static final String _300 = "stroke-gray-300";
            public static final String _400 = "stroke-gray-400";
            public static final String _500 = "stroke-gray-500";
            public static final String _600 = "stroke-gray-600";
            public static final String _700 = "stroke-gray-700";
            public static final String _800 = "stroke-gray-800";
            public static final String _900 = "stroke-gray-900";
            public static final String _950 = "stroke-gray-950";

            private Gray() {
            }
        }

        public static final class Zinc {
            public static final String _50 = "stroke-zinc-50";
            public static final String _100 = "stroke-zinc-100";
            public static final String _200 = "stroke-zinc-200";
            public static final String _300 = "stroke-zinc-300";
            public static final String _400 = "stroke-zinc-400";
            public static final String _500 = "stroke-zinc-500";
            public static final String _600 = "stroke-zinc-600";
            public static final String _700 = "stroke-zinc-700";
            public static final String _800 = "stroke-zinc-800";
            public static final String _900 = "stroke-zinc-900";
            public static final String _950 = "stroke-zinc-950";

            private Zinc() {
            }
        }

        public static final class Neutral {
            public static final String _50 = "stroke-neutral-50";
            public static final String _100 = "stroke-neutral-100";
            public static final String _200 = "stroke-neutral-200";
            public static final String _300 = "stroke-neutral-300";
            public static final String _400 = "stroke-neutral-400";
            public static final String _500 = "stroke-neutral-500";
            public static final String _600 = "stroke-neutral-600";
            public static final String _700 = "stroke-neutral-700";
            public static final String _800 = "stroke-neutral-800";
            public static final String _900 = "stroke-neutral-900";
            public static final String _950 = "stroke-neutral-950";

            private Neutral() {
            }
        }

        public static final class Stone {
            public static final String _50 = "stroke-stone-50";
            public static final String _100 = "stroke-stone-100";
            public static final String _200 = "stroke-stone-200";
            public static final String _300 = "stroke-stone-300";
            public static final String _400 = "stroke-stone-400";
            public static final String _500 = "stroke-stone-500";
            public static final String _600 = "stroke-stone-600";
            public static final String _700 = "stroke-stone-700";
            public static final String _800 = "stroke-stone-800";
            public static final String _900 = "stroke-stone-900";
            public static final String _950 = "stroke-stone-950";

            private Stone() {
            }
        }

        public static final class Red {
            public static final String _50 = "stroke-red-50";
            public static final String _100 = "stroke-red-100";
            public static final String _200 = "stroke-red-200";
            public static final String _300 = "stroke-red-300";
            public static final String _400 = "stroke-red-400";
            public static final String _500 = "stroke-red-500";
            public static final String _600 = "stroke-red-600";
            public static final String _700 = "stroke-red-700";
            public static final String _800 = "stroke-red-800";
            public static final String _900 = "stroke-red-900";
            public static final String _950 = "stroke-red-950";

            private Red() {
            }
        }

        public static final class Orange {
            public static final String _50 = "stroke-orange-50";
            public static final String _100 = "stroke-orange-100";
            public static final String _200 = "stroke-orange-200";
            public static final String _300 = "stroke-orange-300";
            public static final String _400 = "stroke-orange-400";
            public static final String _500 = "stroke-orange-500";
            public static final String _600 = "stroke-orange-600";
            public static final String _700 = "stroke-orange-700";
            public static final String _800 = "stroke-orange-800";
            public static final String _900 = "stroke-orange-900";
            public static final String _950 = "stroke-orange-950";

            private Orange() {
            }
        }

        public static final class Amber {
            public static final String _50 = "stroke-amber-50";
            public static final String _100 = "stroke-amber-100";
            public static final String _200 = "stroke-amber-200";
            public static final String _300 = "stroke-amber-300";
            public static final String _400 = "stroke-amber-400";
            public static final String _500 = "stroke-amber-500";
            public static final String _600 = "stroke-amber-600";
            public static final String _700 = "stroke-amber-700";
            public static final String _800 = "stroke-amber-800";
            public static final String _900 = "stroke-amber-900";
            public static final String _950 = "stroke-amber-950";

            private Amber() {
            }
        }

        public static final class Yellow {
            public static final String _50 = "stroke-yellow-50";
            public static final String _100 = "stroke-yellow-100";
            public static final String _200 = "stroke-yellow-200";
            public static final String _300 = "stroke-yellow-300";
            public static final String _400 = "stroke-yellow-400";
            public static final String _500 = "stroke-yellow-500";
            public static final String _600 = "stroke-yellow-600";
            public static final String _700 = "stroke-yellow-700";
            public static final String _800 = "stroke-yellow-800";
            public static final String _900 = "stroke-yellow-900";
            public static final String _950 = "stroke-yellow-950";

            private Yellow() {
            }
        }

        public static final class Lime {
            public static final String _50 = "stroke-lime-50";
            public static final String _100 = "stroke-lime-100";
            public static final String _200 = "stroke-lime-200";
            public static final String _300 = "stroke-lime-300";
            public static final String _400 = "stroke-lime-400";
            public static final String _500 = "stroke-lime-500";
            public static final String _600 = "stroke-lime-600";
            public static final String _700 = "stroke-lime-700";
            public static final String _800 = "stroke-lime-800";
            public static final String _900 = "stroke-lime-900";
            public static final String _950 = "stroke-lime-950";

            private Lime() {
            }
        }

        public static final class Green {
            public static final String _50 = "stroke-green-50";
            public static final String _100 = "stroke-green-100";
            public static final String _200 = "stroke-green-200";
            public static final String _300 = "stroke-green-300";
            public static final String _400 = "stroke-green-400";
            public static final String _500 = "stroke-green-500";
            public static final String _600 = "stroke-green-600";
            public static final String _700 = "stroke-green-700";
            public static final String _800 = "stroke-green-800";
            public static final String _900 = "stroke-green-900";
            public static final String _950 = "stroke-green-950";

            private Green() {
            }
        }

        public static final class Emerald {
            public static final String _50 = "stroke-emerald-50";
            public static final String _100 = "stroke-emerald-100";
            public static final String _200 = "stroke-emerald-200";
            public static final String _300 = "stroke-emerald-300";
            public static final String _400 = "stroke-emerald-400";
            public static final String _500 = "stroke-emerald-500";
            public static final String _600 = "stroke-emerald-600";
            public static final String _700 = "stroke-emerald-700";
            public static final String _800 = "stroke-emerald-800";
            public static final String _900 = "stroke-emerald-900";
            public static final String _950 = "stroke-emerald-950";

            private Emerald() {
            }
        }

        public static final class Teal {
            public static final String _50 = "stroke-teal-50";
            public static final String _100 = "stroke-teal-100";
            public static final String _200 = "stroke-teal-200";
            public static final String _300 = "stroke-teal-300";
            public static final String _400 = "stroke-teal-400";
            public static final String _500 = "stroke-teal-500";
            public static final String _600 = "stroke-teal-600";
            public static final String _700 = "stroke-teal-700";
            public static final String _800 = "stroke-teal-800";
            public static final String _900 = "stroke-teal-900";
            public static final String _950 = "stroke-teal-950";

            private Teal() {
            }
        }

        public static final class Cyan {
            public static final String _50 = "stroke-cyan-50";
            public static final String _100 = "stroke-cyan-100";
            public static final String _200 = "stroke-cyan-200";
            public static final String _300 = "stroke-cyan-300";
            public static final String _400 = "stroke-cyan-400";
            public static final String _500 = "stroke-cyan-500";
            public static final String _600 = "stroke-cyan-600";
            public static final String _700 = "stroke-cyan-700";
            public static final String _800 = "stroke-cyan-800";
            public static final String _900 = "stroke-cyan-900";
            public static final String _950 = "stroke-cyan-950";

            private Cyan() {
            }
        }

        public static final class Sky {
            public static final String _50 = "stroke-sky-50";
            public static final String _100 = "stroke-sky-100";
            public static final String _200 = "stroke-sky-200";
            public static final String _300 = "stroke-sky-300";
            public static final String _400 = "stroke-sky-400";
            public static final String _500 = "stroke-sky-500";
            public static final String _600 = "stroke-sky-600";
            public static final String _700 = "stroke-sky-700";
            public static final String _800 = "stroke-sky-800";
            public static final String _900 = "stroke-sky-900";
            public static final String _950 = "stroke-sky-950";

            private Sky() {
            }
        }

        public static final class Blue {
            public static final String _50 = "stroke-blue-50";
            public static final String _100 = "stroke-blue-100";
            public static final String _200 = "stroke-blue-200";
            public static final String _300 = "stroke-blue-300";
            public static final String _400 = "stroke-blue-400";
            public static final String _500 = "stroke-blue-500";
            public static final String _600 = "stroke-blue-600";
            public static final String _700 = "stroke-blue-700";
            public static final String _800 = "stroke-blue-800";
            public static final String _900 = "stroke-blue-900";
            public static final String _950 = "stroke-blue-950";

            private Blue() {
            }
        }

        public static final class Indigo {
            public static final String _50 = "stroke-indigo-50";
            public static final String _100 = "stroke-indigo-100";
            public static final String _200 = "stroke-indigo-200";
            public static final String _300 = "stroke-indigo-300";
            public static final String _400 = "stroke-indigo-400";
            public static final String _500 = "stroke-indigo-500";
            public static final String _600 = "stroke-indigo-600";
            public static final String _700 = "stroke-indigo-700";
            public static final String _800 = "stroke-indigo-800";
            public static final String _900 = "stroke-indigo-900";
            public static final String _950 = "stroke-indigo-950";

            private Indigo() {
            }
        }

        public static final class Violet {
            public static final String _50 = "stroke-violet-50";
            public static final String _100 = "stroke-violet-100";
            public static final String _200 = "stroke-violet-200";
            public static final String _300 = "stroke-violet-300";
            public static final String _400 = "stroke-violet-400";
            public static final String _500 = "stroke-violet-500";
            public static final String _600 = "stroke-violet-600";
            public static final String _700 = "stroke-violet-700";
            public static final String _800 = "stroke-violet-800";
            public static final String _900 = "stroke-violet-900";
            public static final String _950 = "stroke-violet-950";

            private Violet() {
            }
        }

        public static final class Purple {
            public static final String _50 = "stroke-purple-50";
            public static final String _100 = "stroke-purple-100";
            public static final String _200 = "stroke-purple-200";
            public static final String _300 = "stroke-purple-300";
            public static final String _400 = "stroke-purple-400";
            public static final String _500 = "stroke-purple-500";
            public static final String _600 = "stroke-purple-600";
            public static final String _700 = "stroke-purple-700";
            public static final String _800 = "stroke-purple-800";
            public static final String _900 = "stroke-purple-900";
            public static final String _950 = "stroke-purple-950";

            private Purple() {
            }
        }

        public static final class Fuchsia {
            public static final String _50 = "stroke-fuchsia-50";
            public static final String _100 = "stroke-fuchsia-100";
            public static final String _200 = "stroke-fuchsia-200";
            public static final String _300 = "stroke-fuchsia-300";
            public static final String _400 = "stroke-fuchsia-400";
            public static final String _500 = "stroke-fuchsia-500";
            public static final String _600 = "stroke-fuchsia-600";
            public static final String _700 = "stroke-fuchsia-700";
            public static final String _800 = "stroke-fuchsia-800";
            public static final String _900 = "stroke-fuchsia-900";
            public static final String _950 = "stroke-fuchsia-950";

            private Fuchsia() {
            }
        }

        public static final class Pink {
            public static final String _50 = "stroke-pink-50";
            public static final String _100 = "stroke-pink-100";
            public static final String _200 = "stroke-pink-200";
            public static final String _300 = "stroke-pink-300";
            public static final String _400 = "stroke-pink-400";
            public static final String _500 = "stroke-pink-500";
            public static final String _600 = "stroke-pink-600";
            public static final String _700 = "stroke-pink-700";
            public static final String _800 = "stroke-pink-800";
            public static final String _900 = "stroke-pink-900";
            public static final String _950 = "stroke-pink-950";

            private Pink() {
            }
        }

        public static final class Rose {
            public static final String _50 = "stroke-rose-50";
            public static final String _100 = "stroke-rose-100";
            public static final String _200 = "stroke-rose-200";
            public static final String _300 = "stroke-rose-300";
            public static final String _400 = "stroke-rose-400";
            public static final String _500 = "stroke-rose-500";
            public static final String _600 = "stroke-rose-600";
            public static final String _700 = "stroke-rose-700";
            public static final String _800 = "stroke-rose-800";
            public static final String _900 = "stroke-rose-900";
            public static final String _950 = "stroke-rose-950";

            private Rose() {
            }
        }

    }

    // -----------------------------------------------------------------------
    // StrokeWidth
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the stroke width of SVG elements.
     */
    public static final class StrokeWidth {

        public static final String NONE = "stroke-0";
        public static final String SMALL = "stroke-1";
        public static final String MEDIUM = "stroke-2";

        private StrokeWidth() {
        }
    }

    // -----------------------------------------------------------------------
    // Direction
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the reading direction of an element.
     * These classes are typically used on a wrapping element to provide RTL or LTR
     * layout support; combine with {@link TailwindVariant#ltr(String)} and
     * {@link TailwindVariant#rtl(String)} for conditional directional styling.
     */
    public static final class Direction {

        public static final String LTR = "ltr";
        public static final String RTL = "rtl";

        private Direction() {
        }
    }

    // -----------------------------------------------------------------------
    // Content
    // -----------------------------------------------------------------------

    /**
     * Classes for setting the content of the CSS {@code content} property.
     * Only the static value {@code content-none} is enumerable; arbitrary string
     * content requires bracket syntax and {@link TailwindVariant#before(String)}.
     */
    public static final class Content {

        public static final String NONE = "content-none";

        private Content() {
        }
    }

    // -----------------------------------------------------------------------
    // Divide
    // -----------------------------------------------------------------------

    /**
     * Classes for adding borders between child elements using the CSS sibling
     * selector.  Covers width, style, and color sub-utilities; the color palette
     * mirrors that of {@link BorderColor}.
     */
    public static final class Divide {

        public static final String SOLID = "divide-solid";
        public static final String DASHED = "divide-dashed";
        public static final String DOTTED = "divide-dotted";
        public static final String DOUBLE = "divide-double";
        public static final String NONE = "divide-none";

        private Divide() {
        }

        /**
         * Horizontal dividers (between rows).
         */
        public static final class X {

            public static final String NONE = "divide-x-0";
            public static final String DEFAULT = "divide-x";
            public static final String XSMALL = "divide-x-2";
            public static final String SMALL = "divide-x-4";
            public static final String MEDIUM = "divide-x-8";
            public static final String REVERSE = "divide-x-reverse";

            private X() {
            }
        }

        /**
         * Vertical dividers (between columns).
         */
        public static final class Y {

            public static final String NONE = "divide-y-0";
            public static final String DEFAULT = "divide-y";
            public static final String XSMALL = "divide-y-2";
            public static final String SMALL = "divide-y-4";
            public static final String MEDIUM = "divide-y-8";
            public static final String REVERSE = "divide-y-reverse";

            private Y() {
            }
        }

        /** Divider color utilities — mirrors the standard Tailwind color palette. */
        public static final class Color {

            public static final String BLACK = "divide-black";
            public static final String WHITE = "divide-white";
            public static final String TRANSPARENT = "divide-transparent";
            public static final String CURRENT = "divide-current";
            public static final String INHERIT = "divide-inherit";

            private Color() {
            }

            public static final class Slate {
                public static final String _50 = "divide-slate-50"; public static final String _100 = "divide-slate-100"; public static final String _200 = "divide-slate-200"; public static final String _300 = "divide-slate-300"; public static final String _400 = "divide-slate-400"; public static final String _500 = "divide-slate-500"; public static final String _600 = "divide-slate-600"; public static final String _700 = "divide-slate-700"; public static final String _800 = "divide-slate-800"; public static final String _900 = "divide-slate-900"; public static final String _950 = "divide-slate-950";
                private Slate() {}
            }
            public static final class Gray {
                public static final String _50 = "divide-gray-50"; public static final String _100 = "divide-gray-100"; public static final String _200 = "divide-gray-200"; public static final String _300 = "divide-gray-300"; public static final String _400 = "divide-gray-400"; public static final String _500 = "divide-gray-500"; public static final String _600 = "divide-gray-600"; public static final String _700 = "divide-gray-700"; public static final String _800 = "divide-gray-800"; public static final String _900 = "divide-gray-900"; public static final String _950 = "divide-gray-950";
                private Gray() {}
            }
            public static final class Red {
                public static final String _50 = "divide-red-50"; public static final String _100 = "divide-red-100"; public static final String _200 = "divide-red-200"; public static final String _300 = "divide-red-300"; public static final String _400 = "divide-red-400"; public static final String _500 = "divide-red-500"; public static final String _600 = "divide-red-600"; public static final String _700 = "divide-red-700"; public static final String _800 = "divide-red-800"; public static final String _900 = "divide-red-900"; public static final String _950 = "divide-red-950";
                private Red() {}
            }
            public static final class Blue {
                public static final String _50 = "divide-blue-50"; public static final String _100 = "divide-blue-100"; public static final String _200 = "divide-blue-200"; public static final String _300 = "divide-blue-300"; public static final String _400 = "divide-blue-400"; public static final String _500 = "divide-blue-500"; public static final String _600 = "divide-blue-600"; public static final String _700 = "divide-blue-700"; public static final String _800 = "divide-blue-800"; public static final String _900 = "divide-blue-900"; public static final String _950 = "divide-blue-950";
                private Blue() {}
            }
            public static final class Green {
                public static final String _50 = "divide-green-50"; public static final String _100 = "divide-green-100"; public static final String _200 = "divide-green-200"; public static final String _300 = "divide-green-300"; public static final String _400 = "divide-green-400"; public static final String _500 = "divide-green-500"; public static final String _600 = "divide-green-600"; public static final String _700 = "divide-green-700"; public static final String _800 = "divide-green-800"; public static final String _900 = "divide-green-900"; public static final String _950 = "divide-green-950";
                private Green() {}
            }
        }
    }

    // -----------------------------------------------------------------------
    // SpaceBetween
    // -----------------------------------------------------------------------

    /**
     * Classes for controlling the space between child elements.
     * For flex/grid containers, prefer {@link Gap} over {@code SpaceBetween}.
     */
    public static final class SpaceBetween {

        private SpaceBetween() {
        }

        /**
         * Horizontal space between children.
         */
        public static final class X {

            public static final String NONE = "space-x-0";
            public static final String XSMALL = "space-x-1";
            public static final String SMALL = "space-x-2";
            public static final String MEDIUM = "space-x-4";
            public static final String LARGE = "space-x-6";
            public static final String XLARGE = "space-x-8";
            public static final String XXLARGE = "space-x-12";
            public static final String XXXLARGE = "space-x-16";
            public static final String REVERSE = "space-x-reverse";

            private X() {
            }
        }

        /**
         * Vertical space between children.
         */
        public static final class Y {

            public static final String NONE = "space-y-0";
            public static final String XSMALL = "space-y-1";
            public static final String SMALL = "space-y-2";
            public static final String MEDIUM = "space-y-4";
            public static final String LARGE = "space-y-6";
            public static final String XLARGE = "space-y-8";
            public static final String XXLARGE = "space-y-12";
            public static final String XXXLARGE = "space-y-16";
            public static final String REVERSE = "space-y-reverse";

            private Y() {
            }
        }
    }

}
