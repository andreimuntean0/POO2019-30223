package a;

public class CurrentAccount extends Account{
	
	private double limit;
	
	public CurrentAccount(int number,double limit) {
		super(number);
		this.limit=limit;
	}

	public double getLimit()
	{
		return limit;
	}
	
	public void Limit(double limit)
	{
		this.limit=limit;
	}
	
	@SuppressWarnings("unused")
	private void overdraft(double limit)
	{
		if(this.limit>=limit)
			super.withdraw(limit);
	}

}
