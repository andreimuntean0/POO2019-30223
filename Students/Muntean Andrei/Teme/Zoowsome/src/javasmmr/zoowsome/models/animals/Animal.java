package javasmmr.zoowsome.models.animals;

public abstract class Animal {

	public abstract class Mammal extends Animal{
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
		enum waterType
		{
			Saltwater,
			Freshwater;
		}
	}
	
	public abstract class Insect extends Animal{
		boolean canFly, isDangerous;
	}
	
	int nrOfLegs;
	String name =new String();
	
	public int getNrOfLegs()
	{
		return nrOfLegs;
	}
	
	public void setNrOfLegs(int newNrOfLegs)
	{
		this.nrOfLegs= newNrOfLegs;
	}
	
	public String getName()
	{
		
		return name;
	}
	
	public void setName(String newName)
	{
		this.name=newName;
	}

}
