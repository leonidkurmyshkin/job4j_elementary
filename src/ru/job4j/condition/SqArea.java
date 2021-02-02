package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        return k * Math.pow(p / (2 * (k + 1)), 2);
    }

    public static void main(String[] args) {
        double result = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = " + result);
        result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = " + result);
    }
}