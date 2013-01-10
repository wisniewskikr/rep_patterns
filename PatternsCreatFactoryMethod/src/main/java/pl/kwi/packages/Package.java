package pl.kwi.packages;

import pl.kwi.toys.Toy;

public class Package {
	
	
	private Toy toy;
	
	
	public Package(Toy toy) {
		this.toy = toy;
	}
	
	public Toy getToy() {
		return toy;
	}
	public void setToy(Toy toy) {
		this.toy = toy;
	}
	
}
