package colocviu1;

public class ClientFidel extends Client {

	int nrPuncte;
	int sumaPlata;
	double discount;

	public ClientFidel() {

	}

	public ClientFidel(int nrPuncte, int sumaPlata, double discount) {
		this.nrPuncte = nrPuncte;
		this.sumaPlata = sumaPlata;
		this.discount = discount;
	}

	public void calcPuncte(ClientFidel clientFidel) {
		if (clientFidel.sumaPlata < 100)
			clientFidel.nrPuncte += 5;
		else if (clientFidel.sumaPlata < 200)
			clientFidel.nrPuncte += 15;
		else if (clientFidel.sumaPlata < 500)
			clientFidel.nrPuncte += 40;
		else if (clientFidel.sumaPlata < 1000)
			clientFidel.nrPuncte += 50;
		else
			clientFidel.nrPuncte += 100;
	}

	public void calcDiscount(ClientFidel clientFidel) {

	}

	public void showPersonalInfo(ClientFidel clientFidel) {
		System.out.println("ID:" + clientFidel.getID());
		System.out.println("Nume: " + clientFidel.numePersoana);
	}

	public void sortClientiFideli(ClientFidel[] clientiFideli) {
		for (int i = 0; i < clientiFideli.length - 1; i++)
			for (int j = 1; j < clientiFideli.length; j++)
				if (clientiFideli[i].sumaPlata > clientiFideli[j].sumaPlata) {
					ClientFidel aux = clientiFideli[i];
					clientiFideli[i] = clientiFideli[j];
					clientiFideli[j] = aux;
				}
	}

}
