// Last updated: 9/2/2026, 9:30:21 AM
1import java.util.*;
2
3class Solution {
4    public boolean wordPattern(String pattern, String s) {
5        String[] words = s.split(" ");
6
7        if (pattern.length() != words.length) {
8            return false;
9        }
10
11        HashMap<Character, String> map = new HashMap<>();
12        HashSet<String> used = new HashSet<>();
13
14        for (int i = 0; i < pattern.length(); i++) {
15            char c = pattern.charAt(i);
16            String word = words[i];
17
18            if (map.containsKey(c)) {
19                if (!map.get(c).equals(word)) {
20                    return false;
21                }
22            } else {
23                if (used.contains(word)) {
24                    return false;
25                }
26
27                map.put(c, word);
28                used.add(word);
29            }
30        }
31
32        return true;
33    }
34}