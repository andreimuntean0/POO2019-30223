package a;

public class SavingsAccount extends Account{
	private double interest;
	
	public SavingsAccount(int n, double interest)
	{
		super(n);
		this.interest=interest;
	}
	
	public double calcInterest()
	{
		double nBalance = getBalance()*interest + getBalance();
		return nBalance;
	}
	
	public void fBalance()
	{
		double nBalance = super.getBalance()*interest;
		super.deposit(nBalance);
	}
	
}
