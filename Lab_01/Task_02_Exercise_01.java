/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_01;

/**
 *
 * @author AaMaN Computer
 */
public class Task_02_Exercise_01 {
    public static void main(String[] args) {
         int array [] = new int[6];
      array[0]= 12;
      array[1]= 24;
      array[2]= 36;
      array[3]= 48;
      array[4]= 60;
        System.out.println("Elemennt Before insertion");
      
      for(int i=0; i<array.length; i++){
          System.out.print(array[i] + " ");
          
        }
    int newElement = 6;
    
    for(int i= array.length-1; i>0;i--){
    array[i]= array[i-1];
    
    }
    
    array [0] = newElement;
     System.out.println("\nElemennt After insertion");
    
    for(int i =0; i<array.length;i++){
        System.out.print(array[i] + " ");
    }
    }
}
