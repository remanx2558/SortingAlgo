package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class codeforce2 {

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){


            int n=Integer.parseInt(br.readLine());
            String str2[]=br.readLine().split(" ");


            long arr2[]=new long[str2.length];

            for(int i=0;i<arr2.length;i++){
                arr2[i]=Long.parseLong(str2[i]);
            }

            mukesh(arr2,n);

        }
    }
    static long gcd(long a, long b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    static int m;
    static void mukesh(long []arr,int n){
       // HashMap<Integer, ArrayList<Long>> hm=new HashMap<Integer, ArrayList<Long>>();
HashMap<Integer,Long> hm2=new HashMap<Integer, Long>();

hm2.put(1,arr[0]);
arr[0]=1;
m=1;

        //hm.put(1,new ArrayList<Long>());
       // hm.get(1).add(arr[0]);
       // arr[0]=1;
       // m=1;
        boolean b=false;

        for(int i=1;i<n;i++){
            b=false;

            ///if
            for(int j=1;j<=m;j++){
                if(gcd(arr[i],hm2.get(j))>1){
                        //gcd(arr[i],hm.get(j).get(0))>1){
                    arr[i]=j;
                    b=true;
                    break;
                }}
//else
            if(b==false){
                m++;

                hm2.put(m,arr[i]);
              //  hm.get(m).add(arr[i]);
                arr[i]=m;

            }

        }

/////////////////show time/////////
        System.out.println(m);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }

}
