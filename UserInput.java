package lessoncode.Converter;

import java.util.Scanner;

public class UserInput {

    public double userInput(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        double input = scanner.nextDouble();
        scanner.close();
        return input;
    }
    public int userInputInteger(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        int input = scanner.nextInt();
        scanner.close();
        return input;
    }
}