import java.util.Scanner;

public class Calculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    // Method for modulus
    public static double modulus(double a, double b) {
        return a % b;
    }

    // Method for power
    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice='y';

        do {
            System.out.println("\n===== JAVA CONSOLE CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Exit");
            System.out.print("Choose an option (1-7): ");

            int option = sc.nextInt();

            if (option == 7) {
                System.out.println("Thank you for using Calculator!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;

            switch (option) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                case 5:
                    result = modulus(num1, num2);
                    break;
                case 6:
                    result = power(num1, num2);
                    break;
                default:
                    System.out.println("Invalid Option!");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
    }
}
