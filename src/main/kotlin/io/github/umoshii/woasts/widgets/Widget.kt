package io.github.umoshii.woasts.widgets

import io.github.umoshii.woasts.helpers.McClient
import io.github.umoshii.woasts.utils.ColorUtils
import net.minecraft.client.DeltaTracker
import net.minecraft.client.gui.GuiGraphicsExtractor

abstract class Widget {
    abstract val isEnabled: Boolean

    var containerWidth: Int = 0
    val containerHeight: Int = 14
    val containerColor: Int = ColorUtils.hexToArgb("#0000007F")

    // these are functions instead of vals with overrideable getters
    // because it's more efficient to cache the returns of these once
    // rather than running the getters 3 times per render cycle
    abstract fun getRenderString(): String
    abstract fun getRenderColor(): Int

    fun render(graphics: GuiGraphicsExtractor, tickCounter: DeltaTracker, x: Int, y: Int) {
        if (!isEnabled) return

        val renderString = getRenderString()
        val renderColor = getRenderColor()

        containerWidth = McClient.instance.font.width(renderString) + 14
        val textX = (x + containerWidth / 2) - (McClient.instance.font.width(renderString) / 2)
        val textY = (y + containerHeight / 2) - (McClient.instance.font.lineHeight / 2)

        graphics.fill(x, y, x + containerWidth, y + containerHeight, containerColor)
        graphics.text(McClient.instance.font, renderString, textX, textY, renderColor, true)
    }
}