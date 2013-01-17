package pl.kwi.clients;

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
	public void addPropertiesToToy_bear(){
		
		Toy toy = new BearToy();
		client.addPropertiesToToy(toy);
		
		Assert.assertEquals("Bear", toy.getName());
		Assert.assertEquals("This is label for: Bear", toy.getProperty("label"));
		Assert.assertEquals("This is description for: Bear", toy.getProperty("description"));
		Assert.assertEquals("This is color for: Bear", toy.getProperty("color"));
		
	}
	
	@Test
	public void addPropertiesToToy_car(){
		
		Toy toy = new CarToy();
		client.addPropertiesToToy(toy);
		
		Assert.assertEquals("Car", toy.getName());
		Assert.assertEquals("This is label for: Car", toy.getProperty("label"));
		Assert.assertEquals("This is description for: Car", toy.getProperty("description"));
		Assert.assertEquals("This is color for: Car", toy.getProperty("color"));
		
	}
	
	@Test
	public void addPropertiesToToy_doll(){
		
		Toy toy = new DollToy();
		client.addPropertiesToToy(toy);
		
		Assert.assertEquals("Doll", toy.getName());
		Assert.assertEquals("This is label for: Doll", toy.getProperty("label"));
		Assert.assertEquals("This is description for: Doll", toy.getProperty("description"));
		Assert.assertEquals("This is color for: Doll", toy.getProperty("color"));
		
	}

}
