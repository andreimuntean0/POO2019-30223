package lab8;

public class Zi {

	String nume;
	boolean lucratoare;

	public Zi() {

	}

	public Zi(String Nume, boolean Lucratoare) {
		this.nume = Nume;
		this.lucratoare = Lucratoare;
	}

	public boolean esteLucratoare() {
		return lucratoare;
	}

	public void setLucratoare() {
		this.lucratoare = true;
	}

	public void setNelucratoare() {
		this.lucratoare = false;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String newNume) {
		this.nume = newNume;
	}
}
