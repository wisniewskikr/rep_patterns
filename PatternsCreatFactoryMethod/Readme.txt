FACTORY METHOD

In this design pattern class of factory consists of at least two methods:
- abstract method: 	this method different for different types of factories;
- factory method: 	this method is the same for all types of factories 
  					and uses abstract method.
  					
For instance:
Class AbstrToyFactory has two methods:
- abstract getToy(): which returns different types of toys depending on factory;
- factory method createPackageWithToy(): which returns package with different 
  types of toys depending on factory.
