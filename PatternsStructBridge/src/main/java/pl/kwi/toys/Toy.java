package pl.kwi.toys;

import java.util.Properties;

import pl.kwi.styles.ITextStyle;

public abstract class Toy {
	
	
	public final static String DOLL = "Doll";
	public final static String BEAR = "Bear";
	public final static String CAR = "Car";
	
	protected ITextStyle textStyle;
	private Properties properties;
	private String name;
	
	
	public Toy(String name, ITextStyle textStyle){
		this.name = name;
		this.textStyle = textStyle;
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
	
	public abstract String getFormattedName();

}
