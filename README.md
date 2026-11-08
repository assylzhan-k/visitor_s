
# RPG Character System — Visitor Design Pattern

## Project Description

This project shows the **Visitor Design Pattern** in Java using an RPG character system.
The system contains different character types, such as Warriors and Mages. The Visitor Pattern allows us to perform different operations on these characters without modifying their existing classes. It demonstrates **Double Dispatch**, separation of responsibilities, and extensibility.


## Project Structure

    RPGVisitorPattern/
    └── src/
        ├── Main.java
        ├── GameCharacter.java
        ├── Warrior.java
        ├── Mage.java
        ├── CharacterVisitor.java
        ├── PowerVisitor.java
        └── InfoVisitor.java

## Visitor Pattern Components

### 1. Element Interface

`GameCharacter` declares the `accept()` method, which allows characters to accept visitors.

### 2. Concrete Elements

Two classes implement the `GameCharacter` interface:

- **Warrior** — represents a character with strength and defense.
- **Mage** — represents a character with magic power and mana.

Each element implements `accept()` and calls the appropriate visitor method.

### 3. Visitor Interface

`CharacterVisitor` declares methods for each character type:

- `visitWarrior(Warrior warrior)`
- `visitMage(Mage mage)`

### 4. Concrete Visitors

The project contains two visitors:

- **PowerVisitor** — calculates the combat power of each character.
- **InfoVisitor** — displays character information.

Each visitor implements both methods declared in the `CharacterVisitor` interface.

### 5. Object Structure

The `Main` class creates a `List<GameCharacter>` containing Warrior and Mage objects.

The client iterates through the collection and applies visitors to each character.

## How It Works

1. The client creates Warrior and Mage objects.
2. The characters are stored in a collection.
3. The client creates PowerVisitor and InfoVisitor objects.
4. Each character accepts a visitor using `accept()`.
5. The character calls the corresponding `visit()` method.
6. The visitor performs its operation.

## Double Dispatch

Double Dispatch is the main mechanism of the Visitor Pattern.

The client calls:

    character.accept(visitor);

Inside the Warrior class:

    visitor.visitWarrior(this);

Inside the Mage class:

    visitor.visitMage(this);

This allows Java to select the correct operation based on both the concrete element type and the visitor implementation.

## Code Example

```java
List<GameCharacter> characters = Arrays.asList(
    new Warrior("Diluc", 40, 20),
    new Mage("Lisa", 35, 60)
);

CharacterVisitor powerVisitor = new PowerVisitor();
CharacterVisitor infoVisitor = new InfoVisitor();

for (GameCharacter character : characters) {
    character.accept(infoVisitor);
    character.accept(powerVisitor);
}
```

## Output

<img width="978" height="314" alt="Screenshot 2026-11-08 at 15 18 07" src="https://github.com/user-attachments/assets/506682df-fb02-4be7-b61b-e7694ec26b1b" />


## Clean Code Principles

### 1. Meaningful Names

Classes and methods have descriptive names such as `Warrior`, `Mage`, `PowerVisitor`, and `InfoVisitor`.

### 2. Single Responsibility Principle

Each Concrete Visitor performs one specific operation.

`PowerVisitor` calculates combat power, while `InfoVisitor` displays character information.

### 3. Open/Closed Principle

New operations can be added by creating new Visitor classes without modifying existing character classes.

### 4. Encapsulation

Character attributes are private and accessed through public getter methods.

Visitors receive only the information required to perform their operations.

### 5. No Type Checking

Double Dispatch eliminates the need for `instanceof` and conditional type-checking chains.

### 6. Separation of Concerns

Character classes store character data, while Visitor classes implement operations on that data.

## Advantages of the Visitor Pattern

- Allows adding new operations without modifying existing element classes.
- Separates algorithms from object structures.
- Improves code maintainability.
- Centralizes related operations.
- Supports Double Dispatch.
- Makes extending functionality easier.

## Disadvantages of the Visitor Pattern

- Adding a new element type requires updating all Visitor implementations.
- Introduces additional classes and interfaces.
- May increase complexity in small applications.
- Visitors may require access to element data.


## Conclusion

This project demonstrates how the Visitor Design Pattern separates operations from object structures.

The `PowerVisitor` and `InfoVisitor` classes perform different operations on `Warrior` and `Mage` objects without changing their classes.

The implementation follows Clean Code principles and demonstrates Double Dispatch through the `accept()` and `visit()` methods.
