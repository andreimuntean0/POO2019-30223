package rechizite;

public abstract class Rechizita {

	String eticheta= new String();
	
	public abstract String getNume();

	public void setEticheta(String et) {
		this.eticheta = et;
	}
	
	public Rechizita() {
		setEticheta(null);
	}
	
}
