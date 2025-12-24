package org.example.implementation;

import java.io.*;
import java.util.*;

public class _2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<Integer.parseInt(s);i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        ArrayList<Integer> countList = new ArrayList<>();
        for(int i=0; i<list.size();i++){
            int count=0;
            for(int j=0;j<list.size();j++){
                if(list.get(i)==list.get(j)){//값만 비교
                    count++;
                }
            }
            countList.add(count);
        }
        Collections.sort(countList);
        Collections.sort(list);
        System.out.println("산술평균 " + (list.stream().mapToInt(Integer::intValue).sum()/list.size()));
        System.out.println("중앙값" + list.toArray()[list.size()/2]);
        System.out.println("최빈값 "+ countList.get(list.size()-1));
        System.out.println("범위 " + (list.get(list.size()-1)-list.get(0)));
    }
}
