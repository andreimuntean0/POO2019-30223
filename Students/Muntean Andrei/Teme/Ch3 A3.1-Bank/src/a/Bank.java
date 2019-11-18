package a;

public class Bank {
			
	public static void main(String[] args) {

		Account [] accounts = new Account[2];
		
		accounts[0]= new CurrentAccount(200, 10000);
		accounts[1]= new SavingsAccount(2,0.08);
		
		CurrentAccount acc = null;
		SavingsAccount accs = null;
		for(int i=0;i<accounts.length;i++)
			if(accounts[i] instanceof CurrentAccount)
			{
				acc=(CurrentAccount)accounts[i];
			}
			else
				if( accounts[i] instanceof SavingsAccount)
				{
					accs=(SavingsAccount)accounts[i];
				}
		System.out.println(accs.calcInterest());
		System.out.println(acc.getLimit());
	}

}
