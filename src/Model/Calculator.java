package Model;


public class Calculator {
    private double memory = 0;

    public double getMemory() {
        return memory;
    }

    public void add(double number) {
        memory += number;
    }

    public void subtract(double number) {
        memory -= number;
    }

    public void multiply(double number) {
        memory *= number;
    }

    public void divide(double number) {
        if (number != 0) {
            memory /= number;
        }
    }

    public void power(double number) {
        memory = Math.pow(memory, number);
    }
}
