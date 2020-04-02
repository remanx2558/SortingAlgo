package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class sort6{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            String []n=br.readLine().split(" ");
            String str1[]=br.readLine().split(" ");
            String str2[]=br.readLine().split(" ");

            int arr[]=new int[str1.length];
            int arr2[]=new int[str2.length];

            for(int i=0;i<str1.length;i++){
                arr[i]=Integer.parseInt(str1[i]);
                //System.out.print(arr[i]);
            }
            for(int i=0;i<str2.length;i++){
                arr2[i]=Integer.parseInt(str2[i]);
                //System.out.print(arr[i]);
            }


            kamlesh(arr,arr2);

        }


    }
    static int upperbound(int []arr,int l,int r,int k){
        if(k>arr[arr.length-1]){return arr.length;}
        else if(k<arr[0]){return 0;}
if(l<=r && l>=0 && r<arr.length){
            int mid=(l+r)/2;
            if(arr[mid]==k){
                return mid+1+1;
            }
            else if(k>arr[mid]){
                return upperbound(arr,mid+1,r,k)+1;
            }
            else return upperbound(arr,l,mid-1,k)+1;
        }
        return -1;
    }
    static void kamlesh(int []arr1,int[] arr2){
        Arrays.sort(arr2);
        int count=0;

        for(int i=0;i<arr1.length;i++){
          int index=upperbound(arr2,0,arr2.length,arr1[i]);
          count=count+( arr2.length-index+1);
        }
        System.out.println(count);

    }
    static int uperbound(int []arr2,int l,int r,int k){
        int mid=(l+r)/2;
        if(k<arr2[0]){return 0;}
        else if(k>arr2[arr2.length-1]){
            return arr2.length;
        }
        else if(k<arr2[mid] && mid-1>=0 && k>arr2[mid-1]){return mid+1;}
        else if(k>arr2[mid] && mid+1<arr2.length && k<arr2[mid+1]){return mid+1+1;}
        else if(arr2[mid]==k){return mid+1;}
        else if(arr2[mid]>k){return upperbound(arr2,l,mid-1,k);}
        else if(arr2[mid]<k){return upperbound(arr2,mid+1,r,k);}
        else return -1;


    }


}