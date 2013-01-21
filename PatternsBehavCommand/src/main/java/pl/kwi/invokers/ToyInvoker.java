package pl.kwi.invokers;

import java.util.ArrayList;
import java.util.List;

import pl.kwi.commands.ICommand;

public class ToyInvoker {
	
	private List<ICommand> history = new ArrayList<ICommand>();
	 
	   public void storeAndExecute(ICommand cmd) {
	      this.history.add(cmd); // optional 
	      cmd.execute();        
	   }

	public List<ICommand> getCommandsHistory() {
		return history;
	}
	   
}
