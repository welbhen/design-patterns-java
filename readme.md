# Study repo for Design Patterns with Java

I'm going to use Java as the programming language.

## Strategy Pattern

* "Encapsulate what varies".
* "Program to an Interface, not an Implementation".

### IS-A principle

If ```X``` *is-a* ```Y```, then, ```X``` should inherit from (extend) ```Y```.

### HAS-A principle

If ```X``` extends ```Y```, and each ```Y``` subclass *has-a* ```b``` behavior, then, each ```X``` class should be composed with a ```b``` behavior.

## Adapter Pattern

* "Convert the Interface of a class into another Interface".
* "The Adapter delegates calls to the Adaptee and returns any needed value to the original caller (Client)".

## Observer Pattern

* "Loose coupling: Subject and Observers interact, but know little about each other".
* "One-to-many dependency between objects, so when one object changes state all of its dependents (i.e., subscribers a.k.a. Observers) are notified and updated. Each dependent deals with the update on its own way".
