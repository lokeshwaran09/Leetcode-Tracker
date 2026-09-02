// Last updated: 9/2/2026, 9:34:58 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int hold = -prices[0];
4        int sold = 0;
5        int cooldown = 0;
6
7        for (int i = 1; i < prices.length; i++) {
8            int prevHold = hold;
9            int prevSold = sold;
10            int prevCooldown = cooldown;
11
12            hold = Math.max(prevHold, prevCooldown - prices[i]);
13            sold = prevHold + prices[i];
14            cooldown = Math.max(prevCooldown, prevSold);
15        }
16
17        return Math.max(sold, cooldown);
18    }
19}