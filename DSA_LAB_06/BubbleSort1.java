package bubblesort1;

public class BubbleSort1 {
    public static void main(String[] args) {
        
        int array[] = {5,1,3,4,6,2};
        System.out.println("Input array:");
        for(int i = 0; i<array.length; i++){
         System.out.print(array[i] + "  ");
        }
        System.out.println(); 
        for(int i = 0; i<array.length - 1; i++){
         for(int j = 0; j<array.length - 1; j++){
           if(array[j] >array[j + 1]){
           int temp = array[j];
           array[j] = array[j + 1];
           array[j + 1] = temp;
            }
          }  
        }
        System.out.println("Sorted array:");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + "  ");
        }
    }
}
