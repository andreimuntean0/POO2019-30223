package lab4;

public class Asigurare {

	Autovehicul a;
	Sofer s;
	String tipAsigurare;//RCA/Casco
	boolean valabil;
	String dataExpirarii;
	
	public Asigurare(Autovehicul an, Sofer sn, String ntipAsigurare, boolean nvalabil,String ndataExpirarii)
	{
		a=an;
		s=sn;
		setTipAsigurare(ntipAsigurare);
		setValabil(nvalabil);
		setDataExpirarii(ndataExpirarii);
	}
	
	public boolean isValabil() {
		return valabil;
	}

	public void setValabil(boolean valabil) {
		this.valabil = valabil;
	}

	public String getTipAsigurare() {
		return tipAsigurare;
	}

	public void setTipAsigurare(String TipAsigurare) {
		this.tipAsigurare = TipAsigurare;
	}
	
	public void setDataExpirarii(String DataExpirarii) {
		this.dataExpirarii = DataExpirarii;
	}
	
	public String getDataExpirarii() {
		return dataExpirarii;
	}
	
	
}
