COMMAND


We should use this design pattern if we a set of different commands.
So we encapsulate these commands in objects and we are able to call them
later. This pattern is also very useful if we want to store commands
history.

Actors in this pattern:
- interface Command: this interface has one method: execute(). For instance: ICommand;
- implementations of Command: these classes get Request objects as constructor`s parameters
and in methods execute() they executes some action on them. For instance: ToyDescripionCommand
or ToyLabelCommand;
- class of Invoker: this class has method execute(Command) or storeAndExecute(Command). For instance:
Invoker;
- class of Client: in this class we create one Invoker and we execute commands when we need 