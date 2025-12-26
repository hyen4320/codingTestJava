package org.example.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class _1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomNumber = br.readLine();
        ArrayList<Integer> plasticNumbers = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        int count = 1;

        for (Character i : roomNumber.toCharArray()) {
            if (plasticNumbers.contains(Integer.parseInt(i.toString()))) {
                plasticNumbers.remove(plasticNumbers.indexOf(Integer.parseInt(i.toString())));
            }
            else {
                if (i.toString().equals("6")) {
                    if(plasticNumbers.contains(9)){
                        plasticNumbers.remove(plasticNumbers.indexOf(Integer.parseInt("9")));
                    }
                    else{
                        count++;
                        plasticNumbers.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
                        plasticNumbers.remove(plasticNumbers.indexOf(Integer.parseInt(i.toString())));
                    }
                }
                else if (i.toString().equals("9")) {
                    if(plasticNumbers.contains(6)){
                        plasticNumbers.remove(plasticNumbers.indexOf(Integer.parseInt("6")));
                    }
                    else{
                        count++;
                        plasticNumbers.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
                        plasticNumbers.remove(plasticNumbers.indexOf(Integer.parseInt(i.toString())));
                    }
                }
                else{
                    count++;
                    plasticNumbers.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
                    plasticNumbers.remove(plasticNumbers.indexOf(Integer.parseInt(i.toString())));
                }
            }
        }
        System.out.println(count);
    }
}
