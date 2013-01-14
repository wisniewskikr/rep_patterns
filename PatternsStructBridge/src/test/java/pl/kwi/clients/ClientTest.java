package pl.kwi.clients;

import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import pl.kwi.clients.Client;
import pl.kwi.styles.BoldTextStyle;
import pl.kwi.styles.ItalicTextStyle;

public class ClientTest {
	
	private Client client;

	@Before
	public void setUp() throws Exception {
		client = new Client();
	}

	@Test
	public void getBearToyNameByStyle(){
		String name = client.getBearToyNameByStyle(new BoldTextStyle());
		assertEquals("<b>Bear</b>", name);
	}
	
	@Test
	public void getCarToyNameByStyle(){
		String name = client.getCarToyNameByStyle(new ItalicTextStyle());
		assertEquals("<i>Car</i>", name);
	}
	
	@Test
	public void getDollToyNameByStyle(){
		String name = client.getDollToyNameByStyle(new BoldTextStyle());
		assertEquals("<b>Doll</b>", name);
	}

}
