import java.util.*;

class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {

            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int option = sc.nextInt();

            // Variables to store operands
            double num1, num2, result;
            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();

            switch (option) {
                case 1:

                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:

                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:

                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:

                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error! Division by zero.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }


            System.out.print("Do you want to continue (y/n)? ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');


    }
}
