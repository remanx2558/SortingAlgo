package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class codeforce1 {

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){


            String str1[]=br.readLine().split(" ");
            String str2[]=br.readLine().split(" ");

            long arr1[]=new long[str1.length];
            long arr2[]=new long[str2.length];

            for(int i=0;i<arr1.length;i++){
                arr1[i]=Long.parseLong(str1[i]);
            }
            for(int i=0;i<arr2.length;i++){
                arr2[i]=Long.parseLong(str2[i]);
            }

            mukesh(arr1,arr2);

        }
    }

static void mukesh(long []arr1,long[]arr2){
        long x=arr1[1]+arr2[0]-arr1[0];
    long y=arr1[3]+arr2[1]-arr1[2];

    long xmax=Math.max(arr2[2],arr2[4]);
    long xmin=arr2[2]+arr2[4]-xmax;

    long ymax=Math.max(arr2[3],arr2[5]);
    long ymin=arr2[3]+arr2[5]-ymax;


  //  if((arr1[0]>=1 && arr2[0]-1<xmin )||(arr1[1]>=1 && arr2[0]+1>xmax) ||(arr1[2]>=1 && arr2[1]-1<ymin) ||(arr1[3]>=1 && arr2[1]+1>ymax)){
     //   System.out.println("NO");

  //  }
     if(arr2[0]==arr2[2] && arr2[0]==arr2[4] && (arr1[0]>0 || arr1[1]>0)){
        System.out.println("NO");
    }
    else if(arr2[1]==arr2[3] && arr2[1]==arr2[5] && (arr1[2]>0 || arr1[3]>0)){
        System.out.println("NO");
    }

    else if(x>=xmin && x<=xmax && y>=ymin && y<=ymax){
        System.out.println("YES");
    }
    else System.out.println("NO");



}
}
