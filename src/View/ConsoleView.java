package View;


import java.util.Scanner;

public class ConsoleView {
    private static final Scanner in = new Scanner(System.in);

    public static int menu() {
        System.out.println("=============== MENU ===============");
        System.out.println("||1. Normal Calculator            ||");
        System.out.println("||2. BMI Calculator               ||");
        System.out.println("||3. Exit                         ||");
        System.out.println("====================================");
        System.out.print("Enter your choice: ");
        return in.nextInt();
    }

    public static double inputDouble(String prompt) {
        System.out.print(prompt);
        return in.nextDouble();
    }

    public static String inputOperator() {
        System.out.print("Enter operator (+, -, *, /, ^, =): ");
        return in.next();
    }

    public static void displayResult(double result) {
        System.out.println("Result: " + result);
    }

    public static void displayBMIResult(double bmi, String status) {
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + status);
    }
}
