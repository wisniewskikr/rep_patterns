package pl.kwi.clients;

import java.util.List;

import pl.kwi.toys.Toy;

public class Client {
		
	public List<String> getToyPossibleTransportRoutes(Toy toy){
		
		return toy.getTransportRouteStart().getAllPossibleTransportRoutes();
		
	}

}
