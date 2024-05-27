/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.core;

import java.io.Serializable;

/**
 *
 * @author ignismx
 */
public class Car implements Serializable{
    
    private String name;
    
    private transient String color;
    
    private final transient String brand = "BMW";
    
    private static transient int price = 5;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Car.price = price;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", color=" + color + ", brand=" + brand + '}';
    }
    
}
