package pl.kwi.clients;

import static junit.framework.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import pl.kwi.clients.Client;
import pl.kwi.contexts.Context;
import pl.kwi.toys.Toy;

public class ClientTest {
	
	private Client client;

	@Before
	public void setUp() throws Exception {
		client = new Client();
	}
	
	@Test
	public void lazyInitBearToy(){
		
		Context context = new Context();
		
		List<Toy> toys = context.getToys();
		assertEquals(true, toys.isEmpty());
		
		client.lazyInitBearToy(context);
				
		assertEquals(false, toys.isEmpty());
		assertEquals(Toy.BEAR, toys.get(0).getName());
		
	}
	
	@Test
	public void lazyInitCarToy(){
		
		Context context = new Context();
		
		List<Toy> toys = context.getToys();
		assertEquals(true, toys.isEmpty());
		
		client.lazyInitCarToy(context);
				
		assertEquals(false, toys.isEmpty());
		assertEquals(Toy.CAR, toys.get(0).getName());
		
	}
	
	@Test
	public void lazyInitDollToy(){
		
		Context context = new Context();
		
		List<Toy> toys = context.getToys();
		assertEquals(true, toys.isEmpty());
		
		client.lazyInitDollToy(context);
				
		assertEquals(false, toys.isEmpty());
		assertEquals(Toy.DOLL, toys.get(0).getName());
		
	}


}
