/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

/**
 *
 * @author ignis
 */
public class CaesarChipher {

    public static void main(String[] args) {
        String messageOne = "There's-a-starman-waiting-in-the-sky";
        String meesageTwo = "www.abc.xy";
        String meesageThree = "Ciphering.";
        //caesarCipher(messageOne, 3);
        caesarCipher(meesageTwo, 87);
    }

    public static String caesarCipher(String s, int k) {
        // Write your code here
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String cipherMessage = "";
        String[] message = s.split("");
        for (String letter : message) {
            int currentIndex = alphabet.indexOf(letter.toLowerCase());
            char cipherLetter = letter.charAt(0);
            if (currentIndex != -1) {
                
                if(k > alphabet.length()){
                    int times = k / alphabet.length();
                    k = k - (times * alphabet.length());
                }
                
                
                if ((currentIndex + k) > (alphabet.length() - 1)) {
                    int index = (currentIndex + k) - (alphabet.length());
                    cipherLetter = alphabet.charAt(index);
                } else {
                    cipherLetter = alphabet.charAt(currentIndex + k);
                }

                if (Character.isUpperCase(letter.charAt(0))) {
                    cipherLetter = Character.toUpperCase(cipherLetter);
                }
            }

            cipherMessage += cipherLetter;
        }

        System.out.println("" + cipherMessage);
        return cipherMessage;
    }
}
