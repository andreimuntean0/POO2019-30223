package lab4;

public class IstoricAuto {

	Autovehicul a;
	Sofer s;
	private boolean accident;
	private int km, nrProprietari;
	
	public IstoricAuto(Autovehicul an, Sofer sn, boolean acc, int kmn, int nrp) 
	{
		a=an;
		s=sn;
		setAccident(acc);
		setKm(kmn);
		setNrProprietari(nrp);
	}
	
	public boolean isAccident() {
		return accident;
	}

	public void setAccident(boolean accident) {
		this.accident = accident;
	}

	public int getNrProprietari() {
		return nrProprietari;
	}

	public void setNrProprietari(int nrProprietari) {
		this.nrProprietari = nrProprietari;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

}
