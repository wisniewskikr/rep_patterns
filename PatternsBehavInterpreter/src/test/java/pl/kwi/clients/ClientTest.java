package pl.kwi.clients;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import pl.kwi.clients.Client;
import pl.kwi.toys.BearToy;
import pl.kwi.toys.Toy;

public class ClientTest {
	
	private Client client;

	@Before
	public void setUp() throws Exception {
		client = new Client();
	}
	
	@Test
	public void addCountPropertyToToy(){
		
		Toy toy = new BearToy();
		String count = "2 * 6 / 3 + 1 - 4";
		
		client.addCountPropertyToToy(count, toy);
		
		Assert.assertEquals("1", toy.getProperty("count"));
		
	}

}
