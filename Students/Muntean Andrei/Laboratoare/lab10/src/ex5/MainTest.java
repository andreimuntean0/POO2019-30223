package ex5;

public class MainTest {

	public static void main(String[] args) {

		PetHotel petHotel = new PetHotel();
		Caine c1 = new Caine("Max", 3, "-", false, 1, 11, "AFVRVC");
		Caine c2 = new Caine("Henry", 8, "Labrador", true, 2, 22, "DETBCR");
		Caine c3 = new Caine("Seth", 2, "French Bulldog", true, 3, 33, "FTHNTV");
		Caine c4 = new Caine("Tofu", 4, "Corgi", true, 4, 44, "TGFDEW");
		Caine c5 = new Caine("Frankie", 9, "Dachshund", true, 5, 55, "DRGGTG%FDE");

		petHotel.addCaine(c1);
		petHotel.addCaine(c2);
		petHotel.addCaine(c3);
		petHotel.addCaine(c4);
		petHotel.addCaine(c5);

		petHotel.print();
	}

}
