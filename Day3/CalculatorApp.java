import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Choose Operation (+ - * /): ");
        char op = sc.next().charAt(0);

        switch (op){
            case '+': System.out.println("Result: " + (a + b)); break;
            case '-': System.out.println("Result: " + (a - b)); break;
            case '*': System.out.println("Result: " + (a * b)); break;
            case '/':
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}
