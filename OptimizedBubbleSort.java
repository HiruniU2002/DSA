/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OptimizedBubbleSort;

/**
 *
 * @author User
 */
public class OptimizedBubbleSort {
    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {

            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swapping happened, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = {5,8,2,6,1};

        System.out.println("Optimized Bubble Sort\n");

        bubbleSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
    
}
