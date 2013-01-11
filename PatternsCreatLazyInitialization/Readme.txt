LAZY INITIALIZATION


We use this design pattern when we want to delay the creation of an object, 
the calculation of a value, or some other expensive process until the first time it is needed.

Classes in this pattern:
- class Contexts: there are two methods getList() and getElementByName().
An element is added to list only if it was eaelier loaded by method getElementByName().