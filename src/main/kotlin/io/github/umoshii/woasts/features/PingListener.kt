package io.github.umoshii.woasts.features

import io.github.umoshii.woasts.helpers.McClient

object PingListener {
    fun getPing(): Long {
        if (McClient.connection == null || McClient.instance.currentServer == null) return 0L

        return McClient.instance.debugOverlay.pingLogger.get(McClient.instance.debugOverlay.pingLogger.size() - 1)
    }
}