package pl.kwi.observables;

import java.util.ArrayList;
import java.util.List;

import pl.kwi.observers.IObserver;
import pl.kwi.toys.Toy;

public abstract class Observable {
	
	private List<IObserver> observers = new ArrayList<IObserver>();
	
	public void registerObserver(IObserver observer){
		observers.add(observer);
	}
	
	public void unregisterObserver(IObserver observer){
		observers.remove(observer);
	}
	
	public void notifyObservers(Toy toy){
		for (IObserver observer : observers) {
			observer.notify(toy);
		}
	}

}
