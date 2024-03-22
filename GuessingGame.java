import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("You have to chose a number between 1 to 100 || You will get 10 chances to guess.");
        Scanner write = new Scanner(System.in);

        int randomNumber = (int)(Math.random()*100)+1;
        int guess;

        for(int i = 10; i>0; i--)
        {
            if(i==10){
                System.out.print("You have "+i+" chances --> Enter here - ");
                guess = write.nextInt();
            }
            else{
                System.out.print("You have "+i+" chances --> Guess Again - ");
                guess = write.nextInt();
            }
            if(guess == randomNumber){
                System.out.print("Well Done, your guessing is correct!");
                break;
            }
            else if (guess<randomNumber)
                System.out.print("Wrong! Random Number is greater than the guessed number!");
            else if (guess>randomNumber){
                System.out.println("Wrong! Random Number is smaller than guessed number!");
            }
        }
    }
}
