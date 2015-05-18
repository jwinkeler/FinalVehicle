
public class Truck extends Vehicle implements VehicleInterface {
	private double NumberOfAxels;

	Truck(String Name, String Color, double Weight, Person Owner, double NumberOfAxels){
		super(Name, Color, Weight, Owner);
		this.NumberOfAxels = NumberOfAxels;

	}
	public void transferOwnership(Person newOwner){
		this.setOwner(newOwner);
	}
}