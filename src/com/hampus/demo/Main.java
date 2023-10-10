package com.hampus.demo;

import com.hampus.demo.modules.GameLogic;
import com.hampus.demo.modules.GameMessages;

public class Main
{
    public static void main(String[] args)
    {
        int noOfWins;

        GameLogic game = new GameLogic();
        GameMessages output = new GameMessages();

        output.gameStart();

        do
        {
            noOfWins = game.gameLoop();
        } while (noOfWins < 5);
    }
}


