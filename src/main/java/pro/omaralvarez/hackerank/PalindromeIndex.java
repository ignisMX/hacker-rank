/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

/**
 *
 * @author ignis
 */
public class PalindromeIndex {

    public static void main(String[] args) {
//fgnfnidynhxebxxxfmxixhsruldhsaobhlcggchboashdlurshxixmfxxxbexhnydinfngf
        var palOne = "quyjjdcgsvvsgcdjjyq";
        var palTwo = "qyjjdcgsvvsgcdjjyuq";
        var palThree = "hgygsvlfwcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcflvsgygh";
        var palFour = "quyjjdcgsvvsgcdjxjyq";
        var palFive = "aaab";
        var palSix = "baa";
        var palSeven = "fcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwf";
        //hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh
        var palEight = "fcwnswwsnwcwf";
        palindromeIndex(palEight);
    }

    public static int palindromeIndex(String s) {

        String[] letters = s.split("");
        int index = -1;
        int endPointer = letters.length - 1;
        for (int i = 0; i < letters.length / 2; i++) {
            if (!letters[i].equals(letters[endPointer - i])) {
                if (index > -1) {
                    index = -1;
                    break;
                }
                if (letters[i + 1].equals(letters[endPointer - i])
                        && letters[i].equals(letters[endPointer - (i + 1)])) {
                    
                    if (letters[i + 2].equals(letters[endPointer - (i + 1) ])) {

                        index = i;
                        endPointer ++;
                        i++;
                    } else if (letters[i + 1 ].equals(letters[endPointer - (i + 2)])) {
                        index = endPointer - i;
                        endPointer--;
                    }
                    
                } else if (letters[i + 1].equals(letters[endPointer - i])) {
                    index = i;
                    endPointer++;
                    i++;
                } else if (letters[i].equals(letters[endPointer - (i + 1)])) {
                    index = endPointer - i;
                    endPointer--;
                }
            }
        }
        System.out.println("index:" + index);
        return index;
    }

    private static void printArray(String[] letters) {
        for (String letter : letters) {
            System.out.print(letter + " ");
        }
    }
}
