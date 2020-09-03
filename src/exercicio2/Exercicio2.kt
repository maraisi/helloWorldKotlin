package exercicio2

fun main(){
    println(textosIguais("O rato roeu a roupa do Rei de Roma", "O rato roeu a roupa do Rei de Roma"))
}

fun textosIguais(text1: String, text2: String): Boolean{
    return text1 == text2
}