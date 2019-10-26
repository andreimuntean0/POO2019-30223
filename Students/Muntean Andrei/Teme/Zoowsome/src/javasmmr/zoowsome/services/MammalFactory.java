package javasmmr.zoowsome.services;

import javasmmr.zoowsome.models.animals.Animal;

public class MammalFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) {
		if(Constants.Animals.Mammals.Dog.equals(type))
		{
			return new Dog();
		}
		else
			if(Constants.Animals.Mammals.Cat.equals(type))
			{
				return new Cat();
			}
			else
			{
				throw new Exception("Invalid animal exception!");
			}
	}

}
