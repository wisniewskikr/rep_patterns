CHAIN OF RESPONSIBILITY



We should use this design pattern if we want to send some
object/request through some chain of others objects. Objects
of chain do some action on request object. They can sent 
request object to next chain object or finish chain in this
place. Good example of this pattern are filters in web applications.

Actors in this pattern:
- abstract chain object: there are two main methods:
	* setNextFilter(): which adds new object to chain
	* filter(Request): which does action on request
- chain objects: objects which do some action on request objects.
For instance LabelFilter adds label to toy and DescriptionFilter
adds description to toy;
- abstract request object: for instance Toy;
- request objects: objects which are transformed into chain. For 
instance BearToy or CarToy.