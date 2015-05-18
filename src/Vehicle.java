
public abstract class Vehicle {
	private String Name;
	private String Color;
	private double Weight;
	private Person Owner;

	public void transferOwnership(Person newOwner){
		this.setOwner(newOwner);
	}
	public Vehicle(String Name, String Color, double Weight, Person Owner){
		this.Name=Name;
		this.Color=Color;
		this.Weight=Weight;
		this.setOwner(Owner);
				
	}
	public Person getOwner() {
		return Owner;
	}
	public void setOwner(Person owner) {
		Owner = owner;
	}
}
