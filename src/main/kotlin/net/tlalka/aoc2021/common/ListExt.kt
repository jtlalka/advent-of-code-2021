package net.tlalka.aoc2021.common

fun <T> List<T>.toPair(): Pair<T, T> = Pair(first(), last())

fun List<Int>.median(): Int = size.let { (this[it / 2] + this[(it - 1) / 2]) / 2 }
fun List<Long>.median(): Long = size.let { (this[it / 2] + this[(it - 1) / 2]) / 2L }
