package pl.kwi.clients;

import pl.kwi.toys.BearToy;
import pl.kwi.toys.CarToy;
import pl.kwi.toys.DollToy;
import pl.kwi.toys.Toy;
import pl.kwi.visitors.DescriptionVisitor;
import pl.kwi.visitors.LabelVisitor;

public class Client {
		
public void addPropertiesToBearToy(BearToy bearToy){
		
		bearToy.accept(new LabelVisitor());
		bearToy.accept(new DescriptionVisitor());
		
	}
		
	public void addPropertiesToCarToy(CarToy carToy){
		
		carToy.accept(new LabelVisitor());
		carToy.accept(new DescriptionVisitor());
		
	}
		
	public void addPropertiesToDollToy(DollToy dollToy){
		
		dollToy.accept(new LabelVisitor());
		dollToy.accept(new DescriptionVisitor());
		
	}

}
