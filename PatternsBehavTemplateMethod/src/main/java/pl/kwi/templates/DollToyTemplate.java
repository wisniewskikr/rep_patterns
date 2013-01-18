package pl.kwi.templates;

import pl.kwi.toys.Toy;

public class DollToyTemplate extends Template {

	@Override
	protected void addLabel(Toy toy) {
		toy.addProperty("label", "This is label for: " + Toy.DOLL);
	}

	@Override
	protected void addDescription(Toy toy) {
		toy.addProperty("description", "This is description for: " + Toy.DOLL);

	}

}
