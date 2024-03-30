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
public class DiagonalDifference {

    public static void main(String[] args) {

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int leftDiagonal = 0;
        int rightDiagonal = 0;
        for (int i = 0; i < arr.size(); i++) {
            int leftElement = arr.get(i).get(i);
            int rightElement = arr.get(arr.size() - (1 + i)).get(i);
            System.out.println("element = " + leftElement);
            leftDiagonal += leftElement;
            System.out.println("element = " + rightElement);
            rightDiagonal += rightElement;
        }

        System.out.println("result = " + leftDiagonal);
        System.out.println("result = " + rightDiagonal);

        return Math.abs(leftDiagonal - rightDiagonal);
    }
}
