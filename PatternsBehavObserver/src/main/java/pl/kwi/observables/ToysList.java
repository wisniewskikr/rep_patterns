package pl.kwi.observables;

import java.util.ArrayList;
import java.util.List;

import pl.kwi.toys.Toy;

public class ToysList extends Observable {
	
	private List<Toy> toys = new ArrayList<Toy>();
	
	public void add(Toy toy){
		toys.add(toy);
		notifyObservers(toy);
	}
	
	public List<Toy> getToys(){
		return toys;
	}

}
