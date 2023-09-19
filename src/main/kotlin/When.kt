import java.lang.module.ModuleDescriptor.read

fun main() {
    var input = readln()
    input?.let { testWhen(input) }
}

fun testWhen(input: Any) {
    when (input) {
        1 -> println("1")
        in 2..10 -> println("2 - 10")
        is String -> println("String with length ${input.length}")
        13 -> println("Lucky you!")
        else -> println("Sorrrry")
    }
}