package pl.kwi.clients;

import pl.kwi.contexts.Context;
import pl.kwi.states.BearState;
import pl.kwi.states.CarState;
import pl.kwi.states.DollState;
import pl.kwi.toys.Toy;

public class Client {
			
	
	public void addPropertiesToBearToy(Toy toy){
		
		Context context = new Context(new BearState());
		context.addPropertiesToToy(toy);
		
	}
		
	public void addPropertiesToCarToy(Toy toy){
		
		Context context = new Context(new CarState());
		context.addPropertiesToToy(toy);
		
	}
		
	public void addPropertiesToDollToy(Toy toy){
		
		Context context = new Context(new DollState());
		context.addPropertiesToToy(toy);
		
	}
	

}
