public class BoxNew {

    int height;
    int Long;
    int width;

    public BoxNew(int height, int Long, int weight) {
        this(height, Long);

        this.height = height;
        this.Long = Long;
        this.width = weight;

        print();
    }

    public BoxNew(int height, int Long) {
        this(height);

        this.height = height;
        this.Long = Long;
        width = 7;

        print();
    }

    public BoxNew(int height) {
        this();
        this.height = height;
        Long = 5;
        width = 9;

        print();
    }

    public BoxNew() {
        height = 4;
        Long = 6;
        width = 8;

        print();
    }

    public void print() {
        System.out.println("height=" + height + " Long=" + Long + " weight=" + width);
    }
}



