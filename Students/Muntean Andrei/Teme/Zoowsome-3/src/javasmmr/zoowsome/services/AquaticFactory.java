package javasmmr.zoowsome.services;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.BlackSeaBass;
import javasmmr.zoowsome.models.animals.Salmon;

public class AquaticFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) throws Exception {
		if(Constants.Animals.Aquatics.BlackSeaBass.equals(type))
		{
			return BlackSeaBass();
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
