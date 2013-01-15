package pl.kwi.singletons;

import pl.kwi.toys.DollToy;
import pl.kwi.toys.Toy;

public class DollToySingleton {
	
	private static Toy toy;
	
	private DollToySingleton(){		
	}
	
	public static Toy getInstance(){
		
		if(toy == null){
			toy = new DollToy();
		}
		
		return toy;
		
	}

}
