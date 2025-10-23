public class Loopy {
    public static void main(String[] args) {
        System.out.println("Before the loop");
        int x = 0;
        while (x <= 4) {
            System.out.println("In the loop");
            System.out.println("Value of x is " + x);
            x++;
        }
        System.out.println("This is after the loop");
    }
}
