package pl.kwi.clients;

import pl.kwi.factories.ToyFactory;
import pl.kwi.toys.Toy;

public class Client {
		
	public Toy createBearToy(){
		return ToyFactory.createToy(Toy.BEAR);
	}
	
	public Toy createCarToy(){
		return ToyFactory.createToy(Toy.CAR);
	}
	
	public Toy createDollToy(){
		return ToyFactory.createToy(Toy.DOLL);
	}

}
