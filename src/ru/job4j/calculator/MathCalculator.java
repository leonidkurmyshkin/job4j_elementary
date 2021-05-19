package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractPlusDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double sumOfAllOperations(double first, double second) {
        return sumAndMultiply(first, second)
                + subtractPlusDivide(first, second);
    }

    public static void main(String[] args) {
        int first = 10;
        int second = 20;
        System.out.println(
                first + " + " + second + " + "
                + first + " * " + second + " = "
                + sumAndMultiply(10, 20));
        System.out.println(
                first + " - " + second + " + "
                + first + " / " + second + " = "
                + subtractPlusDivide(10, 20));
        System.out.println(
                first + " + " + second + " + "
                + first + " * " + second + " + "
                + first + " - " + second + " + "
                + first + " / " + second + " = "
                + sumOfAllOperations(10, 20));
    }
}