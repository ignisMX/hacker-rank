/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.interfaces;

/**
 *
 * @author ignis
 */
public class ClassA implements InterfaceA, InterfaceB {

    @Override
    public void greetings() {
        System.out.println("abstract method Hola");
    }
    
    @Override
    public void greetings(String message){
        System.out.println("Metodo overrided in class A");
        InterfaceA.super.greetings("Interface A");
        InterfaceB.super.greetings("Interface B");
    }
    
    public static void staticGreetings(){
        System.out.println("static greetigns from Class A");
        InterfaceA.staticGreetings();
    } 

    
    public static void main(String[] args) {
        ClassA instance = new ClassA();
        instance.greetings();
        instance.greetings("mundo");
        instance.staticGreetings();
        
        
        InterfaceA instance2 = new ClassA();
        instance2.greetings();
        instance2.greetings("instance 2");
       
    }
    
}
