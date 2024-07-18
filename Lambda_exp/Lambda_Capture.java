package Lambda_exp;

interface Mylamda {

    public void display();

}

class demo {
    int count = 0;

    public void show() {

        Mylamda ml = () -> {

            System.out.println("Hello Demo");
            System.out.println("Bye");
            System.out.println(count++);
        };
    }

}

public class Lambda_Capture {
    public static void main(String[] args) {

    }

}
