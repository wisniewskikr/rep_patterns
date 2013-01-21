package pl.kwi.clients;

import java.util.List;

import pl.kwi.commands.ICommand;
import pl.kwi.invokers.ToyInvoker;

public class Client {
		
	
	private ToyInvoker invoker;
	
	
	public Client(){
		invoker = new ToyInvoker();
	}
	
	
	public void executeCommand(ICommand command){
		invoker.storeAndExecute(command);
	}
	
	public List<ICommand> getCommnadHistory() {
		return invoker.getCommandsHistory();
	}

}
