package pl.kwi.main;

import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import pl.kwi.toys.Toy;

public class MainTest {
	
	private Main main;

	@Before
	public void setUp() throws Exception {
		main = new Main();
	}

	@Test
	public void getBearToy(){
		
		Toy toy1 = main.getBearToy();
		Toy toy2 = main.getBearToy();
		
		assertEquals(toy1, toy2);
		
	}
	
	@Test
	public void getCarToy(){
		
		Toy toy1 = main.getCarToy();
		Toy toy2 = main.getCarToy();
		
		assertEquals(toy1, toy2);
		
	}
	
	@Test
	public void getDollToy(){
		
		Toy toy1 = main.getDollToy();
		Toy toy2 = main.getDollToy();
		
		assertEquals(toy1, toy2);
		
	}

}
