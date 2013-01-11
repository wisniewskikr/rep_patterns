package pl.kwi.states;

import pl.kwi.toys.Toy;

public interface IState {
	
	public void addLabelProperty(Toy toy);
	
	public void addDescriptionProperty(Toy toy);

}
