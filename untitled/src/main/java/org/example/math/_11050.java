package org.example.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        System.out.println(binomial(N,K));
    }
    private static int binomial(int n, int k){
        return factorial(n)/(factorial(k)*factorial(n-k));
    }
    private static int factorial(int n){
        if(n==1||n==0){//n이 0일 때도 처리해야함 factorial(n-1) 요놈 때문에 0처리를 안해주면 마이너스까지 내려가서 스택오버플로우 남
            return 1;
        }
        return n * factorial(n-1);
    }
}
