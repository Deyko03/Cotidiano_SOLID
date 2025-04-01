package DIP

class emailService {
    fun enviarMensaje(mensaje: String) {
        println("Enviando correo: $mensaje")
    }
}
class notificador {
    private val emailService = EmailService()
    fun notificar(mensaje: String) {
        emailService.enviarMensaje(mensaje)
    }
}
fun main() {
    val notificador = notificador()
    notificador.notificar("Hola Mundo!")
    }