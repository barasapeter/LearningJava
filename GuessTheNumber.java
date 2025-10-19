public class GuessTheNumber {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.Random randomGenerator = new java.util.Random();

        System.out.println("Welcome to Guess the Number!");

        String difficultyChoice;

        do {
            System.out.println(
                    "Choose a difficulty:\n" +
                            "1. Easy (1-10, 5 attempts)\n" +
                            "2. Medium (1-50, 7 attempts)\n" +
                            "3. Hard (1-100, 10 attempts)");

            System.out.print("> ");

            difficultyChoice = scanner.nextLine();

            if (!difficultyChoice.equals("1") &&
                    !difficultyChoice.equals("2") &&
                    !difficultyChoice.equals("3")) {
                System.out.println("Invalid choice. Please choose 1, 2 or 3!");
            }

        } while (!difficultyChoice.equals("1") &&
                !difficultyChoice.equals("2") &&
                !difficultyChoice.equals("3"));

        int rangeEasy = 10;
        int rangeMedium = 50;
        int rangeHard = 100;

        int rangeOfChoice = 0;

        switch (difficultyChoice) {
            case "1":
                rangeOfChoice = rangeEasy;
                break;

            case "2":
                rangeOfChoice = rangeMedium;
                break;

            case "3":
                rangeOfChoice = rangeHard;
                break;
        }

        int correctAnswer = randomGenerator.nextInt(rangeOfChoice + 1);

        System.out.println("Your choice: " + rangeOfChoice);

        System.out.println("Correct answer: " + correctAnswer);

        scanner.close();
    }
}
