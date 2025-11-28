package org.example.graph;

import java.io.*;
import java.util.*;

public class _11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer N = Integer.parseInt(br.readLine());
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=1;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer key = Integer.parseInt(st.nextToken());
            Integer value = Integer.parseInt(st.nextToken());
            map.computeIfAbsent(key, v->new ArrayList<>()).add(value);
            //computeIfAbsent는 value값을 반환함 map.computeIfAbsent는 하나의 ArrayList<Integer>임 거기에
            //.add하는 거니까 가능함
            map.computeIfAbsent(value, v->new ArrayList<>()).add(key);
        }
        //트리는 만들었고 탐색만하면됨


    }
}
