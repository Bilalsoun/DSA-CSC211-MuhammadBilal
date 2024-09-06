/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab_2;

/**
 *
 * @author AaMaN Computer
 */
public class DSA_Lab_2_Problem_6 {
    public int countPrimes(int n){
        if(n <= 2){
        return 0;
        }
        boolean[] isPrime = new boolean[n];
        for(int i = 2; i < n; i++){
         isPrime[i] = true;
        }
        for(int i = 2; i * i < n; i++){
            if(isPrime[i]){
             for(int j = i * i; j < n; j += i){
             isPrime[j] = false;
             }
           }
        }
        int count = 0;
        for(int i = 2; i < n; i++){
         if(isPrime[i]){
            count++;
          }
        }
      return count;
    }
    public static void main(String[] args) {
        DSA_Lab_2_Problem_6 input = new DSA_Lab_2_Problem_6();
        int[] testValues = {10, 20, 30, 50, 100};
        for(int n : testValues){
       int primeCount = input.countPrimes(n);
       System.out.println("Number of primes less than " + n + " is: " + primeCount);
        }
    }
}
