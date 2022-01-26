package ru.job4j.condition;

public class Game {

    public static void menu(String name) {
        if (("Mario").equals(name)) {
            System.out.println("Start - super Mario");
        }
        if (name.equals("tanks")) {
            System.out.println("Start - Tanks");
        }
        if (name.equals("tetris")) {
            System.out.println("Start - Tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
        Game.menu("tetris");
        Game.menu("Mario");
    }
}
