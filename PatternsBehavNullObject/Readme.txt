NULL OBJECT


We should use this design pattern if we need to define "neutral" object
which implements some interface. This Null Object has all methods of
interface but without their implementation. This pattern should remove
additional code with null handling.

Actors in this pattern:
- class of Null Object: this class implements all methods of interface
but these methods are empty.
