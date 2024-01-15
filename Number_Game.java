import java.uitl.*;
import java.util.Random;


class GuessingGame
{
    private int numberToGuess;
    private int attempts;
    private int maxattempts;

    public GuessingGame(int maxattempts)
     {
        Random random = new Random();
        numberToGuess = random.nextInt(100) + 1;
        attempts = 0;
        this.maxattempts = maxattempts;
    }


    public void play()
     {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (attempts < maxattempts)
         {
            System.out.print("Take guess no " + (attempts + 1) + ": "); 
            int guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess)
            {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) 
            {
                System.out.println("Too high!");
            } else 
            {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                scanner.close();
                return;
            }
        }



        System.out.println("Sorry, you've reached the maximum number of attempts.");
        System.out.println("The number I was thinking of was: " + numberToGuess);
        scanner.close();

    }
}

public class Task_1_NUmber_Game 
{
    public static void main(String[] args) 
    {
        int maxattempts = 5; 
        GuessingGame guessingGame = new GuessingGame(maxattempts);
        guessingGame.play();
    }
}