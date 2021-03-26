fun main(){
    var add=34+67+23
    println (add)
age()
    marks()
    comp()
    factInteresting()

}
fun sum(num1:Int,num2:Int,num3:Int):Int{
    var add=num1+num2+num3
    return add
    println(add)
}
fun age () {
    var age=21
   var growth=--(age)
    println(growth)
}
fun marks(){
    var mark=89
    var inc=++(mark)
    println(inc)
}
fun comp(){
    var num1=234
    var num2=567
    println(num2<num1)
    println(num2>num1)
}
fun factInteresting(){
    var name="mary"
    var age=21
    var likes="No I do not have any thing interesting that I love and like"
    var interestings=("my name is $name surprisingly $likes .")
    println(interestings)
}