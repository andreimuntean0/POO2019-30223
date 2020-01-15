package farmacie;

public interface AtributiiAngajat {

	void adaugaMedicament(Farmacia f, Medicamente med, Stoc stc);

	void eliminaMedicament(Farmacia f, Medicamente med);

	Stoc verificaStoc(Farmacia f, Medicamente med);

	boolean verificaVanzare(Farmacia f, Medicamente med);

	void modificaStoc(Farmacia f, Medicamente med, Stoc stcNou);

	void procesareReteta(NumarRetete ret);
}
