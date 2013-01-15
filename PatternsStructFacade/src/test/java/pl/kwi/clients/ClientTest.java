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
	public void getBearToy(){
		
		Toy toy = client.getBearToy();
		
		Assert.assertEquals(Toy.BEAR, toy.getName());
		Assert.assertEquals("big", toy.getProperty("size"));
		Assert.assertEquals("red", toy.getProperty("color"));
		Assert.assertEquals("This is a toy: Bear", toy.getProperty("description"));
		
	}
	
	@Test
	public void getCarToy(){
		
		Toy toy = client.getCarToy();
		
		Assert.assertEquals(Toy.CAR, toy.getName());
		Assert.assertEquals("small", toy.getProperty("size"));
		Assert.assertEquals("white", toy.getProperty("color"));
		Assert.assertEquals("This is a toy: Car", toy.getProperty("description"));
		
	}
	
	@Test
	public void getDollToy(){
		
		Toy toy = client.getDollToy();
		
		Assert.assertEquals(Toy.DOLL, toy.getName());
		Assert.assertEquals("medium", toy.getProperty("size"));
		Assert.assertEquals("blue", toy.getProperty("color"));
		Assert.assertEquals("This is a toy: Doll", toy.getProperty("description"));
		
	}

}
