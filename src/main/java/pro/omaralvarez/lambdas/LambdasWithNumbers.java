/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.lambdas;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 *
 * @author ignis
 */
public class LambdasWithNumbers {

    public static void main(String[] args) {

        var list = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        doubleNumber(list);
        sumNumbers(list);
        sumTwoMaxNumbers(list);
    }

    public static void doubleNumber(List<Integer> list) {
        List<Integer> doubleOfPairs = list.stream()
                .filter(element -> element % 2 == 0)
                .map(element -> element * 2).collect(Collectors.toList());

        doubleOfPairs.forEach(element -> System.out.println(" " + element + " "));
    }

    public static void sumNumbers(List<Integer> list) {
        int sum = list.stream()
                .filter(element -> element % 2 != 0)
                .map(element -> element * 2)
                .reduce(1, (first, second) -> first * second);
        System.out.println(" sum of all of them " + sum);
    }
    
    public static void sumTwoMaxNumbers(List<Integer> list){
        
       int sum = list.stream().sorted(Comparator.reverseOrder())
               .limit(2)
               .reduce(0,Integer::sum);
       
       
        System.out.println(" sum for two greatest elements " + sum);
    }
}
