package pl.kwi.factories;

import pl.kwi.toys.DollToy;
import pl.kwi.toys.Toy;

public class DollToyFactory extends AbstrToyFactory {

	@Override
	public Toy getToy() {
		return new DollToy();
	}

}
