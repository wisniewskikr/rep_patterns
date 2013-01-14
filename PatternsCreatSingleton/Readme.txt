SINGLETON


We use this design pattern when we want to have one and only
one instance of some object. Good example is connection to 
data base: we want to have and use only one instance of connection
to avoid unnecessary resource usage.

We have here following classes:
Class BearToySingleton has private constructor and static method
getInstance() which return existing instance of object BearToy
or create new if there is no existing.
