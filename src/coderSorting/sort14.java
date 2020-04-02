package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class sort14 {

    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            String str[]=br.readLine().split(" ");

            String str2[]=br.readLine().split(" ");
            int arr[]=new int[str2.length];
            for(int i=0;i<str2.length;i++){
                arr[i]=Integer.parseInt(str2[i]);
            }
            ///
            mukersh(arr,Integer.parseInt(str[1]));
        }

    }
    static void mukersh(int []arr,int k){
        Arrays.sort(arr);
        int minmin=Integer.MAX_VALUE;

        for(int i=0;i+k-1<arr.length;i++){
            int diff=arr[i+k-1]-arr[i];
            if(diff<minmin){
                minmin=diff;
            }


        }

        System.out.println(minmin);

    }

}
