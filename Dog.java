public class Dog {
    String name = "Bosco";

    void bark(int numOfBarks) {
        int i = 0;
        while (i < numOfBarks) {
            i++;
            System.out.println("ruff");
        }
    }

    public static void main(String[] args) {

        Dog slurp = new Dog();

        slurp.bark(5);

    }
}
