package pl.kwi.clients;

import pl.kwi.controllers.ToyFrontController;
import pl.kwi.toys.Toy;

public class Client {
	
	private ToyFrontController frontController;
	
	public Client(){
		frontController = new ToyFrontController();
	}
		
	public Toy getBearToy(){
		return frontController.getToyByName(Toy.BEAR);
	}
	
	public Toy getCarToy(){
		return frontController.getToyByName(Toy.CAR);
	}
	
	public Toy getDollToy(){
		return frontController.getToyByName(Toy.DOLL);
	}

}
