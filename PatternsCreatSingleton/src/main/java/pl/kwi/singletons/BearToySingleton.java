package pl.kwi.singletons;

import pl.kwi.toys.BearToy;
import pl.kwi.toys.Toy;

public class BearToySingleton {
	
	private static Toy toy;
	
	private BearToySingleton(){		
	}
	
	public static Toy getInstance(){
		
		if(toy == null){
			toy = new BearToy();
		}
		
		return toy;
		
	}

}
