fun main() {
    add()
    name()
    var result =sum(10,20)
    println(result)

    var seed =fly(23f,32f)
    println(seed)

}
fun add() {
    var c = 10
    var b = 20
    var add= c + b
println(add)

}

fun name(){
    var name = "hello love lace"
    println(name)

}
fun sum(c:Int,b:Int):Int{
    var add=c + b

    return add

}
fun fly(d:Float,e:Float):Float{
    var slim = d + e

    return slim
}