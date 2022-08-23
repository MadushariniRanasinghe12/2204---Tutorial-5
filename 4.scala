def main(args:Array[String]) = {

    def isEvenOdd(number:Int):Unit = number match{
        case 0 => println("Even number")
        case 1 => println("Odd number")
        case _ => isEvenOdd(number % 2 )
    }

    print("Enter the number : ")
    var number = scala.io.StdIn.readInt()
    isEvenOdd(number)
}