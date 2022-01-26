package ru.job4j.condition;

public class Club {
    public  static void permission(boolean hasMoney, boolean isFriend) {
        String permission = hasMoney || isFriend ? "I can go to the club." : "I can't.";
        System.out.println(permission);
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(false, true);
        permission(true, false);
        permission(false, false);
    }
}
