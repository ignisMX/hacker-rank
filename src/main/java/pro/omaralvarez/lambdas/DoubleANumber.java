/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.lambdas;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ignis
 */
public class DoubleANumber {
    public static void main(String[] args) {
        
        var list = List.of(10,11,12,13,14,15,16,17,18,19,20);
        doubleNumber(list);
    }
    
    public static void doubleNumber(List<Integer> list){
        List<Integer> doubleOfPairs = list.stream()
                .filter(element -> element %2 == 0)
                .map(element -> element * 2).collect(Collectors.toList());
        
       doubleOfPairs.forEach(element -> System.out.println(" " + element +" "));
    }
}
