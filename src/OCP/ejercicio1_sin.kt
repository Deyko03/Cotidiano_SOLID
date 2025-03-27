package OCP

class grafica {
    fun dibujar(tipo: String) {
        when (tipo) {
            "barra" -> println("Dibujando gráfica de barras")
            "linea" -> println("Dibujando gráfica de líneas")
            else -> println("Tipo de gráfica no soportado")
        }
    }
}
fun main() {
    val grafica = grafica()
    grafica.dibujar("barra")
    grafica.dibujar("linea")
}

