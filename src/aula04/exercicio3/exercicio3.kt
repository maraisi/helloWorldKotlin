package aula04.exercicio3

//3) Escrever o código que deve analisar um número inteiro e, caso ele seja par, retornar true, caso contrário, retorna false.

fun main(){
    print("O número é par? ")
    println(numeroPar(5))
}

fun numeroPar(num: Int): Boolean{
    return num % 2 == 0
}
