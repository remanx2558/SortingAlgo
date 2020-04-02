
package coderSorting;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;
        import java.util.Collection;
        import java.util.Collections;
        import java.util.Comparator;

class  Sort7{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            String n[]=br.readLine().split(" ");
            String str1[]=br.readLine().split(" ");
            String str2[]=br.readLine().split(" ");

            int arr1[]=new int[str1.length];
            int arr2[]=new int[str2.length];
            for(int i=0;i<str1.length;i++){
                arr1[i]=Integer.parseInt(str1[i]);
                //System.out.print(arr[i]);
            }
            for(int i=0;i<str2.length;i++){
                arr2[i]=Integer.parseInt(str2[i]);
                //System.out.print(arr[i]);
            }
            mukesh(arr1,arr2);

        }


    }

    static void mukesh(int[] arr1, int []arr2){
HashMap<Integer,Integer> hm1=new HashMap<Integer, Integer>();
        HashMap<Integer,Integer> hm2=new  HashMap<Integer, Integer>();
    for(int i=0;i<arr2.length;i++){
        if(hm2.containsKey(arr2[i])==false){
            hm2.put(arr2[i],0);
        }
    }
        for(int i=0;i<arr1.length;i++){
            if(hm2.containsKey(arr1[i])==true){

                int k=hm2.get(arr1[i])+1;
                hm2.remove(arr1[i]);
                hm2.put(arr1[i],k);
                arr1[i]=-1;
            }
        }
        //////
        Arrays.sort(arr1);
        for(int i=0;i<arr2.length;i++){
            int fre=hm2.get(arr2[i]);

            for(int j=0;j<fre;j++){
                System.out.print(arr2[i]+" ");
            }
        }
        for(int i=0;i<arr1.length;i++){
          if(arr1[i]!=-1){
              System.out.print(arr1[i]+" ");

          }

        }


System.out.println();
    }

}