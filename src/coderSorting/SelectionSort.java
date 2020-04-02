package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class SelectionSort {
    static class element{

        int f;
        int v;
        element(int ff,int vv){
            f=ff;
            v=vv;
        }
    }
    static class mycomparator implements Comparator<element>{
        @Override
        public int compare(element t1, element t2) {
            if(t1.f<t2.f){return -1;}//increating order of frequency comes firse
            else if(t1.f>t2.f){return 1;}
            else if(t1.v<t2.v){return 1;}//decreasing value comes first
            else return -1;
        }
   }
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            int n=Integer.parseInt(br.readLine());
            String str[]=br.readLine().split(" ");
            int arr[]=new int[n];
            for(int i=0;i<str.length;i++){
                arr[i]=Integer.parseInt(str[i]);
                //System.out.print(arr[i]);
            }
            mukesh(arr,n);

        }


    }

   static void mukesh(int[] arr, int n){

        ArrayList<element> al=new ArrayList<element>();

        for(int i=0;i<n;i++){
            if(arr[i]!=-1){
                int count=1;
                for(int j=i+1;j<n;j++){
                    if(arr[j]==arr[i]){
                        count++;
                        arr[j]=-1;
                    }
                }
                element node=new element(count,arr[i]);
                al.add(node);

            }
        }

        ////////////
        Collections.sort(al,new mycomparator());
        for(int i=al.size()-1;i>=0;i--){

            int fr=al.get(i).f;
            int val=al.get(i).v;
            for(int j=0;j<fr;j++){
                System.out.print(val+" ");
            }
        }
        System.out.println();





    }

}