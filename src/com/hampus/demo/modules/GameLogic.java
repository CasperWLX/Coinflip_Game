package com.hampus.demo.modules;

public class GameLogic
{
    int noOfWins = 0;
    int userChoice;
    int coinFlip;

    UserInput input = new UserInput();
    GameMessages output = new GameMessages();


    public int gameLoop()
    {
        delayOutput(2);
        output.headsOrTailsMessage();
        userChoice = numberScope(1, 2);
        coinFlip = flipCoin();
        delayOutput(1);

        if (userChoice == coinFlip)
        {
            noOfWins++;
            System.out.println("You got it right!\nYou now have: " + noOfWins + " wins in a row");
            output.roundMessage(noOfWins);
        }
        else
        {
            System.out.println("YikerZ, time to start from the beginning again");
            noOfWins = 0;
        }
        return noOfWins;
    }

    public static int flipCoin()
    {
        System.out.println("Flipping the coin...!");
        delayOutput(4);
        int result = (int) (Math.random() * 2 + 1);
        if (result == 1)
        {
            System.out.println("It landed on Heads!");
        }
        else
        {
            System.out.println("It landed on Tails!");
        }
        return result;
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

    public int numberScope(int min, int max)
    {
        while (true)
        {
            int num = input.getInt();
            if (num < min || num > max)
            {
                System.out.println("Please enter a valid number");
            }
            else
            {
                return num;
            }
        }
    }
}
