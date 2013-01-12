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
	public void addLabelToToy(){
		Toy toy = new BearToy();
		client.addLabelToToy(toy);
		
		Assert.assertEquals("This is label for: Bear", toy.getProperty("label"));
	}
	
	@Test
	public void addDescriptionToToy(){
		Toy toy = new CarToy();
		client.addDescriptionToToy(toy);
		
		Assert.assertEquals("This is description for: Car", toy.getProperty("description"));
	}

}
