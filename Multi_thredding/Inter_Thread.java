package Multi_thredding;

class textFile {
    int value = 0;
    boolean flag = true;

    synchronized public void setData() {
        while (flag == false) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }

        }
        value++;
        System.out.println("The Producer has set value : " + value);
        flag = false;
        notify();

    }

    synchronized public int getData() {

        int x = 0;
        while (flag == true) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }

        }

        x = value;
        flag = true;
        notify();
        return x;
    }
}

class producer extends Thread {

    textFile file;

    public producer(textFile file) {
        this.file = file;
    }

    public void run() {

        int i = 1;

        while (true) {

            file.setData();

            i++;
        }

    }

}

class consumer extends Thread {

    textFile file;

    public consumer(textFile file) {
        this.file = file;
    }

    public void run() {
        int j = 0;

        while (true) {
            System.out.println("Consumer has feched the value : " + file.getData());

        }
    }

}

public class Inter_Thread {

    public static void main(String[] args) {
        System.out.println("Hello world");
        textFile file = new textFile();

        System.out.println(" textFile file = new textFile()--done");
        producer pd = new producer(file);

        System.out.println("producer pd = new producer(file);--done");
        consumer cm = new consumer(file);

        System.out.println("consumer cm = new consumer(file);--done");

        System.out.println(pd.getState());
        pd.start();
        System.out.println(pd.getState());

        System.out.println(cm.getState());
        cm.start();
        System.out.println(cm.getState());

    }
}
