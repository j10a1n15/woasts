package io.github.umoshii.woasts.widgets.implementation

import io.github.umoshii.woasts.utils.ColorUtils
import io.github.umoshii.woasts.widgets.Widget

object TestWidget : Widget() {
    override val isEnabled: Boolean = true
    override fun getRenderString(): String = "Meow"
    override fun getRenderColor(): Int = ColorUtils.Constants.WHITE.hex
}