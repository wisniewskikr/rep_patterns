package pl.kwi.factories;

import pl.kwi.toys.CarToy;
import pl.kwi.toys.Toy;

public class CarToyFactory extends AbstrToyFactory {

	@Override
	public Toy getToy() {
		return new CarToy();
	}

}
