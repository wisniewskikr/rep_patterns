package pl.kwi.strategies;

import pl.kwi.toys.Toy;

public class DescriptionStrategy extends Strategy {

	@Override
	public void execute(Toy toy) {
		toy.addProperty("description", "This is description for: " + toy.getName());
	}

}
