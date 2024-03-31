//You are given an array prices where prices[i] is the price of a given 
//stock on the ith day.You want to maximize your profit by choosing a 
//single day to buy one stock and choosing a different day in the future 
//to sell that stock.Return the maximum profit you can achieve from 
//this transaction. If you cannot achieve any profit, return 0.

class stockbestimetobuy {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int profit = 0;
        int min = prices[0];
        int max = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            profit = price - min;
            max = Math.max(profit, max);
        }
        return max;
    }
}

// //OR
// import java.util.*;
// class stockbestimetobuy {
// public static int maxProfit(int[] prices) {
// if (prices == null || prices.length <= 1) {
// return 0;
// }

// int minPrice = prices[0];
// int maxProfit = 0;

// for (int i = 1; i < prices.length; i++) {
// if (prices[i] < minPrice) {
// minPrice = prices[i];
// } else {
// int profit = prices[i] - minPrice;
// if (profit > maxProfit) {
// maxProfit = profit;
// }
// }
// }
// return maxProfit;
// }

// public static void main(String[] args) {
// int[] arr = {1, 2, 3, 47, 800, 90};
// System.out.println(maxProfit(arr));
// }
// }

// class Solution {
// public int maxProfit(int[] prices) {
// int maxprof=0;
// for(int i=0;i<prices.length;i++){
// for(int j=i+1;j<prices.length;j++){
// if(prices[j]-prices[i]>maxprof){
// maxprof=prices[j]-prices[i];
// }
// }
// }return maxprof;
// }
// }