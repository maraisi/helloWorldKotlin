package exercicio5

fun main(){
    println(analiseNum(4,5,10,1))
}
fun analiseNum(numA: Int, numB:Int, numC:Int, numD: Int): Boolean{
    return (numA > numB && numA > numC) || (numB > numC && numB > numD)
}
