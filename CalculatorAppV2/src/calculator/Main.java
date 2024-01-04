package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Simple Calculator App");

        while (true) {
            System.out.print("Enter an operator (+, -, *, /) or 'q' to quit: ");
            String operator = scanner.next();

            if (operator.equals("q")) {
                System.out.println("Calculator app has been closed.");
                break;
            }

            System.out.print("Enter a value: ");
            double value = scanner.nextDouble();

            switch (operator) {
                case "+":
                    calculator.add(value);
                    break;
                case "-":
                    calculator.subtract(value);
                    break;
                case "*":
                    calculator.multiply(value);
                    break;
                case "/":
                    calculator.divide(value);
                    break;
                default:
                    System.out.println("Invalid operator.");
            }

            System.out.println("Current Result: " + calculator.getCurrentResult());
        }

        scanner.close();

	}

}

//Explanation:
//Package and Import Statements (import java.util.Scanner):
//
//The code imports the Scanner class from the java.util package, allowing user input.
//Class Declaration (public class Main):
//
//This code defines a class named Main.
//main Method (public static void main(String[] args)):
//
//The entry point of the program where execution starts.
//Object Instantiation (Scanner scanner = new Scanner(System.in), Calculator calculator = new Calculator()):
//
//Creates a Scanner object (scanner) to read input from the console.
//Creates a Calculator object (calculator) to perform calculations.
//Console Output (System.out.println("Simple Calculator App")):
//
//Prints a message to the console.
//User Input (scanner.next(), scanner.nextDouble()):
//
//Reads the user's input for the operator and value.
//Switch Statement (switch (operator) { ... }):
//
//Uses a switch statement to determine the operation based on the user's input.
//Calculator Operations (calculator.add(value), calculator.subtract(value), calculator.multiply(value), calculator.divide(value)):
//
//Calls the appropriate methods of the Calculator class based on the user's input.
//Console Output (System.out.println("Current Result: " + calculator.getCurrentResult())):
//
//Prints the current result after each operation.
//Loop (while (true) { ... }, break):
//
//Continues to prompt the user for input until they enter 'q' to quit.
//Resource Closing (scanner.close()):
//
//Closes the Scanner to release system resources.
//This program creates a simple calculator that allows the user to perform basic arithmetic operations in a loop until they choose to quit by entering 'q'. It demonstrates the use of classes, objects, user input, and control flow in Java.