package pl.kwi.main;

import pl.kwi.singletons.BearToySingleton;
import pl.kwi.singletons.CarToySingleton;
import pl.kwi.singletons.DollToySingleton;
import pl.kwi.toys.Toy;

public class Main {
		
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
