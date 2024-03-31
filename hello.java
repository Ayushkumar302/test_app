import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, sum;

        // Input the two numbers
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        // Add the numbers
        sum = num1 + num2;

        // Display the result
        System.out.println("Sum = " + sum);

        scanner.close();
    }
}
