package pl.kwi.singletons;

import pl.kwi.toys.CarToy;
import pl.kwi.toys.Toy;

public class CarToySingleton {
	
	private static Toy toy;
	
	private CarToySingleton(){		
	}
	
	public static Toy getInstance(){
		
		if(toy == null){
			toy = new CarToy();
		}
		
		return toy;
		
	}

}
