import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PhraseGenerator {
    public static void main(String[] args) {
        String[] wordListOne = {
                "agnostic",
                "opinionated",
                "voice activated",
                "haptically driven",
                "extensible",
                "reactive",
                "agent based",
                "functional",
                "AI enabled",
                "strongly typed"
        };

        String[] wordListTwo = {
                "loosely coupled",
                "six sigma",
                "asynchronous",
                "event driven",
                "pub-sub",
                "IoT",
                "cloud native",
                "service oriented",
                "containerized",
                "serverless",
                "microservices",
                "distributed ledger"
        };

        String[] wordListThree = {
                "framework",
                "library",
                "DSL",
                "REST API",
                "repository",
                "pipeline",
                "service mesh",
                "architecture",
                "perspective",
                "design",
                "orientation"
        };

        int lengthOne = wordListOne.length;
        int lengthTwo = wordListTwo.length;
        int lengthThree = wordListThree.length;

        Random randomGenerator = new Random();
        final int MAX_ITERATIONS = 500_000;

        Set<String> uniquePhrases = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        String fileName = "phrases-txt.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < MAX_ITERATIONS; i++) {
                String phrase = wordListOne[randomGenerator.nextInt(lengthOne)] + " "
                        + wordListTwo[randomGenerator.nextInt(lengthTwo)] + " "
                        + wordListThree[randomGenerator.nextInt(lengthThree)];

                if (!uniquePhrases.add(phrase)) {
                    duplicates.add(phrase);
                }

                writer.write(phrase);
                writer.newLine();
            }

            writer.newLine();
            writer.write("=======================================");
            writer.newLine();
            writer.write("Total phrases generated: " + MAX_ITERATIONS);
            writer.newLine();
            writer.write("Unique phrases: " + uniquePhrases.size());
            writer.newLine();
            writer.write("Duplicate count: " + duplicates.size());
            writer.newLine();

            if (!duplicates.isEmpty()) {
                writer.newLine();
                writer.write("Duplicate phrases:");
                writer.newLine();
                for (String d : duplicates) {
                    writer.write(" - " + d);
                    writer.newLine();
                }
            }

            System.out.println("Output saved to " + fileName);

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
