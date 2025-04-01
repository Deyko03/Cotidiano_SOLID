package DIP_Con

interface Motor {
    fun encender()
}
class MotorGasolina: Motor {
    override fun encender() {
        println("Motor de gasolina encendido")
    }
}
class MotorElectrico : Motor {
    override fun encender() {
        println("Motor eléctrico encendido")
    }
}
class Coche(private val motor: Motor){
    fun arrancar(){
        motor.encender()
    }
}
fun main() {
    val motorGasolina = MotorGasolina()
    val motorElectrico = MotorElectrico()
    val coche1 = Coche(motorGasolina)
    val coche2 = Coche(motorElectrico)
    coche1.arrancar()
    coche2.arrancar()
}