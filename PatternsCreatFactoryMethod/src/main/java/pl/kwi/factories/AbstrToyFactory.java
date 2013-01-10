package pl.kwi.factories;

import pl.kwi.packages.Package;
import pl.kwi.toys.Toy;


public abstract class AbstrToyFactory {
	
	public abstract Toy getToy();
	
	public Package createPackageWithToy(){
		
		Toy toy = getToy();
		return new Package(toy);
		
	}

}
