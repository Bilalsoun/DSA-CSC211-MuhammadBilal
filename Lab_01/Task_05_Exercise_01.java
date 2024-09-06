/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_01;

import java.util.Arrays;

/**
 *
 * @author AaMaN Computer
 */
public class Task_05_Exercise_01 {
    public static void main(String[] args) {
        
         int[] inputArray = {1, 3, 5, 7, 9};
        reverseArray(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }
    public static void reverseArray(int[] arr){
        int left = 0, right = arr.length - 1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        
        } 
    }
}
