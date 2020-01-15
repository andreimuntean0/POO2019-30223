package farmacie;

public class Angajat implements AtributiiAngajat {

	String nume;
	int ID;
	String dataAngajarii;
	double bonusSalariu;

	public Angajat(String nume, int iD, String dataAngajarii, double bonusSalariu) {
		super();
		this.nume = nume;
		ID = iD;
		this.dataAngajarii = dataAngajarii;
		this.bonusSalariu = bonusSalariu;
	}

	public void adaugaMedicament(Farmacia f, Medicamente med, Stoc stc) {
		f.medsStoc.put(med, stc);
	}

	@Override
	public void eliminaMedicament(Farmacia f, Medicamente med) {
		f.medsStoc.remove(med);
	}

	@Override
	public Stoc verificaStoc(Farmacia f, Medicamente med) {
		return f.medsStoc.get(med);
	}

	@Override
	public boolean verificaVanzare(Farmacia f, Medicamente med) {
		if (f.medsStoc.containsKey(med))
			return true;
		else
			return false;
	}

	@Override
	public void modificaStoc(Farmacia f, Medicamente med, Stoc stcNou) {
		f.medsStoc.put(med, stcNou);
	}

	@Override
	public void procesareReteta(NumarRetete ret) {
		this.bonusSalariu = (0.15) * ret.pret;
	}
}
