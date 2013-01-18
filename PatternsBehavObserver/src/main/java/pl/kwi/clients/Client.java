package pl.kwi.clients;

import java.util.List;

import pl.kwi.observables.ToysList;
import pl.kwi.observers.BearToyObserver;
import pl.kwi.observers.CarToyObserver;
import pl.kwi.observers.DollToyObserver;
import pl.kwi.toys.Toy;

public class Client {
		
	public ToysList createToysList(List<Toy> toys){
		
		ToysList toysList = new ToysList();
		toysList.registerObserver(new BearToyObserver());
		toysList.registerObserver(new CarToyObserver());
		toysList.registerObserver(new DollToyObserver());
		for (Toy toy : toys) {
			toysList.add(toy);
		}
		
		return toysList;
		
	}
	
}
