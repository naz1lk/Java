package homeworks;

import java.util.Random;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int temperature1 = random.nextInt(0,200);
        int temperature2 = random.nextInt(0,200);
        System.out.println(temperature1 + " " + temperature2);
        int temperature3 = scanner.nextInt();
        int temperature4 = scanner.nextInt();
        System.out.println(worksRight(temperature1, temperature2));
        System.out.println(worksRight(temperature3, temperature4));
    }
    static boolean worksRight(int temp1, int temp2) {
        if (temp1 > 100 && temp2 < 100) {
            return true;
        }
        return false;
    }
}
