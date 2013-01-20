package pl.kwi.clients;

import java.util.List;

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
	public void produceToys() {
		
		int bearToyCount = 1; 
		int carToyCount = 2; 
		int dollToyCount = 3;
		
		List<Toy> toys = client.produceToys(bearToyCount, carToyCount, dollToyCount);
		
		Assert.assertEquals(6, toys.size());
		
	}

}
