package io.github.umoshii.woasts.integration

import com.terraformersmc.modmenu.api.ConfigScreenFactory
import com.terraformersmc.modmenu.api.ModMenuApi
import io.github.umoshii.woasts.config.Config
import me.shedaniel.autoconfig.AutoConfigClient

class ModMenuIntegration : ModMenuApi {
    override fun getModConfigScreenFactory(): ConfigScreenFactory<*>? {
        return ConfigScreenFactory { parent ->
            AutoConfigClient.getConfigScreen(Config::class.java, parent).get()
        }
    }
}