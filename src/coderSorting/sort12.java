package coderSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort12 {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int p=0;p<t;p++){
            String str3[]=br.readLine().split(" ");
            String str1=str3[0];
            String str2=str3[1];

            int dp[][]=new int[str2.length()][str1.length()];
            //base case
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)==str2.charAt(0)){
                    dp[0][i]=1;
                }

            }
            //////
            for(int i=1;i<str2.length();i++){
                for(int j=0;j<str1.length();j++){
                    if(str1.charAt(j)==str2.charAt(i)){
                        int count=0;
                        for(int k=j-1;k>=0;k--){
                            count=count+dp[i-1][k];
                        }
                        dp[i][j]=count;
                    }

                }}
            /////print it
/*
            for(int i=0;i<str2.length();i++){
                for(int j=0;j<str1.length();j++){
                    System.out.print(dp[i][j]+" ");}
            System.out.println();
            }

*/
            ////
            int count2=0;
            for(int i=0;i<str1.length();i++){
                count2=count2+dp[str2.length()-1][i];
            }

            System.out.println(count2);


        }

    }
}
