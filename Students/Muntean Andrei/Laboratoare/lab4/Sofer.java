package lab4;

public class Sofer {

	private String nume, prenume;
	private int varsta,nrPermis;
	private Autovehicul acondus;
	
	public Sofer(String nNume, String nPrenume, int nvarsta, int nnrPermis, Autovehicul a)
	{
		setNume(nNume);
		setPrenume(nPrenume);
		setVarsta(nvarsta);
		setNrPermis(nnrPermis);
		setAcondus(a);
	}
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getNrPermis() {
		return nrPermis;
	}

	public void setNrPermis(int nrPermis) {
		this.nrPermis = nrPermis;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public Autovehicul getAcondus() {
		return acondus;
	}

	public void setAcondus(Autovehicul acondus) {
		this.acondus = acondus;
	}

}
