package pl.kwi.clients;

import pl.kwi.templates.BearToyTemplate;
import pl.kwi.templates.CarToyTemplate;
import pl.kwi.templates.DollToyTemplate;
import pl.kwi.templates.Template;
import pl.kwi.toys.BearToy;
import pl.kwi.toys.CarToy;
import pl.kwi.toys.DollToy;
import pl.kwi.toys.Toy;

public class Client {
	
	public Toy createBearToy() {
		
		Toy toy = new BearToy();
		Template template = new BearToyTemplate();
		template.addPropertiesToToy(toy);
		return toy;
		
	}
	
	public Toy createCarToy() {
		
		Toy toy = new CarToy();
		Template template = new CarToyTemplate();
		template.addPropertiesToToy(toy);
		return toy;
		
	}
	
	public Toy createDollToy() {
		
		Toy toy = new DollToy();
		Template template = new DollToyTemplate();
		template.addPropertiesToToy(toy);
		return toy;
		
	}

}
