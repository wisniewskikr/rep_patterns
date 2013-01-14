package pl.kwi.proxies;

import pl.kwi.toys.DollToy;
import pl.kwi.toys.IToy;

public class DollToyProxy implements IToy{

	private IToy toy;
	
	public String getToyType() {
		
		if(toy == null){
			toy = new DollToy();
		}
		
		return toy.getToyType();
	}

}
