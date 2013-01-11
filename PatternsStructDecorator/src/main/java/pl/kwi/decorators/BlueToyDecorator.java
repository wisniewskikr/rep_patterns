package pl.kwi.decorators;

public class BlueToyDecorator extends AbstrDecorator{
	
	public BlueToyDecorator(IDecorator decorator){
		super(decorator);
	}

	public String getDescription() {
		return decorator.getDescription() + "color: blue | ";
	}

}
