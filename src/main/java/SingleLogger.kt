package com.alterjuice.utils.treelogger


fun interface SingleLogger {
    fun log(level: LogLevel, msg: String)
    fun isEmpty() = this === EMPTY

    companion object {
        val EMPTY = SingleLogger { level, msg -> }
    }
}
