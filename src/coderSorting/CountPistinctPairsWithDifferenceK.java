
package coderSorting;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;
        import java.util.Collection;
        import java.util.Collections;
        import java.util.Comparator;

class CountPistinctPairsWithDifferenceK{
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
            int k=Integer.parseInt(br.readLine());

            mukesh(arr,k);

        }


    }

    static void mukesh(int[] arr, int k){
Arrays.sort(arr);
int count=0;
HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
for(int i=0;i<arr.length;i++){
    if((i+1<=arr.length-1) && (Arrays.binarySearch(arr,i+1,arr.length,arr[i]+k)>=0)){
        if(hm.containsKey(arr[i])==false){
            hm.put(arr[i],-1);
            count++;
        }
       }
    //fails for more than 2 repeating numberrs

}
        System.out.println(count);

    }

}