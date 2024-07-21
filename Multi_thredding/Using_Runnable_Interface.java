package Multi_thredding;

class MyThread2 implements Runnable {

    public void run() {
        int i = 1;

        while (i > 0) {
            System.out.println("Hello");
            i++;

        }

    }

    public class Using_Runnable_Interface {

    public static void main(String[] args) {
        MyThread2 t2 = new MyThread2();
        t2.start();
        int j = 1;

        while (j > 0) {
            System.out.println("World");
            j++;

        }

}
