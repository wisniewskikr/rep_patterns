package pl.kwi.observers;

import pl.kwi.toys.CarToy;
import pl.kwi.toys.Toy;

public class CarToyObserver implements IObserver {

	public void notify(Toy toy) {
		
		if(toy instanceof CarToy){
			
			toy.addProperty("label", "This is label for: " + Toy.CAR);
			toy.addProperty("description", "This is description for: " + Toy.CAR);
			
		}

	}

}
