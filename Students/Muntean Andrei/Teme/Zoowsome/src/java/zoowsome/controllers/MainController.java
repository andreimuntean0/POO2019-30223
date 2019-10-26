package java.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.Constants;
import javasmmr.zoowsome.services.SpeciesFactory;
import javasmmr.zoowsome.services.factories.AnimalFactory;
public class MainController {

	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory= new AnimalFactory();
		SpeciesFactory speciesFactory1= abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1= speciesFactory1.getAnimal(Constants.Animals.Mammals.Cat);
		System.out.printf("We have an animal with %d legs", a1.getNrOfLegs());
	}

}
