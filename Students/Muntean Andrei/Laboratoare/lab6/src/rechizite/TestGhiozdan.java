package rechizite;

public class TestGhiozdan {

	public static void main(String[] args) {

		Ghiozdan g = new Ghiozdan();
		Caiet c1 = new Caiet();
		c1.setEticheta("MSI");
		
		Caiet c2 = new Caiet();
		c2.setEticheta("BD");

		Caiet c3 = new Caiet();
		c3=c1;

		Manual m1 = new Manual();
		m1.setEticheta("PL");

		Manual m2 = new Manual();
		m2.setEticheta("POO");

		Manual m3 = new Manual();
		m3.setEticheta("AF");
		
		int n=0;
		g.addCaiet(c1, n++);
		g.addManual(m1, n++);
		g.addManual(m3, n++);
		g.addCaiet(c3, n++);
		g.addCaiet(c2, n++);
		g.addManual(m3, n++);
		g.addManual(m2, n++);

		g.listItems();
		System.out.println();
		g.listCaiet();
		System.out.println();
		g.listManual();
	}

}
