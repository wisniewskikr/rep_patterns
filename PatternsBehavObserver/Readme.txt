OBSERVER


We should use this design pattern if we want to
do some action on some event. 

Actors in this pattern:
- interface Observer: this interface has one method
notify() without or with some different arguments. This
method is run when some action on observable object is done. 
Example Observe: IObserver;
- classes implement Observer: these classes have implementation
of notify() method. For instance BearToyObserver or CarToyObserver;
- abstract class Observable: this interface has three methods:
	* registerObserver(Observer);
	* unregisterObserver(Observer);
	* notifyObservers();  
- implementation of Observable: method notifyObservers() should be
here add to some method which should be observed. For instance 
class ToyList and observed method addToToys(Toy).

public class Client {
		
	public ToysList createToysList(List<Toy> toys){
		
		ToysList toysList = new ToysList();
		toysList.registerObserver(new BearToyObserver());
		toysList.registerObserver(new CarToyObserver());
		toysList.registerObserver(new DollToyObserver());
		for (Toy toy : toys) {
			toysList.add(toy);
		}
		
		return toysList;
		
	}
	
}
