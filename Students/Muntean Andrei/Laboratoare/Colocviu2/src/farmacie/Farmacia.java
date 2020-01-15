package farmacie;

import java.util.*;

public class Farmacia implements Cloneable {

	Map<Medicamente, Stoc> medsStoc = new HashMap<Medicamente, Stoc>();
	Map<Angajat, NumarRetete> reteteAngajat = new HashMap<Angajat, NumarRetete>();
	Set<Angajat> colectieAngajati = new HashSet<Angajat>();

	public Farmacia(Map<Medicamente, Stoc> medsStoc, Map<Angajat, NumarRetete> reteteAngajat,
			Set<Angajat> colectieAngajati) {
		super();
		this.medsStoc = medsStoc;
		this.reteteAngajat = reteteAngajat;
		this.colectieAngajati = colectieAngajati;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
