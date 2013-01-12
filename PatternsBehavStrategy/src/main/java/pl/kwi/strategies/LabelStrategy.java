package pl.kwi.strategies;

import pl.kwi.toys.Toy;

public class LabelStrategy extends Strategy {

	@Override
	public void execute(Toy toy) {
		toy.addProperty("label", "This is label for: " + toy.getName());
	}

}
