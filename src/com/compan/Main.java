package com.compan;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        ArrayList<Integer> numbers1=new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i <=20; i++) {
            numbers.add(random.nextInt(50));

            if (numbers.get(i)%2!=0){
               numbers1.add(numbers.get(i));
            }
        }
        System.out.println(numbers);
        System.out.println("tak sandar:  "+numbers1);
    }
}
