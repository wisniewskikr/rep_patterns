package pl.kwi.proxies;

import pl.kwi.toys.BearToy;
import pl.kwi.toys.IToy;

public class BearToyProxy implements IToy{

	private IToy toy;
	
	public String getToyType() {
		
		if(toy == null){
			toy = new BearToy();
		}
		
		return toy.getToyType();
	}

}
