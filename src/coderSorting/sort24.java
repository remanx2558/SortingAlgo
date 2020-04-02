package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class sort24 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int size = sc.nextInt();

            int[] arr = new int[size];
            for(int j=0;j<size;j++){
                arr[j] = sc.nextInt();

            }



            System.out.println(func(arr,arr.length));
        }
    }
    static int func(int []arr,int n){
        // if size is less than 3, no triplet exists
        if (n < 3)
            return -1;

        // Initialize Maximum, second maximum and third
        // maximum element
        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;int maxC = Integer.MIN_VALUE;

        // Initialize Minimum and second mimimum element
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++)
        {
            // Update Maximum, second maximum and third
            // maximum element
            if (arr[i] > maxA)
            {
                maxC = maxB;
                maxB = maxA;
                maxA = arr[i];
            }

            // Update second maximum and third maximum element
            else if (arr[i] > maxB)
            {
                maxC = maxB;
                maxB = arr[i];
            }

            // Update third maximum element
            else if (arr[i] > maxC)
                maxC = arr[i];

            // Update Minimum and second mimimum element
            if (arr[i] < minA)
            {
                minB = minA;
                minA = arr[i];
            }

            // Update second mimimum element
            else if(arr[i] < minB)
                minB = arr[i];
        }

        return Math.max(minA * minB * maxA,
                maxA * maxB * maxC);
    }




}
