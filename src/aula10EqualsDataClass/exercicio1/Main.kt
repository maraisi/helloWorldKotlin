package aula10EqualsDataClass.exercicio1

//  2. Na classe Main, criar duas pessoas com o mesmo número de RG.

//  4. Sobrescrever o equals da classe Pessoa para que compare apenas o número de RG.
//  5. Refazer a comparação utilizando o equals. Qual é o resultado? O que mudou? Por quê?

fun main(){
    var ana = Pessoa("Ana Maria", 987654321)
    var joao = Pessoa("João Paulo", 987654321)

//3. Usando equals, comparar se a primeira pessoa criada é igual à segunda. Qual é o resultado?

    println("------------------------------------------------------")
    println("Comparar se a primeira pessoa criada é igual à segunda")
    println("------------------------------------------------------")

    when(ana.equals(joao)) {
        true -> println("São a mesma pessoa.")
        false -> println("Não são a mesma pessoa.")
    }

    println("\n-------------------------------------------------------------------------------------------")
    println("Comparar se a primeira pessoa criada é igual à segunda usando \"data class\" e o atributo RG")
    println("--------------------------------------------------------------------------------------------")

    when(ana.rg.equals(joao.rg)){
        true -> println("São a mesma pessoa.")
        false -> println("Não são a mesma pessoa.")
    }

}