package org.example.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class _1978 {
    public static void main(String[] args) throws IOException {
        //최댓값, 에라토스테네스 체 갈긴 후 contain으로 존재함을 확인--이렇게 풀면 문제에 제약있음 정석으로 해야함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        boolean isPrime = false;

        for(int i=0;i<N;i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        //i를 2~n-1까지 나눠서 나눠지는게 없으면 소수
        for(int i:list){
            if(i<=1){
                continue;
            }
            if(i==2){
                result+=1;
                continue;
            }
            for(int j=2;j<i;j++){
                if(i%j!=0){
                    isPrime = true;
                }
                else{
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                result+=1;
            }
        }
        System.out.println(result);
    }

}
