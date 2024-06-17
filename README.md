
# Design Patterns 🚀

**Design patterns** are typical solutions to commonly occurring problems in software design.
<br>They are like pre-made blueprints that you can customize to solve a recurring design problem in your code.

The most basic and low-level patterns are often called *idioms*.
<br>They usually apply only to a single programming language.

The most universal and high-level patterns are *architectural patterns*.
<br>Developers can implement these patterns in virtually any language.
<br>Unlike other patterns, they can be used to design the architecture of an entire application.
<br><br>
- **Creational patterns** provide object creation mechanisms that increase flexibility and reuse of existing code.
- **Structural patterns** explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient.
- **Behavioral patterns** are concerned with algorithms and the assignment of responsibilities between objects.

## Creational patterns

### 1. Factory Method

#### Solves the problem of creating product objects without specifying their concrete classes.
![factory_method](https://github.com/sxlecquer/design-patterns/assets/115950735/eec89a76-1198-46aa-b4d7-080d021fb904)

#

### 2. Abstract Factory
#### Solves the problem of creating entire product families without specifying their concrete classes.
![abstract_factory](https://github.com/sxlecquer/design-patterns/assets/115950735/1c4e5fe2-80c2-47c5-8165-e2336cc3e81e)

#

### 3. Builder
#### Lets us construct complex objects step by step. <br> The pattern allows us to produce different types and representations of an object using the same construction code.
![builder](https://github.com/sxlecquer/design-patterns/assets/115950735/9316d4f8-ce5a-473a-9bb4-3b893ae5f49d)

#

### 4. Prototype
#### Lets us copy existing objects without making our code dependent on their classes.
![prototype](https://github.com/sxlecquer/design-patterns/assets/115950735/265381d4-546a-4163-93b6-7b161efb7f25)

#

### 5. Singleton
#### Lets us ensure that a class has only one instance, while providing a global access point to this instance.
![singleton](https://github.com/sxlecquer/design-patterns/assets/115950735/669236da-0f12-4515-9d38-55b5361f4705)

## Structural patterns

### 1. Adapter
#### Allows objects with incompatible interfaces to collaborate.
![adapter](https://github.com/sxlecquer/design-patterns/assets/115950735/03701336-ced6-4db1-a582-512c36be6c47)

#

### 2. Bridge
#### Lets us split a large class or a set of closely related classes into 2 separate hierarchies — *abstraction* and *implementation* — <br>which can be developed independently of each other.
![bridge](https://github.com/sxlecquer/design-patterns/assets/115950735/2f78ea9f-a4b7-445b-9988-ea00a68463a9)

#

### 3. Composite
#### Lets us compose objects into tree structures and then work with these structures as if they were individual objects.
![composite](https://github.com/sxlecquer/design-patterns/assets/115950735/871360ad-a111-4947-8ace-06425ec6e4aa)

#

### 4. Decorator
#### Lets us attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.
![decorator](https://github.com/sxlecquer/design-patterns/assets/115950735/c96c9730-11dc-49db-b986-6a842324ec0b)

#

### 5. Facade
#### Provides a simplified interface to a library, a framework, or any other complex set of classes.
![facade](https://github.com/sxlecquer/design-patterns/assets/115950735/4500baf0-7d68-4006-b1d0-0565dc5bc689)

#

### 6. Flyweight
#### Lets us fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.
![flyweight](https://github.com/sxlecquer/design-patterns/assets/115950735/7f716ad7-3201-423c-9047-2e254ecdd712)

#

### 7. Proxy
#### Lets us provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing us to perform something either before or after the request gets through to the original object.
![proxy](https://github.com/sxlecquer/design-patterns/assets/115950735/00aedcdc-024f-4561-89bd-bb5d74a308f7)

## Behavioral patterns

### 1. Chain of Responsibility
#### Lets us pass requests along a chain of handlers. <br> Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
![cor](https://github.com/sxlecquer/design-patterns/assets/115950735/ae89d8bf-5562-43dc-969b-b6d5b24f3234)

#

### 2. Command
#### Turns a request into a stand-alone object that contains all information about the request. <br> This transformation lets us pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.
![command](https://github.com/sxlecquer/design-patterns/assets/115950735/031613b4-ec0d-41af-9c4e-59fce8bd0a39)

#

### 3. Iterator
#### Lets us traverse elements of a collection without exposing its underlying representation (list, stack, tree).
![iterator](https://github.com/sxlecquer/design-patterns/assets/115950735/875693d8-4ddf-4d2a-929e-9e1668f1eff3)

#

### 4. Mediator
#### Lets us reduce chaotic dependencies between objects. <br> The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.
![mediator](https://github.com/sxlecquer/design-patterns/assets/115950735/f74cd974-8efb-4448-8637-057164d90d69)

#

### 5. Memento
#### Lets us save and restore the previous state of an object without revealing the details of its implementation.
![memento](https://github.com/sxlecquer/design-patterns/assets/115950735/9b215bc8-8dba-4ea0-bde0-4f81d7a70808)

#

### 6. Observer
#### Lets us define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.
![observer](https://github.com/sxlecquer/design-patterns/assets/115950735/29ee4983-4214-43df-a073-7185cf990778)

#

### 7. State
#### Lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.
![state](https://github.com/sxlecquer/design-patterns/assets/115950735/f208f209-2988-47fb-966f-4ee258ca5d6e)

#

### 8. Strategy
#### Lets us define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.
![strategy](https://github.com/sxlecquer/design-patterns/assets/115950735/049979e4-c15b-418c-8fbe-376f3ef68758)

#

### 9. Template Method
#### Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
![template_method](https://github.com/sxlecquer/design-patterns/assets/115950735/7fe588ae-487b-46e1-999d-01d9acc25a54)

#

### 10. Visitor
#### Lets us separate algorithms from the objects on which they operate.
![visitor](https://github.com/sxlecquer/design-patterns/assets/115950735/06a7ed55-471d-4e86-90b8-de21739d8cb3)

#
