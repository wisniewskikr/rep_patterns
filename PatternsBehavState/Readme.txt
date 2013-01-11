STATE


We should use this pattern when we have the same "if" block
in more then one method. 

We should create so many different classes of State as we have "if"
blocks. Every class of State should have so many methods as
we had methods with "if" blocks.

Pattern State is very similar to Strategy. This is the same but
from another point of view:
- Strategy: we have so many Strategies as we had method with "if" block;
- State: we have so many States as we had "if" in "if" blocks
So pattern depends on what should be dynamically changed: count of "if" or 
methods with "if". 

Classes in this pattern:
- interface State: with all methods which had "if" blocks. For instance: IState
with methods addLabelProperty(Toy toy) and addDescriptionProperty(Toy toy)
- implementation of State: every State was one "if" block. For instance:
BearState, CarState, DollState;
- class Context: this class gets State as constructor parameter and
calls all State methods.