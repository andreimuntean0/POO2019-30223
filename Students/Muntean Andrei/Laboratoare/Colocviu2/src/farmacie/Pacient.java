package farmacie;

public abstract class Pacient {

	String nume;
	String prenume;
	int varsta;
	String sex;

	public Pacient() {

	}

	public Pacient(String nume, String prenume, int varsta, String sex) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.sex = sex;
	}

	public void calculGradSeveritate() {

	}
}
