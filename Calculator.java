import java.util.Scanner;
public class JCM {

        public static void main(String[] args) {
            Scanner o = new Scanner(System.in);

            System.out.println("Simple Calculator");
            System.out.println("=================");

            System.out.print("Enter the first number: ");
            double num1 = o.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = o.nextDouble();

            System.out.println("Choose an operation (+, -, *, /): ");
            char operation = o.next().charAt(0);

            double result = 0;
            boolean validOperation = true;

            if (operation == '+') {
                result = num1 + num2;
            } else if (operation == '-') {
                result = num1 - num2;
            } else if (operation == '*') {
                result = num1 * num2;
            } else if (operation == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
            } else {
                System.out.println("Invalid operation. Please choose +, -, *, or /.");
                validOperation = false;
            }

            if (validOperation) {
                System.out.println("The result is: " + result);
            }

            o.close();
        }
    }

