// Last updated: 10/9/2026, 2:57:48 PM
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        int[] count = new int[26];
4
5        for (char c : magazine.toCharArray()) {
6            count[c - 'a']++;
7        }
8
9        for (char c : ransomNote.toCharArray()) {
10            if (count[c - 'a'] == 0) {
11                return false;
12            }
13            count[c - 'a']--;
14        }
15
16        return true;
17    }
18}