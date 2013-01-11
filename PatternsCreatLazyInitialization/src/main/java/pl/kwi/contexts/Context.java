package pl.kwi.contexts;

import java.util.ArrayList;
import java.util.List;

import pl.kwi.toys.Toy;

public class Context {
	
	
	private List<Toy> toys = new ArrayList<Toy>();

	
	public Toy getToyByName(String name){
		
		for (Toy toy : toys) {
			
			if(toy.getName().equals(name)){
				return toy;
			}
			
		}
		
		Toy toy = new Toy(name);
		toys.add(toy);
		
		return toy;
		
	}
	
	
	public List<Toy> getToys() {
		return toys;
	}
	

}
