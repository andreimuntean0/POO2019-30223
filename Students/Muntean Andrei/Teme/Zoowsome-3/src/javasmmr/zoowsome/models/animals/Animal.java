package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

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

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}

	public void decodeFromXml(Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));

	}

	private void setDangerPerc(Double valueOf) {
		// TODO Auto-generated method stub

	}

	private void setMaintenanceCost(Double valueOf) {
		// TODO Auto-generated method stub

	}

}
