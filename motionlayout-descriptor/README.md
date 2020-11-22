# MotionLayout Issues

Experiments are run in two different ways:

- A) Through XML
- B) Programmatically through a Compound View + nested layout inflation using a `<merge>` tag.

### Broken Motion Scene When Loading It Programmatically

The layout inflated by the compound view (`CompoundMotionLayout`) using the `<merge>` tag broke on `2.0.0-beta4` (it was working correctly on `2.0.0-beta3`). We experienced this problem when switching from `2.0.0-beta3` to `2.0.4`, but I was able to scope the problem when switching from beta3 to beta4.

##### Build

- `androidx.constraintlayout:constraintlayout:2.0.0-beta4`+ // tried on the latest version (2.0.4) and (2.1.0-alpha1) and it's still broken.

### Different Scene When Loading It Programmatically

The Motion behaves differently when inflating the compound view (`CompoundMotionLayout`) using the `<merge>` tag, because the constraints seem to be ignored. The unexpected behavior though, is that we are using parentTag to let the layout know the views are wrapped by a MotionLayout, but constraints are ignored anyways. On the other hand, if we open the Compound View it will preview the layout correctly.

##### Build

- `androidx.constraintlayout:constraintlayout:2.0.0-beta3`

### Motion Scene Started Automatically In Some Cases

If we call `loadLayoutDescription()` during the view initialisation, the Motion will be started automatically. If instead, we do it on `onAttachedToWindow()`, it won't

##### Build

- `androidx.constraintlayout:constraintlayout:2.0.0-beta3`








