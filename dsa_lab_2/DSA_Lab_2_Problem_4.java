/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab_2;

/**
 *
 * @author AaMaN Computer
 */
public class DSA_Lab_2_Problem_4 {
    
 public int countKDifference(int[] nums, int k){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){
              if(Math.abs(nums[i] - nums[j]) == k){
                count++; 
            }
          }
      }
        return count;
    }
    public static void main(String[] args) {
        DSA_Lab_2_Problem_4 input = new DSA_Lab_2_Problem_4();
        int[] nums = {1, 2, 2, 1};
        int k = 1;
       int result = input.countKDifference(nums, k);
        System.out.println("The number difference k :" + k + ": " + result);
    }
}
