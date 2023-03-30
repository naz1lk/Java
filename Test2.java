import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //  Разработайте алгоритм, который будет получать значение населения того или иного города,
        //  а так же идентификатора страны и определять насколько большой город в зависимости от страны.
        //Например, для Германии город с населением до 100к человек маленький, до 400к человек средний,
        // больше 1кк человек - большой. Для Франции, до 200к маленький, до 500к - средний, более 1.5кк - большой.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter population: ");
        int population = scanner.nextInt();

        System.out.print("Enter an country identifier: ");
        String countryID = scanner.next(); // FR, DE
        // для Германии город с населением до 100к человек маленький, до 400к человек средний,
        // больше 1кк человек - большой
        if (countryID.equals("DE")) {
            if (population > 0 && population < 100_000) {
                System.out.println("This city is small in Germany");
            } else if (population >= 100_000 && population < 400_000) {
                System.out.println("This city is middle in Germany");
            } else if (population >= 400_000 && population < 1_000_000) {
                System.out.println("This city is in Germany with undefined parameter");
            } else if (population >= 1_000_000) {
                System.out.println("This city is big in Germany");
            }
            // Для Франции, до 200к маленький, до 500к - средний, более 1.5кк - большой.
            if (population > 0 && population < 200_000)
                System.out.println("this city is small town in France");
            else if (population >= 200_000 && population < 500_000)
                System.out.println("this city is middle town in France");
            else if (population >= 400_000 && population < 1_000_000)
                System.out.println("this city in France with undefined parameter");
            else if (population >= 1_500_000)
                System.out.println("this city is big town in France");
            else
                System.out.println("wrong information about population");
        } else {
            System.out.println("wrong country id");
        }

            scanner.close();
        
    }
}
