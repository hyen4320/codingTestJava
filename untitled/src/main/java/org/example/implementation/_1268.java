package org.example.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                list.add(Integer.parseInt(st.nextToken()));
            }
        }
        int index = 0;
        int loop=0;
        while(loop<N*5){
            list.stream();
            index++;
        }

    }
}