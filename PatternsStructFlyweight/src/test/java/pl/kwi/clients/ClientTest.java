package pl.kwi.clients;

import static junit.framework.Assert.assertSame;
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
	public void getToyWithName() {
		
		Toy bear1 = client.getToyWithName(Toy.BEAR);
		Toy bear2 = client.getToyWithName(Toy.BEAR);
		Toy car1 = client.getToyWithName(Toy.CAR);
		Toy car2 = client.getToyWithName(Toy.CAR);
		Toy doll1 = client.getToyWithName(Toy.DOLL);
		Toy doll2 = client.getToyWithName(Toy.DOLL);
		
		assertSame(bear1, bear2);
		assertSame(car1, car2);
		assertSame(doll1, doll2);
		
	}

}
