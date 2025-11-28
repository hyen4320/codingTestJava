package org.example.data_structures;

import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class _2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> dq = new ArrayDeque<>(n);

        for(int i=1; i<n+1; i++){
            dq.offer(i);
        }
        while(dq.size()>1){
            dq.poll();
            dq.offer(dq.poll());
        }
        bw.write(dq.getFirst()+"\n");
        bw.flush();
        bw.close();
    }
}
