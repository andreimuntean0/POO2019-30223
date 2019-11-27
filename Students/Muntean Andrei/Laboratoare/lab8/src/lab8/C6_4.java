package lab8;

public class C6_4 {

	CalendarLucru c = new CalendarLucru();

	public void main(String[] args) throws Exception {

		try {
			if (c.zile[0].esteLucratoare() == true && c.zile[5].esteLucratoare() == true) {
				c.zile[0].setNelucratoare();
				c.zile[5].setNelucratoare();
			} else
				throw new LiberException("Nu lucreaza luni/vineri.");
		} 
		catch(LiberException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println("Exception" + e.getMessage());

		}
	}

}
