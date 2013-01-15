package pl.kwi.clients;

import pl.kwi.flyweight.ToyFlyweightFactory;
import pl.kwi.toys.Toy;

public class Client {
		
	private ToyFlyweightFactory flyweightFactory;
	
	public Client() {
		flyweightFactory = new ToyFlyweightFactory();
	}
		
	public Toy getToyWithName(String name) {
		return flyweightFactory.getToyWithName(name);
	}

}
