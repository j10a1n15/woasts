package io.github.umoshii.woasts.commands

import io.github.umoshii.woasts.Woasts
import io.github.umoshii.woasts.config.Config
import io.github.umoshii.woasts.helpers.McClient
import me.shedaniel.autoconfig.AutoConfigClient
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback
import net.fabricmc.fabric.api.client.command.v2.ClientCommands

object ConfigCommand {
    fun register() {
        ClientCommandRegistrationCallback.EVENT.register { dispatcher, _ ->
            dispatcher.register(
                ClientCommands.literal(Woasts.MOD_ID).executes {
                    McClient.instance.execute {
                        McClient.instance.setScreenAndShow(
                            AutoConfigClient.getConfigScreen(Config::class.java, McClient.screen).get()
                        )
                    }

                    1
                }
            )
        }
    }
}