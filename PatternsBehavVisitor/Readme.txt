VISITOR


We should use this pattern when we have the same "if" blocks
in more then one method. This pattern is similar to:
- State: as many States as if blocks;
- Strategy: as many Strategies as methods with if blocks;

But here additionally we got compilation error if some
"if block" or some method is added.

Actors in this pattern:
- interface Visitor: with so many visit() method as 
we have "if blocks". For instance IToyVisitor with methods
visit(BearToy), visit(CarToy) and visit(DollToy);
- classes implementing Visitor: so many classes as we have
methods with "if blocks". For instance: DescriptionVisitor
and LabelVisitor;
- interface Visitable: with one method accept(Visitor). 
For instance: IToyVisitable with method accept(IToyVisitor);
- classes implementing Visitable: so many classes as we have
"if blocks". For instance: ToyBear, CarBear and DollBear. Every
class has the same method:

public void accept(IToyVisitor visitor){
	visitor.visit(this);
} 
