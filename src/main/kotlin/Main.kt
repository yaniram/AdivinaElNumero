fun main(args: Array<String>) {
    var contador = 10
    while (contador > 0){
        println("Elvalor de contador es: $contador")
        contador--
    }

    println("Generando número aleatorio...")
    val numeroAleatorio = (1..10).random()
    println("El numero aleatorio $numeroAleatorio")
do {
    println("Adivina el numero entre 1 a 10, ¿Cuál crees que es?: ")
    val numero = readLine()!!.toString().toInt()

} while (numeroAleatorio != numero)
    println("Ganaste!")

}