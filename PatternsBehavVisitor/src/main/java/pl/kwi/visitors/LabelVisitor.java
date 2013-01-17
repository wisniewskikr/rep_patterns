package pl.kwi.visitors;

import pl.kwi.toys.BearToy;
import pl.kwi.toys.CarToy;
import pl.kwi.toys.DollToy;
import pl.kwi.toys.Toy;

public class LabelVisitor implements IToyVisitor {

	public void visit(BearToy bearToy) {
		bearToy.addProperty("label", "This is label for: " + Toy.BEAR);
	}

	public void visit(CarToy carToy) {
		carToy.addProperty("label", "This is label for: " + Toy.CAR);
	}

	public void visit(DollToy dollToy) {
		dollToy.addProperty("label", "This is label for: " + Toy.DOLL);
	}

}
