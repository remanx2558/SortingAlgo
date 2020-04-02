package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sort15 {

    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            String str[]=br.readLine().split(" ");

            String str1[]=br.readLine().split(" ");
            String str2[]=br.readLine().split(" ");

            long arr1[]=new long[str1.length];
            for(int i=0;i<str2.length;i++){
                arr1[i]=Long.parseLong(str1[i]);
            }
            long arr2[]=new long[str2.length];
            for(int i=0;i<str2.length;i++){
                arr2[i]=Long.parseLong(str2[i]);
            }
            ///
            mukersh(arr1,arr2,Long.parseLong(str[1]));
        }

    }
    static void mukersh(long []arr,long []arr2,long k){
        Arrays.sort(arr);
        Arrays.sort(arr2);

        boolean b=true;
        for(int i=0;i<arr.length;i++){
            long kk=arr[i];
            long ll=arr2[arr.length-1-i];
            if(kk+ll<k) {
                b = false;
                break;
            }}
        if(b==false){
            System.out.println("0");
        }
        else System.out.println("1");

    }
}
