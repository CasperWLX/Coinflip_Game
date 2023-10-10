package com.hampus.demo;

import com.hampus.demo.modules.GameLogic;

public class Main
{
    public static void main(String[] args)
    {
        int noOfWins;

        System.out.println("Welcome to COINFLIPPER");
        System.out.println("Time to flip the first coin");

        GameLogic game = new GameLogic();

        do
        {
            noOfWins = game.gameLoop();
        } while (noOfWins < 5);
    }
}


