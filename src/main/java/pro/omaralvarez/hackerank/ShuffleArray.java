/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

import java.util.Random;

/**
 *
 * @author ignismx
 */
public class ShuffleArray {
    
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1,2,3,4,9};
        shuffle(arrayOfNumbers);
        //System.out.println(arrayOfNumbers);
        
        PrintUtils.printArray(arrayOfNumbers);
    }
    public static  void shuffle(int[] num){
        Random random = new Random();
        int i = 0;
        for(int counter : random.ints(num.length - 1, 0, num.length - 1).toArray()){
            i ++;
            int temp = num[i];
            num[i] = num[counter];
            num[counter] = temp;
        }
    }
}
