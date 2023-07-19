/* Hey there, if you think that Dagger,Koin,Anvil are DI (Dependency Injection) then you're wrong my
friend. These are just the frameworks for impl(implementation/implementing) DI.

Car has 2 components : Tyre and Engine, without which it can't run. So, I create the below code to depict
the dependency of Car class on the classes Tyre and Engine.

Congo, this was DI :) But since, we are doing everything by ourselves, so its called as Manual DI
 */


class Car(
    val tyre: Tyre,
    val engine: DieselEngine
) {
    // Build the car here
}

data class Tyre(
    val companyName: String,
    val type: String
)

data class DieselEngine(
    val capacity: Int,
    val type: String
)

fun main() {
    val myTyre = Tyre(companyName = "CEAT", type = "RUBBER")
    val myEngine = DieselEngine(capacity = 1200, type = "DIESEL")

    // Injecting dependencies of tyre and engine classes into the Car class
    val car = Car(tyre = myTyre, engine = myEngine)
}

/* What's the use?
DI allows us to easily switch between different impl of a dependency. Ex: We can have one impl of a
repository that uses localDB for data storage and another impl that uses a remoteAPI.
Let's see this in our second code.
*/
