package Gaisenok;

public class Exceptions {

    static int divideByZero() {
        return 25 / 0;
    }

    public static void main(String[] arg) {
        try {
            divideByZero();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
