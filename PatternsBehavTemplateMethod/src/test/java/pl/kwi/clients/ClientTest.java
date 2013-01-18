package pl.kwi.clients;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import pl.kwi.clients.Client;
import pl.kwi.toys.Toy;

public class ClientTest {
	
	private Client client;

	@Before
	public void setUp() throws Exception {
		client = new Client();
	}

	@Test
	public void createBearToy() {
		
		Toy toy = client.createBearToy();
		
		Assert.assertEquals("Bear", toy.getName());
		Assert.assertEquals("This is label for: Bear", toy.getProperty("label"));
		Assert.assertEquals("This is description for: Bear", toy.getProperty("description"));
		
	}
	
	@Test
	public void createCarToy() {
		
		Toy toy = client.createCarToy();
		
		Assert.assertEquals("Car", toy.getName());
		Assert.assertEquals("This is label for: Car", toy.getProperty("label"));
		Assert.assertEquals("This is description for: Car", toy.getProperty("description"));
		
	}
	
	@Test
	public void createDollToy() {
		
		Toy toy = client.createDollToy();
		
		Assert.assertEquals("Doll", toy.getName());
		Assert.assertEquals("This is label for: Doll", toy.getProperty("label"));
		Assert.assertEquals("This is description for: Doll", toy.getProperty("description"));
		
	}

}
