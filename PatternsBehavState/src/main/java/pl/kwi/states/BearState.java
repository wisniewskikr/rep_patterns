package pl.kwi.states;

import pl.kwi.toys.Toy;

public class BearState implements IState {

	public void addLabelProperty(Toy toy) {
		toy.addProperty("label", "This is label for: " + Toy.BEAR);
	}

	public void addDescriptionProperty(Toy toy) {
		toy.addProperty("description", "This is description for: " + Toy.BEAR);
	}

}
