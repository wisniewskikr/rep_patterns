package pl.kwi.observers;

import pl.kwi.toys.BearToy;
import pl.kwi.toys.Toy;

public class BearToyObserver implements IObserver {

	public void notify(Toy toy) {
		
		if(toy instanceof BearToy){
			
			toy.addProperty("label", "This is label for: " + Toy.BEAR);
			toy.addProperty("description", "This is description for: " + Toy.BEAR);
			
		}

	}

}
