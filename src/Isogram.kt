package Isogram

fun isIsogram(input: String): Boolean = letterFrequencies(input).values.none { it > 1 }

fun letterFrequencies(input: String): Map<Char, Int> =
    input.filter { it.isLetter() }
        .toLowerCase()
        .groupingBy { it }
        .eachCount()