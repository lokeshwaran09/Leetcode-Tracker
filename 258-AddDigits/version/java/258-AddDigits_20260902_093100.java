// Last updated: 9/2/2026, 9:31:00 AM
1class Solution {
2    public String getHint(String secret, String guess) {
3        int bulls = 0;
4        int cows = 0;
5        int[] count = new int[10];
6
7        for (int i = 0; i < secret.length(); i++) {
8            if (secret.charAt(i) == guess.charAt(i)) {
9                bulls++;
10            } else {
11                count[secret.charAt(i) - '0']++;
12            }
13        }
14
15        for (int i = 0; i < guess.length(); i++) {
16            if (secret.charAt(i) != guess.charAt(i)) {
17                int digit = guess.charAt(i) - '0';
18
19                if (count[digit] > 0) {
20                    cows++;
21                    count[digit]--;
22                }
23            }
24        }
25
26        return bulls + "A" + cows + "B";
27    }
28}