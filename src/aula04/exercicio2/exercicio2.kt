package aula04.exercicio2

//2) Escrever o código que deve analisar duas cadeias de texto e, caso sejam diferentes, retornar true, ou, caso sejam iguais, retornar false.

fun main() {

    print("As duas cadeias de texto são diferentes? ")
    println(textosIguais("O rato roeu a roupa do Rei de Roma","O rato roeu a roupa do Rei de Roma"))
}

fun textosIguais(texto1: String, texto2: String): Boolean{

    return texto1 != texto2
}