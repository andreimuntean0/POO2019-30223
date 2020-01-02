package anBisect;

public class AnBisect{

	public boolean esteAnBisect(int an)
	{
		if (an % 400 == 0 || an==400)
	        return true; 
	    if (an % 100 == 0 && an!=100)  
	        return false;  
	    if (an % 4 == 0)  
	        return true;  
	    return false;  
	}
}
