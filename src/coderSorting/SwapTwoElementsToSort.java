package coderSorting;
// Java program to
// sort using one swap
import java.io.*;

class SwapTwoElementsToSort
{
    // This function sorts an array
// that can be sorted by single swap
    static void sortByOneSwap(int arr[],
                              int n)
    {
   int s=0;
   int e=n-1;
   int count=0;
   while(s<e && count<n){
       if(arr[s]>arr[e]){
           break;
       }
        if(s+1<=n-1 && arr[s]<arr[s+1]){s++;}
        if(e-1>=0 && arr[e]>arr[e-1]){e--;}
count++;

   }
   System.out.println("swap index "+s+" "+e);
    }

    // A utility function to
// print an array of size n
    static void printArray(int arr[], int n)
    {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = {10, 30, 20,
                40, 50, 60, 70};
        int n = arr.length;

        System.out.println("Given array is ");
        printArray(arr, n);

        sortByOneSwap(arr, n);

        System.out.println("Sorted array is ");
        printArray(arr, n);
    }
}

// This code is contributed by anuj_67.
