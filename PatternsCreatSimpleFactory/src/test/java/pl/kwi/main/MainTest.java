package pl.kwi.main;

import static org.junit.Assert.*;

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
	public void createBearToy() {
		Toy bearToy = main.createBearToy();
		assertEquals(Toy.BEAR, bearToy.getName());
	}
	
	@Test
	public void createCarToy() {
		Toy carToy = main.createCarToy();
		assertEquals(Toy.CAR, carToy.getName());
	}
	
	@Test
	public void createDollToy() {
		Toy dollToy = main.createDollToy();
		assertEquals(Toy.DOLL, dollToy.getName());
	}

}
