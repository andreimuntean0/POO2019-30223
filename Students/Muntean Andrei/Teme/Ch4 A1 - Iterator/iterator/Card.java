package iterator;

public class Card {
	
	private int nrCarte;
	
	public Card(int nrcarte)
	{
		setNrCarte(nrcarte);
	}
	
	public int getNrCarte()
	{
		return nrCarte;
	}
	
	public void setNrCarte(int nrCarte)
	{
		if(nrCarte<2 || nrCarte>13)
			throw new RuntimeException();
		this.nrCarte=nrCarte;
	}
	
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Card))
			return false;
		if(obj==this)
			return true;
		Card that=(Card)obj;
		return that.getNrCarte() == getNrCarte();
	}
}
