
fun main() {
    val p1 = Person("Tom", "Jones", 23)
    val child = Person("Mik")
    val p2 = Person("Bob", "Jones", 54, child)
    println(p1.lastName)
    println(p2.children)

    val rect1 =  Rectangle(5.0, 2.0)
    println("Perimeter rect1 is ${rect1.perimeter}")
    val rect2 =  Rectangle(5.0, 2.0)
    println("Perimeter rect2 is ${rect2.perimeter}")

    println(rect1 == rect2)

}

//первичный конструктор primary
class Person(val firstName: String = "Unknown", val lastName: String = "Unknown", var age: Int = 0) {
    var children: MutableList<Person> = mutableListOf() //ArrayList

    init {
        println("Person is created $firstName")
    }

    //вторичный конструктор
    constructor(firstName: String = "", lastName: String = "", age: Int = 0, child: Person) : this(
        firstName,
        lastName,
        age
    ) {
        children.add(child)
    }

    //пустой конструктор
    constructor() : this("", "", -1)

    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName', age=$age, children=$children)"
    }

}

data class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1 //this
        set(value) {
            if (value < 0) println("negative")
            field = value
        }

    fun area() = height * length

}