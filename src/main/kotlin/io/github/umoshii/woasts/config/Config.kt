package io.github.umoshii.woasts.config

import io.github.umoshii.woasts.Woasts
import me.shedaniel.autoconfig.ConfigData
import me.shedaniel.autoconfig.annotation.Config
import me.shedaniel.autoconfig.annotation.ConfigEntry
import me.shedaniel.clothconfig2.gui.entries.SelectionListEntry

@Config(name = Woasts.MOD_ID)
class Config : ConfigData {
    enum class RenderCorner(private val key: String) : SelectionListEntry.Translatable {
        UP_LEFT("upLeft"),
        UP_RIGHT("upRight"),
        DOWN_LEFT("downLeft"),
        DOWN_RIGHT("downRight");

        override fun getKey(): String = "text.autoconfig.woasts.option.renderCorner.$key"
    }

    var margin: Int = 5
    var spacing: Int = 3

    var wrap: Int = 3
    var wrapSpacing: Int = 3

    @ConfigEntry.Gui.EnumHandler(option = ConfigEntry.Gui.EnumHandler.EnumDisplayOption.BUTTON)
    var renderCorner: RenderCorner = RenderCorner.UP_LEFT
}