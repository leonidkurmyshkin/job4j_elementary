package ru.job4j.tasks;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        int result = (int) (percent * prize - pay);
        return result <= 0 ? 0 : result;
    }
}