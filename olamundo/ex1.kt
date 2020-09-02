fun main(){
    return maiorDeTres()
}

fun maiorDeTres(a: Int, b:Int, c:Int): Int{
    if(a > b && a > c){
        return a
    } else if(b > a && b > c){
        return b
    } else{
        return c
    }
}