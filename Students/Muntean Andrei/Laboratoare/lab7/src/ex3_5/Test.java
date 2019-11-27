package ex3_5;

import java.awt.Color;

public class Test {

	public static void revopsire(Masina m, Color newColor)
	{
		m.culoare=newColor;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Masina m1 = new Masina("Audi", Color.GRAY);
		Masina m2 = new Masina("BMW", Color.BLACK);
		Masina m3 = new Masina("Dacia", Color.RED);
				
		System.out.println("Masina 1 inainte de shallowCopy: " + m1);
		
		Masina mShallow = m3;
		Masina mDeep = (Masina) m3.clone();
		System.out.println("Masina 1 dupa shallowCopy: " + m1);
		System.out.println("Masina 3 shallowCopy: " +mShallow);
		System.out.println("Masina 3 deepCopy: " +mDeep);
		//toate la fel

		Student s1 = new Student("Muntean","Andrei",m1);
		Student sShallow = s1;
		Student s2 = new Student("Sas","Marcel",m2);
		Student sDeep = (Student) s2.clone();

		System.out.println(s1.toString());
		
		//revopsire sShallow->se va schimba culoarea pt primele 2 masini
		//revopsire Deep -> doar pt masina 3
		revopsire(sShallow.auto, Color.BLUE);
		revopsire(sDeep.auto, Color.GREEN);
		
		System.out.println(sShallow);
		
	}

}
