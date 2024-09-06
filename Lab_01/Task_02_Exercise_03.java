/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_01;

/**
 *
 * @author AaMaN Computer
 */
public class Task_02_Exercise_03 {
    public static void main(String[] args) {
        int array [] = new int[6];
      array[0]= 3;
      array[1]= 6;
      array[2]= 9;
      array[3]= 12;
      array[4]= 15;
        System.out.println("Elemennt Before insertion");
      
      for(int i=0; i<array.length; i++){
          System.out.print(array[i] + " ");
          
        }
    int newElement = 18;
     array [array.length - 1] = newElement;
        System.out.println("\nElemennt After insertion at the End");
    
    for(int i =0; i<array.length;i++){
        System.out.print(array[i] + " ");
    }
    }
}
