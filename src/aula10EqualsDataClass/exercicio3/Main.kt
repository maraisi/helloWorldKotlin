package aula10EqualsDataClass.exercicio3

//1. Criar uma classe Aluno que tenha como propriedades um nome (String) e numeroDeAluno (Integer).
//2. Na classe Main, criar uma lista de alunos e adicionar quatro alunos novos.
//3. Criar um aluno novo com um número de aluno contido na lista e perguntar se ele está na lista (utilizar a função contains).
//4. Sobrescrever o equals da classe Aluno para que compare apenas o número de aluno.
//5. Perguntar novamente se o aluno novo está na lista. Qual é o resultado? O que mudou? Por quê?

fun main(){

    var listaAlunos = listOf(
            Aluno("Maraisi",1),
            Aluno("Gustavo",2),
            Aluno("Maria",3),
            Aluno("Michele", 4)
    )

    var alunoNovo = Aluno("AlunoNovo",4)

    println(listaAlunos.contains(alunoNovo))
    println(listaAlunos.equals(alunoNovo))



}