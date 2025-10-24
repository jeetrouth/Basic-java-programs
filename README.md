# Basic Java Programs

Collection of small, self-contained Java programs demonstrating common programming concepts and algorithms — aimed at beginners and learners.

Repository: https://github.com/Sbiswas001/Basic-java-programs

Topics: hacktoberfest, hacktoberfest-accepted

---

## Contents

This repository contains simple Java programs such as:
- Hello World
- Basic calculator (addition, subtraction, multiplication, division)
- Loops and conditionals examples
- Array operations (search, sort)
- Recursion examples (factorial, Fibonacci)
- String manipulation
- Small algorithm demos (e.g., bubble sort, linear search)

(See the repo file list for exact filenames and folder structure.)

---

## Prerequisites

- Java Development Kit (JDK) 8 or later installed
- Terminal / command prompt or an IDE (IntelliJ IDEA, Eclipse, VS Code + Java extensions)

Check Java installation:
```bash
java -version
javac -version
```

---

## How to compile and run

From the repository root, navigate to the folder containing the .java file you want to run.

Compile a single file:
```bash
javac HelloWorld.java
```

Run the compiled class:
```bash
java HelloWorld
```

Compile all `.java` files in a folder:
```bash
javac *.java
```

Run a class (ensure package paths are respected if source files use packages):
```bash
java -cp . com.example.MyProgram
```

If you use an IDE, import the folder as a Java project/module and run classes directly from the IDE.

---

## Recommended structure

Keep each program in its own file named after the public class, for example:
- HelloWorld.java
- Calculator.java
- FactorialRecursive.java
- BubbleSort.java

Optionally group related examples into folders:
- sorting/
- recursion/
- strings/

---

## Contributing

Contributions are welcome! Simple ways to contribute:
- Add new beginner-friendly programs
- Improve existing programs with comments and clearer input/output
- Fix typos and README improvements

If you'd like to contribute:
1. Fork the repository
2. Create a descriptive branch (e.g., `add/fibonacci-example`)
3. Add your program with clear filename and comments
4. Submit a pull request describing what you added

Label your PR appropriately for Hacktoberfest if participating.

---

## Coding style & guidelines

- Use clear, descriptive class and variable names
- Keep programs small and focused on a single concept
- Add brief comments explaining non-obvious logic
- Prefer simple console input/output for beginner clarity

---

## License

No license is specified for this repository. If you want others to freely use and contribute, consider adding a license such as MIT. Example: create a `LICENSE` file with the MIT license text.

---

## Contact

Repository owner: Sbiswas001 — https://github.com/Sbiswas001

Happy learning and happy coding!
