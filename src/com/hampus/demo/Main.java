package com.hampus.demo;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int noOfWins = 0;
        int userChoice;
        int coinFlip;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to COINFLIPPER");
        System.out.println("Time to flip the first coin");

        do
        {
            System.out.println("Pick heads(1) or Tails!(2)");
            userChoice = input.nextInt();
            coinFlip = flipCoin();
            delayOutput(1);

            if(userChoice == coinFlip)
            {
                System.out.println("You got it right!\n You now have: " + noOfWins + " wins in a row");
                noOfWins++;
                messages(noOfWins);
            }
            else
            {
                System.out.println("YikerZ, time to start from the beginning again");
                noOfWins = 0;
            }
        }while (noOfWins < 5);
    }

    public static int flipCoin()
    {
        System.out.println("Tossing coin...!");
        delayOutput(4);
        int result = (int) (Math.random() * 2 + 1);
        if (result == 1)
        {
            System.out.println("It landed on heads!");
        }
        else
        {
            System.out.println("It landed on tails!");
        }
        return result;
    }
    public static void messages(int noOfWins)
    {
        switch (noOfWins){
            case 1:
                System.out.println("That's one to start.");
                break;
            case 2:
                System.out.println("eyy that's two in a row");
                break;
            case 3:
                System.out.println("Wow alright don't det get too excited now");
                break;
            case 4:
                System.out.println("Do you even know how rare it is to win this many times in a row...?");
                break;
            case 5:
                System.out.println("CONGRATULATIONS YOU WON THE GAME");
                break;
            default:
                System.out.println("ERROR.How did you even get this error...?");
        }

    }

    public static void delayOutput(int seconds)
    {
        int sleepAmount = 1000 * seconds;
        try
        {
            Thread.sleep(sleepAmount);
        }
        catch (InterruptedException ie)
        {
            System.out.println("timed out");
        }

    }

}
