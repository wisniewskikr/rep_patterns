package pl.kwi.clients;

import pl.kwi.contexts.Context;
import pl.kwi.strategies.LabelStrategy;
import pl.kwi.strategies.DescriptionStrategy;
import pl.kwi.toys.Toy;

public class Client {
		
	public void addLabelToToy(Toy toy){
		Context context = new Context(new LabelStrategy());
		context.executeStrategy(toy);
	}
	
	public void addDescriptionToToy(Toy toy){
		Context context = new Context(new DescriptionStrategy());
		context.executeStrategy(toy);
	}

}
