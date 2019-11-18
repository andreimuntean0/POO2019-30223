package colocviu1;

public class Persoana {

	private int ID;
	String numePersoana = new String();

	public Persoana() {

	}

	public Persoana(final int id, String nume) {
		this.ID = id;
		this.numePersoana = nume;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void showPersonalInfo(Persoana person) {
		System.out.println("ID:" + person.getID());
		System.out.println("Nume: " + person.numePersoana);
	}

}
