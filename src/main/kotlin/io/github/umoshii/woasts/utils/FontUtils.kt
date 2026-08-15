package io.github.umoshii.woasts.utils

import io.github.umoshii.woasts.Woasts
import net.minecraft.network.chat.Component
import net.minecraft.network.chat.FontDescription
import net.minecraft.network.chat.MutableComponent
import net.minecraft.network.chat.Style
import net.minecraft.resources.Identifier

object FontUtils {
    val iconFont    = Style.EMPTY.withFont(FontDescription.Resource(Woasts.id("icons")))
    val defaultFont = Style.EMPTY.withFont(FontDescription.Resource(Identifier.fromNamespaceAndPath("minecraft", "default")))

    enum class Icons(val component: MutableComponent) {
        PING(Component.literal("\uE000").withStyle(iconFont)),
        LOCATION(Component.literal("\uE001").withStyle(iconFont)),
        FPS(Component.literal("\uE002").withStyle(iconFont))
    }
}