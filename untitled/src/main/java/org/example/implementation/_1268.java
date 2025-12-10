package org.example.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int[][] arr = new int[N][5];
        ArrayList<Integer> captain = new ArrayList<>();
        //초기 배열
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Integer> temp = new ArrayList<>();
            while(st.hasMoreTokens()){
                temp.add(Integer.parseInt(st.nextToken()));
            }
            list.add(temp);
        }
        //배열 뒤집기
        for(int i=0;i<N;i++){
            for(int j=0;j<5;j++){
                arr[j][i] = list.get(i).get(j);
            }
        }
        for(int[] i: arr){
            for(int j=1;j<10;j++){
                System.out.println("j = " + j);
            }
        }
    }
}