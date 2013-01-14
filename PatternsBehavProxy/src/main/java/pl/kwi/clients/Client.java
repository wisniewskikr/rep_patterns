package pl.kwi.clients;

import pl.kwi.proxies.BearToyProxy;
import pl.kwi.proxies.CarToyProxy;
import pl.kwi.proxies.DollToyProxy;
import pl.kwi.toys.IToy;

public class Client {
		
	public String getBearToyType(){
		IToy toy = new BearToyProxy();
		return toy.getToyType();
	}
	
	public String getCarToyType(){
		IToy toy = new CarToyProxy();
		return toy.getToyType();
	}
	
	public String getDollToyType(){
		IToy toy = new DollToyProxy();
		return toy.getToyType();
	}

}
