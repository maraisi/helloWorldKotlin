package aula09Colletions.exercicios.exercício1

fun main(){

//  Criar um dicionário que represente os apelidos que uso para chamar os
//  meus amigos. Para isso, o dicionário deverá ter como chave String e como
//  valor uma lista de String.
//
//  Números da Loteria dos Sonhos:
//
//  0 → Ovos
//  1 → Água
//  2 → Escopeta
//  3 → Cavalo
//  4 → Dentista
//  5 → Fogo


    val loteriaDosSonhos = mapOf(
        0 to "Ovos",
        1 to "Água",
        2 to "Escopeta",
        3 to "Cavalo",
        4 to "Dentista",
        5 to "Fogo"
    )

//  Criar um dicionário que represente os apelidos que uso para chamar os
//  meus amigos. Para isso, o dicionário deverá ter como chave String e como
//  valor uma lista de Strings.

    val dicionario = mapOf(
        "João" to listOf("Juan", "Fissura", "Maromba"),
        "Miguel" to listOf("Night Watch", "Bruce Wayne", "Tampinha"),
        "Maria" to listOf("Wonder Woman", "Mary", "Marilene"),
        "Lucas" to listOf("Lukinha", "Jorge", "George")
    )

//  Em seguida crie uma classe Exercício 1 com seu método main, imprimir no
//  Main todas as chaves junto com seus valores associados. Para isso, utilizar
//  o foreach com as chaves.

    println("------------------------------")
    println("Números da Loteria dos Sonhos:")
    println("------------------------------")

//  for (n in 1..loteriaDosSonhos.size) {
//      println("${n - 1} -> ${loteriaDosSonhos[n - 1]}")
//  }

    loteriaDosSonhos.forEach {
        k, v -> println("$k -> $v")
    }


    println("\n----------------------------")
    println("Meus amigos e seus apelidos:")
    println("----------------------------")

    dicionario.forEach {
        k, v -> println("$k -> $v")
    }
}


