package rechizite;

public class Ghiozdan {

	Rechizita [] list= new Rechizita[10];
	
	public void addCaiet(Caiet a, int i)
	{
		list[i]=a;
	}
	
	public void addManual(Manual m, int i)
	{
		list[i]=m;
	}
	
	public void listItems()
	{
		for(int i=0;i<list.length;i++)
		{
			if(list[i]!= null)
				System.out.println(list[i].getNume());
		}
	}
	
	public void listManual()
	{
		for(int i=0;i<list.length;i++)
		{
			if((list[i]!= null) && (list[i].getNume().contains("Manual")))
				System.out.println(list[i].getNume());
		}
	}
	
	public void listCaiet()
	{
		for(int i=0;i<list.length;i++)
		{
			if((list[i]!= null) && (list[i].getNume().contains("Caiet")))
				System.out.println(list[i].getNume());
		}
	}
	
	public void getNrRechizite()
	{
		int ct=0;
		for(int i=0;i<list.length;i++)
		{
			if(list[i]!= null)
				ct++;
		}
		System.out.println(ct);
	}
	
	public void getNrManuale()
	{
		int ct=0;
		for(int i=0;i<list.length;i++)
		{
			if((list[i]!= null) && (list[i].getNume().contains("Manual")))
				ct++;
		}
		System.out.println(ct);
	}
	
	public void getNrCaiete()
	{
		int ct=0;
		for(int i=0;i<list.length;i++)
		{
			if((list[i]!= null) && (list[i].getNume().contains("Caiet")))
				ct++;
		}
		System.out.println(ct);
	}
	
	public static void main(String[] args) {

	}

}
