def main(args:Array[String]) = {

    def prime(n:Int, i:Int=2): Boolean = n match{
        case x if(x < i) => false
        case x if(i == x) => true
        case x if(x % i == 0) => false
        case _ => prime(n, i+1)
    } 

    def primeSeq(n:Int, i:Int=1):Unit = {
        if(prime(i))
            print(i + " ")
        
        if(i<n)
            primeSeq(n, i+1)
    }

    print("Enter the value of n : ")
    var n = scala.io.StdIn.readInt()
    primeSeq(n)
}