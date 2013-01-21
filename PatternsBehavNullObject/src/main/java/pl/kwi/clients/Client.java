package pl.kwi.clients;

import java.util.List;

import pl.kwi.toys.NullToy;
import pl.kwi.toys.Toy;

public class Client {
		
	public void addToyToList(Toy toy, List<Toy> toys) {
		
		if(toy != null) {
			toys.add(toy);
		}else{
			toys.add(new NullToy());
		}
		
	}

}
