package com.hampus.demo.modules;

public class GameMessages
{
    public void messages(int noOfWins)
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
