package pl.kwi.clients;

import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import pl.kwi.clients.Client;
import pl.kwi.commands.ICommand;
import pl.kwi.commands.ToyDescriptionComand;
import pl.kwi.commands.ToyLabelComand;
import pl.kwi.toys.BearToy;
import pl.kwi.toys.Toy;

public class ClientTest {
	
	private Client client;

	@Before
	public void setUp() throws Exception {
		client = new Client();
	}
	
	@Test
	public void executeCommand(){
		
		Toy toy = new BearToy();
		
		ICommand cmnd1 = new ToyDescriptionComand(toy);
		client.executeCommand(cmnd1);
		
		ICommand cmnd2 = new ToyLabelComand(toy);
		client.executeCommand(cmnd2);
		
		Assert.assertEquals("This is description for: Bear", toy.getProperty("description"));
		Assert.assertEquals("This is label for: Bear", toy.getProperty("label"));
		
	}
	
	@Test
	public void getCommnadHistory(){
		
		Toy toy = new BearToy();
		
		ICommand cmnd1 = new ToyDescriptionComand(toy);
		client.executeCommand(cmnd1);
		
		ICommand cmnd2 = new ToyLabelComand(toy);
		client.executeCommand(cmnd2);
		
		List<ICommand> commnadHistory = client.getCommnadHistory();
		
		Assert.assertEquals("Execute command: Add Toy description", commnadHistory.get(0).getCommandDescription());
		Assert.assertEquals("Execute command: Add Toy label", commnadHistory.get(1).getCommandDescription());
		
	}

	
}
