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
	public void createBearToy(){
		Toy toy = client.createBearToy();
		Assert.assertEquals(Toy.BEAR, toy.getName());
	}
	
	@Test
	public void createCarToy(){
		Toy toy = client.createCarToy();
		Assert.assertEquals(Toy.CAR, toy.getName());
	}
	
	@Test
	public void createDollToy(){
		Toy toy = client.createDollToy();
		Assert.assertEquals(Toy.DOLL, toy.getName());
	}

}
