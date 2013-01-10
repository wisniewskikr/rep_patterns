package pl.kwi.clients;

import pl.kwi.singletons.BearToySingleton;
import pl.kwi.singletons.CarToySingleton;
import pl.kwi.singletons.DollToySingleton;
import pl.kwi.toys.Toy;

public class Client {
		
	public Toy getBearToy(){
		return BearToySingleton.getInstance();
	}
	
	public Toy getCarToy(){
		return CarToySingleton.getInstance();
	}
	
	public Toy getDollToy(){
		return DollToySingleton.getInstance();
	}

}
