package bubble_sort_early_stoping;


public class Bubble_Sort_Early_Stoping {

    public static void main(String[] args) {
        int array[] = {5, 1, 3, 4, 6, 2};

        System.out.println("Input array:");
        for(int i = 0; i < array.length; i++){
         System.out.print(array[i] + "  ");
        }
        System.out.println();
        earlyStopBubbleSort(array);
        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++){
        System.out.print(array[i] + "  ");
        }
    }
    public static void earlyStopBubbleSort(int[] arr) {
        boolean swapped;
        for(int i = 0; i <arr.length - 1; i++){
        swapped = false;
        for(int j = 0; j<arr.length - 1 - i; j++){
        if(arr[j] >arr[j + 1]){
        int temp = arr[j];
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
