/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

import java.util.Arrays;

/**
 *
 * @author ignis
 */
public class ZigZagSequence {

    public static void main(String[] args) {
        //int[] arrayOfNumbers = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int[] arrayOfNumbers = {1,2,3,4,5,6,7};
        findZigZagSequence(arrayOfNumbers, arrayOfNumbers.length);
    }

    public static void findZigZagSequence(int[] a, int n) {
        
        Arrays.sort(a);
        int mid = (n) / 2;
        
        int temp = a[mid];
        
        a[mid] = a[n - 1];
        a[n - 1] = temp;
        
        int st = mid + 1;
        int ed = n - 2;
        while (st <= ed) {
            
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed  - 1;
        }
        
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(a[i]);
        }
        System.out.println();
    }
    

}
