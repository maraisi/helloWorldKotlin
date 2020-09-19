package aula04.exercicio1

//1) Ecrever o código que deve analisar três números inteiros e retornar o maior deles.

fun main(){
    println(maiorDeTres(4,7,3))
}

fun maiorDeTres(numA:Int, numB: Int, numC: Int): Int {
//    if (numA > numB && numA > numC) {
//        return numA
//    } else if (numB > numA && numB > numC) {
//        return numB
//    } else {
//        return numC
//    }
    when {
        numA > numB && numA > numC -> return numA
        numB > numA && numB > numC -> return numB
        else -> return numC
    }
}

