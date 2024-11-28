import java.io.*;
import java.lang.classfile.TypeAnnotation.EmptyTarget;
import java.lang.classfile.constantpool.StringEntry;
import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
         Scanner sc = new Scanner(System.in);
          System.out.print("Enter the first number: ");
          double num1 = sc.nextDouble();
          System.out.print("Enter the second number: ");
          double num2 = sc.nextDouble();
          System.out.print("Enter the operator (+, -, *, /): ");
          String operator = sc.next();
          double result = 0;
        while(operator != "") {
          System.out.print("Enter the first number: ");
          num1 = sc.nextDouble();
          System.out.print("Enter the second number: ");
          num2 = sc.nextDouble();
          System.out.print("Enter the operator (+, -, *, /): ");
          operator = sc.next();
        switch (operator) {
            case "+":
                result = calculator.add(num1, num2);
                break;
            case "-":
                result = calculator.subtract(num1, num2);
                break;  
            case "*":
                result = calculator.multiply(num1, num2);
                break;
            case "/":
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operator. Supported operators: +, -, *, /");
                break;
        }

        System.out.printf("Result: %.2f%n", result);
    }
    }


    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}




