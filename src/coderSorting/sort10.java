package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class SortTheGivenArrayAfterApplyingTheGivenEquation{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            String []n=br.readLine().split(" ");
           int z=Integer.parseInt(br.readLine());

            String str1[]=br.readLine().split(" ");

            int arr[]=new int[str1.length];
            int guments[]=new int[n.length];

            for(int i=0;i<str1.length;i++){
                arr[i]=Integer.parseInt(str1[i]);
                //System.out.print(arr[i]);
            }
            for(int i=0;i<n.length;i++){
                guments[i]=Integer.parseInt(n[i]);
                //System.out.print(arr[i]);
            }


            kamlesh(arr,guments);

        }


    }
    static void kamlesh(int []arr1,int[] arr2){

        //naive
        BigInteger []mod=new BigInteger[arr1.length];

        for(int i=0;i<arr1.length;i++){
            BigInteger b=new BigInteger(String.valueOf(arr1[i]));
            b.multiply(b);
            b.multiply(BigInteger.valueOf(arr2[0]));

            BigInteger c=new BigInteger(String.valueOf(arr1[i]));
            c.multiply(BigInteger.valueOf(arr2[1]));

            b.add(c);
            b.add(BigInteger.valueOf(arr2[2]));
            mod[i]=new BigInteger(String.valueOf(b));
            System.out.println(mod[i]);
        }

        for(int i=0;i<arr1.length;i++){
            System.out.print(mod[i]+" ");}
    }

}