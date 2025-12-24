package org.example.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count=Integer.parseInt(st.nextToken());
        int[] list=new int[count];
        int maximum=Integer.parseInt(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0;i<count;i++){
            list[i]=Integer.parseInt(st1.nextToken());
        }
        System.out.println(bruteforce(list,maximum));


    }
    private static int bruteforce(int[] list,int maximum){
        int result=0;
        int num=0;
        for(int i=0;i<list.length;i++){
            for(int j=i+1;j<list.length;j++){
                for(int k=j+1;k<list.length;k++){
                    num=list[i]+list[j]+list[k];
                    if(num<=maximum){
                        if(result<num){
                            result=num;
                        }

                    }
                }
            }
        }
        return result;
    }
}
