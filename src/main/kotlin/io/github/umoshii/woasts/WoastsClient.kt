package io.github.umoshii.woasts

import io.github.umoshii.woasts.commands.ConfigCommand
import io.github.umoshii.woasts.config.Config
import io.github.umoshii.woasts.widgets.WidgetRenderer
import me.shedaniel.autoconfig.AutoConfig
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer
import net.fabricmc.api.ClientModInitializer

object WoastsClient : ClientModInitializer {
    lateinit var config: Config

    override fun onInitializeClient() {
        AutoConfig.register(Config::class.java, ::GsonConfigSerializer)
        config = AutoConfig.getConfigHolder(Config::class.java).config

        WidgetRenderer.register()
        ConfigCommand.register()
    }
}