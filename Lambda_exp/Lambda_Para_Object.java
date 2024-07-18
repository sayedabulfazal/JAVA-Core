package Lambda_exp;

// Functional Interface for Lambda
interface myLamda2 {
    public void display2();

}

// Class to use Lamda expression
class useLambda {

    // Method to call lamda expression
    public void callLambda(myLamda2 ml) {
        ml.display2();

    }
}

// New Class to use lamda expression as Praamter or object
class demoLam {

    public void meth1() {
        useLambda ul = new useLambda();
        ul.callLambda(() -> {
            System.out.println("Hello shemdi");
        });
    }

}

public class Lambda_Para_Object {

    public static void main(String[] args) {
        demoLam dl = new demoLam();
        dl.meth1();

    }

}
