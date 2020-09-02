fun main(){
    return analiseNum()
}

fun analiseNum(numA: Int, numB:Int, numC:Int, numD): Boolean{
    return (numA > numB && numA > numC) || (numB > numC && numB > numD)
    }
}