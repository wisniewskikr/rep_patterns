package pl.kwi.factories;

import pl.kwi.toys.BearToy;
import pl.kwi.toys.CarToy;
import pl.kwi.toys.DollToy;
import pl.kwi.toys.Toy;

public abstract class AbstractFactory {
	
	
	public static final String POLAND = "Poland";
	public static final String GERMANY = "Germany";
	public static final String ENGLAND = "England";
	
	
	public static AbstractFactory getFactory(String country){
		
		if(AbstractFactory.POLAND.equals(country)){
			return new PolishToyFactory();
		}else if(AbstractFactory.GERMANY.equals(country)){
			return new GermanToyFactory();
		}else if(AbstractFactory.ENGLAND.equals(country)){
			return new EnglishToyFactory();
		}
		
		return null;
		
	}
	
	public abstract String getCountry();
	
	public Toy getBearToy(){
		Toy toy = new BearToy();
		toy.addProperty("country", getCountry());
		return toy;
	}
	
	public Toy getCarToy(){
		Toy toy = new CarToy();
		toy.addProperty("country", getCountry());
		return toy;
	}
	
	public Toy getDollToy(){
		Toy toy = new DollToy();
		toy.addProperty("country", getCountry());
		return toy;
	}

}
