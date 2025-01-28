import java.util.Scanner;

public class SelectionSort {
    // Method to perform Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < n; j++) { // Fixed: `j = 1+1` should be `j = i + 1`
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
            // Swap the found minimum element with the current element
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Declare and initialize the array
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print original array
        System.out.println("\nOriginal Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Perform selection sort
        selectionSort(arr);

        // Print sorted array
        System.out.println("\n\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}