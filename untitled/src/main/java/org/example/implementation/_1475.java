package org.example.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomNumber = br.readLine();
        roomNumber = roomNumber.replaceAll("6","9");
        Double price = 0.0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for(char i:roomNumber.toCharArray()){
        }
        System.out.println("price = " + price);


    }
}
