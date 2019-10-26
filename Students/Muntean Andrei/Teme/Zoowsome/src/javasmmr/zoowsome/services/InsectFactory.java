package javasmmr.zoowsome.services;

import javasmmr.zoowsome.models.animals.Animal;

public class InsectFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) {
		if(Constants.Animals.Insects.Bee.equals(type))
		{
			return new Bee();
		}
		else
			if(Constants.Animals.Insects.Fly.equals(type))
			{
				return new Fly();
			}
			else
				throw new Exception("Invalid animal exception!");
	}

}
