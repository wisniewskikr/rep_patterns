package pl.kwi.clients;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import pl.kwi.clients.Client;
import pl.kwi.toys.BearToy;
import pl.kwi.toys.CarToy;
import pl.kwi.toys.Toy;

public class ClientTest {
	
	private Client client;

	@Before
	public void setUp() throws Exception {
		client = new Client();
	}
	
	@Test
	public void paintToyBlue(){
		Toy toy = new BearToy();
		client.paintToyBlue(toy);
		
		Assert.assertEquals("blue", toy.getProperty("color"));
	}
	
	@Test
	public void paintToyRed(){
		Toy toy = new CarToy();
		client.paintToyRed(toy);
		
		Assert.assertEquals("red", toy.getProperty("color"));
	}

}
