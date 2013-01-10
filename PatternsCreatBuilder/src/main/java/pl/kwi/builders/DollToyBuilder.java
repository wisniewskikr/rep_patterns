package pl.kwi.builders;

import pl.kwi.toys.DollToy;

public class DollToyBuilder extends ToyBuilder {

	@Override
	public void buildToy() {
		toy = new DollToy();
	}	

}
