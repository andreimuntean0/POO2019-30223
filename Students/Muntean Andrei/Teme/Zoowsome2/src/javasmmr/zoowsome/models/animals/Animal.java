package javasmmr.zoowsome.models.animals;

public abstract class Animal implements Killer {

	int nrOfLegs;
	String name = new String();
	final Double maintenanceCost; // h/week 0.1->8
	final Double dangerPerc;
	boolean takenCareOf;

	public Animal() {
		this.maintenanceCost = null;
		this.dangerPerc = null;
		this.takenCareOf = false;
	}

	public Animal(int nrOfLegs, String name, final Double maintenanceCost, final Double dangerPerc) {
		this.nrOfLegs = nrOfLegs;
		this.name = name;
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
		this.takenCareOf = false;
	}

	public abstract class Mammal extends Animal {
		float normalBodyTemp, percBodyHair;
	}

	public abstract class Reptile extends Animal {
		boolean laysEggs;
	}

	public abstract class Bird extends Animal {
		boolean migrates;
		int avgFlightAltitude;
	}

	public static abstract class Aquatic extends Animal {
		int avgSwinDepth;

		enum waterType {
			Saltwater, Freshwater;
		}
	}

	public abstract class Insect extends Animal {
		boolean canFly, isDangerous;
	}

	public boolean getTakenCareof() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean newTakenCareOf) {
		this.takenCareOf = newTakenCareOf;
	}

	public int getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(int newNrOfLegs) {
		this.nrOfLegs = newNrOfLegs;
	}

	public String getName() {

		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

}
