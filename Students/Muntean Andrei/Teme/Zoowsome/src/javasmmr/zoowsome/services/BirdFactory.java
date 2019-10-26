package javasmmr.zoowsome.services;

import javasmmr.zoowsome.models.animals.Animal;

public class BirdFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) {
		if(Constants.Animals.Birds.Toucan.equals(type))
		{
			return new Toucan();
		}
		else
			if(Constants.Animals.Birds.Parrot.equals(type))
			{
				return new Parrot();
			}
			else
				throw new Exception("Invalid animal exception!");
	}

}
