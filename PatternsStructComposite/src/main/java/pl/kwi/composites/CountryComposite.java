package pl.kwi.composites;

import java.util.ArrayList;
import java.util.List;

public abstract class CountryComposite {

	
	private List<CountryComposite> countries = new ArrayList<CountryComposite>();
	
	public void addNextCountry(CountryComposite country){
		countries.add(country);
	}
	
	public List<String> getAllPossibleTransportRoutes(){
		
		List<String> routes = new ArrayList<String>();
				
		for (CountryComposite country : countries) {
			
			List<String> possibleRoutes = country.getAllPossibleTransportRoutes();
			for (String possibleRoute : possibleRoutes) {
				String route = getCountryName() + " -> " + possibleRoute;
				routes.add(route);
			}
			
		}
		
		if(countries.isEmpty()){
			routes.add(getCountryName());
		}
		
		return routes;
		
	}
	
	public abstract String getCountryName();
	
}
