package ex3_4;

public class Persoana implements Comparable<Persoana> {
	String nume = new String();
	String prenume = new String();
	int varsta;

	public Persoana() {

	}

	public Persoana(String n, String p, int v) {
		this.nume = n;
		this.prenume = p;
		this.varsta = v;
	}

	@Override
	public int compareTo(Persoana pers) {
		return this.nume.compareTo(pers.nume);
	}

	public String toString() {
		return nume + " " + prenume + " " + varsta;
	}
}
