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
public class PlusMinus {
    
    public static void main(String[] args) {
        
        List<Integer> list = List.of(-4,3,-9,0,4,1);
        plusMinus(list);
        
    }
    
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        float positives = arr.stream().filter(element-> element > 0).count();
        float negatives = arr.stream().filter(element-> element < 0).count();
        float zeros = arr.stream().filter(element-> element == 0).count();
        
        float positivesRatio = positives / arr.size();
        float negativesRatio = negatives / arr.size();
        float zerosRatio = zeros / arr.size();
        
        System.out.println(positivesRatio);
        System.out.println(negativesRatio);
        System.out.println(zerosRatio);
    }
}
