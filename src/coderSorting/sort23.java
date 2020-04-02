package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sort23 {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            /////////////////////////////
            int n=Integer.parseInt(br.readLine());


            String str1[]=br.readLine().split(" ");

            long arr1[]=new long[str1.length];

            for(int i=0;i<str1.length;i++){
                arr1[i]=Long.parseLong(str1[i]);}
            Arrays.sort(arr1);
            //////////////////////////
            mukesh(arr1);

        }
    }
    static void mukesh(long [] arr){
        int count=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]+1){
                count++;
            }
        }
        System.out.println(count);


    }

}
