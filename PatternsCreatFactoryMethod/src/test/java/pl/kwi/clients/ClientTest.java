package pl.kwi.clients;

import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import pl.kwi.clients.Client;
import pl.kwi.packages.Package;
import pl.kwi.toys.Toy;

public class ClientTest {
	
	private Client client;

	@Before
	public void setUp() throws Exception {
		client = new Client();
	}
	
	@Test
	public void getPackageWithBear(){
		
		Package pack = client.getPackageWithBear();
		Toy toy = pack.getToy();
		
		assertEquals(Toy.BEAR, toy.getName());
		
	}
	
	@Test
	public void getPackageWithCar(){
		
		Package pack = client.getPackageWithCar();
		Toy toy = pack.getToy();
		
		assertEquals(Toy.CAR, toy.getName());
		
	}
	
	@Test
	public void getPackageWithDoll(){
		
		Package pack = client.getPackageWithDoll();
		Toy toy = pack.getToy();
		
		assertEquals(Toy.DOLL, toy.getName());
		
	}

}
