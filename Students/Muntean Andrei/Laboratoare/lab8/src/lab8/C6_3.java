package lab8;

public class C6_3 {

	Lucrator [] lucratori = new Lucrator[4];
	
	public  void main(String[] args) throws ArrayIndexOutOfBoundsException {
	
		try
		{
			for(int i=0;i<8;i++)
				System.out.println(lucratori[i]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException" + e.getMessage());

		}

	}

}
