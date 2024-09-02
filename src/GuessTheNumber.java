import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            int numberToGuess = random.nextInt(100) + 1;
            int userGuess = 0;
            int attempts = 0;

            System.out.println("Am generat un număr între 1 și 100. Încearcă să-l ghicești!");

            while (userGuess != numberToGuess) {
                System.out.print("Introdu un număr: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("Prea mic! Încearcă un număr mai mare.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Prea mare! Încearcă un număr mai mic.");
                } else {
                    System.out.println("Felicitări! Ai ghicit numărul în " + attempts + " încercări.");
                }
            }

            System.out.print("Vrei să joci din nou? (da/nu): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("da");

        } while (playAgain);

        System.out.println("Mulțumim că ai jucat!");
    }
}
