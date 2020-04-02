import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class SelectionSort2 {
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
int count[]=new int[3];
for(int i=0;i<n;i++){
    if(arr[i]==0){
        count[0]++;
    }
    else if(arr[i]==1){
        count[1]++;
    }
    else count[2]++;

}
for(int i=0;i<3;i++){
    int f=count[i];
    for(int j=0;j<f;j++){
        System.out.print(i+" ");
    }

}
    System.out.println();
    }

}