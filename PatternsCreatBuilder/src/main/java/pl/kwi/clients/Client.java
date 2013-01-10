package pl.kwi.clients;

import pl.kwi.builders.BearToyBuilder;
import pl.kwi.builders.CarToyBuilder;
import pl.kwi.builders.DollToyBuilder;
import pl.kwi.directors.ToyDirector;
import pl.kwi.toys.Toy;

public class Client {
		
	public Toy createBearToy(){
		
		ToyDirector director = new ToyDirector();
		director.setToyBuilder(new BearToyBuilder());
		director.constructToy();
		return director.getToy();
		
	}
	
	public Toy createCarToy(){
		
		ToyDirector director = new ToyDirector();
		director.setToyBuilder(new CarToyBuilder());
		director.constructToy();
		return director.getToy();
		
	}
	
	public Toy createDollToy(){
		
		ToyDirector director = new ToyDirector();
		director.setToyBuilder(new DollToyBuilder());
		director.constructToy();
		return director.getToy();
		
	}

}
