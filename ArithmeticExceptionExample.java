//1..Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.

public class ArithmeticExceptionExample {

    // Main method 
    public static void main(String[] args) {
        
        // Declare two integer variables for division
        int num1 = 10;  // Dividend
        int num2 = 0; // Divisor
        
        try {
            // trying to divide the numbers
            int result = num1 / num2; 
            
            // prints the result if no exception happens
            System.out.println("Result: " + result);
        } 
        // Catch block
        catch (ArithmeticException e) {
            
            // error message when exception occurs
            System.out.println("Error: Division by zero is not allowed!");
        }
        
        // Program continues after the exception handling
        System.out.println("The program has handled the exception and continues.");
    }
}

//Output:
/*
Error: Division by zero is not allowed!
The program has handled the exception and continues.
*/
