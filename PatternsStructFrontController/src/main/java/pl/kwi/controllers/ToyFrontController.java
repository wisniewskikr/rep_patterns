package pl.kwi.controllers;

import pl.kwi.singletons.BearToySingleton;
import pl.kwi.singletons.CarToySingleton;
import pl.kwi.singletons.DollToySingleton;
import pl.kwi.toys.Toy;

public class ToyFrontController {
	
	
	public Toy getToyByName(String name){
		
		if(Toy.BEAR.equals(name)){
			return BearToySingleton.getInstance();
		}else if (Toy.CAR.equals(name)){
			return CarToySingleton.getInstance();
		}else if (Toy.DOLL.equals(name)){
			return DollToySingleton.getInstance();
		}else{
			return null;
		}
		
	}
	

}
