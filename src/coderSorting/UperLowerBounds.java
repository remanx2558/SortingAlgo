package coderSorting;

import java.util.*;
import java.lang.*;
import java.io.*;
class UpperLowerBonds
{
    public static void main (String[] args)
    {
        //code
        Scanner s=new Scanner (System.in);
        int t=s.nextInt();
        for(int p=0;p<t;p++){
            int n=s.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            mukesh(arr,n);

        }
    }
    static void mukesh(int []arr,int n){
        ArrayList<Integer> even=new ArrayList<Integer>();
        ArrayList<Integer> odd=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }
            else odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        String e="";
        String o="";
        for(int i=0;i<even.size();i++){
            e=e+even.get(i)+" ";
        }
        for(int i=odd.size()-1;i>=0;i--){
            o=o+odd.get(i)+" ";
        }
        String f=o+e;
        System.out.println(f);

    }
}