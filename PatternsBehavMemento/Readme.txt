MEMENTO


We should use this design pattern if we want to 
restore an object to its previous state (undo via rollback).
Here we store all states of object and when we need we can
restore his old state.

Actors in this pattern:
- class Memento: this class stores state (constructor) and has method to 
restore it: 
	* getSavedState();
- class Originator: this class saves states in Memento. It has two methods:
	* saveToMemento();
	* restoreFromMemento(Memento)
- class Caretaker: this class has list of Memento and two methods:
	* addMemento(Memento)
	* getMemento(index)
- class with saved and restored state: in  this class you have to create new Originator and Memento.
When you want to save state you have to do something like this (for instance Toy): 
	originator.setState(state);
	caretaker.addMemento(originator.saveToMemento());
When you want to restore state you have to do somethinf like this:	
	public String getActionOnToy(int actionNr) {
		return originator.restoreFromMemento(caretaker.getMemento(actionNr));
	}
