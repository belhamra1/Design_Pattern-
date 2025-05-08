# Design_Pattern-

# 📘 Observer Pattern (Java) – Simple Example

This project demonstrates a **basic implementation of the Observer Design Pattern** in Java using simple method names: `add`, `remove`, `notify`, and `update`.

## 🔄 What is the Observer Pattern?

The Observer Pattern defines a **one-to-many dependency** between objects. When one object (called the **subject**) changes state, **all its dependents (observers)** are notified automatically.

## 🧱 Components

- **`Observer` interface**  
  Defines a method `update(String message)` to receive updates.

- **`Observable` interface**  
  Defines methods to manage observers:
  - `add(Observer o)`
  - `remove(Observer o)`
  - `notify(String message)`

- **`MessageService`**  
  Concrete implementation of `Observable`. Manages a list of observers and notifies them.

- **Observers**  
  Implementations of `Observer` that print received messages:
  - `EmailClient`
  - `SMSClient`
  - `AppClient`

## ▶️ How to Run

Compile and run `Main.java`. You should see output like:

