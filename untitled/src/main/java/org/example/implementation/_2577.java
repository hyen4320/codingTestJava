package org.example.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2577 {
    public static void main(String[] args) throws IOException {
        int[] alpha =  new int[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String[] str = String.valueOf(A*B*C).split("");
        for(String s: str){
            alpha[s.charAt(0)-'0']++;
        }
        for(int factor: alpha){
            System.out.println(factor);
        }
    }
}
