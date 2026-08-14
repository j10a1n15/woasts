package io.github.umoshii.woasts.config

import io.github.umoshii.woasts.Woasts
import me.shedaniel.autoconfig.ConfigData
import me.shedaniel.autoconfig.annotation.Config

@Config(name = Woasts.MOD_ID)
class Config : ConfigData {
    val margin: Int = 5
}