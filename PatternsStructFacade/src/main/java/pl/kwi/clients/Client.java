package pl.kwi.clients;

import pl.kwi.facades.ToyFacade;
import pl.kwi.toys.Toy;

public class Client {
		
	public Toy getBearToy(){
		ToyFacade facade = new ToyFacade();
		return facade.createBearToy();
	}
	
	public Toy getCarToy(){
		ToyFacade facade = new ToyFacade();
		return facade.createCarToy();
	}
	
	public Toy getDollToy(){
		ToyFacade facade = new ToyFacade();
		return facade.createDollToy();
	}

}
