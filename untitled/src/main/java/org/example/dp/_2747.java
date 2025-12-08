package org.example.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        
        int[] n = new int[46];
        
        n[0]=0;
        n[1]=1;
        n[2]=1;
        for(int i=3;i<=45;i++){
            n[i]=n[i-1]+n[i-2];
        }
        System.out.println(n[N]);
    }
}
