import java.util.Random;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
	   int x=(int)(Math.random()*10);
	   System.out.println(x);
	   x=x*2;
	   System.out.println(x);
	   
	   Random randomGenerator= new Random();
	   int intRandom= randomGenerator.nextInt(9); 
	   System.out.println(intRandom);
	   intRandom=intRandom*2;
	   System.out.println(intRandom);
	   
	}

}
