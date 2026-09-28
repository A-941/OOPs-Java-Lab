# Object-Oriented Programming (OOP) - Java Lab Experiments

This repository contains clean, concise, and tested solutions for all Object-Oriented Programming (OOPs) laboratory experiments in Java (Lab 0 through Lab 7).

---

## Directory Structure

```
Oops/
├── Lab0/
│   ├── Program1_CodingIsFun.java          # Basic Java output
│   ├── Program2_FirstNPrimes.java          # Prime numbers generator
│   ├── Program3_MathOperations.java        # Arithmetic operations
│   ├── Program4_StudentPercentage.java     # 6-subject percentage calculation
│   ├── Program5_MaxOfThree.java            # Maximum of 3 numbers using ternary operator
│   ├── Program6_VowelsConsonants.java      # Vowel and consonant counter
│   ├── Program7_CapitalWordsCount.java     # Count words starting with uppercase
│   ├── Program8_VowelFrequency.java        # Frequency of each vowel until 'quit'
│   ├── Program9_PyramidString.java         # Pyramid string pattern display
│   └── Program10_DiamondPattern.java       # Diamond star pattern
├── Lab1/
│   ├── Program1_TemperatureStats.java      # 7-day temperature analysis
│   ├── Program2_MatrixMultiplication.java  # Matrix multiplication
│   ├── Program3_DistanceDemo.java          # Distance class (feet & inches, getters/setters/this/toString)
│   └── Program4_AreaOverloading.java       # Area calculation using method overloading
├── Lab2/
│   ├── Program1_DistanceConstructors.java  # Constructor overloading & copy constructor
│   ├── Program2_VehicleDemo.java           # Instance blocks, static count, getters/setters/toString
│   └── Program3_InbuiltClassesDemo.java    # Built-in Java classes (System, Math, String, Integer)
├── Lab3/
│   ├── Program1_UniversityDemo.java        # Single/multilevel inheritance, super keyword, method overriding
│   └── Program2_BankingDemo.java           # Abstract classes, final variable, final method, final class
├── Lab4/
│   ├── Program1_PaymentDemo.java           # Interface implementation & polymorphism
│   └── bank/                               # Package architecture and access modifiers
│       ├── operations/
│       │   └── BankOperations.java         # Interface for bank operations
│       ├── accounts/
│       │   ├── SavingsAccount.java         # Implementation with private/protected/public
│       │   └── SpecialSavingsAccount.java  # Subclass accessing protected members
│       └── application/
│           └── BankApplication.java       # Driver class demonstrating access modifier rules
├── Lab5/
│   ├── Program1_ArrayDivisionException.java # Multiple catch (ArithmeticException & ArrayIndexOutOfBounds)
│   ├── Program2_OddNumberException.java    # Throwing NumberFormatException for odd numbers
│   └── Program3_VowelCustomException.java  # Custom exception StringNotValidException
├── Lab6/
│   ├── Program1_FileCopyCharStream.java    # File copy using FileReader and FileWriter
│   ├── Program2_MergeAudioFiles.java       # Merging audio files using Byte Streams
│   └── Program3_StudentSerialization.java  # Object serialization and deserialization
├── Lab7/
│   ├── Program1_EvenOddThreads.java        # Multithreading with even and odd printing
│   ├── Program2_ThreadPriorityDemo.java    # Thread priority configuration
│   ├── Program3_BankWithdrawRaceCondition.java # Synchronized banking withdrawal simulation
│   └── Program4_ProducerConsumerStack.java # Producer-Consumer problem using synchronized stack
└── .gitignore
```

---

## Lab Summaries

### Lab 0: Java Basics & Control Structures
- **Program 1**: Output message `"CODING IS FUN, ENJOY IT!"`.
- **Program 2**: Generate first `n` prime numbers.
- **Program 3**: Input two numbers and perform addition, subtraction, multiplication, division, modulo.
- **Program 4**: Calculate percentage marks across 6 subjects.
- **Program 5**: Find maximum of three numbers using ternary conditional operator.
- **Program 6**: Count consonants and vowels in a line.
- **Program 7**: Count words starting with a capital letter.
- **Program 8**: Track vowel frequencies across sentences until `"quit"` is entered.
- **Program 9**: Display input string in pyramid format.
- **Program 10**: Print a diamond star pattern based on input size.

