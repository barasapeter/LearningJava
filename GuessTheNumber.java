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
        ;

        int rangeOfChoice = 0;
        int maxAttempts = 0;

        switch (difficultyChoice) {
            case "1":
                rangeOfChoice = 10;
                maxAttempts = 5;
                break;

            case "2":
                rangeOfChoice = 50;
                maxAttempts = 7;
                break;

            case "3":
                rangeOfChoice = 100;
                maxAttempts = 10;
                break;
        }

        int correctAnswer = randomGenerator.nextInt(rangeOfChoice + 1);

        int userGuess = 0;

        String inputPrompt = "Enter a number between 0 and " + rangeOfChoice + ": ";

        int i = 0;

        while (true) {

            if (i >= maxAttempts) {
                System.out.println("Game Over! The number was " + correctAnswer + ".");
                break;
            }

            System.out.print(inputPrompt);
            userGuess = scanner.nextInt();

            if (userGuess == correctAnswer) {
                System.out.println("Correct! You win!");
                break;
            }

            if (userGuess > correctAnswer) {
                System.out.println("Too high! Try again.");
            }

            if (userGuess < correctAnswer) {
                System.out.println("Too low! Try again.");
            }

            i++;

            if ((maxAttempts - i) != 0)
                System.out.println(maxAttempts - i + " attempts left");
        }

        scanner.close();
    }
}
