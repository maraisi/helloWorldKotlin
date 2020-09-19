package aula10EqualsDataClass.exercicio2

fun main(){
    var coca1 = Coca(2, 7.50)
    var coca2 = Coca(2, 10.50)


    println("----------------------------------------------------")
    println("Comparar se a primeira Coca criada é igual à segunda")
    println("----------------------------------------------------")

    when(coca1.equals(coca2)){
        true -> println("É a mesma Coca.")
        false -> println("Não é a mesma Coca.")
    }

    println("\n-----------------------------------------------------------------------------")
    println("Comparar se a primeira Coca criada é igual à segunda usando somente o tamanho")
    println("-----------------------------------------------------------------------------")

    when(coca1.tamanho.equals(coca2.tamanho)){
        true -> println("É a mesma Coca.")
        false -> println("Não é a mesma Coca.")
    }
}