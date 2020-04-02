
package coderSorting;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;
        import java.util.Collection;
        import java.util.Collections;
        import java.util.Comparator;

class EfficientlySortingNumbersInRangeFromZeroTonSquareMinusOne{
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
            mukesh(arr);

        }


    }

    static void mukesh(int[] arr){
Arrays.sort(arr);
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
System.out.println();

    }

}