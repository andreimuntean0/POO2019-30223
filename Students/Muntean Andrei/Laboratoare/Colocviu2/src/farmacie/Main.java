package farmacie;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Stoc stc1 = new Stoc(2);
		Stoc stc2 = new Stoc(89);

		Medicamente m1 = new Medicamente("asd");
		Medicamente m2 = new Medicamente("fff");
		Medicamente m3 = new Medicamente("aas");

		Angajat a1 = new Angajat("Andrei", 1, "2019-12-12", 0);
		Angajat a2 = new Angajat("Radu", 2, "2019-10-12", 0);

		NumarRetete ret = new NumarRetete();
		NumarRetete ret2 = new NumarRetete();

		Map<Medicamente, Stoc> medsStoc = new HashMap<Medicamente, Stoc>();
		Map<Angajat, NumarRetete> reteteAngajat = new HashMap<Angajat, NumarRetete>();
		Set<Angajat> colectieAngajati = new HashSet<Angajat>();

		medsStoc.put(m1, stc1);
		medsStoc.put(m2, stc2);
		medsStoc.put(m3, stc2);

		reteteAngajat.put(a1, ret);
		reteteAngajat.put(a2, ret2);

		colectieAngajati.add(a1);
		colectieAngajati.add(a2);

		Farmacia f = new Farmacia(medsStoc, reteteAngajat, colectieAngajati);
		DoctorulFarmaciei doc = new DoctorulFarmaciei(ret, f);

	}

}
