/*
Let's say I want to create a Car with PetrolEngine, but now it has only DieselEngine, so create a Generic
that will implement both petrol and diesel engines.   */

class Car(
    val tyre: Tyre,
    val engine: Engine
) {
    // Build the car here
}

data class Tyre(
    val companyName: String,
    val type: String
)

interface Engine {
    val powerCapacity: Int

}


//Let Engine classes implement the interface
data class DieselEngine(
    val tankCapacity: Int,
    override val powerCapacity: Int
) : Engine

data class PetrolEngine(
    val tankCapacity: Int,
    val color: String,
    override val powerCapacity: Int
) : Engine


fun main() {
    val myTyre = Tyre(companyName = "CEAT", type = "RUBBER")
    val petrolEngine = PetrolEngine(tankCapacity = 1400, color = "RED", powerCapacity = 2000)
    val dieselEngine = DieselEngine(tankCapacity = 1400, powerCapacity = 2000)

    val petrolCar = Car(tyre = myTyre, engine = petrolEngine)
    val dieselCar = Car(tyre = myTyre, engine = dieselEngine)

}