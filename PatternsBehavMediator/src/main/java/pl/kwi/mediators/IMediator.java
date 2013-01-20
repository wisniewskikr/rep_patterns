package pl.kwi.mediators;

import java.util.List;

import pl.kwi.toys.Toy;

public interface IMediator {
	
	public void addToy(Toy toy);
	
	public List<Toy> getToys();

}
