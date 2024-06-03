# Study repo for Design Patterns with Java

Java will be used as the programming language.

## Foundations

### Strategy Pattern

* "Encapsulate what varies".
* "Program to an Interface, not an Implementation".

#### IS-A principle

If ```X``` *is-a* ```Y```, then, ```X``` should inherit from (extend) ```Y```.

#### HAS-A principle

If ```X``` extends ```Y```, and each ```Y``` subclass *has-a* ```b``` behavior, then, each ```X``` class should be composed with a ```b``` behavior.

### Adapter Pattern

* "Convert the Interface of a class into another Interface".
* "The Adapter delegates calls to the Adaptee and returns any needed value to the original caller (Client)".

### Observer Pattern

* "Loose coupling: Subject and Observers interact, but know little about each other".
* "One-to-many dependency between objects, so when one object changes state all of its dependents (i.e., subscribers a.k.a. Observers) are notified and updated. Each dependent deals with the update on its own way".

### Decorator Pattern

* "Extend behavior with composition".

#### Open-Closed Principal

Classes should be *open* for extension, but *closed* for modification.

### Iterator Pattern

* "Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation".
    * Aggregate objects examples: Arrays, Java Collection classes (e.g., ArrayList), Maps, Lists, Sets, etc.

### Factory Patterns

* "Factory is the only place where the concrete types are known, the client (consumer) would only need to know the interface".

#### The Factory Method Pattern

Defines an interface for *creating* an object, but lets subclasses decide which class to *instantiate*.

## In-depth Studies

### Creational Design Patterns

Help manage the complexity of growing programming languages.

* "Encapsulate knowledge about which concrete class should be used".
* "Conceal how objects are created".

#### Builder Pattern

Use a Builder Class to create the Object you need.

* "Avoid complex constructors".

#### Singleton Pattern

* "Violates the single responsibility principal": a Singleton Class is responsible for the logic AND also responsible for ensuring it has only on instance.
* "Classes that use a Singleton are tightly coupled to it".

#### Prototype Pattern

Useful for when you need a large number of same type objects.

* "To handle mutability: a *deep* copy needs to be made instead of a *shallow* one".

#### Factory method Pattern

* "Use when a class has to create instances of another class, but it doesn't know in advance what the concrete type of that class should be".

#### Abstract Factories Pattern

Factory of factories.

* "System should be independent of how objects are created".
* "It should be configured with one of multiple families of objects".
* "The family of related objects should be used together".