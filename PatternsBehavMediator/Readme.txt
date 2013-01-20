MEDIATOR


We should use this design pattern if we want to
have only one common point between two classes 
(we can call them Producer and Consumer).
This common point is class of Mediator and this class
is set as constructor parameter to Producers and to 
Consumers.

Actors in this pattern:
- interface Mediator: interface with methods for 
Consumers and Producers. For instance IMediator;
- implementation of Mediator: implementation methods
from IMediator. For instance class Mediator;
- class of Producer: this class gets Mediator as 
constructor parameter. Here some method from Mediator
has be called;
- class of Consumer: this class gets Mediator as 
constructor parameter. Here some method from Mediator
has be called;
