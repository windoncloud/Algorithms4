package com.company;

public class Main {

    public static void main(String[] args) {
        int [] arr = new int[] {7, 1, 5, 3, 6, 4};
        int result = gcd(10, 20);
        int profit = maxProfit(arr);
        System.out.print("result " + result);
        System.out.print("profit " + profit);
    }

    // 计算两个非负整数p和q的最大公约数：若q是0，
    // 则最大公约数为p。否则，将p除以q得到余数r，
    // p和q的最大公约数即为q和r的最大公约数。
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

    public static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

    // https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/solution/mai-mai-gu-piao-de-zui-jia-shi-ji-by-leetcode/

}
