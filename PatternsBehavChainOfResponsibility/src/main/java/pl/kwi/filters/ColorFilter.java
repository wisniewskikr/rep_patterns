package pl.kwi.filters;

import pl.kwi.toys.BearToy;
import pl.kwi.toys.CarToy;
import pl.kwi.toys.DollToy;
import pl.kwi.toys.Toy;

public class ColorFilter extends AbstractFilter {

	@Override
	public void filter(Toy toy) {
		
		if(toy instanceof BearToy) {
			toy.addProperty("color", "This is color for: " + Toy.BEAR);
		}else if(toy instanceof CarToy){
			toy.addProperty("color", "This is color for: " + Toy.CAR);
		}else if(toy instanceof DollToy){
			toy.addProperty("color", "This is color for: " + Toy.DOLL);
		}
		
		if(nextFilter != null){
			nextFilter.filter(toy);
		}

	}

}
