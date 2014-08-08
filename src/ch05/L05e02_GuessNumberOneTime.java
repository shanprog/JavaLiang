package ch05;

import java.util.Scanner;
import java.util.Locale;

public class L05e02_GuessNumberOneTime {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        int number = (int) (Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        // Prompt the user to guess the number
        System.out.print("Enter your guess: ");
        int guess = input.nextInt();

        if (guess == number)
            System.out.println("Yes, the number is " + number);
        else if (guess > number)
            System.out.println("Your guess is too high");
        else
            System.out.println("Your guess is too low");


    }
}