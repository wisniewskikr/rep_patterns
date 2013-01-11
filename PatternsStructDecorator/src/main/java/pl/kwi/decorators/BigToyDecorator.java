package pl.kwi.decorators;

public class BigToyDecorator extends AbstrDecorator{
	
	public BigToyDecorator(IDecorator decorator){
		super(decorator);
	}

	public String getDescription() {
		return decorator.getDescription() + "size: big | ";
	}

}
