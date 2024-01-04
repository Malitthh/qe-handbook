The code you provided demonstrates several Object-Oriented Programming (OOP) concepts in Java. Here are the key OOP concepts used in the Calculator.java and Main.java:

1. Classes and Objects:
Classes:

Calculator and Main are classes. A class is a blueprint for creating objects.
Objects:

Instances of classes are created with new keyword: Calculator calculator = new Calculator() and Scanner scanner = new Scanner(System.in).
2. Encapsulation:
Private Instance Variable (private double currentResult):

The currentResult variable is declared as private, encapsulating it within the Calculator class. This restricts direct access from outside the class.
Public Methods (add, subtract, multiply, divide, getCurrentResult):

Public methods are provided to perform operations and retrieve the current result. These methods act as interfaces to interact with the encapsulated data.
3. Constructors:
Constructor (public Calculator()):
The Calculator class has a constructor that initializes the currentResult to 0.0 when an object is created.
4. Inheritance (Not explicitly demonstrated):
Inheritance allows a class to inherit properties and behaviors from another class.
5. Polymorphism (Not explicitly demonstrated):
Polymorphism allows objects of different types to be treated as objects of a common type.
6. Abstraction:
Abstraction is achieved through the use of methods like add, subtract, multiply, divide.
The user doesn't need to know how these operations are implemented; they only need to know how to use them.
7. Modularity:
Separation of Concerns:
The functionality of the calculator is encapsulated in the Calculator class, and the user interface and interaction are handled in the Main class.
8. Composition:
Main Class Uses Calculator Class:
The Main class "has a" Calculator object, using composition to integrate the calculator functionality into the main application.
9. Exception Handling:
Error Handling in divide Method:
The divide method in the Calculator class handles the case of dividing by zero and prints an error message.
10. Control Flow:
if, switch, while Statements:
The code uses conditional statements (if, switch) and loops (while) for control flow in decision-making and repetition.
11. Dependency Injection (implicit):
Scanner is Injected into Main Class:
The Main class depends on the Scanner class for user input. The Scanner is injected through the constructor or method.
These concepts collectively contribute to building a modular, maintainable, and extensible program by emphasizing the organization of code around objects and their interactions. Understanding and applying these OOP principles is fundamental for mastering programming, especially in languages like Java that heavily rely on OOP concepts.