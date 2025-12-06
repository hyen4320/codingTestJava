package org.example.data_structures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String,Integer> map = new HashMap<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            map.put(br.readLine(),0);
        }

        for(int i=0;i<M;i++){
            String checkString=br.readLine();
            if(map.containsKey(checkString)){
                list.add(checkString);
            }
        }
        System.out.println(list.toArray().length);
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
