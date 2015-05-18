
public class Car extends Vehicle implements VehicleInterface  {
	private double NumberOfDoors;
	Car(String Name, String Color, double Weight, Person Owner, double NumberOfDoors){
		super(Name, Color, Weight, Owner);
		this.NumberOfDoors = NumberOfDoors;

	}
	public void transferOwnership(Person newOwner){
		this.setOwner(newOwner);
	}
}
