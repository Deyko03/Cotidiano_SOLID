package LSP

interface dispositivo {
    fun encender()
}

class televisor : dispositivo {
    override fun encender() {
        println("Encendiendo televisor...")
        }
}

class radio {
    fun sintonizar() {
        println("Sintonizando radio...")
        }
}

fun main() {
    val televisor: dispositivo = televisor()
    televisor.encender()

    val radio = radio()
    radio.sintonizar()
}