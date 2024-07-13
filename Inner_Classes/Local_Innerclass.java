package Inner_Classes;

class outer1 {
    public void display() {

        class inner1 {

            public void show1() {
                System.out.println("Hello World");
            }
        }

        new inner1().show1();

    }
}

public class Local_Innerclass {

    public static void main(String[] args) {
        outer1 ot = new outer1();
        ot.display();
    }

}
