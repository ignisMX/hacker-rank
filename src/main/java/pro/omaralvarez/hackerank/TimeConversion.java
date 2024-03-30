/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author ignis
 */
public class TimeConversion {
    
    public static void main(String[] args) {
        
        timeConversion("07:05:45PM");
    }
    
    public static String timeConversion(String s) {
        
        String militaryTime = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.US)).format(DateTimeFormatter.ofPattern("HH:mm:ss")
        );
        
        System.out.println(militaryTime);
        
        return militaryTime;
    }
}
