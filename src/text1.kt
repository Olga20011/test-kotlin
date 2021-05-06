fun main() {
    introduction("Olga",20)
    drinks(3)
    drinks(6)
    drinks(17)

    println(multiply(52,40))
    println(division(100,10))
    println(modulus(10,7))

    var olga=Human("Olga",20,65)
    eat(4)









}
fun introduction(name:String,age:Int){
    print("My name is $name and I am $age years old")
}
fun drinks(age: Int){
    var studentAge=3
    if (studentAge<6){
        println("milk")
    } else if(studentAge>6 && studentAge<15){
        println("Fanta")
    }else{
        println("cocacola")
    }
}

fun multiply(num1:Int,num2:Int):Int{
    var a=num1*num2
    return(a)

}
fun division(num3:Int,num4:Int):Int{
    var x=num3/num4
    return(x)
}
fun modulus(num5:Int,num6:Int):Int{
    var remainder=num5%num6
    return(remainder)
}
class Human(name:String,age:Int,weight:Int)
    fun eat(foodweight:Int){
        println("I am eating $foodweight kgs of food")


    }

