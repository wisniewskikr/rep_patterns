package pl.kwi.commands;

import pl.kwi.toys.Toy;

public class ToyLabelComand implements ICommand{

	private Toy toy;
	
	public ToyLabelComand(Toy toy) {
		this.toy = toy;
	}
	
	public void execute() {
		toy.addProperty("label", "This is label for: " + toy.getName());
		
	}
	
	public String getCommandDescription() {
		return "Execute command: Add Toy label";
	}

}
