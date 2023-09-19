
fun main(){

    var a:String ="String"
    a = "null" //no null
    a.length

    var b:String? = "String 2"

    //b.length //no call method
    b = null

    //safecall //  вернется значение null
    b?.length

    //bob?.field?.department.name -> null    no NPE

    //Elvis ?:
    println(b?.length ?: -1)

    //!!  выбрасывает NPE if null
    //val t = b!!.length


}