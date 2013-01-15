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
		
		Toy toy = client.getBearToy();
		
		assertEquals(Toy.BEAR, toy.getName());
		
	}
	
	@Test
	public void getCarToy(){
		
		Toy toy = client.getCarToy();
		
		assertEquals(Toy.CAR, toy.getName());
		
	}
	
	@Test
	public void getDollToy(){
		
		Toy toy = client.getDollToy();
		
		assertEquals(Toy.DOLL, toy.getName());
		
	}

}
