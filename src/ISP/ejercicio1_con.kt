package ISP

interface Encendedor {
    fun encender()
}

interface Apagador {
    fun apagar()
}

interface Router {
    fun conectarWifi()
}

interface Actualizador {
    fun actualizarFirmware()
}

class lampara : Encendedor, Apagador {
    override fun encender() {
        println("Encendiendo la lámpara")
    }
    override fun apagar() {
        println("Apagando la lámpara")
    }
}

fun main() {
    val lampara = Lampara()
    lampara.encender()
    lampara.apagar()
}