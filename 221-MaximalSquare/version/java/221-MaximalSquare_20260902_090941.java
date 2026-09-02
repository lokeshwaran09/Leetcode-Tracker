// Last updated: 9/2/2026, 9:09:41 AM
1import java.util.*;
2
3class Solution {
4    public List<Integer> diffWaysToCompute(String expression) {
5        List<Integer> result = new ArrayList<>();
6
7        for (int i = 0; i < expression.length(); i++) {
8            char c = expression.charAt(i);
9
10            if (c == '+' || c == '-' || c == '*') {
11                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
12                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
13
14                for (int a : left) {
15                    for (int b : right) {
16                        if (c == '+') {
17                            result.add(a + b);
18                        } else if (c == '-') {
19                            result.add(a - b);
20                        } else {
21                            result.add(a * b);
22                        }
23                    }
24                }
25            }
26        }
27
28        if (result.isEmpty()) {
29            result.add(Integer.parseInt(expression));
30        }
31
32        return result;
33    }
34}