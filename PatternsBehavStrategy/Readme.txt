STRATEGY


We should use this pattern when we want to change some values
depending on some condition. So we create strategy for every
such condition which will change requested values.

For instance:
We have following classes:
- abstract class Strategy with method execute(): it`s implementations set
specified values. For instance BlueColourStrategy set color value as blue
and RedColourStrategy set color as red;
- class Context with method executeStrategy(): this method executes Strategy
which was set here as constructor attribute.
