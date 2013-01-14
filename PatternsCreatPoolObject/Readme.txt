POOL OBJECT


In this design pattern you create set of objects in advance
and put them to pool. Then you don`t create such object every 
time when you need it but you just take it from pool, use
and after all return back again to pool. You create new
object only when all from pool are used and pool is empty.
You should use this design pattern when creation of new 
object is very resource consuming.

Classes in this pattern:
- class Pool: this class has two collections - one with
unlocked objects (available to use objects) and second
with locked object (already in use).
