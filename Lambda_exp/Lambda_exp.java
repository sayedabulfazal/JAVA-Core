package Lambda_exp;

interface lambda1 {

    public int display(int a, int b);

}

public class Lambda_exp {

    public static void main(String[] args) {

        lambda1 azam = (a, b) -> a + b;

        System.out.println(azam.display(2, 2));

    }
}
