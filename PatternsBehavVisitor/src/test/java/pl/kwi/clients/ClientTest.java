package pl.kwi.clients;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import pl.kwi.toys.BearToy;
import pl.kwi.toys.CarToy;
import pl.kwi.toys.DollToy;

public class ClientTest {
	
	private Client client;

	@Before
	public void setUp() throws Exception {
		client = new Client();
	}
	
	@Test
	public void addPropertiesToBearToy(){
		BearToy bearToy = new BearToy();
		client.addPropertiesToBearToy(bearToy);
		
		Assert.assertEquals("Bear", bearToy.getName());
		Assert.assertEquals("This is label for: Bear", bearToy.getProperty("label"));
		Assert.assertEquals("This is description for: Bear", bearToy.getProperty("description"));
	}
	
	@Test
	public void addPropertiesToCarToy(){
		CarToy carToy = new CarToy();
		client.addPropertiesToCarToy(carToy);
		
		Assert.assertEquals("Car", carToy.getName());
		Assert.assertEquals("This is label for: Car", carToy.getProperty("label"));
		Assert.assertEquals("This is description for: Car", carToy.getProperty("description"));
	}
	
	@Test
	public void addPropertiesToDollToy(){
		DollToy dollToy = new DollToy();
		client.addPropertiesToDollToy(dollToy);
		
		Assert.assertEquals("Doll", dollToy.getName());
		Assert.assertEquals("This is label for: Doll", dollToy.getProperty("label"));
		Assert.assertEquals("This is description for: Doll", dollToy.getProperty("description"));
	}

}
