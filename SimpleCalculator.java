import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple Java Calculator");
        System.out.println("----------------------");
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("\nSelect operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = scanner.nextInt();
        double result = 0;
        
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("\nResult: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("\nResult: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("\nResult: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("\nResult: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("\nError: Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("\nInvalid choice! Please select 1-4.");
        }
        
        scanner.close();
    }
}
