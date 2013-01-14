package pl.kwi.clients;

import pl.kwi.interfaces.IPrinter;

public class Client {
	
	public String printDescription(IPrinter printer){
		return printer.printDescription();
	}

}
