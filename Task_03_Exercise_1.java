/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1ds;

/**
 *
 * @author AaMaN Computer
 */
public class Task_03_Exercise_1 {
    public static void main(String[] args) {
                 int[] array = {8, 16, 24, 32, 40};
        
        int deleteIndex = 2; 

        for(int i = deleteIndex; i <array.length - 1; i++){
            array[i] = array[i + 1];
        }
        System.out.println("\nElements After Deletion:");
        for(int i = 0; i <array.length - 1; i++){
            System.out.print(array[i] + " ");
        }
    }
   
}
