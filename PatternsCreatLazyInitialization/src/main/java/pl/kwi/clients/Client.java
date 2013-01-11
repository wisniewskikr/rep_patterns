package pl.kwi.clients;

import pl.kwi.contexts.Context;
import pl.kwi.toys.Toy;

public class Client {

	public void lazyInitBearToy(Context context){
		context.getToyByName(Toy.BEAR);
	}
	
	public void lazyInitCarToy(Context context){
		context.getToyByName(Toy.CAR);
	}
	
	public void lazyInitDollToy(Context context){
		context.getToyByName(Toy.DOLL);
	}

}
