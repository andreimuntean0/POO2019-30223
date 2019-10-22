package lab3;


public class l3_2 {
	
	static double f(double x)
	{
		return Math.sin(x);
	}
	static double fprime(double x)
	{
		return Math.cos(x);
	}
	
	public static void main(String[] args) {

		double epsilon = 0.000001; 
		int max_count = 200,ct=0; 
		
		for(epsilon=0.000001;epsilon<=0.01;epsilon+=0.000001)
		{
			double x = 17;
			if(args.length==1) {
			x= Double.valueOf(args[0]).doubleValue();
			}
			for( int count=1;(Math.abs(f(x)) > epsilon) && ( count < max_count);count ++)  {
				x= x - f(x)/fprime(x);
				System.out.println("Step: "+count+" x:"+x+" Value:"+f(x));
				ct++;
			}            
			if( Math.abs(f(x)) <= epsilon) {
				System.out.println("Zero found at x="+x);
				
			}
			else {
				System.out.println("Failed to find a zero");
			}
		}
		System.out.println(ct);
	}
}

