package pl.kwi.clients;

import pl.kwi.filters.AbstractFilter;
import pl.kwi.filters.ColorFilter;
import pl.kwi.filters.DescriptionFilter;
import pl.kwi.filters.LabelFilter;
import pl.kwi.toys.Toy;

public class Client {
		
	public void addPropertiesToToy(Toy toy){
		
		AbstractFilter labelFilter = new LabelFilter();
		AbstractFilter descriptionFilter = new DescriptionFilter();
		AbstractFilter colorFilter = new ColorFilter();
		
		labelFilter.setNextFilter(descriptionFilter);
		descriptionFilter.setNextFilter(colorFilter);
		
		labelFilter.filter(toy);
		
	}

}
