package pl.kwi.adapters;

import pl.kwi.interfaces.IPrinter;
import pl.kwi.toys.Toy;

public class ToyPrinterAdapter_Association implements IPrinter{
	
	private Toy toy;
	
	public ToyPrinterAdapter_Association(Toy toy){
		this.toy = toy;
	}

	public String printDescription() {
		return "This is a toy of type: " + toy.getName();
	}

}
