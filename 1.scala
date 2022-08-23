def main(args:Array[String]) = {
    
    def GCD(num1:Int, num2:Int):Int ={
        if(num1 == 0)
            return num2
        if(num2 == 0)
            return num1

        if(num1 > num2)
            return GCD(num1%num2, num2)
        else
            return GCD(num1, num2%num1)

    }

    def prime(p:Int, n:Int=2):Boolean = n match{
        case x if(x==p) => true
        case x if GCD(p,x)>1 => false
        case x => prime(p,x+1)
    }

    println(prime(5))
}