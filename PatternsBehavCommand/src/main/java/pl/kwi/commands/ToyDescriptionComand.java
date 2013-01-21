package pl.kwi.commands;

import pl.kwi.toys.Toy;

public class ToyDescriptionComand implements ICommand{
	
	private Toy toy;
	
	public ToyDescriptionComand(Toy toy) {
		this.toy = toy;
	}

	public void execute() {
		toy.addProperty("description", "This is description for: " + toy.getName());
		
	}

	public String getCommandDescription() {
		return "Execute command: Add Toy description";
	}

}
