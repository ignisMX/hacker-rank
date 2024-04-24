/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.Optional;

/**
 *
 * @author ignis
 */
public class LonelyInteger {
    
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,3,2,1);
        int result = lonelyinteger(list);
        System.out.println(result);
    }
    
    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
        Set lonely = new HashSet<Integer>();
        for(Integer number : a){
            if(lonely.contains(number)){
                lonely.remove(number);
            }
            else{
                lonely.add(number);
            }
        }
        
        Optional<Integer> result = lonely.stream().findFirst();
        
        return result.get();
    }
}
