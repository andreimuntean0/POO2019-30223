package lab3;

public class simLoto {

	public static void main(String[] args) {
		int[] arr= new int[6];
		int min=0,max=49,range=0;
		range=max-min + 1;
		for(int i=0;i<6;i++)
		{
			int rand=(int)(Math.random()*range)+min;
			int j=0,s=0;
			while(j<i)
			{
				if(arr[j]==rand)
				{
					i--;
					s=1;
				}
				j++;
			}
			if(s==0)
			{
				arr[i]=rand;
				System.out.println(arr[i] + " ");
			}
		}
		
	}

}
