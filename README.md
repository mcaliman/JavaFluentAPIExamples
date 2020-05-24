# Fluent-API Tutorial: different ways of implementing a Logo Language style turtle in Java.

## What is fluent API Java?
Fluent API means to build an API in such a way so that it meets the following criteria: 
1. The API user can understand the API very easily. 
2. The API can perform a series of actions in order to finish a task. 

# Examples

For example, we can do it with the chaining of methods

```
Turtle t = new Turtle("Spot", 0, 0, true, true);
t.penDown().hide().moveTo(10, 10).show().turn(-90).move(100).turn(+180);
```

instead of

```
Turtle t = new Turtle("Spot", 0, 0, true, true);
t.penDown();
t.hide();
t.moveTo(10, 10);
t.show();
t.turn(-90);
t.move(100);
t.turn(+180);
```
