package pl.kwi.contexts;

import pl.kwi.states.IState;
import pl.kwi.toys.Toy;

public class Context {
	
	
	private IState state;
	
	
	public Context(IState state){
		this.state = state;
	}
	
	
	public void addPropertiesToToy(Toy toy){
		state.addLabelProperty(toy);
		state.addDescriptionProperty(toy);
	}

}
