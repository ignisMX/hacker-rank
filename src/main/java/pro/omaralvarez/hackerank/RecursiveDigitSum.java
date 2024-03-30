/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

/**
 *
 * @author ignis
 */
public class RecursiveDigitSum {

    public static void main(String[] args) {
        int result = superDigit("861568688536788", 100000);
        System.out.println("super digit: " + result);

    }

    public static int superDigit(String n, int k) {
        String pNumber = calculateP(n, k);
        System.out.println("pNumber " + pNumber);
        int superDigit = getSuperDigit(pNumber);

        return superDigit;
    }

    public static int getSuperDigit(String numbers) {

        String[] digits = numbers.split("");
        int superDigit = 0;
        for (String number : digits) {
            superDigit += Integer.parseInt(number);
        }

        if (String.valueOf(superDigit).length() > 1) {
            superDigit = getSuperDigit(String.valueOf(superDigit));
        }

        return superDigit;
    }

    public static String calculateP(String numbers, int times) {

        numbers = numbers.replace("0", "");
        String[] digits = numbers.split("");
        long pNumber = 0;
        for (String number : digits) {
            pNumber += Integer.parseInt(number);
        }
        
        pNumber = pNumber * times;
        
        return String.valueOf(pNumber);

    }
}
