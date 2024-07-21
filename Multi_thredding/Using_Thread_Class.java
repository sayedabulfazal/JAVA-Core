package Multi_thredding;

class MyThread extends Thread {

    public void run() {
        int i = 1;

        while (i > 0) {
            System.out.println("Hello");
            i++;

        }

    }
}

public class Using_Thread_Class {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        int j = 1;

        while (j > 0) {
            System.out.println("World");
            j++;

        }

    }

}
