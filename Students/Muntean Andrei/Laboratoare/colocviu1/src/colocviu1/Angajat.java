package colocviu1;

public class Angajat extends Persoana {

	String dataAngajare = new String();
	int nrClientiServiti;
	Client[] clientiServiti = new Client[10];

	public Angajat() {

	}

	public Angajat(String data, int nr, Client[] clientiS) {
		this.dataAngajare = data;
		this.nrClientiServiti = nr;
		this.clientiServiti = clientiS;
	}

	public void showPersonalInfo(Angajat angajat) {
		System.out.println("ID:" + angajat.getID());
		System.out.println("Nume: " + angajat.numePersoana);
	}

	public void servireClient(Angajat angajat, Client client) {
		client.sumaPlata = 0;
		for (int i = 0; i < client.nrProduseCumparate; i++) {
			client.sumaPlata += client.listaProduseCumparate[i].pret;
		}
		client.listaProduseCumparate = null;
		client.nrProduseCumparate = 0;
	}

	public void sortAngajati(Angajat[] angajati) {
		for (int i = 0; i < angajati.length - 1; i++)
			for (int j = 1; j < angajati.length; j++)
				if (angajati[i].nrClientiServiti > angajati[j].nrClientiServiti) {
					Angajat aux = angajati[i];
					angajati[i] = angajati[j];
					angajati[j] = aux;
				}
	}
}

