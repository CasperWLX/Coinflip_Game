package com.hampus.demo.modules;

public class GameLogic
{
    int noOfWins = 0;
    int userChoice;
    int coinFlip;

    UserInput input = new UserInput();
    GameMessages Output = new GameMessages();


    public int gameLoop()
    {
        System.out.println("Pick heads(1) or Tails!(2)");
        userChoice = numberScope(1, 2);
        coinFlip = flipCoin();
        delayOutput(1);

        if (userChoice == coinFlip)
        {
            System.out.println("You got it right!\n You now have: " + noOfWins + " wins in a row");
            noOfWins++;
            Output.messages(noOfWins);
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
