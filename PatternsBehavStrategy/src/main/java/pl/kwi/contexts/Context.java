package pl.kwi.contexts;

import pl.kwi.strategies.Strategy;
import pl.kwi.toys.Toy;

public class Context {
	
	
	private Strategy strategy;
	
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void executeStrategy(Toy toy){
		strategy.execute(toy);
	}

}
