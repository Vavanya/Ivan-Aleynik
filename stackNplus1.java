import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class stackNplus1 {
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        Stack<Integer> from = new Stack<>();
        Stack<Integer> to = new Stack<>();
        size = in.nextInt();
        System.out.println("Введите число");
        int chislo = in.nextInt();
        for (int i = 0; i < size; i++) {
            from.push(getRandomNumberInRange(-100, 100));
            int j = from.pop();
            if (j % chislo == 0) {
                to.push(j);
            }
        }
        int q = 0;
        for (int g = to.size(); q < g; q++) {
            int f = to.pop();
            from.push(f);
            System.out.println(f);

        }


    }
}

