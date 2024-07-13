package Inner_Classes;

abstract class My {

    abstract public void show2();
}

class outer3 {
    public void display3() {

        // 1)Object with refrence
        My m = new My() {
            public void show2() {
                System.out.println("Hello I am : Anonymous Inner Class ");
            }
        };
        m.show2();

        // OR

        // 2) Anonymous object
        // new My() {
        // public void show2() {
        // System.out.println("Hello I am : Anonymous Inner Class + Anonymous Object");
        // }
        // }.show2();
    }
}

public class Anonymous_Abstract_innerClass {

    public static void main(String[] args) {

        outer3 ot = new outer3();
        ot.display3();

    }

}
