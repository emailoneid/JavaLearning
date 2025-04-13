import java.util.Scanner;

public class Calculator {
    public static void main (String args[]){
        System.out.println("Welcome to this simple calculator");

        // Holders for operands
        double num1 = 0.0;
        double num2 = 0.0;
        String operation;

        System.out.println("Please enter the first number");
        Scanner input = new Scanner(System.in);
        try{
            num1 = input.nextDouble();
        } catch (Exception e) {
            System.out.println("You entered a wrong number");
            System.exit(0);
        }

        System.out.println("Please enter the second number");
        Scanner input2 = new Scanner(System.in);
        try{
            num2 = input.nextDouble();
        } catch (Exception e) {
            System.out.println("You entered a wrong number");
            System.exit(0);
        }
        System.out.println("Please enter the operation");
        Scanner input3 = new Scanner(System.in);
        operation = input3.next();

        double x = 0.0;

        switch(operation){
            case "+":
                x = num1 + num2;
                System.out.println("The result is: " + x);
                break;
            case "-":
                x = num1 - num2;
                System.out.println("The result is: " + x);
                break;
            case "*":
                x = num1 * num2;
                System.out.println("The result is: " + x);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    x = num1 / num2;
                    System.out.println("The result is: " + x);
                }
                break;
            default:
                System.out.println("Invalid operation. Please enter +, -, * or /.");
        }

//        if (operation.equals("+")){
//            double x = num1 + num2;
//            System.out.println("The result is: " + x);
//        } else if (operation.equals("-")){
//            double x = num1 - num2;
//            System.out.println("The result is: " + x);
//        } else if (operation.equals("*")){
//            double x = num1 * num2;
//            System.out.println("The result is: " + x);
//        } else if (operation.equals("/")){
//            double x = num1 / num2;
//            System.out.println("The result is: " + x);
//        }

    }
}
