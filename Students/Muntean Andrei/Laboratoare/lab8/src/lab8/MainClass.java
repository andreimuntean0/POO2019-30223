package lab8;

public class MainClass {

	public static void main(String[] args) {

		CalendarLucru calendarGigel = new CalendarLucru();
		Lucrator l1 = new Lucrator("Gigel",calendarGigel);
		
		try {
			l1.lucreaza(calendarGigel.zile[0]);
		} catch (ExceptieZiNelucratoare e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
