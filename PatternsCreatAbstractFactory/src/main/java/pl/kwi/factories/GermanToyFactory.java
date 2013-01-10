package pl.kwi.factories;

public class GermanToyFactory extends AbstractFactory{

	@Override
	public String getCountry() {
		return AbstractFactory.GERMANY;
	}

}
