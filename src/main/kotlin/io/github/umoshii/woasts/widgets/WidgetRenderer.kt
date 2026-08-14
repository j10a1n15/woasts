package io.github.umoshii.woasts.widgets

import io.github.umoshii.woasts.Woasts
import io.github.umoshii.woasts.WoastsClient
import io.github.umoshii.woasts.widgets.implementation.TestWidget
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry
import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements
import net.minecraft.client.DeltaTracker
import net.minecraft.client.gui.GuiGraphicsExtractor

object WidgetRenderer {
    private val widgets: List<Widget> = listOf(TestWidget)

    private fun render(graphics: GuiGraphicsExtractor, tickCounter: DeltaTracker) {
        widgets.forEach { widget ->
            widget.render(graphics, tickCounter, WoastsClient.config.margin, WoastsClient.config.margin)
        }
    }

    fun register() {
        HudElementRegistry.attachElementAfter(
            VanillaHudElements.SLEEP,
            Woasts.id("woasts_hud"),
            ::render
        )
    }
}