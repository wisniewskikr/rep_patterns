BUILDER


We should use this pattern if we want to get the same type of
object but with different properties. And these properties
should be change very easy.

So we define these properties in specific builders. Class director
use these builders and returns different results depending on
these builders. Class director is hard coded - static.

So we have here two basic classes:
- abstract class Builder: 	with build...() methods. Instances of this 
							class implements these build methods;
- class Director: this class has 3 main methods:
	* setBuilder(): where specific Builder instance is set;
	* construct(): hard-coded method which constructs result using Builders;
	* getResult(): method returns specific result depending on Builders.
