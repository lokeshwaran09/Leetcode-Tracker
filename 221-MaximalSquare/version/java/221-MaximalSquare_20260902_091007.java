// Last updated: 9/2/2026, 9:10:07 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length()) {
4            return false;
5        }
6
7        int[] count = new int[26];
8
9        for (int i = 0; i < s.length(); i++) {
10            count[s.charAt(i) - 'a']++;
11            count[t.charAt(i) - 'a']--;
12        }
13
14        for (int n : count) {
15            if (n != 0) {
16                return false;
17            }
18        }
19
20        return true;
21    }
22}