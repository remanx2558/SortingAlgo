package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class sort25 {

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            int n=Integer.parseInt(br.readLine());
            int arr[]=new int[n];
            int arr2[]=new int[n];
            String str[]=br.readLine().split(" ");

            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(str[i]);
                arr2[i]=arr[i];
            }
            Arrays.sort(arr2);
            HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
            for(int i=0;i<arr.length;i++){
                hm.put(arr2[i],i);
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(hm.get(arr[i])+" ");
            }

        }
    }

}