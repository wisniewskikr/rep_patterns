package pl.kwi.observers;

import pl.kwi.toys.DollToy;
import pl.kwi.toys.Toy;

public class DollToyObserver implements IObserver {

	public void notify(Toy toy) {
		
		if(toy instanceof DollToy){
			
			toy.addProperty("label", "This is label for: " + Toy.DOLL);
			toy.addProperty("description", "This is description for: " + Toy.DOLL);
			
		}

	}

}
