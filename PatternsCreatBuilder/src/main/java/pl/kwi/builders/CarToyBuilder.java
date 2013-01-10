package pl.kwi.builders;

import pl.kwi.toys.CarToy;

public class CarToyBuilder extends ToyBuilder {

	@Override
	public void buildToy() {
		toy = new CarToy();
	}	

}
