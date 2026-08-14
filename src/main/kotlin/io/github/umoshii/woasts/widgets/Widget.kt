package io.github.umoshii.woasts.widgets

import io.github.umoshii.woasts.Woasts
import io.github.umoshii.woasts.helpers.McClient
import io.github.umoshii.woasts.utils.ColorUtils
import io.github.umoshii.woasts.utils.FontUtils
import net.minecraft.client.DeltaTracker
import net.minecraft.client.gui.GuiGraphicsExtractor
import net.minecraft.network.chat.Component
import net.minecraft.network.chat.MutableComponent

abstract class Widget {
    abstract val isEnabled: Boolean

    var containerWidth: Int = 0
    val containerHeight: Int = 14
    val containerColor: Int = ColorUtils.hexToArgb("#0000007F")

    abstract fun getRenderValue(): String
    abstract fun getRenderColor(): Int
    abstract fun getRenderIcon(): MutableComponent

    fun render(graphics: GuiGraphicsExtractor, tickCounter: DeltaTracker, x: Int, y: Int) {
        if (!isEnabled) return

        val renderColor = getRenderColor()
        val renderComponent = Component.empty()
            .append(getRenderIcon())
            .append(
                Component.literal(" ${getRenderValue()}")
                    .withStyle(FontUtils.defaultFont)
            )

        containerWidth = McClient.font.width(renderComponent) + 10
        val tx = (x + containerWidth / 2) - (McClient.font.width(renderComponent) / 2)
        val ty = (y + containerHeight / 2) - (McClient.font.lineHeight / 2)

        graphics.fill(x, y, x + containerWidth, y + containerHeight, containerColor)
        graphics.text(McClient.font, renderComponent, tx, ty, renderColor, true)
    }
}