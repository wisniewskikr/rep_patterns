package pl.kwi.clients;

import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import pl.kwi.clients.Client;
import pl.kwi.composites.FranceComposite;
import pl.kwi.composites.GermanyComposite;
import pl.kwi.composites.NiderlandComposite;
import pl.kwi.composites.PolandComposite;
import pl.kwi.toys.BearToy;
import pl.kwi.toys.Toy;

public class ClientTest {
	
	private Client client;

	@Before
	public void setUp() throws Exception {
		client = new Client();
	}
	
	@Test
	public void getToyPossibleTransportRoutes(){
		
		PolandComposite poland = new PolandComposite();
		GermanyComposite germany = new GermanyComposite();
		FranceComposite france = new FranceComposite();
		NiderlandComposite niderland = new NiderlandComposite();
		
		poland.addNextCountry(germany);
		germany.addNextCountry(france);
		germany.addNextCountry(niderland);
		
		Toy toy = new BearToy();
		toy.setTransportRouteStart(poland);
		
		List<String> routes = client.getToyPossibleTransportRoutes(toy);
		
		Assert.assertEquals("Poland -> Germany -> France", routes.get(0));
		Assert.assertEquals("Poland -> Germany -> Niderland", routes.get(1));
		
	}

}
