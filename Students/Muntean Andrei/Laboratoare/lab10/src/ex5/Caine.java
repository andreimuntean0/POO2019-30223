package ex5;

public class Caine {

	String nume;
	int varsta;
	String rasa;
	boolean dresat;
	int nrCamera;
	int nrInregistrare;
	String numeProprietar;
	
	public Caine() {
		
	}
	
	public Caine(String N,int V, String R, boolean D, int nrc, int nri, String np)
	{
		this.nume=N;
		this.varsta=V;
		this.rasa=R;
		this.dresat=D;
		this.nrCamera=nrc;
		this.nrInregistrare=nri;
		this.numeProprietar=np;
		
	}

	public String toString() {
		return nume + " " + varsta + " " + rasa + " " + dresat +" "+nrCamera + " " +nrInregistrare + " " + numeProprietar ;
	}
	
}
