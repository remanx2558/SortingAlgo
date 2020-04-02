package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class sort18 {

    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            String str=br.readLine().trim();

            String str1[]=br.readLine().split(" ");

            int arr1[]=new int[str1.length];

            for(int i=0;i<str1.length;i++){
                arr1[i]=Integer.parseInt(str1[i]);
            }

            ///
            mukersh(arr1);
        }

    }
    static void mukersh(int []arr){

        //find index
        int s2=0;
        int s1=0;
        int l1=arr.length-1;
        int l2=arr.length-1;

        if(arr.length==1){
            System.out.println(arr[0]);
            return;
        }

        //2 elements
        for(int j=1;j<arr.length;j++){
            if(arr[j-1]>arr[j]){
              s2=j;
              l1=j-1;
              break;
            }

        }
        //////////////
        int arr2[]=new int[arr.length];
        int k=0;
        while(s1<=l1 && s2<=l2 && k<arr.length){
            if(arr[s1]<arr[s2]){
                arr2[k++]=arr[s1++];
            }
            else arr2[k++]=arr[s2++];

        }
        ////if
        if(s1<=l1 && k<arr.length){
            while(s1<=l1){
                arr2[k++]=arr[s1++];
            }
        }
        if(s2<=l2&& k<arr.length){
            while(s2<=l2){
                arr2[k++]=arr[s2++];
            }
        }
        /////////print
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();



    }


}
