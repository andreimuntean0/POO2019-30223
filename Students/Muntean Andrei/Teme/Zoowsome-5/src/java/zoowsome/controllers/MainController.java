package java.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.Constants;
import javasmmr.zoowsome.services.SpeciesFactory;
import javasmmr.zoowsome.services.factories.AnimalFactory;

public class MainController {

	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cat);
		System.out.printf("We have an animal with %d legs", a1.getNrOfLegs());

		String result;
		Animal[] Animale = new Animal[4];
		Caretakers[] Ingrijitori = new Caretakers[4];
		for (Caretakers c : Ingrijitori) {
			for (Animal a : Animale) {
				if (c.getIsDead() && a.getTakenCareof() == false) {
					result = c.takeCareOf(a);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						c.setIsDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						// try take care + skip to next animal
					} else {
						a.setTakenCareOf(true);
					}
				}
			}
		}

	}
}
