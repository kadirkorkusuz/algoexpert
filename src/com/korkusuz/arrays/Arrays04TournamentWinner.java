package com.korkusuz.arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class Arrays04TournamentWinner {

    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        HashMap <String, Integer> points = new HashMap<>();
        int max = 0;
        String leader = "";

        for (int i = 0; i < results.size(); i++)
        {
            String winnerOfTheGame;
            if (results.get(i) == 1)
            {
                winnerOfTheGame = competitions.get(i).get(0);
            }
            else
            {
                winnerOfTheGame = competitions.get(i).get(1);
            }

            if (!points.containsKey(winnerOfTheGame))
            {
                points.put(winnerOfTheGame, 3);
                if (points.get(winnerOfTheGame) > max)
                {
                    max = points.get(winnerOfTheGame);
                    leader = winnerOfTheGame;
                }
            }
            else
            {
                points.put(winnerOfTheGame, points.get(winnerOfTheGame) + 3);
                if (points.get(winnerOfTheGame) > max)
                {
                    max = points.get(winnerOfTheGame);
                    leader = winnerOfTheGame;
                }
            }
        }
        return leader;
    }
}
