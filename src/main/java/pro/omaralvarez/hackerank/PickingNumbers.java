/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ignismx
 */
public class PickingNumbers {

    public static void main(String[] args) {
        var inputOne = List.of(4, 6, 5, 3, 3, 1);
        
        var inputTwo = List.of(1 ,2, 2, 3, 1, 2);
        
        var inputThree = List.of(
     66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 
        66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 
        66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 
        66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 
        66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 
        66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66);
     var result = pickingNumbers(inputTwo);
        System.out.println(result);
    }

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        var sortedList = a.stream().sorted().collect(Collectors.toList());
        var longest = 0;
        var longestTemp = 1;
        var pivot = sortedList.get(0);
        for (int counter = 1; counter < sortedList.size(); counter++) {
            var element = sortedList.get(counter);
            var difference = Math.abs(element - pivot);
            if(difference <= 1){
                longestTemp ++;
            }
            else{
                pivot = element;
                longest = Math.max(longest, longestTemp);
                longestTemp = 1;
            }
        }

        return Math.max(longest, longestTemp);

    }
}
