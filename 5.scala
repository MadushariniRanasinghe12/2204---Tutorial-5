def main(args:Array[String]) = {

    def isEven(number:Int):Boolean = number match{
        case 0 => true
        case 1 => false
        case _ => isEven(number % 2)
    }

    def addeven(n:Int, i:Int=1):Int = i match{
        case x if(i >= n) => return 0
        case x if(isEven(i)) => i + addeven(n, i+1)
        case _ => addeven(n, i+1)
    }

    print("Enter the value of n : ")
    var n = scala.io.StdIn.readInt()
    println(addeven(n))
}