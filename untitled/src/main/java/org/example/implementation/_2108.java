package org.example.implementation;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class _2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        ArrayList<Integer> list = new ArrayList<>();
        int bigNum=0;
        int countNum=0;
        for(int i=0;i<Integer.parseInt(s);i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        list.sort(Integer::compareTo);
        System.out.println("산술평균 " + (list.stream().mapToInt(Integer::intValue).sum()/list.size()));
        System.out.println("중앙값" + list.toArray()[list.size()/2]);
        System.out.println("최빈값");
        System.out.println("범위");
    }
}
