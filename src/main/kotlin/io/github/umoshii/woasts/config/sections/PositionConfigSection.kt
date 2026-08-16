package io.github.umoshii.woasts.config.sections

import io.github.umoshii.woasts.utils.ColorUtils
import me.shedaniel.autoconfig.annotation.ConfigEntry

class PositionConfigSection {
    var isEnabled: Boolean = true

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var color: Int = ColorUtils.CatppuccinoColors.TEXT.hex
}