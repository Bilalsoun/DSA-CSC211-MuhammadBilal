/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_01;

/**
 *
 * @author AaMaN Computer
 */
public class Task_02_Exercise_02 {
    public static void main(String[] args) {
        int array [] = new int[6];
      array[0]= 100;
      array[1]= 200;
      array[2]= 300;
      array[3]= 400;
      array[4]= 500;
        System.out.println("Elemennt Before insertion");
      
      for(int i=0; i<array.length; i++){
          System.out.print(array[i] + " ");
          
        }
    int newElement = 250;
    int position =2;
    
    for(int i= array.length-1; i>position;i--){
    array[i]= array[i-1];
    
    }
    
    array [position] = newElement;
     System.out.println("\nElemennt After insertion");
    
    for(int i =0; i<array.length;i++){
        System.out.print(array[i] + " ");
    }
    }
}
