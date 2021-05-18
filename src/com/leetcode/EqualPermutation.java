package com.leetcode;

public class EqualPermutation {

    private double equalPermutation (double n) {
        double total = 0;

        for (double i = 1; i < n+1; i++){
            for (double j = i+1; j < n+1; j++) {
                total += 2/(j-i+1);
            }
        }



        return total;
    }



    public static void main (String[] args) {
        EqualPermutation ep = new EqualPermutation();
        double result = ep.equalPermutation(5.00);
        System.out.println(result);

    }

}
