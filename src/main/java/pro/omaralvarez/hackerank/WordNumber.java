/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author ignismx
 */
public class WordNumber {
    
    public static void main(String[] args) throws Exception {
        var numbers = "onesixeightfournine";
        var result = wordToNumber(numbers);
        System.out.println(result);
    }
    
    private static int wordToNumber(String numbers) throws Exception{
        
        Map dictionary = new HashMap<String, String>();
        dictionary.put("one", "1");
        dictionary.put("two", "2");
        dictionary.put("three", "3");
        dictionary.put("four", "4");
        dictionary.put("five", "5");
        dictionary.put("six", "6");
        dictionary.put("seven", "7");
        dictionary.put("eight", "8");
        dictionary.put("nine", "9");
        
        var letters = numbers.split("");
        var word = "";
        var result = new StringBuilder();
        for(var element : letters){
            word += element;
            if(dictionary.containsKey(word)){
                result.append(dictionary.get(word));
                word = "";
            }
        }
        
        return Integer.parseInt(result.toString());
    }
}
