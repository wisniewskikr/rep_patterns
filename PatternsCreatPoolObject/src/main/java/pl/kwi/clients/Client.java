package pl.kwi.clients;

import pl.kwi.pools.BearToyPool;
import pl.kwi.pools.CarToyPool;
import pl.kwi.pools.DollToyPool;
import pl.kwi.toys.Toy;

public class Client {
		
	private BearToyPool bearToyPool;
	private CarToyPool carToyPool;
	private DollToyPool dollToyPool;
	
	public Client(){
		bearToyPool = new BearToyPool();
		carToyPool = new CarToyPool();
		dollToyPool = new DollToyPool();
	}
	
	public Toy createBearToy(){
		return bearToyPool.create();
	}
	
	public void returnToBearPool(Toy toy){
		bearToyPool.returnToPool(toy);
	}
	
	public Toy createCarToy(){
		return carToyPool.create();
	}
	
	public void returnToCarPool(Toy toy){
		carToyPool.returnToPool(toy);
	}
	
	public Toy createDollToy(){
		return dollToyPool.create();
	}
	
	public void returnToDollPool(Toy toy){
		dollToyPool.returnToPool(toy);
	}

}
