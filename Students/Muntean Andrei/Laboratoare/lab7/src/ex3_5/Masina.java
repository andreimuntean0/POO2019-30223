package ex3_5;
import java.awt.Color; 
public class Masina extends Student{

	String marca = new String();
	Color culoare;
	
	public Masina() {
		
	}
	
	public Masina(String m, Color c) {
		this.marca=m;
		this.culoare=c;
	}
	public static void revopsire(Masina m, Color newColor)
	{
		m.culoare=newColor;
	}
}
