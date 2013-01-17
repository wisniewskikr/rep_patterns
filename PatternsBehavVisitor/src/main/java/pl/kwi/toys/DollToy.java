package pl.kwi.toys;

import pl.kwi.visitors.IToyVisitor;

public class DollToy extends Toy{
	
	public DollToy(){
		super(Toy.DOLL);
	}
	
	public void accept(IToyVisitor visitor) {
		visitor.visit(this);
	}

}
