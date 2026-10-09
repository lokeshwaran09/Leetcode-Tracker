// Last updated: 10/9/2026, 3:07:37 PM
1class Solution {
2    public int longestSubstring(String s, int k) {
3        if (s.length() < k) {
4            return 0;
5        }
6
7        int[] count = new int[26];
8
9        for (char c : s.toCharArray()) {
10            count[c - 'a']++;
11        }
12
13        for (int i = 0; i < s.length(); i++) {
14            if (count[s.charAt(i) - 'a'] < k) {
15                int left = longestSubstring(s.substring(0, i), k);
16
17                int j = i + 1;
18                while (j < s.length() && count[s.charAt(j) - 'a'] < k) {
19                    j++;
20                }
21
22                int right = longestSubstring(s.substring(j), k);
23
24                return Math.max(left, right);
25            }
26        }
27
28        return s.length();
29    }
30}