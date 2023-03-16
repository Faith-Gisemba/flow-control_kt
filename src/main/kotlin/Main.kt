fun main(){
    odd()
    println(fiveChars(arrayOf("google","ubuntu","linux","lulu")))
    robotServe(5)
    robotServe(14)
    robotServe(67)
    fizzyBuz(arrayOf())

}

//Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun odd(){
    for(num in 1..100){
        if(num%2 !=0){
            println(num)
        }
    }

}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters

fun fiveChars(namess: Array<String>): Int {
    var x = 0
    namess.forEach{y ->
        if(y.length > 5){
            x++
        }
    }
    return x
}

//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
//
fun robotServe(age: Int){
    if(age in 0..6)
        println("milk")
    else if(age in 7..15)
        println("fanta orange")
    else{
        println("Coca cola")
    }
}


//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)

fun fizzyBuz(numbers: Array<String>) {
    for (namey in 1..100) {
        if(namey % 3 == 0 && namey % 5 == 0)
            println("FizzBuzz")
        else if (namey % 5 == 0)
            println("Buzz")
        if(namey % 3 == 0)
            println("Fizz")
        else{
            println(namey)
        }


    }
}