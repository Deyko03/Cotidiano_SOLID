package OCP

interface MetodoEnvio {
    fun enviar(archivo: String)
}

class EnvioFTP : MetodoEnvio {
    override fun enviar(archivo: String) {
        println("Enviando archivo por FTP: $archivo")
    }
}

class EnvioHTTP : MetodoEnvio {
    override fun enviar(archivo: String) {
        println("Enviando archivo por HTTP: $archivo")
    }
}

class GestorEnvio {
    fun enviarArchivo(metodo: MetodoEnvio, archivo: String) {
        metodo.enviar(archivo)
    }
}

fun main() {
    val gestorEnvio = GestorEnvio()

    val envioFTP = EnvioFTP()
    val envioHTTP = EnvioHTTP()

    gestorEnvio.enviarArchivo(envioFTP, "documento.txt")
    gestorEnvio.enviarArchivo(envioHTTP, "imagen.png")
}