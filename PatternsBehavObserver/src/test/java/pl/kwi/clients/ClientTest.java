package pl.kwi.clients;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import pl.kwi.clients.Client;
import pl.kwi.observables.ToysList;
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
	public void createToysList() {
		
		List<Toy> toys = new ArrayList<Toy>();
		toys.add(new BearToy());
		toys.add(new CarToy());
		toys.add(new DollToy());
		
		ToysList toysList = client.createToysList(toys);
		
		toys = toysList.getToys();
		
		Toy toy;
		toy = toys.get(0);
		Assert.assertEquals("Bear", toy.getName());
		Assert.assertEquals("This is label for: Bear", toy.getProperty("label"));
		Assert.assertEquals("This is description for: Bear", toy.getProperty("description"));
		
		toy = toys.get(1);
		Assert.assertEquals("Car", toy.getName());
		Assert.assertEquals("This is label for: Car", toy.getProperty("label"));
		Assert.assertEquals("This is description for: Car", toy.getProperty("description"));
		
		toy = toys.get(2);
		Assert.assertEquals("Doll", toy.getName());
		Assert.assertEquals("This is label for: Doll", toy.getProperty("label"));
		Assert.assertEquals("This is description for: Doll", toy.getProperty("description"));
		
	}
	
}
