TEMPLATE METHOD


You should use this design pattern if you have one method
with the same steps for few classes. This method is the same
but steps are different. So you create one template method
which consists of abstract methods. These abstract methods
are different for every step class. 

Actors in this pattern:
- abstract class with template method: here you create
few abstracts methods and one template method which consist
of these abstract methods. For instance class Template
with abstract methods addLabel() and addDescription()
and template method addPropertiesToToy(Toy);
- implementations of abstract class: here abstract methods
are filled with content. For instance BearToyTemplate or
CarToyTemplate
- client uses only template method addPropertiesToToy(Toy)
