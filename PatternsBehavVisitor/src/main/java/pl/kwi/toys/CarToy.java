package pl.kwi.toys;

import pl.kwi.visitors.IToyVisitor;

public class CarToy extends Toy{
	
	public CarToy(){
		super(Toy.CAR);
	}
	
	public void accept(IToyVisitor visitor) {
		visitor.visit(this);
	}

}
