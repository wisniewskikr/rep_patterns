BRIDGE


This design pattern joins abstract class with an interface
so you have then very flexible solution. This abstract class
receives as constructor`s parameter this interface so you 
can change performance in implementation of interface
and in implementation of abstract class.

We have here following classes:
- interface and it`s implementation: this interface is used 
in abstract class. For instance ITextStyle and implementations:
BoldTextStyle and ItalicTextStyle;
- abstract class: this class takes as constructor`s argument an
interface. It has abstract method which use this interface.
For instance Toy with method getFormattedName() and 
implementations: BearToy, CarToy and DollToy. So this method 
returns name (depending on toy type) in text style (depending
on TextStyle implementation).  
