package aula09Colletions.exercicios.exercício3

//  Criar uma nova classe chamada Prova. Definir e implementar o seguinte método:
//  public void somaTotal(Set<Integer> conjuntoDeInteiros).

//  O método deve percorrer o conjunto de inteiros, ir acumulando o total da soma
//  dos valores e, no final, imprimir na tela o valor da soma total.

class Prova() {

    fun somaTotal(){
        val conjuntoDeInteiros = setOf<Int>()

        return conjuntoDeInteiros.forEach {
            k -> k + k
        }

    }



}