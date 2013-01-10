package pl.kwi.factories;

import pl.kwi.toys.BearToy;
import pl.kwi.toys.CarToy;
import pl.kwi.toys.DollToy;
import pl.kwi.toys.Toy;


public class ToyFactory {
	
	public static Toy createToy(String name){
		
		if(Toy.BEAR.equals(name)){
			return new BearToy();
		}else if(Toy.CAR.equals(name)) {
			return new CarToy();
		}else if(Toy.DOLL.equals(name)){
			return new DollToy();
		}else{
			return null;
		}
		
	}

}
