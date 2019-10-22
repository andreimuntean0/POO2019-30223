package lab3;

import java.util.Scanner;

public class String_voc_cons {

	private static Scanner in;

	public static void main(String[] args) {
		String s= new String("asvnirmwefefe");
	    int c1 = 0, c2 = 0;
	    s = s.toLowerCase();
	    for(int i = 0; i < s.length(); i++)
	    { 
	    	char c = s.charAt(i); 
	    	if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
	    		c1++;
	    	else 
	    		if((c >= 'a') && (c <= 'z'))
	    			c2++;
	     }
	     System.out.println("Vocale: " + c1);
	     System.out.println("Consoane: " + c2);
	     

	     System.out.println("Vocala de introdus:");
	     in = new Scanner(System.in);
	     String c=in.nextLine();
	     String news = s + c;
	     news +=  c;
	     System.out.println(news);
	     System.out.println(news.length()-1);


	}

}
