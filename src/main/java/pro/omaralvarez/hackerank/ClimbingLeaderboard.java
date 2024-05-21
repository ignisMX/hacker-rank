/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 *
 * @author ignismx
 */
public class ClimbingLeaderboard {

    public static void main(String[] args) {
        var result = climbingLeaderboard(List.of(100, 100, 50, 40, 40, 20, 10), List.of(3, 5, 25, 50, 120));
        //var result = climbingLeaderboard(List.of(1), List.of(1, 1));
        System.out.println("result: " + result);
    }

    //120,50,25,5
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here

        var leaderboard = ranked.stream().distinct().collect(Collectors.toList());
        var result = new ArrayList<Integer>();
        
        System.out.println("leaderboard: " + leaderboard);
        var rank = leaderboard.size() - 1;
        for (var game : player) {
            System.out.println("game: " + game);
            if(game == leaderboard.get(rank)){
                result.add(rank + 1);
            }
            else if (game < leaderboard.get(rank)) {
                result.add(rank + 2);
                    
            }else {
                while (rank > 0 && game >= leaderboard.get(rank - 1)) {
                    System.out.println("player " + leaderboard.get(rank - 1));
                    rank--;
                }
                result.add(rank + 1);
            }
        }

        return result;
    }

}
