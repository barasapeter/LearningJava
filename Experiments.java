class Doggy {
    String name;
}


public class Experiments {
    public static void main(String[] args) {

        Doggy[] doggies = new Doggy[3];

        Doggy bart = new Doggy();
        bart.name = "Bart";

        doggies[0] = bart;

        System.out.println(doggies[0].name);

    }
}
