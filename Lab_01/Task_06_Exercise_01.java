/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_01;

/**
 *
 * @author AaMaN Computer
 */
public class Task_06_Exercise_01 {
    public static void main(String[] args) {
        String word="radar";
        boolean  palindrome=true;
        for(int i=0; i<word.length()/2; i++){
        if(word.charAt(i)!=word.charAt(word.length()-1-i)){
        palindrome=false;
        break;
        
        }
        }
        
        if(palindrome){
            System.out.println(word+ " is palindrome:");
        
        }
        else{
        
            System.out.println(word+ " is not palindrome:");
        }
    }
   
}
