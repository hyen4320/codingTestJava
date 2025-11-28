package org.example.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _2941 {
    public static void main(String[] args) throws IOException {
        Map<String,Integer> map = new HashMap<>();
        map.put("c=",1);
        map.put("c-",1);
        map.put("dz=",1);
        map.put("d-",1);
        map.put("lj",1);
        map.put("nj",1);
        map.put("s=",1);
        map.put("z=",1);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        Integer result = 0;
        for(int i=0;i<s.length()-2;i++) {
//            System.out.println("s.substring(i,i+1) = " + s.substring(i, i + 3));
            if (map.containsKey(s.substring(i, i + 3))) {
                result += map.get(s.substring(i, i + 3));

            }
        }
        for(int i=0;i<s.length()-1;i++){
//            System.out.println("s.substring(i,i+1) = " + s.substring(i,i+2));
            if(map.containsKey(s.substring(i,i+2))){
                result+=map.get(s.substring(i,i+2));
                s=s.replace(s.substring(i, i + 2),"");
            }
        }
        System.out.println("s = " + s);
        System.out.println("result = " + (result+s.length()));
    }
}
