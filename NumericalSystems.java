public class NumericalSystems {
    public static void main(String[] args) {
        //возведение в степень

        //QWERT = Q * 10^4 + W * 10^3 + E * 10^2 + R * 10^1 + T * 10^0
        //43210 <- reserved indexes

        int b = 1024;

        //System.out.println(1*Math.pow(10,3) + 0*Math.pow(10,2) + 2*Math.pow(10,1) + 4*Math.pow(10,0));

        int b7 = 144;

        //System.out.println(1*Math.pow(10,2) + 4*Math.pow(10,1) + 4*Math.pow(10,0));

        //OCTAL
        //10->8

        int p = 100;

        //System.out.println(100 / 8);    // 12
        //System.out.println(100 % 8);        // 4

        //System.out.println(12 / 8);    // 1
        //System.out.println(12 % 8);       // 4

        //System.out.println(1 / 8);    // 0
        //System.out.println(1 % 8);       // 1

        int d8 = 144;

        //System.out.println(144 / 8);    // 18
        //System.out.println(144 % 8);        // 0

        //System.out.println(18 / 8);     // 2
        //System.out.println(18 % 8);        // 2

        //System.out.println(2 / 8);     // 0
        //System.out.println(2 % 8);        // 2

        int g7 = 1144;

        //System.out.println(1144 / 8);   // 143
        //System.out.println(1144 % 8);        // 0

        //System.out.println(143 / 8);   // 17
        //System.out.println(143 % 8);      // 7

        //System.out.println(17 / 8);   // 2
        //System.out.println(17 % 8);     // 1

        //System.out.println(2 / 8);    // 0
        //System.out.println(2 % 8);       // 2

        int v8 = 978;

        //System.out.println(978 / 8);    // 122
        //System.out.println(978 % 8);        // 2

        //System.out.println(122 / 8);   // 15
        //System.out.println(122 % 8);      // 2

        //System.out.println(15 / 8);   // 1
        //System.out.println(15 % 8);     // 7

        //System.out.println(1 / 8);   // 0
        //System.out.println(1 % 8);     // 1

        int v6 = 12;

        //System.out.println(12 / 8);   // 1
        //System.out.println(12 % 8);     // 4

        //System.out.println(1 / 8);   // 0
        //System.out.println(1 % 8);     // 1

        //8->10

        int v11 = 1144;

        System.out.println(1 *Math.pow(8,3) + 1*Math.pow(8,2) + 4 *Math.pow(8,1) + 4*Math.pow(8,0));

        int d7 = 1722;

        System.out.println(1 *Math.pow(8,3) + 7*Math.pow(8,2) + 2*Math.pow(8,1) + 2*Math.pow(8,0));

        int ba = 12;

        System.out.println(1 *Math.pow(8,1) + 2 *Math.pow(8,0));

    }
}
