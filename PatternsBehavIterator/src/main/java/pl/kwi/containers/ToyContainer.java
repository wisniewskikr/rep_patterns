package pl.kwi.containers;

import pl.kwi.iterators.Iterator;
import pl.kwi.iterators.ToyIterator;
import pl.kwi.toys.Toy;

public class ToyContainer implements IContainer {
	
	private Toy[] toys;
	
	public ToyContainer(Toy[] toys) {
		this.toys = toys;
	}

	public Iterator getIterator() {
		return new ToyIterator(toys);
	}

}
