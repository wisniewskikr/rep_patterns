package pl.kwi.builders;

import pl.kwi.toys.Toy;

public abstract class ToyBuilder {
	
	
	protected Toy toy;
	
	
	public abstract void buildToy();
	
	public Toy getToy(){
		return toy;
	}

}
