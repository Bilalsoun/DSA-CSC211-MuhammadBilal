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
public class Task_07_Exercise_01 {
    public static void main(String[] args) {
         String str1="listen";
        String str2="silent";
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        boolean result=Arrays.equals(ch1,ch2);
        if(result==true){
        
            System.out.println("String is  Anagram: ");
        }
        else{
        
            System.out.println("String is not Anagram: ");
        }
    }
}
