package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class sort13 {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
          int n=Integer.parseInt(br.readLine());
          String str[]=br.readLine().split(" ");
          int arr[]=new int[str.length];
          for(int i=0;i<str.length;i++){
              arr[i]=Integer.parseInt(str[i]);
          }
          ///
            mukersh(arr);
            }

        }
static void mukersh(int []arr){
    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    Arrays.sort(arr);

    for(int i=0;i<arr.length;i++){
        hm.put(arr[i],i);
    }

    int val=-1;
    int i=0;
    int j=arr.length-1;

    for( j=arr.length-1;j>i;j--){
        for(i=0;j>i;i++){

            if(hm.containsKey(arr[j]/arr[i])){

                //i=0
                if(i>=0 && arr[i]!=arr[i+1]){
                    //good
                }
                if(i==arr.length-1 && arr[i]!=arr[i-1]){
                    //good
                }


                //i=n-1
                if((i+1<arr.length && arr[i]!=arr[i+1]) ){}
                val=arr[j];
                break;
            }
        }
    }

    System.out.println(val);

}
    }

