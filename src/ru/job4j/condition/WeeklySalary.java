package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int sum = 0;
        int daySalary;
        for (int i = 0; i < hours.length; i++) {
            daySalary = hours[i] <= 8 ? hours[i] * 10 : hours[i] * 15 - 40;
            if (i >= 5) {
                daySalary *= 2;
            }
            sum += daySalary;
        }
        return sum;
    }
}