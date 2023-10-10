package com.hampus.demo.modules;

public class GameLogic
{
    //Variables
    int noOfWins = 0;
    int userChoice;
    int coinFlip;

    //Initializing objects
    UserInput input = new UserInput();
    GameMessages output = new GameMessages();

    /**
     * Method that runs the game loop
     * @return - number of wins
     */
    public int gameLoop()
    {
        delayOutput(2);
        output.headsOrTailsMessage();
        userChoice = numberScope(1, 2);
        coinFlip = flipCoin();
        delayOutput(1);

        //Controls win condition
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

    /**
     * Method that flips a coin
     * @return - 1 or 2
     */
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

    /**
     * Method that waits x amount of seconds before continuing
     * @param seconds - amount of seconds to wait
     */
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

    /**
     * Method that limits the number span choice for the user
     * @param min - minimum number
     * @param max - maximum number
     * @return - user input
     */
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
