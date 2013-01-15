FRONT CONTROLLER


We should use this design pattern if we want to have one
central point handling requests.

We have here following classes:
- class of FrontController: this class gets requests and then
sends these requests to other specified classes. For instance
class ToyFrontController with method getToyByName() passes 
requests to specified Singletons. There a toy is created and
returned to FrontController and to the client.
