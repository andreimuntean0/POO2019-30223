package tlab2;

public class FiboEvenSum {

	public static void main(String[] args) {
		int a=0,b=1,s=0;
		while(a+b<4000000)
		{
			int x=a+b;
			a=b;
			b=x;
			if(b%2==0)
				s+=b;
			
		}
		System.out.println(s);
	}

}
