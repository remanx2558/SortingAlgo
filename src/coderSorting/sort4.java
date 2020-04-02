package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class sort4{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            String []n=br.readLine().split(" ");
            String str1[]=br.readLine().split(" ");
            String str2[]=br.readLine().split(" ");

            int arr[]=new int[str1.length];
            int arr2[]=new int[str2.length];
            for(int i=0;i<str1.length;i++){
                arr[i]=Integer.parseInt(str1[i]);
                //System.out.print(arr[i]);
            }
            for(int i=0;i<str2.length;i++){
                arr2[i]=Integer.parseInt(str2[i]);
                //System.out.print(arr[i]);
            }
            mukesh(arr,arr2);

        }


    }

    static void mukesh(int[] arr1, int []arr2){

        HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
        for(int i=0;i<arr1.length;i++){
            if(hm.containsKey(arr1[i])==false){
                hm.put(arr1[i],1);
            }
        }
        boolean b=true;
        for(int i=0;i<arr2.length;i++){
            if(hm.containsKey(arr2[i])==false){
            b=false;
            break;
            }
        }
        //print
        if(b==true){
            System.out.println("YES");
        }
        else System.out.println("NO");

    }

}