/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab_2;

/**
 *
 * @author AaMaN Computer
 */
public class DSA_Lab_2_Problem_1 {
     public int[] getConcatenation(int[] nums) {
        int[] num = new int[2 * nums.length];
        for(int i = 0; i < nums.length; i++){
            num[i] = nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            num[i + nums.length] = nums[i];
        }
        return num;
    }

    public static void main(String[] args) {
       DSA_Lab_2_Problem_1 input = new DSA_Lab_2_Problem_1();
        int[] nums = {1, 2, 3}; 
        int[] result = input.getConcatenation(nums);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
   

