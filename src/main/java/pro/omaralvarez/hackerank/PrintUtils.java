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
public class PrintUtils {

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element);
        }
        System.out.println("");
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }
    
    public static void printListOfNumbers(List<Integer> list){
    
        for(Integer number : list){
        
            System.out.print(number + " ");
        }
        System.out.println("");
    }

}
