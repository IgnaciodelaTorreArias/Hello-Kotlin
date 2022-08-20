import kotlin.random.Random

fun main() {
    println("Hello, Kotlin!!!")
}
fun exampleCode(): Int { // Los parametros son constantes y se puede espeificar retorno de funciones
    val number = Random(System.nanoTime()).nextInt(10) + 1
    var adversario = Random(System.nanoTime()).nextInt(10) + 1
    when(number){ //Parecido a Switch, tambien puede evaluar cadenas
        10 -> println("Excelente")
        8,9 -> println("Bien")
        in 6..7 -> println("Pasaste")
        else -> println("Lo siento")
    }
    var cadena = when{//usado para asignar un valor y para checar sentencias booleanas
        number == 10 && adversario == 10 -> "Ambos son excelentes"
        number == adversario -> "Es un empate"
        number < 7 && adversario >= 7 -> "El adversario es mejor"
        number < 7 && adversario < 7 -> "Los dos son terribles"
        else -> "Unknown"
    }
    println(cadena)
    println("Juntos logran: ${number + adversario}\nTu puntaje es: $number")
	labeledLoop@ for (count in 1 until 10){ //loops con marcadores/banderas
        for (compare in 10 downTo 1){
            if(compare == count){
                print("\n")
                continue@labeledLoop
            }
            print("$count | ")
        }
	}
    //nullable
    var nombre: String? = "Ignacio"
    var length = nombre?.length //safe call, si es null retornar null y no hay error por querer la propiedad
    //length de un null, si tiene un valor se llama a la propiedad length
    println(length)
    length = nombre?.length?:10
    println(length)
    nombre = null
    length = nombre?.length
    println(length)
    length = nombre?.length?:10 // Operador de Elvis, si hay un valor null retorna el valor predeterminado
    println(length)
	return 1
}