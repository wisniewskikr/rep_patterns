package pl.kwi.clients;

import pl.kwi.decorators.BigToyDecorator;
import pl.kwi.decorators.BlueToyDecorator;
import pl.kwi.decorators.IDecorator;
import pl.kwi.decorators.RedToyDecorator;
import pl.kwi.decorators.SmallToyDecorator;
import pl.kwi.toys.Toy;

public class Client {
		
	public String getBigBlueToyDescription(Toy toy){
		
		IDecorator decorator = new BigToyDecorator(new BlueToyDecorator(toy));
		return decorator.getDescription();
		
	}
	
	public String getSmallRedToyDescription(Toy toy){
		
		IDecorator decorator = new SmallToyDecorator(new RedToyDecorator(toy));
		return decorator.getDescription();
		
	}

}
