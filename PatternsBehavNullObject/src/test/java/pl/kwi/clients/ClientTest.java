package pl.kwi.clients;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import pl.kwi.clients.Client;
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
	public void addToyToList() {
		
		List<Toy> toys = new ArrayList<Toy>();
		Toy bearToy = new BearToy();
		Toy carToy = new CarToy();
		Toy dollToy = new DollToy();
		
		client.addToyToList(bearToy, toys);
		client.addToyToList(carToy, toys);
		client.addToyToList(dollToy, toys);
		client.addToyToList(null, toys);
		
		Assert.assertEquals(4, toys.size());
		Assert.assertEquals("", toys.get(3).getName());
		
	}

}
