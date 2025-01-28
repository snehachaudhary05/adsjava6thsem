import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        printArray(arr);
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
          //  System.out.println((i+1) + " ");
            printArray(arr);
        }
        printArray(arr);
        scanner.close();
    }
    public static void printArray(int[] arr)
    {
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}