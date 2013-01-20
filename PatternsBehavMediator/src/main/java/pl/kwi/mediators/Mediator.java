package pl.kwi.mediators;

import java.util.ArrayList;
import java.util.List;

import pl.kwi.toys.Toy;

public class Mediator implements IMediator {
	
	public List<Toy> toys = new ArrayList<Toy>();

	public void addToy(Toy toy) {
		toys.add(toy);

	}

	public List<Toy> getToys() {
		return toys;
	}

}
