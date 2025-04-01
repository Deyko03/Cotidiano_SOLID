package LSP

open class Figura {
    open fun calcularArea(): Int {
        return 0
    }
}

class cuadrado(var lado: Int) : Figura() {
    override fun calcularArea(): Int {
        return lado * lado
        }
}

class rectangulo(var ancho: Int, var alto: Int) : Figura() {
    override fun calcularArea(): Int {
        return ancho * alto
    }
}

fun main() {
    val cuadrado = Cuadrado(5)
    val rectangulo = Rectangulo(5, 10)

    println("Área del cuadrado: ${cuadrado.calcularArea()}")
    println("Área del rectángulo: ${rectangulo.calcularArea()}")
}