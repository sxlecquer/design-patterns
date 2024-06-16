
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
#### Lets us provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.
![proxy](https://github.com/sxlecquer/design-patterns/assets/115950735/00aedcdc-024f-4561-89bd-bb5d74a308f7)

## Behavioral patterns
