/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ignis
 */
public class MinMaxSUM {

    public static void main(String[] args) {
        List<Integer> list = List.of(256741038, 623958417, 467905213, 714532089, 938071625);
        miniMaxSum(list);
    }

    public static void miniMaxSumBigInteger(List<Integer> arr) {

        List<BigInteger> arrayOfNumbers = arr.stream().map(element -> BigInteger.valueOf(element)).collect(Collectors.toList());
        BigInteger sumOfAlls = arrayOfNumbers.stream().reduce(BigInteger.ZERO, BigInteger::add);
        
        BigInteger maxSum = BigInteger.ZERO;
        BigInteger minSum = sumOfAlls;

        for (BigInteger element : arrayOfNumbers) {
            BigInteger sum = sumOfAlls.subtract(element);
            if (sum.compareTo(maxSum) == 1) {
                maxSum = sum;
            }
            if (sum.compareTo(minSum) == -1) {
                minSum = sum;
            }
        }

        System.out.println(minSum + " " + maxSum);

    }
    
    public static void miniMaxSum(List<Integer> arr) {

        long sumOfAlls = arr.stream().mapToLong(Integer::longValue).sum();
        
        long maxSum = 0L;
        long minSum = sumOfAlls;

        for (long element : arr) {
            long sum = sumOfAlls - element;
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < minSum) {
                minSum = sum;
            }
        }


        System.out.println(minSum + " " + maxSum);

    }
}
