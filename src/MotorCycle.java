
public class MotorCycle extends Vehicle implements VehicleInterface {
	private boolean hasSideCar;
	MotorCycle(String Name, String Color, double Weight, Person Owner, boolean hasSideCar){
		super(Name, Color, Weight, Owner);
		this.hasSideCar = hasSideCar;

	}
	public void transferOwnership(Person newOwner){
		this.setOwner(newOwner);
	}
}

