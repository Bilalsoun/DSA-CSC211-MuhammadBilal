/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab_2;

/**
 *
 * @author AaMaN Computer
 */
public class DSA_Lab_2_Problem_3 {
    public int mostWordsFound(String[] sentences) {
        int ans = 0; 
        for(int i = 0; i < sentences.length; i++) {
            String s = sentences[i];
            String[] array = s.strip().split("");
            if(ans < array.length) {
                ans = array.length;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        DSA_Lab_2_Problem_3 input = new DSA_Lab_2_Problem_3();
        String[] sentences = {"DSA","Artificial Intelligence","Software Engineering","Applied phyics"};
        int result = input.mostWordsFound(sentences);
        System.out.println("sentence word: " + result + " words.");
    }
}
