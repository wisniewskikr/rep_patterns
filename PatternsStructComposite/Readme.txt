COMPOSITE


We can use this design pattern when we have group of
similar objects and we can add one object to another.
So we can compose one object from group of similar objects.
In this way we receive some kind of tree.

We have here following classes:
- abstract composite class: in this class you can add
and remove next composite element. There is also method
which is first called on composed elements and then in
current object. For instance class CountryComposite 
with method getAllPossibleTransportRoutes()
- implementations of composite class: specified implementations.
For instance FranceComposite, GermanyComposite or PolandComposite.
