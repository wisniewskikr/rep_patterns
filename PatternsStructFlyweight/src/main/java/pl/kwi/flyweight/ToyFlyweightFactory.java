package pl.kwi.flyweight;

import java.util.HashMap;
import java.util.Map;

import pl.kwi.toys.Toy;

public class ToyFlyweightFactory {
	
	private Map<String, ToyFlyweight> toyFlyweights = new HashMap<String, ToyFlyweight>();
	
	public Toy getToyWithName(String name){
		
		ToyFlyweight toyFlyweight = toyFlyweights.get(name);
		if(toyFlyweight == null) {
			toyFlyweight = new ToyFlyweight(name);
			toyFlyweights.put(name, toyFlyweight);
		}
		
		return toyFlyweight;
		
	}

}
