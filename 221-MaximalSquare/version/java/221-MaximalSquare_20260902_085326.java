// Last updated: 9/2/2026, 8:53:26 AM
1import java.util.*;
2
3class Solution {
4    public int calculate(String s) {
5        Stack<Integer> stack = new Stack<>();
6        int num = 0;
7        char sign = '+';
8
9        for (int i = 0; i < s.length(); i++) {
10            char c = s.charAt(i);
11
12            if (Character.isDigit(c)) {
13                num = num * 10 + (c - '0');
14            }
15
16            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
17                if (sign == '+') {
18                    stack.push(num);
19                } else if (sign == '-') {
20                    stack.push(-num);
21                } else if (sign == '*') {
22                    stack.push(stack.pop() * num);
23                } else if (sign == '/') {
24                    stack.push(stack.pop() / num);
25                }
26
27                sign = c;
28                num = 0;
29            }
30        }
31
32        int result = 0;
33
34        for (int n : stack) {
35            result += n;
36        }
37
38        return result;
39    }
40}