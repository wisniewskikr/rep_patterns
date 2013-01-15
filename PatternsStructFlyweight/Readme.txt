FLYWEIGHT


This design pattern is very similar to Singleton. But in Singleton
we have only one object, here we have group of singletons in list. This objects
should be very similar but have also flexible part. And only when this
flexible part is different then new object is created.

This design pattern should be used when we want to minimize memory 
use. When we have big amount of similar objects.

We have here following classes:
- class Flyweight: this class consists of two parts:
	* similar: bigger part of object
	* unique: small individual part of object
- class FlyweghtFactory: this class has method getFlyweight().
If it is new Flyweight then this Flyweight is created and added
to list. If this Flyweight already exists in list then it is returned
