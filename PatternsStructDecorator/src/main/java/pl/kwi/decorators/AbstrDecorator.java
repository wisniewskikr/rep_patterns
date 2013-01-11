package pl.kwi.decorators;

public abstract class AbstrDecorator implements IDecorator {

	protected IDecorator decorator;
		
	public AbstrDecorator(IDecorator decorator){
		this.decorator = decorator;
	}

}
