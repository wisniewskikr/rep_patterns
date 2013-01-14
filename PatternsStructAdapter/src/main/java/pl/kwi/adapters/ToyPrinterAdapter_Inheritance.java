package pl.kwi.adapters;

import pl.kwi.interfaces.IPrinter;
import pl.kwi.toys.Toy;

public class ToyPrinterAdapter_Inheritance extends Toy implements IPrinter{
			
	public ToyPrinterAdapter_Inheritance(Toy toy){
		super(toy.getName());
	}

	public String printDescription() {
		return "This is a toy of type: " + getName();
	}

}
