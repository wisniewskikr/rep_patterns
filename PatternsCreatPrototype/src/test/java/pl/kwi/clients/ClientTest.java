package pl.kwi.clients;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;
import org.junit.Before;
import org.junit.Test;

import pl.kwi.toys.BearToy;
import pl.kwi.toys.CarToy;
import pl.kwi.toys.DollToy;
import pl.kwi.toys.Toy;

public class ClientTest {
	
	private Client client;

	@Before
	public void setUp() throws Exception {
		client = new Client();
	}
	
	@Test
	public void makeCopyBear(){
		
		Toy toy = new BearToy();
		toy.addProperty("colour", "blue");
		
		Toy toyCopy = client.makeCopy(toy);
		
		assertEquals("blue", toyCopy.getProperty("colour"));
		assertNotSame(toy, toyCopy);
		
	}
	
	@Test
	public void makeCopyCar(){
		
		Toy toy = new CarToy();
		toy.addProperty("colour", "blue");
		
		Toy toyCopy = client.makeCopy(toy);
		
		assertEquals("blue", toyCopy.getProperty("colour"));
		assertNotSame(toy, toyCopy);
		
	}
	
	@Test
	public void makeCopyDoll(){
		
		Toy toy = new DollToy();
		toy.addProperty("colour", "blue");
		
		Toy toyCopy = client.makeCopy(toy);
		
		assertEquals("blue", toyCopy.getProperty("colour"));
		assertNotSame(toy, toyCopy);
		
	}


}
