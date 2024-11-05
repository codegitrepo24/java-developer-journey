# Car and RaceCar Class Design

## Problem Statement

Design a class called `Car` with the following properties and functionality:

1. **Data Members**:
   - `noOfGear`: Number of gears in the car.
   - `color`: Color of the car.

2. **Member Function**:
   - `printCarInfo()`: Prints the car's information including `noOfGear` and `color`.

Additionally, design another class `RaceCar` which extends the `Car` class:

1. **Data Member**:
   - `maxSpeed`: Maximum speed of the race car.

2. **Member Function**:
   - `printRaceCarInfo()`: Prints the race car's information, including `noOfGear`, `color`, and `maxSpeed`.

### Notes

- **Input**:
  - The attributes of `Car` (`noOfGear` and `color`) and `RaceCar` (`maxSpeed`) should be provided as inputs when creating an object.
  
- **Output**:
  - The `printRaceCarInfo` method should display all the attributes in the format specified.

### Example

| Input                | Output                                 |
|----------------------|----------------------------------------|
| noOfGear = 5, color = "red", maxSpeed = 1000 | noOfGear: 5 <br> color: red <br> maxSpeed: 1000 |

- **Explanation**: When the `printRaceCarInfo()` method is called, it prints all details of the race car, combining attributes from both the `Car` and `RaceCar` classes.

---

## Approach

1. **Define the Car Class**:
   - Create a class `Car` with a parameterized constructor that initializes `noOfGear` and `color`.
   - Define a `printCarInfo()` method to display `noOfGear` and `color`.

2. **Define the RaceCar Class**:
   - Create a subclass `RaceCar` that inherits from `Car`.
   - Add an additional attribute `maxSpeed` and initialize it using a parameterized constructor.
   - Define `printRaceCarInfo()` to display `noOfGear`, `color`, and `maxSpeed`.

3. **Testing**:
   - Create an object of the `RaceCar` class with sample inputs.
   - Call the `printRaceCarInfo()` method to verify the correct output.

---

## Algorithm

1. **Define the `Car` class**:
   - Initialize `noOfGear` and `color` using a parameterized constructor.
   - Implement `printCarInfo()` to print `noOfGear` and `color`.

2. **Define the `RaceCar` class**:
   - Inherit from `Car`.
   - Initialize `maxSpeed` in the constructor, in addition to the inherited attributes.
   - Implement `printRaceCarInfo()` to display `noOfGear`, `color`, and `maxSpeed`.

3. **Create a RaceCar Object**:
   - Instantiate a `RaceCar` object and call `printRaceCarInfo()`.

---

## Pseudocode

```plaintext
Class Car:
    Data Members:
        - noOfGear
        - color

    Constructor Car(noOfGear, color):
        Set this.noOfGear = noOfGear
        Set this.color = color

    Function printCarInfo():
        Print "noOfGear: ", noOfGear
        Print "color: ", color

Class RaceCar extends Car:
    Data Members:
        - maxSpeed

    Constructor RaceCar(noOfGear, color, maxSpeed):
        Call super(noOfGear, color)
        Set this.maxSpeed = maxSpeed

    Function printRaceCarInfo():
        Call printCarInfo()   // Print inherited attributes
        Print "maxSpeed: ", maxSpeed

Main:
    Create object raceCar of RaceCar(5, "red", 1000)
    Call raceCar.printRaceCarInfo()
```

---

## Web Diagram

```
+--------------------+              +---------------------+
|       Car          |              |      RaceCar       |
+--------------------+              +---------------------+
| - noOfGear: int    |              | - maxSpeed: int    |
| - color: String    |<------------ | + printRaceCarInfo()|
+--------------------+              +---------------------+
| + printCarInfo()   |              |  extends Car        |
+--------------------+              +---------------------+
```

- **Car**: Represents the base class with properties `noOfGear` and `color` and a method `printCarInfo`.
- **RaceCar**: Inherits from `Car`, with an additional property `maxSpeed` and a method `printRaceCarInfo`.

---

## Companies that Ask This Question

This question has been asked in interviews by:
- **Tata Consultancy Services (TCS)**