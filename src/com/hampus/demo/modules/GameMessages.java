package com.hampus.demo.modules;

public class GameMessages
{
    String lineDivider = "------------------------------";

    public void gameStart()
    {
        System.out.printf("\t\tWelcome to\t\t\n%s\n\t\tCOINFLIPPER\t\t\n%s\n", lineDivider, lineDivider);
        System.out.println("Time to flip the first coin");
    }

    public void headsOrTailsMessage()
    {
        System.out.printf("%s\nPick Heads(1) or Tails!(2)\n%s\n", lineDivider, lineDivider);
    }

    public void roundMessage(int noOfWins)
    {
        switch (noOfWins)
        {
            case 1 -> System.out.println("That's one to start.");
            case 2 -> System.out.println("eyy that's two in a row");
            case 3 -> System.out.println("Wow alright don't det get too excited now");
            case 4 -> System.out.println("Do you even know how rare it is to win this many times in a row...?");
            case 5 -> System.out.println("CONGRATULATIONS YOU WON THE GAME");
            default -> System.out.println("ERROR.How did you even get this error...?");
        }
    }
}
