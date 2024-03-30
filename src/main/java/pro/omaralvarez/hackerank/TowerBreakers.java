/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

/**
 *
 * @author ignis
 */
public class TowerBreakers {
    public static void main(String[] args) {
        
    }
    
    public static int towerBreakers(int n, int m) {
        
        if(m == 1) return 2;
        if(n % 2 != 0) return 1;
        return 2;
    }
    
}
