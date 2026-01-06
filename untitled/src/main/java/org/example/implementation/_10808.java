package org.example.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10808 {
    public static void main(String[] args) throws IOException {
        int[] alpha =  new int[26];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        for(String s: str){
            alpha[s.charAt(0)-'a']++;
        }
        for(int factor: alpha){
            System.out.print(factor+" ");
        }

    }
}
