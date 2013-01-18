package pl.kwi.iterators;

import pl.kwi.toys.Toy;

public class ToyIterator implements Iterator {
	
	private Toy[] toys;
	private int position;
	
	public ToyIterator(Toy[] toys) {
		this.toys = toys;
	}

	public boolean hasNext() {
		
		if (position < toys.length) {
            return true;
		}else{
            return false;
		}
		
	}

	public Object next() {
		
		if (this.hasNext()) {
            return toys[position++];
		} else {
            return null;
		}
		
	}

}
