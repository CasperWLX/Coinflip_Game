package com.hampus.demo;

import com.hampus.demo.modules.GameLogic;
import com.hampus.demo.modules.GameMessages;

public class Main
{
    public static void main(String[] args)
    {
        //Variables
        int noOfWins;

        //Initializing objects
        GameLogic game = new GameLogic();
        GameMessages output = new GameMessages();

        output.gameStart();

        //Game loop
        do
        {
            noOfWins = game.gameLoop();
        } while (noOfWins < 5);
    }
}


