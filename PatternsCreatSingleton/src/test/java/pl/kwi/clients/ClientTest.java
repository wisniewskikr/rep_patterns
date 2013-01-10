package pl.kwi.clients;

import static junit.framework.Assert.assertEquals;
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
	public void getBearToy(){
		
		Toy toy1 = client.getBearToy();
		Toy toy2 = client.getBearToy();
		
		assertEquals(toy1, toy2);
		
	}
	
	@Test
	public void getCarToy(){
		
		Toy toy1 = client.getCarToy();
		Toy toy2 = client.getCarToy();
		
		assertEquals(toy1, toy2);
		
	}
	
	@Test
	public void getDollToy(){
		
		Toy toy1 = client.getDollToy();
		Toy toy2 = client.getDollToy();
		
		assertEquals(toy1, toy2);
		
	}

}
