package pl.kwi.clients;

import java.util.ArrayList;
import java.util.List;

import pl.kwi.containers.ToyContainer;
import pl.kwi.iterators.Iterator;
import pl.kwi.toys.Toy;

public class Client {
		
	public List<Toy> convertArrayToList(Toy[] toys){
		
		List<Toy> toysList = new ArrayList<Toy>();
		
		ToyContainer container = new ToyContainer(toys);
		Iterator it = container.getIterator();
		while(it.hasNext()){
			toysList.add((Toy)it.next());
		}
		
		return toysList;
		
	}

}
