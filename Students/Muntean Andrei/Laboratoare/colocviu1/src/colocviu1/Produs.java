package colocviu1;

public class Produs extends Supermarket {

	String nume = new String();
	int pret;
	int nrExemplarestoc;

	public Produs() {
	}

	public Produs(String nume, int pret, int nrExemplareStoc) {
		this.nume = nume;
		this.pret = pret;
		this.nrExemplarestoc = nrExemplareStoc;
	}

	public boolean inStoc(Produs p) {
		if (p.nrExemplarestoc <= 0)
			return false;
		return true;
	}
}
