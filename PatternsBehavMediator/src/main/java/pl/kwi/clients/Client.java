package pl.kwi.clients;

import java.util.List;

import pl.kwi.consumers.ToyConsumer;
import pl.kwi.mediators.IMediator;
import pl.kwi.mediators.Mediator;
import pl.kwi.producers.ToyProducer;
import pl.kwi.toys.Toy;

public class Client {
		
	public List<Toy> produceToys(int bearToyCount, int carToyCount, int dollToyCount) {
		
		IMediator mediator = new Mediator();
		ToyProducer producer = new ToyProducer(mediator);
		ToyConsumer consumer = new ToyConsumer(mediator);
		
		for (int i = 0; i < bearToyCount; i++) {
			producer.produceBearToy();
		}
		
		for (int i = 0; i < carToyCount; i++) {
			producer.produceCarToy();
		}
		
		for (int i = 0; i < dollToyCount; i++) {
			producer.produceDollToy();
		}
		
		return consumer.getToys();
		
	}

}