### Lab 1: Arrays, Classes, `this` & Method Overloading
- **Program 1**: Temperature statistics (average, max, min, days above average).
- **Program 2**: Multiply two 2D matrices with dimension compatibility check.
- **Program 3**: `Distance` class with feet and inches, `this` keyword, getters, setters, and `toString`.
- **Program 4**: Overloaded `findArea()` method for circle (1 arg), rectangle (2 args), triangle (3 args).

### Lab 2: Constructors, Instance/Static Blocks & Built-in Classes
- **Program 1**: Constructor chaining (`this()`), default constructor, 1-argument constructor, and copy constructor for `Distance`.
- **Program 2**: `Vehicle` class with private fields, instance block tracking object count, Ahmedabad RTO default, and `toString()`.
- **Program 3**: Demonstrations of built-in classes: `System` (`arraycopy`, `currentTimeMillis`, `gc`), `Math` (`sqrt`, `abs`, `min`, `max`, `round`, `random`), `String` (`length`, `charAt`, `substring`, `equals`, `compareTo`, `contains`, `indexOf`), and `Integer` (`parseInt`, `valueOf`, `decode`, `intValue`, `byteValue`, `toString`).

### Lab 3: Inheritance, Polymorphism, Abstract & Final
- **Program 1**: University Employee Management System (`Employee` base class, `Faculty` and `AdministrativeStaff` derived classes, bonus calculation, `super` keyword).
- **Program 2**: Abstract class `BankAccount`, concrete subclasses `SavingsAccount` and `PremiumSavingsAccount`, final variables, final methods, and final class `BankRules`.

### Lab 4: Interfaces, Packages & Access Modifiers
- **Program 1**: `Payment` interface with `CreditCardPayment`, `UPIPayment`, and `NetBankingPayment` implementations demonstrated polymorphically.
- **Program 2**: Multi-package Bank Account Management System demonstrating `public`, `protected`, and `private` visibility across packages `bank.operations`, `bank.accounts`, and `bank.application`.

### Lab 5: Exception Handling & Custom Exceptions
- **Program 1**: Divide array elements with `try-catch` handling `ArithmeticException` and `ArrayIndexOutOfBoundsException`.
- **Program 2**: Method that validates even numbers and throws `NumberFormatException` if odd.
- **Program 3**: Custom checked exception `StringNotValidException` thrown when an input string contains no vowels.

### Lab 6: I/O Streams & Serialization
- **Program 1**: Character stream file copy using `FileReader` and `FileWriter`.
- **Program 2**: Byte stream audio merging using `FileInputStream` and `FileOutputStream`.
- **Program 3**: Serialization and deserialization of `Student` objects using `ObjectOutputStream` and `ObjectInputStream`.

### Lab 7: Multithreading & Concurrency
- **Program 1**: Separate threads concurrently printing even and odd numbers from 1 to 20.
- **Program 2**: Priority setting on worker threads (`MIN_PRIORITY` vs `MAX_PRIORITY`).
- **Program 3**: Multi-user shared bank account withdrawal simulation using `synchronized` to eliminate race conditions.
- **Program 4**: Producer-Consumer problem with bounded stack using `wait()` and `notifyAll()`.

---

## How to Compile & Run

### Compiling and Running Individual Programs
From the project root:

```bash
# Example: Lab 0 Program 1
javac Lab0/Program1_CodingIsFun.java
java -cp Lab0 Program1_CodingIsFun

# Example: Lab 4 Package Application
javac Lab4/bank/operations/BankOperations.java Lab4/bank/accounts/*.java Lab4/bank/application/BankApplication.java
java -cp Lab4 bank.application.BankApplication
```

### Compiling All Programs at Once
```bash
# Windows PowerShell
Get-ChildItem -Recurse -Filter *.java | ForEach-Object { javac $_.FullName }
```
