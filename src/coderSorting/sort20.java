package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sort20 {


    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner s=new Scanner(System.in);
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            String str[]=br.readLine().split(" ");

            String str1[]=br.readLine().split(" ");

            int arr1[]=new int[str1.length];
            String comment=s.next();
            ///order of sorting

            for(int i=0;i<str1.length;i++){
                arr1[i]=Integer.parseInt(str1[i]);
            }

            ///
            mukersh(arr1,Integer.parseInt(str[1]));
        }

    }
    static void mukersh(int []arr,int k){
int val=arr[k];
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,val));

    }


}
