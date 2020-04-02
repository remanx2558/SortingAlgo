package coderSorting;

import java.util.Arrays;
import java.util.Scanner;

public class sort26 {
    public static void main (String[] args)
    {
        //code
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int p=0;p<t;p++){
            String n=s.next();
            int nn[]=new int[n.length()];
            for(int i=0;i<n.length();i++){
                nn[i]=Character.getNumericValue(n.charAt(i));
                        //Integer.valueOf(n.charAt(i));
          //5  System.out.println(nn[i]);
            }
            //min value
            //min_even_value

            Arrays.sort(nn);
            int min=nn[0];
            int m=0;
            int me=-1;
            int min_even=33;

            for(int i=0;i<n.length();i++){
            if(nn[i]%2==0 && nn[i]<min_even){
                min_even=nn[i];
                me=i;
            }
            }


            int k=0;
            int val=0;
            if(min_even%2==0){
                val=min_even;
                nn[me]=-1;
            }
            else {
                val=min;
                nn[m]=-1;
            }



            String str="";
            for(int i=0;i<nn.length;i++){
                if(nn[i]!=-1){
                    str=nn[i]+str;
                }

            }
            str=str+val;
            System.out.println(str);




        }
    }
}
