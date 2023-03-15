public class Box {

    int height = 5;
    int Long = 4;
    int width = 3;

    public Box(int h, int L, int w) {
        this.height = h;
        this.Long = L;
        this.width = w;

        System.out.println(h);
        System.out.println(L);
        System.out.println(w);
        System.out.println(h * L * w);


    }

    public Box(int h, int L) {
        this.height = h;
        this.Long = L;
        width = 3;

        System.out.println(h);
        System.out.println(L);
        System.out.println(width);
        System.out.println(h * L * width);

    }

    public Box(int h) {
        this.height = h;
        Long = 4;
        width = 3;

        System.out.println(h);
        System.out.println(Long);
        System.out.println(width);
        System.out.println(h * Long * width);


    }

    public Box() {
        height = 5;
        Long = 4;
        width = 3;

        System.out.println(height);
        System.out.println(Long);
        System.out.println(width);
        System.out.println(height * Long * width);
    }


}















