package io.github.umoshii.woasts.config.sections

import io.github.umoshii.woasts.utils.ColorUtils
import me.shedaniel.autoconfig.annotation.ConfigEntry

class FPSConfigSection {
    var isEnabled: Boolean = true

    @ConfigEntry.Gui.Tooltip
    var optimalFps: Int = 60

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var greenFpsColor: Int = ColorUtils.hexToArgb("#9dff85ff")

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var yellowFpsColor: Int = ColorUtils.hexToArgb("#fdff85ff")
}