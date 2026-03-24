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
