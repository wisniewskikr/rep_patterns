ABSTRACT FACTORY

This design pattern joins patterns Simple Factory and Factory Method.

Simple Factory because class AbstractFactory has static method getFactory()
which returns different type of factory depending on argument. 
But it doesn`t return simple object but class AbstractFactory with
group of objects.

Factory Method because in class AbstractFactory has also at least two methods:
- abstract method: 	this method different for different types of factories;
- factory method: 	this method is the same for all types of factories 
  					and uses abstract method.

  					
For instance:
Class AbstractFactory has static method getFactory() which returns toy factories
from different countries: Poland, Germany and England. 
It has also three methods:
- getBearToy();
- getCarToy();
- getDollToy();
which returns specific type of toy with specific 'country' property.
 
 
