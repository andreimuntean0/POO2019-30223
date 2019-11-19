package javasmmr.zoowsome.services;
import  javasmmr.zoowsome.models.employees.*;
public abstract class EmployeeAbstractFactory {
	public abstract Employee getEmployee(String type) throws Exception;

}
