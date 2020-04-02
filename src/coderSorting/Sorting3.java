package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class SelectionSort3{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            int n=Integer.parseInt(br.readLine());
            String str[]=br.readLine().split(" ");
            int arr[]=new int[n];
            for(int i=0;i<str.length;i++){
                arr[i]=Integer.parseInt(str[i]);
                //System.out.print(arr[i]);
            }
            mukesh(arr,n);

        }


    }

    static void mukesh(int[] arr, int n){


        int sort[]=new int[n];
        for(int i=0;i<n;i++){
            sort[i]=arr[i];
        }
        Arrays.sort(sort);
        int s=0;
        int e=n-1;
        for(int i=0;i<n;i++){
            if(arr[i]!=sort[i]){
                s=i;
                break;

            }
        }
        ////
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=sort[i]){
                e=i;
                break;

            }
        }
        System.out.println(s+" "+e);

    }

}