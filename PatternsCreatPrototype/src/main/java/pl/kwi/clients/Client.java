package pl.kwi.clients;

import pl.kwi.toys.Toy;

public class Client {
		
	public Toy makeCopy(Toy toy){
		return toy.clone();
	}

}
