package ru.job4j.condition;

public class Max {
   public static int maxOfTwo(int first, int second) {
       int max = first > second ? first : second;
       return max;
   }

    public  static void main(String[] args) {
       System.out.println(Max.maxOfTwo(-5, -6));
    }
}
