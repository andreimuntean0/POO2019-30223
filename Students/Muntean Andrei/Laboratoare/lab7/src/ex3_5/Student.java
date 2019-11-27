package ex3_5;

public class Student implements Cloneable{

	String nume = new String();
	String prenume = new String();
	Masina auto = new Masina();
	
	public Student() {
		
	}
	
	public Student(String n, String p, Masina a) {
		this.nume=n;
		this.prenume=p;;
		this.auto=a;
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
		
	public String toString() {
		return nume + " " + prenume + " " + auto;
	}
}
