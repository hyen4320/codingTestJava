package org.example.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9625 {
    public static void main(String[] args) throws IOException {
        //b(n-1)=an, b(n-1) + a(n-1) = b(n)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(br.readLine());
        //배열 정의
        int[][] dp = new int[46][2];
        //초기값 설정
        dp[0][0]=1;
        dp[0][1]=0;
        dp[1][0]=0;
        dp[1][1]=1;
        //배열 채우기
        for(int i = 2; i <= N; i++) {
            dp[i][0] = dp[i-1][1];
            dp[i][1] = dp[i-1][0]+dp[i-1][1];
        }
        //원하는 값 추출
        System.out.println(dp[N][0]+" "+dp[N][1]);
    }
}
