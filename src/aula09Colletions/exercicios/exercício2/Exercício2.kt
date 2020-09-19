package aula09Colletions.exercicios.exercício2

fun main(){

//    Definir e inicializar uma nova lista vazia. Adicionar os seguintes
//    elementos à lista vazia: 1,5,5,6,7,8,8,8.
//    Imprimir o resultado na tela.

    val listaVazia = mutableListOf<Int> ()

    listaVazia.add(1)
    listaVazia.add(5)
    listaVazia.add(5)
    listaVazia.add(6)
    listaVazia.add(7)
    listaVazia.add(8)
    listaVazia.add(8)
    listaVazia.add(8)

//    Definir e inicializar um novo conjunto vazio. Adicionar os seguintes
//    elementos ao conjunto vazio: 1,5,5,6,7,8,8,8.
//    Imprimir o resultado na tela. Qual é a diferença entre este exercício e o
//    anterior?

    val conjuntoVazio = mutableSetOf<Int> ()

    conjuntoVazio.add(1)
    conjuntoVazio.add(5)
    conjuntoVazio.add(5)
    conjuntoVazio.add(6)
    conjuntoVazio.add(7)
    conjuntoVazio.add(8)
    conjuntoVazio.add(8)
    conjuntoVazio.add(8)



//    Em seguida crie uma classe Exercício 2 com seu método main, imprimir no
//    Main todas as chaves junto com seus valores associados. Para isso, utilizar
//    o foreach com as chaves ou o método toString().

    println("------------")
    println("Lista Vazia:")
    println("------------")

    listaVazia.forEach{
        n -> println(n)
    }

    println("\n---------------")
    println("Conjunto Vazio:")
    println("---------------")

    conjuntoVazio.forEach{
        n -> println(n)
    }

    println("\nA diferença entre a lista e o conjunto é o index.\nEm uma lista a ordem dos elementos é importante, então elementos de valores iguais em ordens diferentes não são a mesma coisa.\nJá em um conjunto, a ordem não interessa, então você tem um conjunto de valores que não se repetem.  ")

}