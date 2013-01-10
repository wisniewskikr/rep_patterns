SIMPLE FACTORY

We use this design pattern when we want to receive from one method 
of factory class different objects the same type basing on method`s attribute.

For instance:
Class ToyFactory has the method createToy() with the attribuete 'name'.
Depending on name this method returns different types of toy: bear, car or doll.
