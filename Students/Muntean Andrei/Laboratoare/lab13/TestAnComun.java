package anBisect;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAnComun {

	private AnBisect an= new AnBisect();	
	@Test
	 public void testAnComun() {
		assertFalse(an.esteAnBisect(203));
		assertFalse(!an.esteAnBisect(4));
		assertFalse(an.esteAnBisect(99));
		assertFalse(!an.esteAnBisect(100));
		assertFalse(an.esteAnBisect(200));
		assertFalse(!an.esteAnBisect(400));
		assertFalse(an.esteAnBisect(500));
		assertFalse(an.esteAnBisect(1000));		
		assertFalse(!an.esteAnBisect(1600));
		assertFalse(an.esteAnBisect(2018));
	 }

}
