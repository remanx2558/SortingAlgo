package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.util.Collections.reverseOrder;

public class sort19 {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            /////////////////////////////
            int n=Integer.parseInt(br.readLine());
            String str1[]=br.readLine().split(" ");
            String str2[]=br.readLine().split(" ");
            ////////////////////////////
            long arr[]=new long[str1.length];
            for(int i=0;i<str1.length;i++){
                arr[i]=Long.parseLong(str1[i]);
            }
            ///////////////////////////
            long arr2[]=new long[str1.length];
            for(int i=0;i<str1.length;i++){
                arr2[i]=Long.parseLong(str2[i]);
            }
            //////////////////////////
            mukesh(arr,arr2);

        }}
    static void mukesh(long []arr ,long []arr2){
        Arrays.sort(arr);
        Arrays.sort(arr2);
        long k=0;
        long M=1000000007;
        for(int i=0;i<arr.length;i++){
            k=(k+((arr[i]*arr2[arr.length-1-i])%M))%M;
        }
        System.out.println(k);
    }
}
