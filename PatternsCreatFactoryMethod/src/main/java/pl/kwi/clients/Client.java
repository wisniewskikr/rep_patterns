package pl.kwi.clients;

import pl.kwi.factories.AbstrToyFactory;
import pl.kwi.factories.BearToyFactory;
import pl.kwi.factories.CarToyFactory;
import pl.kwi.factories.DollToyFactory;
import pl.kwi.packages.Package;

public class Client {
	
	public Package getPackageWithBear(){
		
		AbstrToyFactory toyFactory = new BearToyFactory();
		return toyFactory.createPackageWithToy();
		
	}
	
	public Package getPackageWithCar(){
		
		AbstrToyFactory toyFactory = new CarToyFactory();
		return toyFactory.createPackageWithToy();
		
	}
	
	public Package getPackageWithDoll(){
		
		AbstrToyFactory toyFactory = new DollToyFactory();
		return toyFactory.createPackageWithToy();
		
	}

}
