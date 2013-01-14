ADAPTER


We should use this pattern if we want to join one interface with other
class. We can do it in two ways:
- using association: in adapter one of this interfaces is implemented
and second is put as constructor`s argument;
- using inheritance: in adapter all objects are inherited

We have here following classes:
- one class and one interface: they should be connected. For instance IPrinter
and Toy;
- class Adapter: class which joins other classes or interfaces. 
For instance ToyPrinterAdapter.