# Guessing-Game-Using-Basic-JAVA
The program is a simple guessing game where the user has to guess a randomly generated number between 1 and 100. The user gets 10 chances to guess the number correctly.

Setup: The program starts by displaying a message informing the user about the rules of the game and the number of chances they have.

Generating a Random Number: The program generates a random number between 1 and 100 using the Math.random() method and stores it in the variable randomNumber.

Getting User Input: The program creates a Scanner object named write to read user input from the console.
It enters a for loop that iterates 10 times, representing the 10 chances the user has to guess the number.

Guessing Process: Inside the loop, the program prompts the user to enter their guess, providing information about the number of chances remaining.
It reads the user's guess using the nextInt() method of the Scanner class and stores it in the variable guess.

Checking the Guess: The program compares the user's guess (guess) with the randomly generated number (randomNumber).
If the guess matches the random number, it displays a congratulatory message and exits the loop using the break statement.
If the guess is incorrect, the program provides feedback to the user, informing them whether the random number is greater or smaller than their guess.

End of the Game: After the loop finishes executing (either because the user guessed correctly or ran out of chances), the program ends.

In summary, this program provides a simple interactive guessing game where the user tries to guess a randomly generated number within a limited number of attempts. It demonstrates basic input/output handling and conditional logic in Java.
