package Inner_Classes;

class outer4 {

    static int x = 4;
    static int y = 5;

    static class my1 {

        public void show4() {
            System.out.println("Hello I am am Showing");
        }
    }

}

public class Static_InnerClass {

    public static void main(String[] args) {

        outer4.my1 om = new outer4.my1();
        om.show4();
    }

}
