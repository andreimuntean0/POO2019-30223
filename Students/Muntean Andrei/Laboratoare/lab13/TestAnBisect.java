package anBisect;

import static org.junit.Assert.*;

import org.junit.Test;
import anBisect.AnBisect;
public class TestAnBisect {
	private AnBisect an= new AnBisect();	
	@Test
	 public void testAnBisect() {
		assertTrue(!an.esteAnBisect(203));
		assertTrue(an.esteAnBisect(4));
		assertTrue(!an.esteAnBisect(99));
		assertTrue(an.esteAnBisect(100));
		assertTrue(!an.esteAnBisect(200));
		assertTrue(an.esteAnBisect(400));
		assertTrue(!an.esteAnBisect(500));
		assertTrue(!an.esteAnBisect(1000));		
		assertTrue(an.esteAnBisect(1600));
		assertTrue(!an.esteAnBisect(2018));
	 }

}
