/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pro.omaralvarez.interfaces;

/**
 *
 * @author ignis
 */
public interface InterfaceA {
    public void greetings();
    
    default void greetings(String mensaje){
        System.out.println("Default method desde la interface A Hola " + mensaje);
    }
    
    static void staticGreetings(){
        System.out.println("Static greetings from Interface A");
    }
}
