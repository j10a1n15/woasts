package io.github.umoshii.woasts.widgets.implementation

import io.github.umoshii.woasts.WoastsClient
import io.github.umoshii.woasts.helpers.McClient
import io.github.umoshii.woasts.utils.FontUtils
import io.github.umoshii.woasts.widgets.Widget
import net.minecraft.network.chat.MutableComponent

object PositionWidget : Widget() {
    override val isEnabled: Boolean
        get() = WoastsClient.config.positionConfig.isEnabled

    override fun getRenderColor(): Int {
        return WoastsClient.config.positionConfig.color
    }

    override fun getRenderIcon(): MutableComponent {
        return FontUtils.Icons.LOCATION.component
    }

    override fun getRenderValue(): String {
        McClient.player?.let { player ->
            return "${player.blockX} ${player.blockY} ${player.blockZ}"
        }

        return "? ? ?"
    }
}