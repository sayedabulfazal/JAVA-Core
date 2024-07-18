package Lang_Package;

public class Float_Class {

    public static void main(String[] args) {

        float a = 10.1f;
        Float b = (float) Math.sqrt(-1);

        System.out.println(b.equals(a));
        System.out.println(b.isInfinite());
        System.out.println(b == Float.POSITIVE_INFINITY);
        System.out.println(b.isNaN());
    }

}
