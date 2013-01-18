package pl.kwi.clients;

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
	public void convertArrayToList() {
		
		Toy[] toys = {new BearToy(), new CarToy(), new DollToy()};
		
		List<Toy> toysList = client.convertArrayToList(toys);
		
		Assert.assertEquals(3, toysList.size());
		
	}

}
