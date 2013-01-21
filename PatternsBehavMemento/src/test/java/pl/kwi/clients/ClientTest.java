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
	public void getActionOnToy() {
		
		Toy toy = new BearToy();
		
		client.addPropertyToToy(toy, "label", "This is label for: " + Toy.BEAR);
		client.getPropertyFromToy(toy, "label");
		
		String action1 = client.getActionOnToy(toy, 0);
		Assert.assertEquals("addProperty - label : This is label for: Bear", action1);
		
		String action2 = client.getActionOnToy(toy, 1);
		Assert.assertEquals("getProperty - label : This is label for: Bear", action2);
		
	}

}
