ITERATOR


We should use this pattern if we want to have access to
some collection without displaying its content. User can
only checks if collection has next element and if it has 
then he can take it.

Actors in this pattern:
- interface Iterator: this interface has two methods:
	* boolean hasNext()
	* Object next()
- implementation of Iterator: here is implementation of 
Iterator methods. You have to check here whether collection
has next element and if answer is yes then you have to 
return this element. For instance ToyIterator with array
of toys as constructor argument;
- interface	IContainer: here is only one method: 
getIterator();
- implementation of IContainer: you have to implement here
some iterator. Example class: ToyContainer
