/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro.omaralvarez.hackerank;

/**
 *
 * @author ignis
 */
public class QuckSort {
    
    
    public static void main(String[] args) {
        int[] arrayOfNumbers = {6,6,6,78,34,24,3,5,2,1,9,3,4};
        quickSort(arrayOfNumbers, 0, arrayOfNumbers.length - 1);
        PrintUtils.printArray(arrayOfNumbers);
    }
    
    private static void quickSort(int[] array, int begin, int end){
    
        if(begin < end){
            int partitionIndex = getPartitionIndex(array, begin, end);
            
            quickSort(array, begin, partitionIndex  - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }
    
    private static int getPartitionIndex(int[] array, int begin, int end){
        
        int pivot = array[end];
        int lastIndexLessThanPivot = begin - 1;
        for(int counter = begin; counter < end; counter++){
            if(array[counter] <= pivot){
                lastIndexLessThanPivot ++;
                int temp = array[lastIndexLessThanPivot];
                array[lastIndexLessThanPivot] = array[counter];
                array[counter] = temp;
            }
            
        }
        
        int temp = array[lastIndexLessThanPivot +1];
        array[lastIndexLessThanPivot + 1] = array[end];
        array[end] = temp;
        
        return lastIndexLessThanPivot + 1;
    }
    
}
