package pl.kwi.main;

import junit.framework.Assert;

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
	public void createBearToy(){
		Toy toy = main.createBearToy();
		Assert.assertEquals(Toy.BEAR, toy.getName());
	}
	
	@Test
	public void createCarToy(){
		Toy toy = main.createCarToy();
		Assert.assertEquals(Toy.CAR, toy.getName());
	}
	
	@Test
	public void createDollToy(){
		Toy toy = main.createDollToy();
		Assert.assertEquals(Toy.DOLL, toy.getName());
	}

}
