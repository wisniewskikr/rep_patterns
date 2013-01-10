package pl.kwi.clients;

import java.util.ArrayList;
import java.util.List;

import pl.kwi.factories.AbstractFactory;
import pl.kwi.toys.Toy;

public class Client {
		
	public List<Toy> getToysFromPoland(){
		
		List<Toy> toys = new ArrayList<Toy>();
		
		AbstractFactory af = AbstractFactory.getFactory(AbstractFactory.POLAND);
		toys.add(af.getBearToy());
		toys.add(af.getCarToy());
		toys.add(af.getDollToy());
		
		return toys;
		
	}
	
	public List<Toy> getToysFromGermany(){
		
		List<Toy> toys = new ArrayList<Toy>();
		
		AbstractFactory af = AbstractFactory.getFactory(AbstractFactory.GERMANY);
		toys.add(af.getBearToy());
		toys.add(af.getCarToy());
		toys.add(af.getDollToy());
		
		return toys;
		
	}
	
	public List<Toy> getToysFromEngland(){
		
		List<Toy> toys = new ArrayList<Toy>();
		
		AbstractFactory af = AbstractFactory.getFactory(AbstractFactory.ENGLAND);
		toys.add(af.getBearToy());
		toys.add(af.getCarToy());
		toys.add(af.getDollToy());
		
		return toys;
		
	}

}
