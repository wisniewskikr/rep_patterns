package pl.kwi.clients;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pl.kwi.clients.Client;
import pl.kwi.toys.Toy;

public class ClientTest {
	
	private Client main;

	@Before
	public void setUp() throws Exception {
		main = new Client();
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
