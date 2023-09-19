fun main() {
    println(getRepeatedIntersection(intArrayOf(1, 2, 3, 2, 0), intArrayOf(5, 1, 2, 7, 3, 2)))

    println(countLetters("AAAAJJJJDDDDDIIIUUURRRFFFFFFCCCCCCCCCCCCCCCC"))

    println(groupWords(arrayOf("eat","tea", "tan", "ate","nat","bat")))
}

fun groupWords(words: Array<String>): List<List<String>> {
    val result: MutableList<List<String>> = mutableListOf()

    val map = mutableMapOf<String, MutableList<String>>()

    for (word in words){
        val sortedWords = word
            .toCharArray()
            .sorted()
            .joinToString("")

        if(map.containsKey(sortedWords))
            map[sortedWords]?.add(word)
        else
            map[sortedWords] = mutableListOf(word)
    }

    for ((key, value ) in map)
        result.add(value)

    return result
}

fun getRepeatedIntersection(a1: IntArray, a2: IntArray): List<Int> {
    val result = mutableListOf<Int>()
    val s1 = a1.toHashSet()
    val s2 = a2.toHashSet()

    for (e in s1) {
        if (s2.contains(e)) {
            val numOfRepeats = minOf(a1.count { it == e }, a2.count { it == e })
            repeat(numOfRepeats) { result.add(e) }
        }
    }
    return result
}

fun countLetters(str: String): String {

    var currentLetter = str[0]
    var count = 1
    var result = ""

    for (letter in str.substring(1)) {
        if (currentLetter == letter) {
            count++
        } else {
            if (count == 1)
                result += currentLetter
            else
                result += "$currentLetter$count"
            count = 1
            currentLetter = letter
        }
    }
    if (count == 1)
        result += currentLetter
    else
        result += "$currentLetter$count"

    return result
}