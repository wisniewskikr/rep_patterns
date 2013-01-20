INTERPRETER


You should use this design pattern if you want to
specify how to evaluate sentences in a language.

Actors in this pattern:
- abstract class Expression: here are method interpret(Context)
which is a logic of language and abstract methods which
are different for every specific Expression. For instance
class Expression;
- implementations of Expression: here is implementation of
abstract methods. For instance PlusExpression or MinusExpression
- class Context: this class contains input and output of interpreter
- class client: this class has list of expressions in some
order which call method interpret(Context). At the and we
receive result from Context.getOutput().
