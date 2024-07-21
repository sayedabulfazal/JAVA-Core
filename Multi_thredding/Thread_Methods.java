package Multi_thredding;

class psc_student implements Runnable {

    String name;

    public psc_student(String name) {

        this.name = name;

    }

    public void run() {

        int i = 1;
        while (true) {
            System.out.println("My name is " + this.name + " and I am Running........");
            // try {
            // Thread.sleep(1000);
            // } catch (InterruptedException e) {
            // System.out.println("Interrepted Exception has benn caught__Please fix it");
            // }

            i++;

        }

    }
}

public class Thread_Methods {

    public static void main(String[] args) {

        int i = 1;

        psc_student Shawn = new psc_student("Shawn");
        Thread t = new Thread(Shawn, "Shawn_td");
        t.start();

        while (true) {
            System.out.println("My name is MAIN METHOD");
            Thread.yield();
            // try {
            // Thread.sleep(1000);
            // } catch (InterruptedException e) {
            // System.out.println("Interrepted Exception has benn caught__Please fix it");

            // }

            i++;

        }

    }

}
