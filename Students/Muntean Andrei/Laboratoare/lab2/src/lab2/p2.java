package lab2;
import java.util.Scanner;
public class p2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner din= new Scanner(System.in);
		
		int x= din.nextInt();
		System.out.println("x= " + x);
		
		float y= din.nextFloat();
		System.out.println("y= " + y);

		double z= din.nextDouble();
		System.out.println("z= "+ z);		
	}

}
