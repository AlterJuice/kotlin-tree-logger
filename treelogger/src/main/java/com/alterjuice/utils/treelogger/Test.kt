package com.alterjuice.utils.treelogger


fun main() {
    val logger = SimpleTreeLogger

    val logger1234 = logger["1234"]
    logger1234.w("WARNING2")
    logger1234.e("newTag", "message", Exception())
    val mapped = logger1234.transform(transformLevel = { LogLevel.ERROR }, transformText = { level, msg -> "=============== ${msg} ===============" })
    mapped.w("123")

    logger1234.disable()
    mapped.d("Disabled mapped")
    logger1234.d("Disabled logger1234")
}