/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pro.omaralvarez.interfaces;

/**
 *
 * @author ignis
 */
public interface InterfaceB {
    default void greetings(String message){
        System.out.println("Default method interface B " + message);
    }
}
