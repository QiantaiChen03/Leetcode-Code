package com.leetcode;

public class Q121 {
    //Best Time to Buy and Sell Stock
    public int maxProfit(int[] prices) {
        int profit = 0;
        int goingDown = 0;
        int goingUp = 0;
        int i = 0;
        //Arrays.sort(prices);
        while( i < prices.length -1 ){
            //　going down
            while( (i < prices.length - 1) && (prices[i] >= prices[i+1])){
                i++;
            }goingDown = prices[i];

            while( ( i < prices.length -1 ) && (prices[i] <= prices[i+1])){
                i++;
            }goingUp = prices[i];

            profit = profit + goingUp - goingDown;
        }
        return profit;
    }
}
