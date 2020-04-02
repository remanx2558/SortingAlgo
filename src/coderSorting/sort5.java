package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class sort5{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            String []n=br.readLine().split(" ");
            String str1[]=br.readLine().split(" ");

            int arr[]=new int[str1.length];

            for(int i=0;i<str1.length;i++){
                arr[i]=Integer.parseInt(str1[i]);
                //System.out.print(arr[i]);
            }

            mukesh(arr,n[1]);

        }


    }

    static void mukesh(int[] arr1,String s){
        int k=Integer.parseInt(s);

        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

    }

}