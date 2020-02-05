package com.hackerrank.algorithms;

public class BirthDayCandles {
    public static void main(String args[]) {
        System.out.println(birthdayCakeCandles(new int[]{3, 2, 1, 3}));
    }

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {

        int max = 0;
        int counter = 0;

        for(int i=0; i < ar.length; i++){
            if(max > ar[i]) continue;
            else if(max < ar[i]) { max = ar[i]; counter = 1; }
            else if(max == ar[i]) { counter++; }
        }
        return counter;
    }
}
