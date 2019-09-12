package final_module

class Airfreighter(override var capacity: Int) : Carrying, IAirPlaneInfo {

}

fun main(){
    var plane: Carrying = Airfreighter(3000)
    print("Грузоподьемность самолета " + plane.capacity)
}