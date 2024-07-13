package Inner_Classes;

class outer {
    int x = 10;
    inner in = new inner();

    class inner {
        int y = 20;

        public void innerDisplay() {
            System.out.println("I am Inner Display Method");
            System.out.println(x + " " + y);
        }

    }

    public void outerDisplay() {

        in.innerDisplay();
        System.out.println(in.y);
        System.out.println(x);
    }
}

public class Inner_Practice_01 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        outer out = new outer();
        out.outerDisplay();
        outer.inner oi = new outer().new inner();

        oi.innerDisplay();

    }

}
