class Chihuahua extends Dog {
    String attitude = "angry";
}


public class Main {
    public static void main(String[] args) {
        Chihuahua myDog = new Chihuahua();

        myDog.bark();

        myDog.name = "Recks";

        System.out.println(myDog.name);
        System.out.println(myDog.attitude);

    }
}
