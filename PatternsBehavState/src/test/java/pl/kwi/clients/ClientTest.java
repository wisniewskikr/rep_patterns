package pl.kwi.clients;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

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
	public void addPropertiesToBearToy(){
		Toy toy = new BearToy();
		client.addPropertiesToBearToy(toy);
		
		Assert.assertEquals("Bear", toy.getName());
		Assert.assertEquals("This is label for: Bear", toy.getProperty("label"));
		Assert.assertEquals("This is description for: Bear", toy.getProperty("description"));
	}
	
	@Test
	public void addPropertiesToCarToy(){
		Toy toy = new CarToy();
		client.addPropertiesToCarToy(toy);
		
		Assert.assertEquals("Car", toy.getName());
		Assert.assertEquals("This is label for: Car", toy.getProperty("label"));
		Assert.assertEquals("This is description for: Car", toy.getProperty("description"));
	}
	
	@Test
	public void addPropertiesToDollToy(){
		Toy toy = new DollToy();
		client.addPropertiesToDollToy(toy);
		
		Assert.assertEquals("Doll", toy.getName());
		Assert.assertEquals("This is label for: Doll", toy.getProperty("label"));
		Assert.assertEquals("This is description for: Doll", toy.getProperty("description"));
	}

}
