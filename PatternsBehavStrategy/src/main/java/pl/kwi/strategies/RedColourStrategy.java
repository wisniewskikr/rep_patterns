package pl.kwi.strategies;

import pl.kwi.toys.Toy;

public class RedColourStrategy extends Strategy {

	@Override
	public void execute(Toy toy) {
		toy.addProperty("color", "red");
	}

}
