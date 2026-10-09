// Last updated: 10/9/2026, 3:07:09 PM
1import java.util.*;
2
3class Solution {
4    public String decodeString(String s) {
5        Stack<Integer> counts = new Stack<>();
6        Stack<StringBuilder> strings = new Stack<>();
7        StringBuilder current = new StringBuilder();
8        int num = 0;
9
10        for (char c : s.toCharArray()) {
11            if (Character.isDigit(c)) {
12                num = num * 10 + (c - '0');
13            } else if (c == '[') {
14                counts.push(num);
15                strings.push(current);
16                current = new StringBuilder();
17                num = 0;
18            } else if (c == ']') {
19                int count = counts.pop();
20                StringBuilder previous = strings.pop();
21
22                for (int i = 0; i < count; i++) {
23                    previous.append(current);
24                }
25
26                current = previous;
27            } else {
28                current.append(c);
29            }
30        }
31
32        return current.toString();
33    }
34}