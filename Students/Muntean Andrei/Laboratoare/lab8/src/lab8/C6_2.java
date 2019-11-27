package lab8;

public class C6_2 {

	 Lucrator l = null;
	 Zi z = new Zi("Joi", true);

	public  void main(String[] args) throws NullPointerException, ExceptieZiNelucratoare {
		try {
			l.lucreaza(z);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException" + e.getMessage());
		}
	}

}
