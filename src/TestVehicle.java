import java.util.HashMap;
import java.util.UUID;


public class TestVehicle {
	public static HashMap<UUID, Vehicle> vehicles = new HashMap<UUID, Vehicle>();
	public static void main(String[] args) {

		Person Julia = new Person("Julia", "Winkeler");
		Car newCar = new Car("Toyota Corola", "Blue", 500, Julia,4);
		Truck newTruck = new Truck("Ford F-150","Red", 1000, Julia,2);
		Person Sabrina = new Person("Sabrina", "Casares");
		newTruck.transferOwnership(Sabrina);
		MotorCycle newMotorCycle = new MotorCycle("Harley", "Black", 250, Sabrina, false);
		vehicles.put(newCar.getOwner().getPersonID(), newCar);
		vehicles.put(newTruck.getOwner().getPersonID(),newTruck);
		vehicles.put(newMotorCycle.getOwner().getPersonID(),newMotorCycle);
		

	}
}