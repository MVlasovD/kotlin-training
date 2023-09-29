fun main(args: Array<String>) {
    println("Hello World!")
    val value: String = "Lalalalala"
    val num1: Int = 1
    val num2: Int = 5
    println("Sum of $num1 and $num2 is ${num1 + num2}")
    getString(value)

    val items = listOf("Hunt", "Down", "Of", "Bandit")
    for (item in items) {
        println(item)
    }

    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }

    //diapazony  ranges

    println(5 in 3..10)
    for (i in 1..12)
        print(i)

    for (i in 1 until 11)
        print(i)

    for (i in 10 downTo 1)
        print(i)

    for (i in 0..100 step 10)
        println(i)

    val v = Resource
    val n = Resource
    println(v.hashCode())
    println(n.hashCode())
}

fun getString(arg: String?) {
    print("$arg arg\n")
    Util.getNameOf(arg)
}

object Resource {
    const val name = "Name"
}

