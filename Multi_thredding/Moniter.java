package Multi_thredding;

class sharedData {

    String str;

    synchronized public void display(String str) {
        this.str = str;

        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i));

        }

    }
}

class thread01 extends Thread {

    sharedData sd;

    public thread01(sharedData data) {

        this.sd = data;

    }

    public void run() {
        sd.display("Azam Hacker");

    }

}

class thread02 extends Thread {

    sharedData sd;

    public thread02(sharedData data) {

        this.sd = data;

    }

    public void run() {

        sd.display("Atif Killchor");

    }

}

public class Moniter {

    public static void main(String[] args) {
        // System.out.println("Hello World");

        sharedData sd = new sharedData();
        thread01 td1 = new thread01(sd);
        thread02 td2 = new thread02(sd);
        td2.start();
        td1.start();
        // td2.start();

    }

}
