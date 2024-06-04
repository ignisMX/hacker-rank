/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.core;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ignismx
 */
public class TransientVariables {

    public static void main(String[] args) {
        var car = new Car("i8", "negro");

        try (FileOutputStream fileOutputStream = new FileOutputStream("fileSerialization.txt"); ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
            objectOutputStream.writeObject(car);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("fileSerialization.txt"); ObjectInputStream ois = new ObjectInputStream(fis);) {
            var carTwo = (Car) ois.readObject();
            System.out.println("" + carTwo);
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
