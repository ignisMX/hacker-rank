/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

/**
 *
 * @author ignis
 */
public class PalindromeCreator {

    public static void main(String[] args) {
        String testOne = "kjyuhfhuyj";
        String testTwo = "fcwnswwsnwcwf";
        var result = palindromeCreator2("fcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwf");
        System.out.println("result : " + result);
    }

    public static String palindromeCreator2(String str) {
        if (isPalindrome(str)) {
            return "Palindrome";
        }

        var rightTrashLetters = "";
        var leftTrashLetters = "";
        var length = str.length() - 1;
        var stringBuilder = new StringBuilder(str);
        for (int counter = 0; counter < str.length() / 2; counter++) {

            var leftString = str.charAt(counter);
            var rightString = str.charAt(length - counter);

            System.out.println("leftString: " + leftString);
            System.out.println("rightString:" + rightString);
            System.out.println("tashletter:" + leftTrashLetters + rightTrashLetters);
            if ((leftTrashLetters + rightTrashLetters).length() > 2) {
                break;
            }
            if (leftString != rightString) {
                var nextLeftString = str.charAt(counter + 1);
                var nextRightString = str.charAt(length - (counter + 1));
                System.out.println("no son iguales next left: " + nextLeftString + " next right: " + nextRightString);

                if (nextLeftString == rightString && nextRightString == leftString) {
                    var nextOfNextLeftString = str.charAt(counter + 2);
                    var nextOfNextRightString = str.charAt(length - (counter + 2));
                    System.out.println("no son iguales next of next left: " + nextOfNextLeftString + " next of next right: " + nextOfNextRightString);

                    if (nextOfNextLeftString == nextRightString) {
                        leftTrashLetters += leftString;
                        length++;
                        
                    } else if (nextLeftString == nextOfNextRightString) {
                        rightTrashLetters += rightString;
                        counter--;
                        length--;
                    }
                } else if (nextLeftString == rightString) {

                    leftTrashLetters += leftString;
                    stringBuilder.deleteCharAt(counter);
                    length++;
                    if (isPalindrome(stringBuilder.toString())) {
                        break;
                    }

                } else if (nextRightString == leftString) {
                    rightTrashLetters += rightString;
                    counter--;

                    length--;
                } else {
                    rightTrashLetters += rightString;
                    leftTrashLetters += leftString;
                    
                }
            }
        }

        var trashLetters = leftTrashLetters + rightTrashLetters;
        return trashLetters.isEmpty() ? "not possible" : (str.length() - trashLetters.length()) < 3 ? "not possible" : trashLetters.length() > 2 ? "not possible" : trashLetters;
    }

    public static boolean isPalindrome(String word) {
        var stringBuilder = new StringBuilder(word).reverse().toString();

        return stringBuilder.equals(word);
    }

}
