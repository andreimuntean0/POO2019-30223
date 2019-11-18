package colocviu1;

public class Client extends Persoana {

	int nrProduseCumparate;
	Produs[] listaProduseCumparate = new Produs[200];
	int sumaPlata;

	public Client() {

	}

	public Client(int nrProduseCumparate, Produs[] lista, int sumaPlata) {
		this.nrProduseCumparate = nrProduseCumparate;
		this.listaProduseCumparate = lista;
		this.sumaPlata = sumaPlata;
	}

	public void showPersonalInfo(Client client) {
		System.out.println("ID:" + client.getID());
		System.out.println("Nume: " + client.numePersoana);
	}

	public void addProdusSupermarket(Produs produs) {
		if (produs.inStoc(produs) == true) {// presupunem ca se adauga un singur exemplar
			listaProduseCumparate[nrProduseCumparate++] = produs;
			produs.nrExemplarestoc--;
		} else
			System.out.println("Stoc insuficient");
	}
}
