package pl.kwi.clients;

import pl.kwi.styles.ITextStyle;
import pl.kwi.toys.BearToy;
import pl.kwi.toys.CarToy;
import pl.kwi.toys.DollToy;

public class Client {
		
	public String getBearToyNameByStyle(ITextStyle textStyle){
		BearToy toy = new BearToy(textStyle);
		return toy.getFormattedName();
	}
	
	public String getCarToyNameByStyle(ITextStyle textStyle){
		CarToy toy = new CarToy(textStyle);
		return toy.getFormattedName();
	}
	
	public String getDollToyNameByStyle(ITextStyle textStyle){
		DollToy toy = new DollToy(textStyle);
		return toy.getFormattedName();
	}

}
