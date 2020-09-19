package aula04.exercicio5

/*
5) Escrever um código que deve analisar quatro números inteiros e, caso numA
seja maior que numC e numD ou caso numB seja maior que numC e numD,
retornar true, caso contrário, retornar false.
*/

fun main(){

    println(analiseNum(2,5,10,1))
}

fun analiseNum(numA: Int, numB:Int, numC:Int, numD: Int): Boolean{
    return (numA > numC && numA > numD) || (numB > numC && numB > numD)
}
