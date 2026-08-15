package io.github.umoshii.woasts.config.sections

import io.github.umoshii.woasts.utils.ColorUtils
import me.shedaniel.autoconfig.annotation.ConfigEntry

class PingConfigSection {
    var isEnabled: Boolean = true

    @ConfigEntry.Gui.Tooltip
    var updateTime: Int = 2

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 1, max = 200)
    var greenPingRange: Long = 60L

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 1, max = 200)
    var yellowPingRange: Long = 100L

    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(min = 1, max = 200)
    var orangePingRange: Long = 100L

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var grayPingColor: Int = ColorUtils.hexToArgb("#6d737aff")

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var greenPingColor: Int = ColorUtils.hexToArgb("#70ff4dff")

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var yellowPingColor: Int = ColorUtils.hexToArgb("#f9ff4dff")

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var orangePingColor: Int = ColorUtils.hexToArgb("#ffb84dff")

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var redPingColor: Int = ColorUtils.hexToArgb("#ff624dff")
}