import java.util.Random;
import java.util.Scanner;

    public static void main() {
        main();
    }
    public static void main(String[] args) {
        public class GuessTheNumberLV {

            //maximum number
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int max;
                System.out.print("Enter the maximum value: ");
                max = sc.nextInt();

                //target
                Random gen = new Random();
                int target = 1 + gen.nextInt(max);

                //guessing loop
                int numGuesses = 1;
                int curGuess = 0;
                System.out.println("Guess a number between 1 and" + max);

                for (numGuesses = 1; curGuess != target; numGuesses++) {
                    System.out.print("Next Guess: ");
                    curGuess = sc.nextInt();

                    //guessed output
                    if (curGuess < target) {
                        System.out.println(curGuess + "is too low");
                    } else if (curGuess > target) {
                        System.out.println(curGuess + "is too high");
                    } else {
                        System.out.println("You guessed!" + numGuesses + "guesses!");
                    }

                }
            }}}}