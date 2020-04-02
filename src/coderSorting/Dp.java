package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dp {
    static int dp[][];
    public static int Min_Time(int arr[], int n, int k)
    {
        dp=new int[k][n];
        //1st
        dp[0][0]=arr[0];
        for(int i=1;i<n;i++){
            dp[0][i]=dp[0][i-1]+arr[i];
        }
        //rest
        for(int i=1;i<k;i++){
            for(int j=i;j<n;j++){
                dp[i][j]=Math.min(Math.min(Math.max(dp[i][j-1]+arr[j],dp[0][j]-dp[i][j-1]-arr[j]),Math.max(dp[i-1][j-1],arr[j])),Math.max(dp[i][j-1],arr[j]));

            }
        }
        return dp[k-1][n-1];
    }
    static int john(int sum,int p,int index,int[]arr){
        if(p==1){return sum;}
        if(p<1){return -1;}



        int min=sum;

        int vv=0;
        for(int j=index+1;j<arr.length;j++){
            vv=vv+arr[j];
            int jj=john(sum-vv,p-1,j,arr);
            if(jj==-1){continue;}
            int m=Math.max(jj,vv);
            if(min>m){
                min=m;
            }
        }

        return min;



    }


    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            String str[]=br.readLine().split(" ");

            String str1[]=br.readLine().split(" ");

            int arr1[]=new int[str1.length];

            for(int i=0;i<str1.length;i++){
                arr1[i]=Integer.parseInt(str1[i]);
            }

            ///
            int k=Min_Time(arr1,Integer.parseInt(str[1]),Integer.parseInt(str[0]));
 System.out.println(k);
        }

    }
    static void mukersh(int []arr){

        //find index
        int s2=0;
        int s1=0;
        int l1=0;
        int l2=arr.length-1;


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
        while(s1<=l1 && s2<=l2){
            if(arr[s1]<arr[s2]){
                arr2[k++]=arr[s1++];
            }
            else arr2[k++]=arr[s2++];

        }
        ////if
        if(s1<=l1){
            while(s1<=l1){
                arr2[k++]=arr[s1++];
            }
        }
        if(s2<=l2){
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
