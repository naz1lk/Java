import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pls a number (2value): ");
        int a = scanner.nextInt();

        int tmp1 = a / 3;
        int tmp_1 = a % 3;

        int tmp2 = tmp1 / 3;
        int tmp_2 = tmp1 % 3;

        int tmp3 = tmp2 / 3;
        int tmp_3 = tmp2 % 3;

        System.out.println(tmp_3 + "" + tmp_2 + "" + tmp_1);


    }
}
