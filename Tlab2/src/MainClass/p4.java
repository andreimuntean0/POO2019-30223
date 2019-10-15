package MainClass;
import java.math.BigInteger;
public class p4 {

	public static void main(String[] args) {
	
		BigInteger nr1, nr2;
		/*nr1 = BigInteger.valueOf(200); //se initializeaza nr1 cu 200  
		nr2 = BigInteger.valueOf(300); //se initializeaza nr2 cu 300  
		nr1 = nr1.add(nr2); //la nr1 se aduna nr2  
		System.out.println("Value for nr1 " + nr1 ); 
		*/
		
		//pb boabelor
		nr1 = BigInteger.valueOf(0);
		for(int i=0;i<64;i++)
		{
			nr2 = BigInteger.valueOf(Math.round(Math.pow(2,i))); 
			nr1 = nr1.add(nr2);  
		}
		
		//MET2
		/*nr1=BigInteger.valueOf(1);
		nr2=BigInteger.valueOf(2);
		for(int i=0;i<64;i++)
			nr1 = nr1.multiply(nr2);  
		*/
		System.out.println("Numar total boabe: " + nr1);
	
	}

}
