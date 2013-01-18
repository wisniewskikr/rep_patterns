package pl.kwi.templates;

import pl.kwi.toys.Toy;

public class BearToyTemplate extends Template {

	@Override
	protected void addLabel(Toy toy) {
		toy.addProperty("label", "This is label for: " + Toy.BEAR);
	}

	@Override
	protected void addDescription(Toy toy) {
		toy.addProperty("description", "This is description for: " + Toy.BEAR);

	}

}
