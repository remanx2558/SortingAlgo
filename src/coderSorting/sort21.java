package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class sort21 {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            /////////////////////////////

            String str1[]=br.readLine().split(" ");
            String str2[]=br.readLine().split(" ");
            ////////////////////////////

            ///////////////////////////
            long arr2[]=new long[str2.length];
            elements []arr3=new elements[str2.length];

            k=Long.parseLong(str1[1]);

            for(int i=0;i<str2.length;i++){
                arr2[i]=Long.parseLong(str2[i]);
                arr3[i]=new elements(arr2[i],i);

            }
            //////////////////////////
            mukesh(arr3);

        }
    }
  static   class elements{
        long val;
        int index;
        elements(long v,int i){
            val=v;
            index=i;
        }   }
static long k;
    static class mycompare implements Comparator<elements>{


        @Override
        public int compare(elements e1, elements e2) {
            if(Math.abs(e1.val-k)<Math.abs(e2.val-k)){
                return -1;
            }
            else if (Math.abs(e1.val-k)>Math.abs(e2.val-k)){
                return 1;
            }
            else if(e1.index<e2.index){
                return -1;
            }
            else return 1;
        }
    }
  static   void mukesh(elements [] arr){
        Arrays.sort(arr,new mycompare());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i].val+" ");
        }
        System.out.println();
}}
