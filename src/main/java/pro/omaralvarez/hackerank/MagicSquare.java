/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

import java.util.List;

/**
 *
 * @author ignismx
 */
public class MagicSquare {

    private static List<List<List<Integer>>> getCollection() {

        var collection = List.of(
                List.of(List.of(8, 1, 6), List.of(3, 5, 7), List.of(4, 9, 2)),
                List.of(List.of(6, 1, 8), List.of(7, 5, 3), List.of(2, 9, 4)),
                List.of(List.of(4, 9, 2), List.of(3, 5, 7), List.of(8, 1, 6)),
                List.of(List.of(2, 9, 4), List.of(7, 5, 3), List.of(6, 1, 8)),
                List.of(List.of(8, 3, 4), List.of(1, 5, 9), List.of(6, 7, 2)),
                List.of(List.of(4, 3, 8), List.of(9, 5, 1), List.of(2, 7, 6)),
                List.of(List.of(6, 7, 2), List.of(1, 5, 9), List.of(8, 3, 4)),
                List.of(List.of(2, 7, 6), List.of(9, 5, 1), List.of(4, 3, 8))
        );
        return collection;
    }

    private static int formingMagicSquare(List<List<Integer>> s) {
        var collection = getCollection();
        var minimunCost = Integer.MAX_VALUE;
        for (var square : collection) {
            var cost = 0;
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    var magicElement = square.get(row).get(col);
                    var element = s.get(row).get(col);
                    cost += Math.abs(element - magicElement);
                    
                }
            }
            
            minimunCost = Math.min(cost, minimunCost);
        }

        return minimunCost;
    }

}
