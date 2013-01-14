package pl.kwi.clients;

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
	public void handleBearToys(){
		
		Toy toy1 = client.createBearToy();
		Toy toy2 = client.createBearToy();
		Toy toy3 = client.createBearToy();
		Toy toy4 = client.createBearToy();
		
		Assert.assertEquals("Toy from pool", toy1.getProperty("description"));
		Assert.assertEquals("Toy from pool", toy2.getProperty("description"));
		Assert.assertEquals("Toy from pool", toy3.getProperty("description"));
		Assert.assertEquals("Toy not from pool", toy4.getProperty("description"));
		
		client.returnToBearPool(toy4);
		client.returnToBearPool(toy3);
		
		toy3 = client.createBearToy();
		toy4 = client.createBearToy();
		Toy toy5 = client.createBearToy();
		
		Assert.assertEquals("Toy from pool", toy3.getProperty("description"));
		Assert.assertEquals("Toy from pool", toy4.getProperty("description"));
		Assert.assertEquals("Toy not from pool", toy5.getProperty("description"));
		
	}
	
	@Test
	public void handleCarToys(){
		
		Toy toy1 = client.createCarToy();
		Toy toy2 = client.createCarToy();
		Toy toy3 = client.createCarToy();
		Toy toy4 = client.createCarToy();
		
		Assert.assertEquals("Toy from pool", toy1.getProperty("description"));
		Assert.assertEquals("Toy from pool", toy2.getProperty("description"));
		Assert.assertEquals("Toy from pool", toy3.getProperty("description"));
		Assert.assertEquals("Toy not from pool", toy4.getProperty("description"));
		
		client.returnToCarPool(toy4);
		client.returnToCarPool(toy3);
		
		toy3 = client.createCarToy();
		toy4 = client.createCarToy();
		Toy toy5 = client.createCarToy();
		
		Assert.assertEquals("Toy from pool", toy3.getProperty("description"));
		Assert.assertEquals("Toy from pool", toy4.getProperty("description"));
		Assert.assertEquals("Toy not from pool", toy5.getProperty("description"));
		
	}
	
	@Test
	public void handleDollToys(){
		
		Toy toy1 = client.createDollToy();
		Toy toy2 = client.createDollToy();
		Toy toy3 = client.createDollToy();
		Toy toy4 = client.createDollToy();
		
		Assert.assertEquals("Toy from pool", toy1.getProperty("description"));
		Assert.assertEquals("Toy from pool", toy2.getProperty("description"));
		Assert.assertEquals("Toy from pool", toy3.getProperty("description"));
		Assert.assertEquals("Toy not from pool", toy4.getProperty("description"));
		
		client.returnToDollPool(toy4);
		client.returnToDollPool(toy3);
		
		toy3 = client.createDollToy();
		toy4 = client.createDollToy();
		Toy toy5 = client.createDollToy();
		
		Assert.assertEquals("Toy from pool", toy3.getProperty("description"));
		Assert.assertEquals("Toy from pool", toy4.getProperty("description"));
		Assert.assertEquals("Toy not from pool", toy5.getProperty("description"));
		
	}

}
