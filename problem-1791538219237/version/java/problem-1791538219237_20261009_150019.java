// Last updated: 10/9/2026, 3:00:19 PM
1import java.util.*;
2
3class Solution {
4    public int lengthLongestPath(String input) {
5        Stack<Integer> stack = new Stack<>();
6        stack.push(0);
7        int maxLength = 0;
8
9        for (String s : input.split("\n")) {
10            int level = s.lastIndexOf("\t") + 1;
11
12            while (stack.size() > level + 1) {
13                stack.pop();
14            }
15
16            int length = stack.peek() + s.length() - level + 1;
17            stack.push(length);
18
19            if (s.contains(".")) {
20                maxLength = Math.max(maxLength, length - 1);
21            }
22        }
23
24        return maxLength;
25    }
26}