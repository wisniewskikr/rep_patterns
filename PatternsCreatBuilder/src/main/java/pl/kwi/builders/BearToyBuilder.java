package pl.kwi.builders;

import pl.kwi.toys.BearToy;

public class BearToyBuilder extends ToyBuilder {

	@Override
	public void buildToy() {
		toy = new BearToy();
	}	

}
