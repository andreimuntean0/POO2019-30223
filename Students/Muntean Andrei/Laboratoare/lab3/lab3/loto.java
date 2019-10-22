package lab3;

public class loto {

	public static void main(String[] args) {
		
		float p1,p2,P=1;
		for(int i=1;i<=6;i++)
		{
			p1=i;
			p2=49-i;
			P=P*(p1/p2);
		}
		System.out.println("Probabibilatea este: " + P);
	}

}
