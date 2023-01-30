package com.company;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";//вкарват се константи преди main метода
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose [r]ock,[p]aper or [s]cissors: ");
        String inputPlayer = scanner.nextLine();
            if(inputPlayer.equals("r") || inputPlayer.equals("rock") ) {
            inputPlayer = ROCK;}
            else if (inputPlayer.equals("p") || inputPlayer.equals("paper") ) {
                inputPlayer = PAPER;}
             else if (inputPlayer.equals("s") || inputPlayer.equals("scissors") ) {
            inputPlayer = SCISSORS;}
             else{
                System.out.println("Invalid input! Please try again:)");
                return;
            }
             Random random = new Random();
             int computerRandomNumber = random.nextInt(3);
             String computerMove = "";
             switch (computerRandomNumber) {
                 case 0:
                     computerMove = "Rock";
                     break;
                 case 1:
                     computerMove = "Paper";
                     break;
                 case 2:
                     computerMove = "Scissors";
                     break;
                                  }
        System.out.printf("The computer move is: %s%n", computerMove);
                                  if(inputPlayer.equals(ROCK) && computerMove.equals(SCISSORS) ||
                                          inputPlayer.equals(PAPER) && computerMove.equals(ROCK)  ||
        inputPlayer.equals(SCISSORS) && computerMove.equals(PAPER))
        {
            System.out.println("Congratulations! You win!!!");
        }
        if(inputPlayer.equals(ROCK) && computerMove.equals(PAPER) ||
                inputPlayer.equals(PAPER) && computerMove.equals(SCISSORS)  ||
        inputPlayer.equals(SCISSORS) && computerMove.equals(ROCK))
        {
            System.out.println("Sorry! You lose!");
        }
        if(inputPlayer.equals(ROCK) && computerMove.equals(ROCK) ||
                inputPlayer.equals(PAPER) && computerMove.equals(PAPER)  ||
        inputPlayer.equals(SCISSORS) && computerMove.equals(SCISSORS))
        {
            System.out.println("Try another game! The result is a drow!");
        }

        }
    }


