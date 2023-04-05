package homeworks;

import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
//        CoffeeIfExample();
        CoffeeSwitchExample();


    }


    public static void CoffeeIfExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 = espresso");
        System.out.println("2 = americano");
        System.out.println("3 = cappuccino");
        System.out.println("4 = still water");
        System.out.println("Enter which drink you want");
        int numOfDrink = scanner.nextInt();

        if (numOfDrink == 1) {
            System.out.println("Espresso is ready ");
        } else if (numOfDrink == 2) {
            System.out.println("Americano is ready");
        } else if (numOfDrink == 3) {
            System.out.println("Cappuccino is ready");
        } else if (numOfDrink == 4) {
            System.out.println("Still water is ready");
        } else {
            System.out.println("Wrong number drink");
        }
        scanner.close();
    }

    public static void CoffeeSwitchExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 = espresso");
        System.out.println("2 = americano");
        System.out.println("3 = cappuccino");
        System.out.println("4 = still water");
        System.out.println("Enter which drink you want");
        int numOfDrink = scanner.nextInt();
        if (numOfDrink >= 1 && numOfDrink <= 4) {
            switch (numOfDrink) {
                case 1:
                    System.out.println("1 = espresso");
                    break;
                case 2:
                    System.out.println("2 = americano");
                    break;
                case 3:
                    System.out.println("3 = cappuccino");
                    break;
                case 4:
                    System.out.println("4 = still water");
                    break;
            }
        } else {
            System.out.println("Wrong number drink");
        }

    }

    }