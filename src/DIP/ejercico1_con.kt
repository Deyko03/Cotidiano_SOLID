package DIP

// Interfaz que define el servicio de mensajería
interface IMensajeService {
    fun enviarMensaje(mensaje: String)
}

// Implementación concreta de un servicio de email
class EmailService : IMensajeService {
    override fun enviarMensaje(mensaje: String) {
        println("Enviando correo: $mensaje")
    }
}

// Otra posible implementación de un servicio de SMS
class SMSService : IMensajeService {
    override fun enviarMensaje(mensaje: String) {
        println("Enviando SMS: $mensaje")
    }
}

// Notificador ahora depende de la abstracción (IMensajeService) en lugar de una implementación concreta
class Notificador(private val servicio: IMensajeService) {
    fun notificar(mensaje: String) {
        servicio.enviarMensaje(mensaje)
    }
}

fun main() {
    // Podemos cambiar la implementación sin modificar Notificador
    val notificadorEmail = Notificador(EmailService())
    notificadorEmail.notificar("Hola Mundo por Email!")

    val notificadorSMS = Notificador(SMSService())
    notificadorSMS.notificar("Hola Mundo por SMS!")
}