package aula09Colletions.mutableListOf

fun main() {
    val numbers = mutableListOf(1, 2, 3, 4)
    println("-------------------------------------------------------------------------")
    println("                      MUTABLE LIST OF")
    println("-------------------------------------------------------------------------")
    println("\nval numbers = mutableListOf(1, 2, 3, 4)\n")

    println("Adiciona o 5 na mutableListOf usando numbers.add(5):")
    numbers.add(5)
    println("[1, 2, 3, 4] ==> $numbers")

    println("\nRemove o índice 1 (número 2) da mutableListOf usando numbers.removeAt(1):")
    numbers.removeAt(1)
    println("[1, 2, 3, 4, 5] ==> $numbers")

    println("\nMuda o valor do índice 0 (número 1) usando numbers[0] = 0:")
    numbers[0] = 0
    println("[1, 3, 4, 5] ==> $numbers")

    println("\nMuda a ordem(índice) dos componentes da mutableListOf usando numeros.shuffle:")
    numbers.shuffle()
    println("[0, 3, 4, 5] ==> $numbers")
}