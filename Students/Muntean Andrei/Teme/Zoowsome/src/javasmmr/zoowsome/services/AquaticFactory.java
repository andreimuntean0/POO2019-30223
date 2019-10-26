package javasmmr.zoowsome.services;

import javasmmr.zoowsome.models.animals.Animal;

public class AquaticFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) {
		if(Constants.Animals.Aquatics.BlackSeaBass.equals(type))
		{
			return new BlackSeaBass();
		}
		else
			if(Constants.Animals.Aquatics.Salmon.equals(type))
			{
				return new Salmon();
			}
			else
				throw new Exception("Invalid animal exception!");
		
	}

}
