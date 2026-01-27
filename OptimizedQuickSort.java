/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OptimizedQuickSort;

/**
 *
 * @author User
 */
public class OptimizedQuickSort {

    /**
     * @param args the command line arguments
     */
        public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int p = partition(arr, low, high);

            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    // Partition using middle element as pivot
    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[(low + high) / 2];

        int i = low;
        int j = high;

        while (i <= j) {

            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return i - 1;
    }

    // Swap helper method
    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {9, 3, 7, 1, 8, 2, 5};

        System.out.println("Before Sorting:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\n\nAfter Sorting:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
    
}
