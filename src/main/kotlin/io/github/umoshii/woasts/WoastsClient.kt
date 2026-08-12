package io.github.umoshii.woasts

import io.github.umoshii.woasts.widgets.WidgetRenderer
import net.fabricmc.api.ClientModInitializer

object WoastsClient : ClientModInitializer {
    override fun onInitializeClient() {
        WidgetRenderer.register()
    }
}