package srp


class cliente(val nombre: String, val edad: Int)

class RepositorioCliente {
    fun guardarCliente(cliente: Cliente) {
        println("Guardando cliente ${cliente.nombre} en la base de datos...")
    }
}

class ServicioCorreo {
    fun enviarCorreo(cliente: Cliente) {
        println("Enviando correo a ${cliente.nombre}...")
    }
}

fun main() {
    val cliente = Cliente("Carlos", 28)
    val repositorio = RepositorioCliente()
    val servicioCorreo = ServicioCorreo()

    repositorio.guardarCliente(cliente)
    servicioCorreo.enviarCorreo(cliente)
}