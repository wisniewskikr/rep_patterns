package pl.kwi.filters;

import pl.kwi.toys.Toy;

public abstract class AbstractFilter {
	
	protected AbstractFilter nextFilter;

	public void setNextFilter(AbstractFilter nextFilter) {
		this.nextFilter = nextFilter;
	}
	
	public abstract void filter(Toy toy);

}
