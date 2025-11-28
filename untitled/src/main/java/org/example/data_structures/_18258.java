package org.example.data_structures;

import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class _18258 {
    public static void main(String[] args) throws IOException {
        ArrayDeque<String> queue = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push"-> queue.add(st.nextToken());
                case "pop"-> {
                    if (queue.isEmpty()) {
                        bw.write("-1"+"\n");
                    } else {
                        bw.write(queue.getFirst()+"\n");
                        queue.poll();
                    }
                }
                case "size"-> {
                    bw.write(queue.size()+"\n");
                }
                case "empty"->{
                    bw.write((queue.isEmpty() ? "1":"0")+"\n");
                }
                case "front"-> {
                    if(queue.isEmpty()){
                        bw.write("-1"+"\n");
                    }
                    else{
                        bw.write(queue.getFirst()+"\n");
                    }
                }
                case "back"-> {
                    if(queue.isEmpty()){
                        bw.write("-1\n");
                    }
                    else{
                        bw.write(queue.getLast()+"\n");
                    }
                }
            }
        }
        bw.flush();
        bw.close();
    }
    //bufferedReader, bufferedWriter, StringTokenizer를 사용
    //flush가 출력되는 때임 루프 밖으로 빼서 한 번에 출력
    //ArrayList말고 -삭제가 O(n),ArrayDeque 삭제가 O(1), LinkedList 사용
}
