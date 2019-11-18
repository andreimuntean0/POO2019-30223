package colocviu1;

public class Supermarket {

	int nAngajat = 0, nClientFidel = 0, nProdus = 0;
	private Angajat[] angajati = new Angajat[5];
	private ClientFidel[] clientiFideli = new ClientFidel[5];
	Produs[] produse = new Produs[100];

	public void addProdus(Produs newProdus) {
		this.produse[nProdus++] = newProdus;
	}

	public void addAngajat(Angajat newAngajat) {
		this.angajati[nAngajat++] = newAngajat;
	}

	public void addClientFidel(ClientFidel newClientFidel) {
		this.clientiFideli[nClientFidel++] = newClientFidel;
	}

	public void showListClientiFideli(ClientFidel[] clientiFideli) {
		// clientiFideli.sortClientiFideli(clientiFideli);
		for (int i = 0; i < clientiFideli.length; i++)
			System.out.println(clientiFideli[i].numePersoana);
	}

	public void showListAngajati(Angajat[] angajati) {
		// angajati.sortAngajati(angajati);
		for (int i = 0; i < angajati.length; i++)
			System.out.println(angajati[i].numePersoana);
	}

	public void showStats() {

	}

	public void afisareSupermarket(Supermarket s) {
		for (int i = 0; i < nAngajat; i++)
			afisareAngajat(s.angajati[i]);

	}

	private void afisareAngajat(Angajat angajat) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		Supermarket Kauffland = new Supermarket();
		Supermarket Auchan = new Supermarket();

		Client[] clienti = new Client[5];
		Kauffland.angajati[0] = new Angajat("10.10.1999", 10, clienti);
		Kauffland.angajati[1] = new Angajat("01.01.1439", 5, clienti);
		Kauffland.angajati[2] = new Angajat("12.04.1999", 0, clienti);
		Kauffland.angajati[3] = new Angajat("24.03.1979", 2, clienti);
		Kauffland.angajati[4] = new Angajat("29.10.2010", 20, clienti);

		ClientFidel cf1 = new ClientFidel();
		ClientFidel cf2 = new ClientFidel(0, 10, 0);
		Kauffland.addClientFidel(cf1);
		Kauffland.addClientFidel(cf2);

		Persoana p = new Persoana(2, "Andrei");

	}
}
