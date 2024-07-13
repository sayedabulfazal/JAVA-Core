// A singleton Class is a class of which only one instance can be created.
// Below code is to create a Coffemachine limit to have only one machine which should be shared with all office workers.

package Inner_Classes;

class TeaMachine {

    float teapowder;
    float water;
    static private TeaMachine TM = null;

    private TeaMachine() {
        teapowder = 1;
        water = 1;
    }

    static public TeaMachine getInstance() {
        if (TM == null) {

            System.out.println("Team Machine Setup In Process.....");
            TM = new TeaMachine();
            System.out.println("TEA MACHINE SETUP DONE");

        }

        else {
            System.out.println("You already have a tea Machine present in your office");
        }
        return TM;
    }
}

public class singleton_class {

    public static void main(String[] args) {

        TeaMachine oneshield_TeamMachine1 = TeaMachine.getInstance();
        TeaMachine oneshield_TeamMachine2 = TeaMachine.getInstance();
        TeaMachine oneshield_TeamMachine3 = TeaMachine.getInstance();

    }

}
