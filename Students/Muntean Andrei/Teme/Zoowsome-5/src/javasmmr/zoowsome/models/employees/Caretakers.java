package javasmmr.zoowsome.models.employees;

public abstract class Caretakers extends Employee implements Caretaker_I{

	double workingHours;

	public void setWorkingHours(double newWorkingHours)
	{
		this.workingHours=newWorkingHours;
	}
	
	public double getWorkingHours()
	{
		return workingHours;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
