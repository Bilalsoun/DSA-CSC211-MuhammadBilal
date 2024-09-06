/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab_2;

/**
 *
 * @author AaMaN Computer
 */
public class DSA_Lab_2_Problem_5 {
   public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans1 = 0;
        int ans2 = 0;
       for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    ans1++;
                    break;
                }
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    ans2++;
                    break; 
               }
            }
        }
        return new int[]{ans1, ans2};
    }
    public static void main(String[] args) {
        DSA_Lab_2_Problem_5 solution = new DSA_Lab_2_Problem_5();
        int[] nums1 = {2, 3, 2};
        int[] nums2 = {1, 2};

        int[] result = solution.findIntersectionValues(nums1, nums2);
        System.out.println("Intersection Total: ");
        System.out.println("Total of elements from nums1 found in nums2: " + result[0]);
        System.out.println("Total of elements from nums2 found in nums1: " + result[1]);
    }
}
