import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class rnd {

    private static int getRandomNumberInRange( int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int size;
        size = in.nextInt();
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        for (int i = 0; i < size; i++) {
            first.push(getRandomNumberInRange(-100, 100));
            int j = first.pop();
            if ( j > 0) { second.push(j);
        }

        }

        int q = 0;
        for ( int g = second.size(); q < g; q++ ) {
            int f = second.pop();
            first.push(f);
            System.out.println(f);
        }






    }







}
