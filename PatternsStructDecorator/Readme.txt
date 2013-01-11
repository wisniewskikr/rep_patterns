DECORATOR


We should use this design pattern if we want to adding new decorator 
to constructors queue add some new functionality to result.
 
For this design pattern characteristic is that all decorators
(apart from last) take as constructor`s parameter the same attribute:
decorator interface.

Good real example here is InputSource. For instance:
InputSource is = new BufferedReaderInputSource(new FileInputSource(new File()));

Main classes in this design pattern:
- interface Decorator: with decorated methods. For instance IDecorator;
- last class of constructor`s queue: this class is different from another
decorators because do not take decorator as constructor`s parameter. It only
implements interface Decorator. For instance class Toy;
- abstract Decorator: this class implements interface Decorator and 
forces decorator as constructor`s parameter. This is base for all
classic Decorators. For instance class AbstrDecorator;
- classic Decorators: these classes extend abstract Decorator and
take decorator interface as constructor`s parameter. For instance classes
BigToyDecorator or RedToyDecorator.