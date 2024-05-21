/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

import java.math.BigInteger;

/**
 *
 * @author ignismx
 */ 
public class ExtraLongFactorials {
    
    public static void extraLongFactorials(int n) {
    // Write your code here
        BigInteger factorial = BigInteger.ONE;
        
        while(n > 0){
            var factor = BigInteger.valueOf(n);
            factorial = factorial.multiply(factor);
            n --;
        }
        System.out.println(factorial);
    }
}
