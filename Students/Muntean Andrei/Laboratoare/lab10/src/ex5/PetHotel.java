package ex5;

import java.util.ArrayList;
import java.util.List;

public class PetHotel {

	List <Caine> caini = new ArrayList<Caine>();
	
	public  void addCaine(Caine c) {
		this.caini.add(c);
	}

	public  void removecaine(Caine c) {
		this.caini.remove(c);
	}

	public void print() {
		for(Caine c: caini) {
			System.out.println(c + " " + c.nrCamera);
		}
	}
}
