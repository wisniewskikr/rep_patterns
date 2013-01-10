package pl.kwi.factories;

public class EnglishToyFactory extends AbstractFactory{

	@Override
	public String getCountry() {
		return AbstractFactory.ENGLAND;
	}

}
