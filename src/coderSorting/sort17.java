package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class sort17 {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner s=new Scanner(System.in);
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            String str=br.readLine().trim();

            String str1[]=br.readLine().split(" ");

            int arr1[]=new int[str1.length];

            for(int i=0;i<str1.length;i++){
                arr1[i]=Integer.parseInt(str1[i]);
            }
            String comment=s.next();

            ///
            mukersh(arr1);
        }

    }
    static void mukersh(int []arr){

        Arrays.sort(arr);
        boolean b=false;
        for(int i=arr.length-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                int k=arr[i]*arr[j+1];
                if(Arrays.binarySearch(arr,k)>=0){
                    b=true;
                    System.out.println(k);
                    break;
                }
            }
            if(b==true) {
                break;
            }
        }
        if(b==false){
            System.out.println("1");
        }
    }


}
