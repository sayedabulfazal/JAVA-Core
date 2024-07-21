package Multi_thredding;

class ATM_machine {

    synchronized public void welcomeMessage(String str) {
        System.out.println("Welcome To State Bank of India , " + str);
        // try {
        // Thread.sleep(1000);
        // } catch (Exception e) {
        // // TODO: handle exception
        // }
    }

    synchronized public void customerWaittime(String str) {
        System.out.println("Wait time " + str);
        // try {
        // Thread.sleep(100);
        // } catch (Exception e) {
        // // TODO: handle exception
        // }

    }

    synchronized public void withdraw(int amount, String str) {
        System.out.println("The amount " + amount + " has been withdrawn : " + str);
        System.out.println("Please remove the ATM card to collect thee cash " + str);
    }
}

class customer extends Thread {

    ATM_machine ATM;
    String name;
    int amount;

    public customer(ATM_machine atm, String name, int amount) {
        this.ATM = atm;
        this.name = name;
        this.amount = amount;

    }

    public void useATM() {
        ATM.welcomeMessage(this.name);
        ATM.customerWaittime(this.name);
        ATM.withdraw(this.amount, this.name);

    }

    public void run() {
        useATM();
    }

}

public class ATM_problem {

    public static void main(String[] args) {

        ATM_machine SBI_ATM = new ATM_machine();
        customer c1 = new customer(SBI_ATM, "Azam Dasonkop", 150);
        customer c2 = new customer(SBI_ATM, "Atif Ahmed", 1000);

        c1.start();
        c2.start();

    }

}
