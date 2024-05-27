/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ignis
 */
public class HelloWorld {

    public static void main(String[] args) {
//        System.out.println("result: " + solveChallenge("()"));
//        System.out.println("result: " + solveChallenge("()[]{}"));
//        System.out.println("result: " + solveChallenge("(((((((((((("));
        System.out.println("result: " + solveChallenge("))))))))))))"));
//        System.out.println("result: " + solveChallenge("([)]"));
//        System.out.println("result: " + solveChallenge("{[()]}"));
//        System.out.println("result: " + solveChallenge("{([])"));
    }

    public static boolean solveChallenge(String s) {

        if (s.length() <= 1) {
            return false;
        }
        var brackets = s.split("");
        if (isOpenBracket(brackets[brackets.length - 1])) {
            return false;
        }

        List<String> openBrackets = new ArrayList();

        for (int counter = 0; counter < brackets.length; counter++) {
            if (isOpenBracket(brackets[counter])) {
                openBrackets.add(brackets[counter]);
            } else {
                if (isClosedBracket(brackets[counter]) && openBrackets.isEmpty()) {
                    return false;
                }
                var lastOpenbracket = openBrackets.get(openBrackets.size() - 1);
                if (!((brackets[counter].equals("]") && lastOpenbracket.equals("["))
                        || (brackets[counter].equals(")") && lastOpenbracket.equals("("))
                        || (brackets[counter].equals("}") && lastOpenbracket.equals("{")))) {
                    return false;
                } else {
                    openBrackets.remove(openBrackets.size() - 1);
                }
            }
        }

        return openBrackets.isEmpty();

    }

    public static boolean isOpenBracket(String bracket) {
        return bracket.equals("[") || bracket.equals("(") || bracket.equals("{");
    }

    public static boolean isClosedBracket(String bracket) {
        return bracket.equals("}") || bracket.equals(")") || bracket.equals("]");
    }

    public static void loopTest() {
        for (int i = 0; i < 10; i++) {

            System.out.println("hola");
        }
    }
}
