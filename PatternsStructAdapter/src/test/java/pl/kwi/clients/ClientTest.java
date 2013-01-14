package pl.kwi.clients;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import pl.kwi.adapters.ToyPrinterAdapter_Association;
import pl.kwi.adapters.ToyPrinterAdapter_Inheritance;
import pl.kwi.clients.Client;
import pl.kwi.toys.BearToy;
import pl.kwi.toys.CarToy;

public class ClientTest {
	
	private Client client;

	@Before
	public void setUp() throws Exception {
		client = new Client();
	}
	
	@Test
	public void printDescription_AssociationAdapter(){
		
		ToyPrinterAdapter_Association adapter = new ToyPrinterAdapter_Association(new BearToy());
		String description = client.printDescription(adapter);
		Assert.assertEquals("This is a toy of type: Bear", description);
		
	}
	
	@Test
	public void printDescription_AssociationInheritance(){
		
		ToyPrinterAdapter_Inheritance adapter = new ToyPrinterAdapter_Inheritance(new CarToy());
		String description = client.printDescription(adapter);
		Assert.assertEquals("This is a toy of type: Car", description);
		
	}

}
