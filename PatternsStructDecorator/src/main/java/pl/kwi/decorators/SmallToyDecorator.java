package pl.kwi.decorators;

public class SmallToyDecorator extends AbstrDecorator{
	
	public SmallToyDecorator(IDecorator decorator){
		super(decorator);
	}

	public String getDescription() {
		return decorator.getDescription() + "size: small | ";
	}

}
