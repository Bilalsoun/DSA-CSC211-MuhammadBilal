/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_01;

/**
 *
 * @author AaMaN Computer
 */
public class Task_04_Exercise_02 {
    public static void main(String[] args) {
        int [] array = {4, 6, 2, 8, 10};
int target = 8;
boolean found = false;
for(int i= 0; i<array.length; i++){
if(array[i] == target){
    System.out.println("Element " + target + " Found at Index " + i);
      found = true;
      break;

}
}
        if(found == false){
            System.out.println("Element " + target + " not in the array. ");
        }
    }
        
    }
    
