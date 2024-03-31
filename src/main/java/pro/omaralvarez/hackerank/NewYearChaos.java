/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ignis
 */
public class NewYearChaos {

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(5);
//        list.add(3);
//        list.add(7);
//        list.add(8);
//        list.add(6);
//        list.add(4);

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);

        minimumBribes(list);
    }

    public static void minimumBribes(List<Integer> q) {
        boolean tooChaotic = false;
        int totalBribes = 0;

        int counter = q.size() - 1;
        while (counter >= 0) {
            if (q.get(counter) > (counter + 1)
                    && (q.get(counter) - (counter + 1)) > 2) {
                tooChaotic = true;

                break;
            } else if (q.get(counter) > (counter + 1)) {
                int swap = q.get(counter + 1);
                q.set(counter + 1, q.get(counter));
                q.set(counter, swap);
                totalBribes++;
                counter++;
            } else {
                counter--;
            }

        }

        PrintUtils.printListOfNumbers(q);
        if (tooChaotic) {

            System.out.println("Too chaotic");
        } else {
            System.out.println(totalBribes);
        }

    }
}
