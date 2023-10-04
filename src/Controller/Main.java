package Controller;

import Model.Calculator;
import Model.BMI;
import View.ConsoleView;

public class Main {

    public static void main(String[] args) {
        Calculator calculatorModel = new Calculator();

        while (true) {
            int choice = ConsoleView.menu();
            switch (choice) {
                case 1:
                    handleNormalCalculator(calculatorModel);
                    break;
                case 2:
                    handleBMICalculator();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void handleNormalCalculator(Calculator calculatorModel) {
        double memory;
        System.out.print("Enter number: ");
        memory = ConsoleView.inputDouble(""); // Assign the input to memory
        while (true) {
            System.out.print("Enter operator: ");
            String operator = ConsoleView.inputOperator();
            if (operator.equalsIgnoreCase("+")) {
                double number = ConsoleView.inputDouble("Enter number to add: ");
                memory += number;
                System.out.println("Memory: " + memory);
            } else if (operator.equalsIgnoreCase("-")) {
                double number = ConsoleView.inputDouble("Enter number to subtract: ");
                memory -= number;
                System.out.println("Memory: " + memory);
            } else if (operator.equalsIgnoreCase("*")) {
                double number = ConsoleView.inputDouble("Enter number to multiply: ");
                memory *= number;
                System.out.println("Memory: " + memory);
            } else if (operator.equalsIgnoreCase("/")) {
                double number = ConsoleView.inputDouble("Enter number to divide: ");
                if (number != 0) {
                    memory /= number;
                    System.out.println("Memory: " + memory);
                } else {
                    System.err.println("Division by zero is not allowed.");
                }
            } else if (operator.equalsIgnoreCase("^")) {
                double number = ConsoleView.inputDouble("Enter number for power: ");
                memory = Math.pow(memory, number);
                System.out.println("Memory: " + memory);
            } else if (operator.equalsIgnoreCase("=")) {
                System.out.println("Result: " + memory);
                return;
            } else {
                System.err.println("Invalid operator. Please try again.");
            }
        }
    }

    private static void handleBMICalculator() {
        double weight = ConsoleView.inputDouble("Enter Weight(kg): ");
        double height = ConsoleView.inputDouble("Enter Height(cm): ");
        double bmi = BMI.calculateBMI(weight, height);
        String status = BMI.getStatus(bmi);
        ConsoleView.displayBMIResult(bmi, status);
    }
}
