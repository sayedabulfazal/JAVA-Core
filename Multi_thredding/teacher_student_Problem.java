package Multi_thredding;

class board {
    String text;
    int text_line = 1;
    static int no_of_students = 4;
    int count = 0;

    synchronized public void write(String str) {

        while (count != 0) {
            try {
                wait();

            } catch (Exception e) {
                // TODO: handle exception
            }

        }
        System.out.println("Teacher is writing..........");
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            // TODO: handle exception
        }

        this.text = str;
        System.out.println(this.text);
        count = no_of_students;
        notify();

    }

    synchronized public String read() {

        while (count == 0) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }

        }
        String t = text;
        count--;
        if (count == 0) {
            notify();
        }
        return t;

    }

    synchronized public void attendense() {
        no_of_students++;
    }
}

class teacher extends Thread {

    board b;
    String notes[] = { "Java is a object oriented language", "Polimorfism in java", "Java Inter thread communication",
            "end" };

    public teacher(board b) {

        this.b = b;

    }

    public void run() {
        for (int i = 0; i < notes.length; i++) {

            b.write(notes[i]);

        }
    }
}

class student extends Thread {
    String name;
    board b;

    public student(board b, String name) {
        this.b = b;
        this.name = name;
    }

    public void run() {

        String text_read;
        b.attendense();

        do {
            text_read = b.read();
            System.out.println(board.no_of_students + "Student is Reading ...." + text_read);
            System.out.flush();

        } while (!text_read.equals("end"));

    }
}

public class teacher_student_Problem {

    public static void main(String[] args) {
        board b = new board();
        teacher selvinTeacher = new teacher(b);

        student s1 = new student(b, "azam");
        student s2 = new student(b, "abul");
        student s3 = new student(b, "sahil");
        student s4 = new student(b, "atif");

        selvinTeacher.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();

    }

}
