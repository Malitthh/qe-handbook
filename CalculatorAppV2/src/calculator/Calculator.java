package calculator;

public class Calculator {
	private double currentResult;

	// Constructor
	public Calculator() {
		currentResult = 0.0;
	}

	// Getter for current result
	public double getCurrentResult() {
		return currentResult;
	}

	// Basic arithmetic operations
	public void add(double value) {
		currentResult += value;
	}

	public void subtract(double value) {
		currentResult -= value;
	}

	public void multiply(double value) {
		currentResult *= value;
	}

	public void divide(double value) {
		if (value != 0) {
			currentResult /= value;
		} else {
			System.out.println("Error: Cannot divide by zero.");
		}
	}
}

//Explanation:
//Class Declaration (public class Calculator):
//
//This code defines a class named Calculator.
//Instance Variable (private double currentResult):
//
//The class has a private instance variable currentResult of type double, which represents the current result of the calculator.
//Constructor (public Calculator()):
//
//The class has a constructor that initializes the currentResult to 0.0 when a Calculator object is created.
//Getter Method (public double getCurrentResult()):
//
//This method provides access to the current result value. Other classes can call this method to get the current result.
//Basic Arithmetic Operations (add, subtract, multiply, divide):
//
//These methods perform basic arithmetic operations on the currentResult.
//add adds a given value to the current result.
//subtract subtracts a given value from the current result.
//multiply multiplies the current result by a given value.
//divide divides the current result by a given value, handling the case where the divisor is zero.

