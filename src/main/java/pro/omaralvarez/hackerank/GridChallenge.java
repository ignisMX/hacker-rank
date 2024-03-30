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
public class GridChallenge {

    public static void main(String[] args) {
        gridChallenge(List.of("ppp","ypp","wyw"));
    }

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        String[][] gridString = new String[grid.size()][];
        for (int row = 0; row < grid.size(); row++) {
            String[] rowString = grid.get(row).split("");

            sortArray(rowString, 0, rowString.length - 1);
            gridString[row] = rowString;
        }

        printMatrix(gridString);
        String result = colAsc(gridString);
        System.out.println("result " + result);
        return "";
    }

    private static void sortArray(String[] array, int begin, int end) {
        if (end > begin) {

            int partitionIndex = getPartitionIndex(array, begin, end);
            sortArray(array, begin, partitionIndex - 1);
            sortArray(array, partitionIndex + 1, end);
        }
    }

    public static int getPartitionIndex(String[] array, int begin, int end) {

        
            int lastIndex = begin-1;
            char pivot = array[end].charAt(0);
            for (int counter = begin; counter < end; counter++) {
                if (array[counter].charAt(0) <= pivot) {
                    String temp = array[lastIndex + 1];
                    array[lastIndex + 1] = array[counter];
                    array[counter] = temp;
                    lastIndex++;
                }

            }

            String temp = array[lastIndex + 1];
            array[lastIndex + 1] = array[end];
            array[end] = temp;

            return lastIndex + 1;
        

    }

    private static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element);
        }
        System.out.println("");
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println("");
        }
    }

    private static String colAsc(String[][] matrix) {
        String isAsc = "YES";

        int numberOfColumns = matrix[0].length;
        for (int col = 0; col < numberOfColumns; col++) {
            for (int row = 0; row < matrix.length; row++) {
                if ((row + 1) < matrix.length) {
                    System.out.println("comparing: current : "
                            + matrix[row][col] + " next: " + matrix[row + 1][col]);
                    char current = matrix[row][col].charAt(0);
                    char next = matrix[row + 1][col].charAt(0);
                    if (current > next) {
                        isAsc = "NO";
                        return isAsc;
                    }
                }
            }
        }

        return isAsc;
    }

}
