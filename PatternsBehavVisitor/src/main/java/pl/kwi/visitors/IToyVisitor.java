package pl.kwi.visitors;

import pl.kwi.toys.BearToy;
import pl.kwi.toys.CarToy;
import pl.kwi.toys.DollToy;

public interface IToyVisitor {
	
	public void visit(BearToy bearToy);
	
	public void visit(CarToy carToy);
	
	public void visit(DollToy dollToy);

}
