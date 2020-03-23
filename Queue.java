import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class Queue {
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> first = new PriorityQueue<>();
        PriorityQueue<Integer> second = new PriorityQueue<>();
        Scanner in = new Scanner(System.in);
        int size;
       System.out.println("введите размер");
        size = in.nextInt();
        for (int i = 0; i < size; i++) {
            first.add(getRandomNumberInRange(-100, 100));
        }
        System.out.println("Исходный");
        System.out.println(first);
        for (int i = 0; i < size; i++) {
            int j = first.remove();
            if (j > 0) {
                second.add(j);

            }


        }
        System.out.println("Полученный");
        System.out.println(second);
    }
}
