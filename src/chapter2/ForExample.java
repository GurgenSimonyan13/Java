package chapter2;

public class ForExample {
    public static void main(String[] args) {
        int x;
        int y = 20;
        for (x = 0; x < 10; x++) {
            System.out.println("x =" + x);
            System.out.println("y =" + y);
            y = y - 2;
        }
    }
}
