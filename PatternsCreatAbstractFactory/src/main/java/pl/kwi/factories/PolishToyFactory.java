package pl.kwi.factories;

public class PolishToyFactory extends AbstractFactory{

	@Override
	public String getCountry() {
		return AbstractFactory.POLAND;
	}

}
