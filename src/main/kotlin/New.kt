import java.util.*


fun main() {
        testNamedArguments(y = 4, x = 6, z = 10)

        testDefaultArguments()

        testDefaultArguments(y = 1)
        testDefaultArguments(1, 3)

        printEven(1,4,5,8,4,3,5,7,9,0,6,5,43,3)
        printEven(*intArrayOf(1,2,3,4,5,6,7))
    }

    fun testSimple(): Int {
        return 5 + 5
    }

    fun testSimple2(): Int = 5 + 5

    fun testSum(x: Int, y: Int) = x + y

    fun testString(x: Int): String {
        return x.toString()
    }

    fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
        return listOf(x, y, z)
    }

    fun testDefaultArguments(x: Int = 1, y: Int = 2) {
        println(x + y)
    }

    fun foo (name:String, number:Int = 42, toUpperCase: Boolean = false){
        (if (toUpperCase) name.uppercase(Locale.getDefault()) else name) + number
    }

    //varargs

    fun printEven(vararg numbers:Int){
        numbers.forEach { e -> if (e % 2 == 0) println(e)  }
    }
