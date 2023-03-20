package homeworks;

import java.util.Scanner;

public class Pizza {
    static int getRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a radius of your pizza: ");
        int radiusOfPizza = scanner.nextInt();
        return (int) (Math.PI * Math.pow(radiusOfPizza,2));
    }

    public static void main(String[] args) {
        System.out.println(getRadius());


    }
}
