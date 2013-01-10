package pl.kwi.clients;

import pl.kwi.contexts.Context;
import pl.kwi.strategies.BlueColourStrategy;
import pl.kwi.strategies.RedColourStrategy;
import pl.kwi.toys.Toy;

public class Client {
		
	public void paintToyBlue(Toy toy){
		Context context = new Context(new BlueColourStrategy());
		context.executeStrategy(toy);
	}
	
	public void paintToyRed(Toy toy){
		Context context = new Context(new RedColourStrategy());
		context.executeStrategy(toy);
	}

}
