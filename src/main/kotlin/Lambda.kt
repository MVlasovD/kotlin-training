fun main() {

    val a = listOf(1, 2, 3, 4, 5)

    a.forEach { e -> println(e) }

    println(a.map { e -> e * 2 })

    println(a.filter { e -> e > 2 })

    println(a.reduce { sum, e -> sum + e })

    println(a.sortedByDescending { it })

    println(a.any { it > 3 })
    println(a.all{ it < 10 })

    println(a.sum())

    val numbers = listOf(1,7,-56,23,-6)

    val (positive, negative) = numbers.partition { it > 0 }

    println(positive)
    println(negative)

    val result = listOf("a","bb", "ccc","d5").groupBy { it.length }

    println(result)
}

fun getName(){
    println("Hello")
    var list = listOf(1,2,3,4,5)
}
