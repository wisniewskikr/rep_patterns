package pl.kwi.factories;

import pl.kwi.toys.BearToy;
import pl.kwi.toys.Toy;

public class BearToyFactory extends AbstrToyFactory {

	@Override
	public Toy getToy() {
		return new BearToy();
	}

}
