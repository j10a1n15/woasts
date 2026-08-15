package io.github.umoshii.woasts.widgets.implementation

import io.github.umoshii.woasts.features.PingListener
import io.github.umoshii.woasts.utils.ColorUtils
import io.github.umoshii.woasts.utils.FontUtils
import io.github.umoshii.woasts.widgets.Widget
import net.minecraft.network.chat.MutableComponent

object TestWidget : Widget() {
    override val isEnabled: Boolean = true
    override fun getRenderValue(): String {
        return "${PingListener.getPing()}"
    }
    override fun getRenderColor(): Int = ColorUtils.Constants.WHITE.hex
    override fun getRenderIcon(): MutableComponent = FontUtils.Icons.LOCATION.component
}