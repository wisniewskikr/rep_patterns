package pl.kwi.consumers;

import java.util.List;

import pl.kwi.mediators.IMediator;
import pl.kwi.toys.Toy;

public class ToyConsumer {
	
	private IMediator mediator;

	public ToyConsumer(IMediator mediator) {
		this.mediator = mediator;
	}
	
	public List<Toy> getToys() {
		return mediator.getToys();
	}

}
