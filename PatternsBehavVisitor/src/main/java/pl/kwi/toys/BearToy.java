package pl.kwi.toys;

import pl.kwi.visitors.IToyVisitor;

public class BearToy extends Toy{
	
	public BearToy(){
		super(Toy.BEAR);
	}
	
	public void accept(IToyVisitor visitor) {
		visitor.visit(this);
	}

}
