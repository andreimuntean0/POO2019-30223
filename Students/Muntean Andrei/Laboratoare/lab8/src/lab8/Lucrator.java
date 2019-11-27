package lab8;

public class Lucrator {

	String nume;
	CalendarLucru calendar;

	public Lucrator() {
		
	}
	
	public Lucrator(String nume, CalendarLucru calendar) {
		super();
		this.nume = nume;
		this.calendar = calendar;
	}



	public void lucreaza(Zi zi) throws ExceptieZiNelucratoare {
		if (zi.esteLucratoare() == true)
			System.out.println("Zi lucratoare");
		else
			throw new ExceptieZiNelucratoare();
	}
}
