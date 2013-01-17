package pl.kwi.visitors;

import pl.kwi.toys.BearToy;
import pl.kwi.toys.CarToy;
import pl.kwi.toys.DollToy;
import pl.kwi.toys.Toy;

public class DescriptionVisitor implements IToyVisitor {

	public void visit(BearToy bearToy) {
		bearToy.addProperty("description", "This is description for: " + Toy.BEAR);
	}

	public void visit(CarToy carToy) {
		carToy.addProperty("description", "This is description for: " + Toy.CAR);
	}

	public void visit(DollToy dollToy) {
		dollToy.addProperty("description", "This is description for: " + Toy.DOLL);
	}

}
