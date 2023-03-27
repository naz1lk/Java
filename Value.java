package homeworks;

import java.util.Random;

public class Value {
        public static void main(String[] args) {
            Random rand = new Random();
            int a = rand.nextInt(100,999);
            int first = a / 100;
            int secondBegin = a / 10;
            int second = secondBegin % 10;
            int third = a % 10;
            System.out.println(a);
            if (first > second && first > third) {
                System.out.println(first);
            } else if (second > first && second > third) {
                System.out.println(second);
            } else {
                System.out.println(third);
            }

        }
    }
