package pl.kwi.clients;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import pl.kwi.clients.Client;
import pl.kwi.factories.AbstractFactory;
import pl.kwi.toys.Toy;

public class ClientTest {
	
	private Client client;

	@Before
	public void setUp() throws Exception {
		client = new Client();
	}

	@Test
	public void getToysFromPoland(){
		
		List<Toy> toys = client.getToysFromPoland();
		Toy toy;
		
		toy = toys.get(0);
		assertEquals(Toy.BEAR, toy.getName());
		assertEquals(AbstractFactory.POLAND, toy.getProperty("country"));
		
		toy = toys.get(1);
		assertEquals(Toy.CAR, toy.getName());
		assertEquals(AbstractFactory.POLAND, toy.getProperty("country"));
		
		toy = toys.get(2);
		assertEquals(Toy.DOLL, toy.getName());
		assertEquals(AbstractFactory.POLAND, toy.getProperty("country"));
		
	}
	
	@Test
	public void getToysFromGermany(){
		
		List<Toy> toys = client.getToysFromGermany();
		Toy toy;
		
		toy = toys.get(0);
		assertEquals(Toy.BEAR, toy.getName());
		assertEquals(AbstractFactory.GERMANY, toy.getProperty("country"));
		
		toy = toys.get(1);
		assertEquals(Toy.CAR, toy.getName());
		assertEquals(AbstractFactory.GERMANY, toy.getProperty("country"));
		
		toy = toys.get(2);
		assertEquals(Toy.DOLL, toy.getName());
		assertEquals(AbstractFactory.GERMANY, toy.getProperty("country"));
		
	}
	
	@Test
	public void getToysFromEngland(){
		
		List<Toy> toys = client.getToysFromEngland();
		Toy toy;
		
		toy = toys.get(0);
		assertEquals(Toy.BEAR, toy.getName());
		assertEquals(AbstractFactory.ENGLAND, toy.getProperty("country"));
		
		toy = toys.get(1);
		assertEquals(Toy.CAR, toy.getName());
		assertEquals(AbstractFactory.ENGLAND, toy.getProperty("country"));
		
		toy = toys.get(2);
		assertEquals(Toy.DOLL, toy.getName());
		assertEquals(AbstractFactory.ENGLAND, toy.getProperty("country"));
		
	}

}
