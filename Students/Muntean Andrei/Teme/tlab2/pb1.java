package tlab2;
import java.util.Scanner;
public class pb1 {

	private static Scanner in;

	public static void main(String[] args) {
		System.out.println("n=");
		in = new Scanner(System.in);
		int n=in.nextInt();
		int s=0;
		for(int i=1;i<=n;i++)
			if((i%3==0) ||(i%5==0))
				s+=i;
		System.out.println("s=" + s);

	}

}
