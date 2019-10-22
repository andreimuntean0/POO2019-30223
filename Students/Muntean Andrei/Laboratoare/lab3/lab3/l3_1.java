package lab3;

public class l3_1 {

	public static boolean prim(int x)
	{
		if((x==0) || (x%2==0))
			return false;
		for(int d=3;d<=x/2;d+=2)
			if(x%d==0)
				return false;
		return true;
	}
	
	
	public static void main(String[] args) {

		int m=0,n=99;
		if(m%2!=0)
			m+=1;
		for(int i=m;i<=n;i+=2)
		{
			for(int x=0;x<=i;x++)
				for(int y=0;y<=i;y++)
					if((i==x+y)&&(prim(x)==true)&&(prim(y)==true))
						System.out.println(i + "=" + x + "+" + y );
			
		}
	}

}
