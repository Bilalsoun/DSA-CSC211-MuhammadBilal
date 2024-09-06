/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AaMaN Computer
 */
public class DSA_Lab_2_Problem_2 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {          
       if (words[i].contains(String.valueOf(x))) {
        list.add(i); 
         }
      }   
     return list;
    }
    public static void main(String[] args) {
    DSA_Lab_2_Problem_2 input = new DSA_Lab_2_Problem_2();
        String[] words = {"leet","code"};
        char x = 'e';
        List<Integer> result = input.findWordsContaining(words, x);
        System.out.println(" the character '" + x + "': " + result);
    }
}
