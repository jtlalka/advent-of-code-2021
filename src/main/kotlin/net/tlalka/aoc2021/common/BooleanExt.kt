package net.tlalka.aoc2021.common

fun Boolean.toInt() = if (this) 1 else 0

fun <R> Boolean.ifTrue(block: () -> R): R? = if (this) block.invoke() else null
fun <R> Boolean.ifFalse(block: () -> R): R? = if (this) null else block.invoke()
