package exercicio1

fun main(){
    println(maiorDeTres(4,7,3))
}

fun maiorDeTres(numA:Int, numB: Int, numC: Int): Int {
    if (numA > numB && numA > numC) {
        return numA
    } else if (numB > numA && numB > numC) {
        return numB
    } else {
        return numC
    }
}

