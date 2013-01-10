package pl.kwi.directors;

import pl.kwi.builders.ToyBuilder;
import pl.kwi.toys.Toy;

public class ToyDirector {
	
	
	private ToyBuilder toyBuilder;

	
	public void setToyBuilder(ToyBuilder toyBuilder) {
		this.toyBuilder = toyBuilder;
	}
	
	public void constructToy(){
		toyBuilder.buildToy();
	}
	
	public Toy getToy(){
		return toyBuilder.getToy();
	}
}
