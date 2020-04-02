package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sort16 {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            String str=br.readLine();

            String str1[]=br.readLine().split(" ");

            long arr1[]=new long[str1.length];

            for(int i=0;i<str1.length;i++){
                arr1[i]=Long.parseLong(str1[i]);
            }

            ///
            mukersh(arr1);
        }

    }
    static void mukersh(long []arr){
        ArrayList<Long> e=new ArrayList<Long>();
        ArrayList<Long> o=new ArrayList<Long>();
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                e.add(arr[i]);
            }
            else o.add(arr[i]);
        }
        Collections.sort(e);
        Collections.sort(o,Collections.reverseOrder());
        String s="";
        for(int m=0;m<e.size();m++){
            s=s+e.get(m)+" ";
        }
        for(int m=0;m<o.size();m++){
            s=s+o.get(m)+" ";
        }
        System.out.println(s);
    }


}
