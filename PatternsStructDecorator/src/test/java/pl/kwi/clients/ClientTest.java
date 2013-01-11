package pl.kwi.clients;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import pl.kwi.clients.Client;
import pl.kwi.toys.BearToy;
import pl.kwi.toys.CarToy;

public class ClientTest {
	
	private Client client;

	@Before
	public void setUp() throws Exception {
		client = new Client();
	}
	
	@Test
	public void getBigBlueToyDescription(){
		
		String description = client.getBigBlueToyDescription(new BearToy());
		
		Assert.assertEquals("name: Bear | color: blue | size: big | ", description);
		
	}
	
	@Test
	public void getSmallRedToyDescription(){
		
		String description = client.getSmallRedToyDescription(new CarToy());
		
		Assert.assertEquals("name: Car | color: red | size: small | ", description);
		
	}

}
