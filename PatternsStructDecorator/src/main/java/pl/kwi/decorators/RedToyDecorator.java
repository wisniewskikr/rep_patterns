package pl.kwi.decorators;

public class RedToyDecorator extends AbstrDecorator{
	
	public RedToyDecorator(IDecorator decorator){
		super(decorator);
	}

	public String getDescription() {
		return decorator.getDescription() + "color: red | ";
	}

}
