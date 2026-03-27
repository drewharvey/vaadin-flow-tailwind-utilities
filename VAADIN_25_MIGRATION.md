# Vaadin 25 Compatibility Migration Guide

This document outlines the changes needed to make `vaadin-flow-tailwind-utilities`
compatible with Vaadin 25.

---

## Summary of Required Changes

| Area | Current | Required for Vaadin 25 |
|---|---|---|
| Java version | 17 | 21+ |
| Vaadin compatibility | 24+ | 25+ |
| Tailwind CSS version | v3 | v4 |
| Feature flag key | `com.vaadin.experimental.tailwindCss` | No change — flag is still required in Vaadin 25 |
| README requirements | Java 17+, Vaadin 24+ | Java 21+, Vaadin 25+ |

---

## 1. Java Version Upgrade (Required)

Vaadin 25 mandates **Java 21** as the minimum supported version. The current
project targets Java 17.

**Changes needed in `pom.xml`:**

```xml
<properties>
    <java.version>21</java.version>
    <maven.compiler.source>21</maven.compiler.source>
    <maven.compiler.target>21</maven.compiler.target>
    ...
</properties>
```

**Impact on source code:** The library's Java source (`TailwindUtility.java`,
`TailwindVariant.java`) uses only basic Java constructs (static constants, simple
string concatenation). There are no Java-version-specific APIs used that would
require changes. However, you may optionally adopt Java 21 language features
(records, sealed classes, pattern matching) to modernize the code.

---

## 2. Tailwind Feature Flag (No Change Required)

The Tailwind CSS feature flag is **still required** in Vaadin 25. The existing
`src/main/resources/vaadin-featureflags.properties` file must remain as-is:

```properties
# src/main/resources/vaadin-featureflags.properties
com.vaadin.experimental.tailwindCss=true
```

No changes are needed to this file or to the README's note about the
auto-enabled feature flag — the library continues to deliver the same
zero-configuration value proposition for Vaadin 25 users.

---

## 3. Tailwind CSS v3 → v4 Class Name Changes (Required for Full v4 Coverage)

Vaadin 25 integrates with **Tailwind CSS v4**, not v3. Tailwind v4 renamed
several utility classes. The `TailwindUtility` class currently documents and
provides constants for Tailwind **v3** classes. Any renamed classes would produce
incorrect CSS output when used with a Vaadin 25 / Tailwind v4 project.

### Known Renamed Classes

The following class names changed between Tailwind v3 and v4:

#### Shadow utilities

| v3 class (current constant value) | v4 class (new value needed) |
|---|---|
| `shadow-sm` | `shadow-xs` |
| `shadow` (default) | `shadow-sm` |
| `shadow-md` | `shadow-md` *(unchanged)* |
| `shadow-lg` | `shadow-lg` *(unchanged)* |
| `shadow-xl` | `shadow-xl` *(unchanged)* |
| `shadow-2xl` | `shadow-2xl` *(unchanged)* |

**In `TailwindUtility.BoxShadow`:** verify the constant values for `SMALL` and
the default (`MEDIUM` or similar) and update them to the v4 names.

#### Blur utilities (drop-shadow / filter)

| v3 class | v4 class |
|---|---|
| `blur-sm` | `blur-xs` |
| `blur` (default) | `blur-sm` |
| `blur-md` | `blur` (default) |

**In `TailwindUtility`:** if `Blur` or `DropShadow` filter constants exist,
verify and update their values.

#### Other potential renames

- **`overflow-ellipsis`** → **`text-ellipsis`** (already renamed in v3; should
  be correct if the library was written against late v3).
- **`flex-shrink`** → **`shrink`** and **`flex-grow`** → **`grow`** (also
  renamed in v3; confirm existing constants use the v3+ names).
- Opacity utilities (`bg-opacity-*`, `text-opacity-*`, etc.) are replaced in v4
  by the `/opacity` modifier syntax (`bg-black/50`). These deprecated constants
  should be marked accordingly or removed. See `DYNAMIC_CLASSES.md` section L.

**Recommended approach:** Run the official Tailwind upgrade tool against a sample
application that imports all `TailwindUtility` constants, then diff the output to
identify any further renames:

```bash
npx @tailwindcss/upgrade
```

---

## 4. README and Documentation Updates (Required)

Update `README.md` to reflect the new requirements:

- Change "Java 17+" → "Java 21+"
- Change "Vaadin 24+" → "Vaadin 25+"
- Update the Tailwind CSS version reference from v3 to v4
- The feature flag note in the README remains accurate — no change needed

---

## 5. CI / Build Environment Update (Recommended)

If the project adds CI (GitHub Actions or similar), ensure the build environment
uses Java 21. If a CI pipeline already exists, update the `java-version` field to
`21`.

---

## 6. Optional: Tailwind v4 New Utilities

Tailwind v4 introduces new utility classes not present in v3. To provide complete
coverage for Vaadin 25 users, consider adding constants for v4-only utilities.
Notable additions include:

- **`size-*`** — shorthand for setting both `width` and `height` simultaneously
  (e.g., `size-4` = `w-4 h-4`).
- **`inset-*` improvements** — additional logical property variants.
- **`field-sizing-*`** — for form field auto-sizing.
- **CSS variable–based spacing** — v4's default spacing scale is defined via CSS
  custom properties; arbitrary value support becomes more seamless.

A thorough review of the [Tailwind v4 changelog](https://tailwindcss.com/blog/tailwindcss-v4)
will reveal the full set of additions to consider.

---

## 7. Versioning

Once the changes above are complete, the library should be released as a new
version that clearly signals Vaadin 25 / Tailwind v4 compatibility. Consider:

- Keeping the existing `1.x` line for Vaadin 24 / Tailwind v3 support.
- Releasing `2.0.0` targeting Vaadin 25 / Tailwind v4, consistent with the
  breaking nature of the Tailwind v3 → v4 class renames.

---

## Checklist

- [ ] Upgrade `pom.xml` Java source/target from 17 to 21
- [x] Confirm feature flag `com.vaadin.experimental.tailwindCss=true` is still required — **no change needed to `vaadin-featureflags.properties`**
- [ ] Audit all `TailwindUtility` constant values for Tailwind v3→v4 renames
      (shadow, blur, and any other renamed utilities)
- [ ] Add constants for new Tailwind v4 utilities (e.g., `size-*`)
- [ ] Update `README.md` requirements (Java 21+, Vaadin 25+, Tailwind v4)
- [ ] Update `DYNAMIC_CLASSES.md` to reflect v4 changes (e.g., section L on
      deprecated opacity utilities)
- [ ] Update test suite to cover renamed constants and any new v4 utilities
- [ ] Tag and release a new version (suggested: `2.0.0`)

---

## References

- [Vaadin 25 Upgrade Guide](https://vaadin.com/docs/latest/upgrading)
- [Upgrading Your Add-on to Vaadin 25 (Vaadin Blog)](https://vaadin.com/blog/upgrading-your-add-on-to-vaadin-25-guide)
- [Vaadin 25.0 Release Blog](https://vaadin.com/blog/vaadin-25-0-release)
- [Tailwind CSS v4 Upgrade Guide](https://tailwindcss.com/docs/upgrade-guide)
- [Tailwind CSS v4.0 Release Notes](https://tailwindcss.com/blog/tailwindcss-v4)
- [Vaadin Feature Flags Documentation](https://vaadin.com/docs/latest/flow/configuration/feature-flags)
