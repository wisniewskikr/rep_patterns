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
	public void getBearToyType(){
		String toyType = client.getBearToyType();
		assertEquals(Toy.BEAR, toyType);
	}
	
	@Test
	public void getCarToyType(){
		String toyType = client.getCarToyType();
		assertEquals(Toy.CAR, toyType);
	}
	
	@Test
	public void getDollToyType(){
		String toyType = client.getDollToyType();
		assertEquals(Toy.DOLL, toyType);
	}

}
