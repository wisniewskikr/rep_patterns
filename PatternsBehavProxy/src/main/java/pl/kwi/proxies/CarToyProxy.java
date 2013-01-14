package pl.kwi.proxies;

import pl.kwi.toys.CarToy;
import pl.kwi.toys.IToy;

public class CarToyProxy implements IToy{

	private IToy toy;
	
	public String getToyType() {
		
		if(toy == null){
			toy = new CarToy();
		}
		
		return toy.getToyType();
	}

}
