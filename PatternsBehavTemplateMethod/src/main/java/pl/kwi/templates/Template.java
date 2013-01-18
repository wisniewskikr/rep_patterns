package pl.kwi.templates;

import pl.kwi.toys.Toy;

public abstract class Template {

	
	protected abstract void addLabel(Toy toy);
	
	protected abstract void addDescription(Toy toy);
		
	public void addPropertiesToToy(Toy toy) {
		addLabel(toy);
		addDescription(toy);
	}
	
	
}
