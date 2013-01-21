package pl.kwi.clients;

import pl.kwi.toys.Toy;

public class Client {
		
	public void addPropertyToToy(Toy toy, String key, String value) {
		toy.addProperty(key, value);
	}
	
	public String getPropertyFromToy(Toy toy, String key){
		return toy.getProperty(key);
	}
	
	public String getActionOnToy(Toy toy, int actionNr) {
		return toy.getActionOnToy(actionNr);
	}

}
