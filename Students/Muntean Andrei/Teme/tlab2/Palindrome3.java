package tlab2;

public class Palindrome3 {

	private static int maxim;

	public static int testpalim(int x)
	{
		int aux=x,inv=0;
		while(aux!=0)
		{
			inv=inv*10+aux%10;
			aux/=10;
		}
		if(inv==x)
			return 1;
		else
			return 0;
	}
	
	public static void main(String[] args) {

		maxim = 0;
		for(int i=999;i>=900;i--) //9999,9000
			for(int j=i;j>=900;j--) //9000
				if(testpalim(i*j)==1)
				{
					maxim=i*j;
					System.out.println(maxim);
					return;
				}
	}

}
