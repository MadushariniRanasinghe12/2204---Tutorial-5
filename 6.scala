def main(args:Array[String]) = {

    def fibonacci(n:Int):Int = n match{
        case x if(x == 0) => 0
        case x if(x == 1) => 1
        case x => fibonacci(n-1) + fibonacci(n-2)
    }

    def fibonacciSeq(n:Int):Unit = {
        if(n > 0)
            fibonacciSeq(n-1)
        print(fibonacci(n) + " ")
    }

    print("Enter the value of n : ")
    var n = scala.io.StdIn.readInt()
    fibonacciSeq(n)
}