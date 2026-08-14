package io.github.umoshii.woasts.utils

object ColorUtils {
    fun hexToArgb(hexColor: String): Int {
        val cleanHex = hexColor.removePrefix("#")
        require(cleanHex.length == 8) { "Hex value not valid! Expected: #RRGGBBAA" }

        val rr = cleanHex.substring(0, 2).toInt(16)
        val gg = cleanHex.substring(2, 4).toInt(16)
        val bb = cleanHex.substring(4, 6).toInt(16)
        val aa = cleanHex.substring(6, 8).toInt(16)

        return (aa shl 24) or (rr shl 16) or (gg shl 8) or bb
    }

    enum class Constants(val hex: Int) {
        WHITE(hexToArgb("#FFFFFFFF"))
    }
}