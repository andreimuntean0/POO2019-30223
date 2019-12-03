package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employee {

	String name = new String();
	long  id;
	BigDecimal salary;
	private Boolean isDead;
	
	public Employee() {
		
	}
	
	public Employee(String name, BigDecimal salary, Boolean isDead) {
		this.name=name;
		this.salary=salary;
		this.setIsDead(isDead);
		this.id=(long)Math.random()*1000000000;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Boolean getIsDead() {
		return isDead;
	}

	public void setIsDead(Boolean isDead) {
		this.isDead = isDead;
	}

}
