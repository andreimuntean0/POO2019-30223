package ex3_4;

import java.util.Arrays;

public class mainTest {

	public static void main(String[] args) {
		Persoana[] pers = new Persoana[3];
		pers[0] = new Persoana("Muntean", "Andrei", 20);
		pers[1] = new Persoana("AAA", "A", 50);
		pers[2] = new Persoana("FFF", "Andrei", 22);
		Arrays.sort(pers);
		for (int i = 0; i < 3; i++)
			System.out.println(pers[i]);
	}
}
