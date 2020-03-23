import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;
import java.util.Scanner;
public class Deque1 {

        private static int getRandomNumberInRange( int min, int max) {
            Random r = new Random();
            return r.nextInt((max - min) + 1) + min;
        }




        public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
            int size;
            System.out.println("Введите размер дека");
            size = in.nextInt();
            Deque<Integer> sourse = new ArrayDeque<>();
            for (int i = 0; i < size; i++) {
                sourse.push(getRandomNumberInRange(-100,100));
            }
            System.out.println("Введите число в начало дека");
            int f =in.nextInt();
            sourse.addFirst(f);
            System.out.println(sourse);





        }
    }


