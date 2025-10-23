public class Dog {
    String name = "Bosco";
    String owner = "Peter";
    int age = 2;

    void bark() {
        System.out.println("Ruff! Ruff!");
    }

    void itIsBirthday() {
        this.bark();
        this.age += 1;
    }

    public static void main(String[] args) {
        Dog mommyDog = new Dog();

        Dog dogCopy = mommyDog;

        System.out.println(mommyDog.age);

        mommyDog.itIsBirthday();

        System.out.println(mommyDog.age);

        System.out.println(dogCopy.age);

    }
}
