/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1ds;

import java.util.Arrays;

/**
 *
 * @author AaMaN Computer
 */
public class Task_04_Exercise_03 {
    public static void main(String[] args) {
        int [] array = {11, 22, 33, 44, 55};
    int target = 33;
    
    Arrays.sort(array);
    
    int left = 0;
    int right = array.length -1;
    int middle;
    boolean found = false;
    
    while (left <= right ){
    middle = left + (right - left) / 2;
    if   (array[middle] == target){
        System.out.println("Element " + target + " found at Index " + middle);
        found = true;
        break;
       
    }
    if (array[middle] < target){
    left = middle +1;
    } else{
    right = middle -1;
    }
    }
    if (found == false){
        System.out.println("Element " + target + " not found in the array. ");
    }
    }
    
}


