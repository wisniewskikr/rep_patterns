package pl.kwi.toys;

import java.util.Properties;

import pl.kwi.mementos.Caretaker;
import pl.kwi.mementos.Originator;

public abstract class Toy {
	
	
	public final static String DOLL = "Doll";
	public final static String BEAR = "Bear";
	public final static String CAR = "Car";
	
	private Properties properties;
	private String name;
		
	private Originator originator;
	private Caretaker caretaker;
	
	
	public Toy(String name){
		this.name = name;
		properties = new Properties();
		originator = new Originator();
		caretaker = new Caretaker();
	}
	
	public void addProperty(String key, String value){
		properties.put(key, value);
		originator.setState("addProperty - " + key + " : " + value);
		caretaker.addMemento(originator.saveToMemento());
	}
	
	public String getProperty(String key){
		String value = (String)properties.get(key);
		
		originator.setState("getProperty - " + key + " : " + value);
		caretaker.addMemento(originator.saveToMemento());
		
		return value;
	}

	public String getName() {
		return name;
	}
	
	public String getActionOnToy(int actionNr) {
		return originator.restoreFromMemento(caretaker.getMemento(actionNr));
	}

}
