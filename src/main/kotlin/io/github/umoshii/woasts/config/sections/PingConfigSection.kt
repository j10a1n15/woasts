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
    var grayPingColor: Int = ColorUtils.hexToArgb("#bcc7d4ff")

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var greenPingColor: Int = ColorUtils.hexToArgb("#9dff85ff")

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var yellowPingColor: Int = ColorUtils.hexToArgb("#fdff85ff")

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var orangePingColor: Int = ColorUtils.hexToArgb("#ffce85ff")

    @ConfigEntry.ColorPicker(allowAlpha = true)
    var redPingColor: Int = ColorUtils.hexToArgb("#ff9d85ff")
}