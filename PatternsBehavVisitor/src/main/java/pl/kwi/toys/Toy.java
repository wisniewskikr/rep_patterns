package pl.kwi.toys;

import java.util.Properties;

import pl.kwi.visitors.IToyVisitable;

public abstract class Toy implements IToyVisitable{
	
	
	public final static String DOLL = "Doll";
	public final static String BEAR = "Bear";
	public final static String CAR = "Car";
	
	private Properties properties;
	private String name;
	
	
	public Toy(String name){
		this.name = name;
		properties = new Properties();
	}
	
	public void addProperty(String key, String value){
		properties.put(key, value);
	}
	
	public String getProperty(String key){
		return (String)properties.get(key);
	}

	public String getName() {
		return name;
	}	

}
