package pl.kwi.facades;

import pl.kwi.toys.BearToy;
import pl.kwi.toys.CarToy;
import pl.kwi.toys.DollToy;
import pl.kwi.toys.Toy;

public class ToyFacade {
	
	
	public Toy createBearToy(){
		
		Toy toy = new BearToy();
		
		toy.addProperty("size", "big");
		toy.addProperty("color", "red");
		toy.addProperty("description", "This is a toy: " + toy.getName());
		
		return toy;
		
	}
	
	public Toy createCarToy(){
		
		Toy toy = new CarToy();
		
		toy.addProperty("size", "small");
		toy.addProperty("color", "white");
		toy.addProperty("description", "This is a toy: " + toy.getName());
		
		return toy;
		
	}
	
	public Toy createDollToy(){
		
		Toy toy = new DollToy();
		
		toy.addProperty("size", "medium");
		toy.addProperty("color", "blue");
		toy.addProperty("description", "This is a toy: " + toy.getName());
		
		return toy;
		
	}

}
