package javasmmr.zoowsome.services;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Lizzard;
import javasmmr.zoowsome.models.animals.Snake;

public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if(Constants.Animals.Reptiles.Lizzard.equals(type))
		{
			return new Lizzard();
		}
		else
			if(Constants.Animals.Reptiles.Snake.equals(type))
			{
				return new Snake();
			}
			else
				throw new Exception("Invalid animal exception!");
	}
}
