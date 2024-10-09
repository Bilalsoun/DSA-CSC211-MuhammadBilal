package c_sort_list_string_length;

import java.util.Arrays;

public class C_Sort_List_String_Length {
public static void main(String[] args) {
        String[] array = {"apple", "pie", "banana", "cat"};

        System.out.println("Input Array:");
        System.out.println(Arrays.toString(array));
        bubbleSortByLength(array);
        
        System.out.println("Output Array:");
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSortByLength(String[] arr) {
        boolean swapped;
        for(int i = 0; i <arr.length - 1; i++){
        swapped = false;
       for(int j = 0; j <arr.length - 1 - i; j++){
       if(arr[j].length() >arr[j + 1].length()){
        String temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
        swapped = true;
                }
            }
       if(!swapped){
        break;
            }
        }
    }
}