PROXY


We should use proxy if we want to add some new functionality
to existing object. For instance if we want to check credentials
first. Then instead of normal object we call proxy which first
checks credentials and then this normal object is called.
 
This normal object and proxy should implement
the same interface.

Types of proxy:
- Copy-On-Write Proxy: object is created only when is necessery;
- Cache Proxy: object is created only one and stored in cache;
- Protection Proxy: different users get normal object with different 
credentials;
- Firewall Proxy: normal object is secured.

We have here following classes:
- interface: normal class and proxy have to implement the same interface.
For instance IToy with method getToyType();
- proxy: class of proxy which has some additional functionality
according to normal class. For instance BearToyProxy stores 
instance of BearToy in cache. 
