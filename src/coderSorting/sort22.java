package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sort22 {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            /////////////////////////////
            int n=Integer.parseInt(br.readLine());


            String str1[]=br.readLine().split(" ");
            String str2[]=br.readLine().split(" ");
            ////////////////////////////

            ///////////////////////////
            long arr1[]=new long[str1.length];

            for(int i=0;i<str1.length;i++){
                arr1[i]=Long.parseLong(str1[i]);}

            long arr2[]=new long[str2.length];
            for(int i=0;i<str2.length;i++){
                arr2[i]=Long.parseLong(str2[i]);}

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            //////////////////////////
            mukesh(arr1,arr2);

        }
    }
    static void mukesh(long []arr,long []arr2){
        //////////////
        int s=(int)arr2[0]-1;
        int e=(int)arr2[1]-1;
       // System.out.print("between index "+s+"and"+e);
      //  for(int i=0;i<arr.length;i++){
      //      System.out.print(arr[i]);
       // }

        long sum=0;
        for(int i=s+1;(i<e && i<arr.length) ;i++){
            sum=sum+arr[i];
           // System.out.println(sum);
        }
        System.out.println(sum);
    }

}
//////////////////////////////////////////////////////////////////

//////////////////////