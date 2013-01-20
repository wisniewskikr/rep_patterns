package pl.kwi.producers;

import pl.kwi.mediators.IMediator;
import pl.kwi.toys.BearToy;
import pl.kwi.toys.CarToy;
import pl.kwi.toys.DollToy;

public class ToyProducer {
	
	private IMediator mediator;

	public ToyProducer(IMediator mediator) {
		this.mediator = mediator;
	}
	
	
	public void produceBearToy(){
		mediator.addToy(new BearToy());
	}
	
	public void produceCarToy(){
		mediator.addToy(new CarToy());
	}
	
	public void produceDollToy(){
		mediator.addToy(new DollToy());
	}

}
