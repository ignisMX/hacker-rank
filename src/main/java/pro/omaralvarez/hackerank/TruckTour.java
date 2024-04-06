/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

import java.util.List;

/**
 *
 * @author ignis
 */
public class TruckTour {
    
    public static void main(String[] args) {
        
    }
    
    private static int truckTour(List<List<Integer>> petrolpumps){
    
        int currentPetrol = 0;
        int lastPosibleIndex = 0;
        for(int counter = 0; counter < petrolpumps.size(); counter ++){
            
            
            int petrolGiven = petrolpumps.get(counter).get(0);
            int distanceToNextPetrolPump = petrolpumps.get(counter).get(1);
            // this means that I can move to next petrol
            if(((currentPetrol + petrolGiven) - distanceToNextPetrolPump) > 0){
                currentPetrol += petrolGiven;
                currentPetrol -= distanceToNextPetrolPump;
            }
            else{
                currentPetrol = 0;
                lastPosibleIndex = counter + 1;
            }
        }
        
        return lastPosibleIndex;
    
    }
}
