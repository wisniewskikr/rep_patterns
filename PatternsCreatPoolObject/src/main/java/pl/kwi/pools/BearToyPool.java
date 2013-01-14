package pl.kwi.pools;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import pl.kwi.toys.BearToy;
import pl.kwi.toys.Toy;

public class BearToyPool {
	
	private Map<Integer, Toy> unlocked = new HashMap<Integer, Toy>();
	private Map<Integer, Toy> locked = new HashMap<Integer, Toy>();
	private static final int INIT_POOL_SIZE = 3;
	private int countObjectsInPool = 0;
	
	public BearToyPool(){
		
		Toy toy;
		for (int i = 1; i <= INIT_POOL_SIZE; i++) {
			countObjectsInPool = i;
			toy = new BearToy();
			toy.addProperty("id", String.valueOf(i));
			toy.addProperty("description", "Toy from pool");
			unlocked.put(i, toy);
		}
		
	}
	
	public Toy create(){
		
		Integer key;
		Toy toy;
		if(unlocked.isEmpty()){
			countObjectsInPool++;
			toy = new BearToy();
			toy.addProperty("id", String.valueOf(countObjectsInPool));
			toy.addProperty("description", "Toy not from pool");
			key = countObjectsInPool;
		}else {
			Set<Integer> keys = unlocked.keySet();
			Integer[] array = keys.toArray(new Integer[0]);
			key = array[0];
			toy = unlocked.remove(key);
			toy.addProperty("description", "Toy from pool");
		}
		
		locked.put(key, toy);
		
		return toy;
		
	}
	
	public void returnToPool(Toy toy){
		
		Integer key = new Integer(toy.getProperty("id"));
		locked.remove(key);
		unlocked.put(key, toy);
		
	}

}
