/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

import java.util.List;

/**
 *
 * @author ignis
 */
public class FlippingMatrix {

    public static void main(String[] args) {

    }

    public static int flippingMatrix(List<List<Integer>> matrix) {

        int subMatrix = matrix.size() / 2;
        int maxTotal = 0;
        for (int row = 0; row < subMatrix; row++) {
            for (int col = 0; col < subMatrix; col++) {
                int maxValue = Math.max(matrix.get(row).get(col), 0);
                maxValue = Math.max(matrix.get(row).get(subMatrix * 2 - (col + 1)), maxValue);
                maxValue = Math.max(matrix.get(subMatrix * 2 - (row + 1)).get(col),maxValue);
                maxValue = Math.max(matrix.get(subMatrix * 2 - (row + 1)).get(subMatrix * 2 - (col + 1)), maxValue);
                
                maxTotal+=maxValue;
            }
        }

        return maxTotal;
    }
}
